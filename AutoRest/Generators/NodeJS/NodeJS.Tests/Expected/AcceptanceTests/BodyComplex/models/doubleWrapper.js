/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the DoubleWrapper class.
 * @constructor
 * @member {number} [field1]
 * 
 * @member {number}
 * [field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose]
 * 
 */
function DoubleWrapper() {
}

/**
 * Defines the metadata of DoubleWrapper
 *
 * @returns {object} metadata of DoubleWrapper
 *
 */
DoubleWrapper.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'double-wrapper',
    type: {
      name: 'Composite',
      className: 'DoubleWrapper',
      modelProperties: {
        field1: {
          required: false,
          serializedName: 'field1',
          type: {
            name: 'Number'
          }
        },
        field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose: {
          required: false,
          serializedName: 'field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose',
          type: {
            name: 'Number'
          }
        }
      }
    }
  };
};

module.exports = DoubleWrapper;
