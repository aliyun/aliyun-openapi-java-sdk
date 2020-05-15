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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryEdgeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEdgeInstanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer pageSize;

		private Integer currentPage;

		private List<Instance> instanceList;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public List<Instance> getInstanceList() {
			return this.instanceList;
		}

		public void setInstanceList(List<Instance> instanceList) {
			this.instanceList = instanceList;
		}

		public static class Instance {

			private String instanceId;

			private String name;

			private String tags;

			private Integer type;

			private String gmtCreate;

			private String gmtModified;

			private String roleArn;

			private String roleName;

			private String roleAttachTime;

			private Integer spec;

			private Boolean bizEnable;

			private Integer latestDeploymentStatus;

			private String latestDeploymentType;

			private Long gmtCreateTimestamp;

			private Long gmtModifiedTimestamp;

			private Long roleAttachTimestamp;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getRoleArn() {
				return this.roleArn;
			}

			public void setRoleArn(String roleArn) {
				this.roleArn = roleArn;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getRoleAttachTime() {
				return this.roleAttachTime;
			}

			public void setRoleAttachTime(String roleAttachTime) {
				this.roleAttachTime = roleAttachTime;
			}

			public Integer getSpec() {
				return this.spec;
			}

			public void setSpec(Integer spec) {
				this.spec = spec;
			}

			public Boolean getBizEnable() {
				return this.bizEnable;
			}

			public void setBizEnable(Boolean bizEnable) {
				this.bizEnable = bizEnable;
			}

			public Integer getLatestDeploymentStatus() {
				return this.latestDeploymentStatus;
			}

			public void setLatestDeploymentStatus(Integer latestDeploymentStatus) {
				this.latestDeploymentStatus = latestDeploymentStatus;
			}

			public String getLatestDeploymentType() {
				return this.latestDeploymentType;
			}

			public void setLatestDeploymentType(String latestDeploymentType) {
				this.latestDeploymentType = latestDeploymentType;
			}

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}

			public Long getGmtModifiedTimestamp() {
				return this.gmtModifiedTimestamp;
			}

			public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
				this.gmtModifiedTimestamp = gmtModifiedTimestamp;
			}

			public Long getRoleAttachTimestamp() {
				return this.roleAttachTimestamp;
			}

			public void setRoleAttachTimestamp(Long roleAttachTimestamp) {
				this.roleAttachTimestamp = roleAttachTimestamp;
			}
		}
	}

	@Override
	public QueryEdgeInstanceResponse getInstance(UnmarshallerContext context) {
		return	QueryEdgeInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
