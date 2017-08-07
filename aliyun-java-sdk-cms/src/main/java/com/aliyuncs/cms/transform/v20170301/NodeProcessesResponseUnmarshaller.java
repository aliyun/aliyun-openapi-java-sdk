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
package com.aliyuncs.cms.transform.v20170301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20170301.NodeProcessesResponse;
import com.aliyuncs.cms.model.v20170301.NodeProcessesResponse.NodeProcess;
import com.aliyuncs.transform.UnmarshallerContext;


public class NodeProcessesResponseUnmarshaller {

	public static NodeProcessesResponse unmarshall(NodeProcessesResponse nodeProcessesResponse, UnmarshallerContext context) {
		
		nodeProcessesResponse.setRequestId(context.stringValue("NodeProcessesResponse.RequestId"));
		nodeProcessesResponse.setErrorCode(context.integerValue("NodeProcessesResponse.ErrorCode"));
		nodeProcessesResponse.setErrorMessage(context.stringValue("NodeProcessesResponse.ErrorMessage"));
		nodeProcessesResponse.setSuccess(context.booleanValue("NodeProcessesResponse.Success"));

		List<NodeProcess> nodeProcesses = new ArrayList<NodeProcess>();
		for (int i = 0; i < context.lengthValue("NodeProcessesResponse.NodeProcesses.Length"); i++) {
			NodeProcess nodeProcess = new NodeProcess();
			nodeProcess.setId(context.longValue("NodeProcessesResponse.NodeProcesses["+ i +"].Id"));
			nodeProcess.setName(context.stringValue("NodeProcessesResponse.NodeProcesses["+ i +"].Name"));
			nodeProcess.setInstanceId(context.stringValue("NodeProcessesResponse.NodeProcesses["+ i +"].InstanceId"));
			nodeProcess.setProcessName(context.stringValue("NodeProcessesResponse.NodeProcesses["+ i +"].ProcessName"));
			nodeProcess.setProcessUser(context.stringValue("NodeProcessesResponse.NodeProcesses["+ i +"].ProcessUser"));
			nodeProcess.setCommand(context.stringValue("NodeProcessesResponse.NodeProcesses["+ i +"].Command"));

			nodeProcesses.add(nodeProcess);
		}
		nodeProcessesResponse.setNodeProcesses(nodeProcesses);
	 
	 	return nodeProcessesResponse;
	}
}