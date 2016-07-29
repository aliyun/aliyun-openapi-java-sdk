/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.AddVServerGroupBackendServersResponse;
import com.aliyuncs.slb.model.v20140515.AddVServerGroupBackendServersResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddVServerGroupBackendServersResponseUnmarshaller {

	public static AddVServerGroupBackendServersResponse unmarshall(AddVServerGroupBackendServersResponse addVServerGroupBackendServersResponse, UnmarshallerContext context) {
		
		addVServerGroupBackendServersResponse.setRequestId(context.stringValue("AddVServerGroupBackendServersResponse.RequestId"));
		addVServerGroupBackendServersResponse.setVServerGroupId(context.stringValue("AddVServerGroupBackendServersResponse.VServerGroupId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < context.lengthValue("AddVServerGroupBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(context.stringValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setPort(context.integerValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].Port"));
			backendServer.setWeight(context.integerValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].Weight"));

			backendServers.add(backendServer);
		}
		addVServerGroupBackendServersResponse.setBackendServers(backendServers);
	 
	 	return addVServerGroupBackendServersResponse;
	}
}