// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsRequiredOptional.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class StringOptionalWrapper
    {
        /// <summary>
        /// Initializes a new instance of the StringOptionalWrapper class.
        /// </summary>
        public StringOptionalWrapper() { }

        /// <summary>
        /// Initializes a new instance of the StringOptionalWrapper class.
        /// </summary>
        public StringOptionalWrapper(string value = default(string))
        {
            Value = value;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public string Value { get; set; }

    }
}
