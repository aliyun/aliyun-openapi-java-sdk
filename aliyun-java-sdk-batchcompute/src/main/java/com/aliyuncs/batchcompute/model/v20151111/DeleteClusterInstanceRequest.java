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
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteClusterInstanceRequest extends BatchComputeRequest<DeleteClusterInstanceResponse> {

	public DeleteClusterInstanceRequest() {
		super("BatchCompute", "2015-11-11", "DeleteClusterInstance");
		setUriPattern("/clusters/[ClusterId]/groups/[GroupName]/instances/[InstanceId]");
		setMethod(MethodType.DELETE);
	}

	public DeleteClusterInstanceRequest(String clusterId, String groupName, String instanceId) {
		super("BatchCompute", "2015-11-11", "DeleteClusterInstance");
		setUriPattern("/clusters/[ClusterId]/groups/[GroupName]/instances/[InstanceId]");
		setMethod(MethodType.DELETE);

		setClusterId(clusterId);
		setGroupName(groupName);
		setInstanceId(instanceId);
	}

	private String instanceId;
	private String groupName;
	private String clusterId;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		putPathParameter("GroupName", groupName);
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		putPathParameter("ClusterId", clusterId);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putPathParameter("InstanceId", instanceId);
	}

	@Override
	public Class<DeleteClusterInstanceResponse> getResponseClass() {
		return DeleteClusterInstanceResponse.class;
	}

}
