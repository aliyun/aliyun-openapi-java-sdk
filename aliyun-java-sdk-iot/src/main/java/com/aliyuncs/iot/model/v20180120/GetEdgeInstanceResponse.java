/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetEdgeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEdgeInstanceResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long gmtCreateTimestamp;

		private String type;

		private String roleArn;

		private Integer spec;

		private String roleAttachTime;

		private Long gmtModifiedTimestamp;

		private String tags;

		private String instanceId;

		private String roleName;

		private Long roleAttachTimestamp;

		private String gmtModified;

		private String latestDeploymentType;

		private Integer latestDeploymentStatus;

		private Boolean bizEnable;

		private String gmtCreate;

		private String name;

		public Long getGmtCreateTimestamp() {
			return this.gmtCreateTimestamp;
		}

		public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
			this.gmtCreateTimestamp = gmtCreateTimestamp;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRoleArn() {
			return this.roleArn;
		}

		public void setRoleArn(String roleArn) {
			this.roleArn = roleArn;
		}

		public Integer getSpec() {
			return this.spec;
		}

		public void setSpec(Integer spec) {
			this.spec = spec;
		}

		public String getRoleAttachTime() {
			return this.roleAttachTime;
		}

		public void setRoleAttachTime(String roleAttachTime) {
			this.roleAttachTime = roleAttachTime;
		}

		public Long getGmtModifiedTimestamp() {
			return this.gmtModifiedTimestamp;
		}

		public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
			this.gmtModifiedTimestamp = gmtModifiedTimestamp;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public Long getRoleAttachTimestamp() {
			return this.roleAttachTimestamp;
		}

		public void setRoleAttachTimestamp(Long roleAttachTimestamp) {
			this.roleAttachTimestamp = roleAttachTimestamp;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getLatestDeploymentType() {
			return this.latestDeploymentType;
		}

		public void setLatestDeploymentType(String latestDeploymentType) {
			this.latestDeploymentType = latestDeploymentType;
		}

		public Integer getLatestDeploymentStatus() {
			return this.latestDeploymentStatus;
		}

		public void setLatestDeploymentStatus(Integer latestDeploymentStatus) {
			this.latestDeploymentStatus = latestDeploymentStatus;
		}

		public Boolean getBizEnable() {
			return this.bizEnable;
		}

		public void setBizEnable(Boolean bizEnable) {
			this.bizEnable = bizEnable;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public GetEdgeInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetEdgeInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
