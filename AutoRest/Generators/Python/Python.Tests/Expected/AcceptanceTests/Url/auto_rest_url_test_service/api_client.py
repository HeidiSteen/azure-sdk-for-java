# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.service_client import ServiceClient
from msrest import Configuration, Serializer, Deserializer
from .operations.paths import Paths
from .operations.queries import Queries
from .operations.path_items import PathItems
from . import models


class AutoRestUrlTestServiceConfiguration(Configuration):

    def __init__(
            self, global_string_path, global_string_query=None, base_url=None, filepath=None):

        if global_string_path is None:
            raise ValueError('global_string_path must not be None.')
        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestUrlTestServiceConfiguration, self).__init__(base_url, filepath)

        self.user_agent = 'auto_rest_url_test_service/1.0.0'

        self.global_string_path = global_string_path
        self.global_string_query = global_string_query


class AutoRestUrlTestService(object):

    def __init__(self, config):

        self._client = ServiceClient(None, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config
        self.paths = Paths(
            self._client, self.config, self._serialize, self._deserialize)
        self.queries = Queries(
            self._client, self.config, self._serialize, self._deserialize)
        self.path_items = PathItems(
            self._client, self.config, self._serialize, self._deserialize)
