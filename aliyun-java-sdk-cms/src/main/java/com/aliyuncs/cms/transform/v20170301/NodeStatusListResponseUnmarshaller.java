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

import com.aliyuncs.cms.model.v20170301.NodeStatusListResponse;
import com.aliyuncs.cms.model.v20170301.NodeStatusListResponse.NodeStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class NodeStatusListResponseUnmarshaller {

	public static NodeStatusListResponse unmarshall(NodeStatusListResponse nodeStatusListResponse, UnmarshallerContext context) {
		
		nodeStatusListResponse.setRequestId(context.stringValue("NodeStatusListResponse.RequestId"));
		nodeStatusListResponse.setErrorCode(context.integerValue("NodeStatusListResponse.ErrorCode"));
		nodeStatusListResponse.setErrorMessage(context.stringValue("NodeStatusListResponse.ErrorMessage"));
		nodeStatusListResponse.setSuccess(context.booleanValue("NodeStatusListResponse.Success"));

		List<NodeStatus> nodeStatusList = new ArrayList<NodeStatus>();
		for (int i = 0; i < context.lengthValue("NodeStatusListResponse.NodeStatusList.Length"); i++) {
			NodeStatus nodeStatus = new NodeStatus();
			nodeStatus.setInstanceId(context.stringValue("NodeStatusListResponse.NodeStatusList["+ i +"].InstanceId"));
			nodeStatus.setAutoInstall(context.booleanValue("NodeStatusListResponse.NodeStatusList["+ i +"].AutoInstall"));
			nodeStatus.setStatus(context.stringValue("NodeStatusListResponse.NodeStatusList["+ i +"].Status"));

			nodeStatusList.add(nodeStatus);
		}
		nodeStatusListResponse.setNodeStatusList(nodeStatusList);
	 
	 	return nodeStatusListResponse;
	}
}