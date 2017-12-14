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
package com.aliyuncs.cms.model.v20170301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20170301.NodeStatusListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class NodeStatusListResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMessage;

	private Boolean success;

	private String requestId;

	private List<NodeStatus> nodeStatusList;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NodeStatus> getNodeStatusList() {
		return this.nodeStatusList;
	}

	public void setNodeStatusList(List<NodeStatus> nodeStatusList) {
		this.nodeStatusList = nodeStatusList;
	}

	public static class NodeStatus {

		private String instanceId;

		private Boolean autoInstall;

		private String status;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getAutoInstall() {
			return this.autoInstall;
		}

		public void setAutoInstall(Boolean autoInstall) {
			this.autoInstall = autoInstall;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public NodeStatusListResponse getInstance(UnmarshallerContext context) {
		return	NodeStatusListResponseUnmarshaller.unmarshall(this, context);
	}
}
