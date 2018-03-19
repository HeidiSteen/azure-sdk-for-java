/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Azure Batch task.
 */
public class CloudTask {
    /**
     * A string that uniquely identifies the task within the job.
     * The ID can contain any combination of alphanumeric characters including
     * hyphens and underscores, and cannot contain more than 64 characters.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * A display name for the task.
     * The display name need not be unique and can contain any Unicode
     * characters up to a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The URL of the task.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The ETag of the task.
     * This is an opaque string. You can use it to detect whether the task has
     * changed between requests. In particular, you can be pass the ETag when
     * updating a task to specify that your changes should take effect only if
     * nobody else has modified the task in the meantime.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The last modified time of the task.
     */
    @JsonProperty(value = "lastModified")
    private DateTime lastModified;

    /**
     * The creation time of the task.
     */
    @JsonProperty(value = "creationTime")
    private DateTime creationTime;

    /**
     * How the Batch service should respond when the task completes.
     */
    @JsonProperty(value = "exitConditions")
    private ExitConditions exitConditions;

    /**
     * The current state of the task.
     * Possible values include: 'active', 'preparing', 'running', 'completed'.
     */
    @JsonProperty(value = "state")
    private TaskState state;

    /**
     * The time at which the task entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime")
    private DateTime stateTransitionTime;

    /**
     * The previous state of the task.
     * This property is not set if the task is in its initial Active state.
     * Possible values include: 'active', 'preparing', 'running', 'completed'.
     */
    @JsonProperty(value = "previousState")
    private TaskState previousState;

    /**
     * The time at which the task entered its previous state.
     * This property is not set if the task is in its initial Active state.
     */
    @JsonProperty(value = "previousStateTransitionTime")
    private DateTime previousStateTransitionTime;

    /**
     * The command line of the task.
     * For multi-instance tasks, the command line is executed as the primary
     * task, after the primary task and all subtasks have finished executing
     * the coordination command line. The command line does not run under a
     * shell, and therefore cannot take advantage of shell features such as
     * environment variable expansion. If you want to take advantage of such
     * features, you should invoke the shell in the command line, for example
     * using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux.
     */
    @JsonProperty(value = "commandLine")
    private String commandLine;

    /**
     * The settings for the container under which the task runs.
     * If the pool that will run this task has containerConfiguration set, this
     * must be set as well. If the pool that will run this task doesn't have
     * containerConfiguration set, this must not be set. When this is
     * specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR
     * (the root of Azure Batch directories on the node) are mapped into the
     * container, all task environment variables are mapped into the container,
     * and the task command line is executed in the container.
     */
    @JsonProperty(value = "containerSettings")
    private TaskContainerSettings containerSettings;

    /**
     * A list of files that the Batch service will download to the compute node
     * before running the command line.
     * For multi-instance tasks, the resource files will only be downloaded to
     * the compute node on which the primary task is executed.
     */
    @JsonProperty(value = "resourceFiles")
    private List<ResourceFile> resourceFiles;

    /**
     * A list of files that the Batch service will upload from the compute node
     * after running the command line.
     * For multi-instance tasks, the files will only be uploaded from the
     * compute node on which the primary task is executed.
     */
    @JsonProperty(value = "outputFiles")
    private List<OutputFile> outputFiles;

    /**
     * A list of environment variable settings for the task.
     */
    @JsonProperty(value = "environmentSettings")
    private List<EnvironmentSetting> environmentSettings;

    /**
     * A locality hint that can be used by the Batch service to select a
     * compute node on which to start the new task.
     */
    @JsonProperty(value = "affinityInfo")
    private AffinityInformation affinityInfo;

    /**
     * The execution constraints that apply to this task.
     */
    @JsonProperty(value = "constraints")
    private TaskConstraints constraints;

    /**
     * The user identity under which the task runs.
     * If omitted, the task runs as a non-administrative user unique to the
     * task.
     */
    @JsonProperty(value = "userIdentity")
    private UserIdentity userIdentity;

    /**
     * Information about the execution of the task.
     */
    @JsonProperty(value = "executionInfo")
    private TaskExecutionInformation executionInfo;

