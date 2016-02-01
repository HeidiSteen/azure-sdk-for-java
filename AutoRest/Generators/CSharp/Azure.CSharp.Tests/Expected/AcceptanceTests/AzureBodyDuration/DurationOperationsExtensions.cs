// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsAzureBodyDuration
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Rest.Azure;
    using Models;

    public static partial class DurationOperationsExtensions
    {
            /// <summary>
            /// Get null duration value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static TimeSpan? GetNull(this IDurationOperations operations)
            {
                return Task.Factory.StartNew(s => ((IDurationOperations)s).GetNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null duration value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<TimeSpan?> GetNullAsync( this IDurationOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put a positive duration value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='durationBody'>
            /// </param>
            public static void PutPositiveDuration(this IDurationOperations operations, TimeSpan? durationBody)
            {
                Task.Factory.StartNew(s => ((IDurationOperations)s).PutPositiveDurationAsync(durationBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put a positive duration value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='durationBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutPositiveDurationAsync( this IDurationOperations operations, TimeSpan? durationBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutPositiveDurationWithHttpMessagesAsync(durationBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get a positive duration value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static TimeSpan? GetPositiveDuration(this IDurationOperations operations)
            {
                return Task.Factory.StartNew(s => ((IDurationOperations)s).GetPositiveDurationAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get a positive duration value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<TimeSpan?> GetPositiveDurationAsync( this IDurationOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetPositiveDurationWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Get an invalid duration value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static TimeSpan? GetInvalid(this IDurationOperations operations)
            {
                return Task.Factory.StartNew(s => ((IDurationOperations)s).GetInvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an invalid duration value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<TimeSpan?> GetInvalidAsync( this IDurationOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetInvalidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

    }
}
