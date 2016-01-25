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
package com.aliyuncs.iot.model.v20160104;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20160104.ListDevicePermitsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevicePermitsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private List<DevicePermission> devicePermissions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<DevicePermission> getDevicePermissions() {
		return this.devicePermissions;
	}

	public void setDevicePermissions(List<DevicePermission> devicePermissions) {
		this.devicePermissions = devicePermissions;
	}

	public static class DevicePermission {

		private Long id;

		private Long appKey;

		private String deviceId;

		private String grantType;

		private String topicFullName;

		private Long topicUserId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getAppKey() {
			return this.appKey;
		}

		public void setAppKey(Long appKey) {
			this.appKey = appKey;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getGrantType() {
			return this.grantType;
		}

		public void setGrantType(String grantType) {
			this.grantType = grantType;
		}

		public String getTopicFullName() {
			return this.topicFullName;
		}

		public void setTopicFullName(String topicFullName) {
			this.topicFullName = topicFullName;
		}

		public Long getTopicUserId() {
			return this.topicUserId;
		}

		public void setTopicUserId(Long topicUserId) {
			this.topicUserId = topicUserId;
		}
	}

	@Override
	public ListDevicePermitsResponse getInstance(UnmarshallerContext context) {
		return	ListDevicePermitsResponseUnmarshaller.unmarshall(this, context);
	}
}