    /**
     * Information about the compute node on which the task ran.
     */
    @JsonProperty(value = "nodeInfo")
    private ComputeNodeInformation nodeInfo;

    /**
     * An object that indicates that the task is a multi-instance task, and
     * contains information about how to run the multi-instance task.
     */
    @JsonProperty(value = "multiInstanceSettings")
    private MultiInstanceSettings multiInstanceSettings;

    /**
     * Resource usage statistics for the task.
     */
    @JsonProperty(value = "stats")
    private TaskStatistics stats;

    /**
     * The tasks that this task depends on.
     * This task will not be scheduled until all tasks that it depends on have
     * completed successfully. If any of those tasks fail and exhaust their
     * retry counts, this task will never be scheduled.
     */
    @JsonProperty(value = "dependsOn")
    private TaskDependencies dependsOn;

    /**
     * A list of application packages that the Batch service will deploy to the
     * compute node before running the command line.
     * Application packages are downloaded and deployed to a shared directory,
     * not the task working directory. Therefore, if a referenced package is
     * already on the compute node, and is up to date, then it is not
     * re-downloaded; the existing copy on the compute node is used. If a
     * referenced application package cannot be installed, for example because
     * the package has been deleted or because download failed, the task fails.
     */
    @JsonProperty(value = "applicationPackageReferences")
    private List<ApplicationPackageReference> applicationPackageReferences;

    /**
     * The settings for an authentication token that the task can use to
     * perform Batch service operations.
     * If this property is set, the Batch service provides the task with an
     * authentication token which can be used to authenticate Batch service
     * operations without requiring an account access key. The token is
     * provided via the AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The
     * operations that the task can carry out using the token depend on the
     * settings. For example, a task can request job permissions in order to
     * add other tasks to the job, or check the status of the job or of other
     * tasks under the job.
     */
    @JsonProperty(value = "authenticationTokenSettings")
    private AuthenticationTokenSettings authenticationTokenSettings;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime value.
     *
     * @param creationTime the creationTime value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the exitConditions value.
     *
     * @return the exitConditions value
     */
    public ExitConditions exitConditions() {
        return this.exitConditions;
    }

    /**
     * Set the exitConditions value.
     *
     * @param exitConditions the exitConditions value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withExitConditions(ExitConditions exitConditions) {
        this.exitConditions = exitConditions;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public TaskState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withState(TaskState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateTransitionTime value.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the stateTransitionTime value.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get the previousState value.
     *
     * @return the previousState value
     */
    public TaskState previousState() {
        return this.previousState;
    }

    /**
     * Set the previousState value.
     *
     * @param previousState the previousState value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withPreviousState(TaskState previousState) {
        this.previousState = previousState;
        return this;
    }

    /**
     * Get the previousStateTransitionTime value.
     *
     * @return the previousStateTransitionTime value
     */
    public DateTime previousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Set the previousStateTransitionTime value.
     *
     * @param previousStateTransitionTime the previousStateTransitionTime value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withPreviousStateTransitionTime(DateTime previousStateTransitionTime) {
        this.previousStateTransitionTime = previousStateTransitionTime;
        return this;
    }

    /**
     * Get the commandLine value.
     *
     * @return the commandLine value
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set the commandLine value.
     *
     * @param commandLine the commandLine value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Get the containerSettings value.
     *
     * @return the containerSettings value
     */
    public TaskContainerSettings containerSettings() {
        return this.containerSettings;
    }

    /**
     * Set the containerSettings value.
     *
     * @param containerSettings the containerSettings value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withContainerSettings(TaskContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get the resourceFiles value.
     *
     * @return the resourceFiles value
     */
    public List<ResourceFile> resourceFiles() {
        return this.resourceFiles;
    }

    /**
     * Set the resourceFiles value.
     *
     * @param resourceFiles the resourceFiles value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withResourceFiles(List<ResourceFile> resourceFiles) {
        this.resourceFiles = resourceFiles;
        return this;
    }

    /**
     * Get the outputFiles value.
     *
     * @return the outputFiles value
     */
    public List<OutputFile> outputFiles() {
        return this.outputFiles;
    }

    /**
     * Set the outputFiles value.
     *
     * @param outputFiles the outputFiles value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withOutputFiles(List<OutputFile> outputFiles) {
        this.outputFiles = outputFiles;
        return this;
    }

    /**
     * Get the environmentSettings value.
     *
     * @return the environmentSettings value
     */
    public List<EnvironmentSetting> environmentSettings() {
        return this.environmentSettings;
    }

    /**
     * Set the environmentSettings value.
     *
     * @param environmentSettings the environmentSettings value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withEnvironmentSettings(List<EnvironmentSetting> environmentSettings) {
        this.environmentSettings = environmentSettings;
        return this;
    }

    /**
     * Get the affinityInfo value.
     *
     * @return the affinityInfo value
     */
    public AffinityInformation affinityInfo() {
        return this.affinityInfo;
    }

    /**
     * Set the affinityInfo value.
     *
     * @param affinityInfo the affinityInfo value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withAffinityInfo(AffinityInformation affinityInfo) {
        this.affinityInfo = affinityInfo;
        return this;
    }

    /**
     * Get the constraints value.
     *
     * @return the constraints value
     */
    public TaskConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints value.
     *
     * @param constraints the constraints value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withConstraints(TaskConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the userIdentity value.
     *
     * @return the userIdentity value
     */
    public UserIdentity userIdentity() {
        return this.userIdentity;
    }

    /**
     * Set the userIdentity value.
     *
     * @param userIdentity the userIdentity value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
        return this;
    }

    /**
     * Get the executionInfo value.
     *
     * @return the executionInfo value
     */
    public TaskExecutionInformation executionInfo() {
        return this.executionInfo;
    }

    /**
     * Set the executionInfo value.
     *
     * @param executionInfo the executionInfo value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withExecutionInfo(TaskExecutionInformation executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

    /**
     * Get the nodeInfo value.
     *
     * @return the nodeInfo value
     */
    public ComputeNodeInformation nodeInfo() {
        return this.nodeInfo;
    }

    /**
     * Set the nodeInfo value.
     *
     * @param nodeInfo the nodeInfo value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withNodeInfo(ComputeNodeInformation nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    /**
     * Get the multiInstanceSettings value.
     *
     * @return the multiInstanceSettings value
     */
    public MultiInstanceSettings multiInstanceSettings() {
        return this.multiInstanceSettings;
    }

    /**
     * Set the multiInstanceSettings value.
     *
     * @param multiInstanceSettings the multiInstanceSettings value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withMultiInstanceSettings(MultiInstanceSettings multiInstanceSettings) {
        this.multiInstanceSettings = multiInstanceSettings;
        return this;
    }

    /**
     * Get the stats value.
     *
     * @return the stats value
     */
    public TaskStatistics stats() {
        return this.stats;
    }

    /**
     * Set the stats value.
     *
     * @param stats the stats value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withStats(TaskStatistics stats) {
        this.stats = stats;
        return this;
    }

    /**
     * Get the dependsOn value.
     *
     * @return the dependsOn value
     */
    public TaskDependencies dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn value.
     *
     * @param dependsOn the dependsOn value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withDependsOn(TaskDependencies dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the applicationPackageReferences value.
     *
     * @return the applicationPackageReferences value
     */
    public List<ApplicationPackageReference> applicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set the applicationPackageReferences value.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get the authenticationTokenSettings value.
     *
     * @return the authenticationTokenSettings value
     */
    public AuthenticationTokenSettings authenticationTokenSettings() {
        return this.authenticationTokenSettings;
    }

    /**
     * Set the authenticationTokenSettings value.
     *
     * @param authenticationTokenSettings the authenticationTokenSettings value to set
     * @return the CloudTask object itself.
     */
    public CloudTask withAuthenticationTokenSettings(AuthenticationTokenSettings authenticationTokenSettings) {
        this.authenticationTokenSettings = authenticationTokenSettings;
        return this;
    }

}
