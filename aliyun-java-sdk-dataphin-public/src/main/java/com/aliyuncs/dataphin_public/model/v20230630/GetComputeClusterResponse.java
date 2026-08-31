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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetComputeClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetComputeClusterResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private ClusterConfig clusterConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ClusterConfig getClusterConfig() {
		return this.clusterConfig;
	}

	public void setClusterConfig(ClusterConfig clusterConfig) {
		this.clusterConfig = clusterConfig;
	}

	public static class ClusterConfig {

		private String owner;

		private String gmtCreate;

		private String des;

		private String typeVersion;

		private String gmtModified;

		private Long id;

		private String name;

		private ClusterSafetyControl clusterSafetyControl;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getDes() {
			return this.des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public String getTypeVersion() {
			return this.typeVersion;
		}

		public void setTypeVersion(String typeVersion) {
			this.typeVersion = typeVersion;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ClusterSafetyControl getClusterSafetyControl() {
			return this.clusterSafetyControl;
		}

		public void setClusterSafetyControl(ClusterSafetyControl clusterSafetyControl) {
			this.clusterSafetyControl = clusterSafetyControl;
		}

		public static class ClusterSafetyControl {

			private String clusterSafetyAuthType;

			private List<String> userGroupIds;

			private List<String> userNames;

			private List<String> userGroupNames;

			private List<String> userIds;

			public String getClusterSafetyAuthType() {
				return this.clusterSafetyAuthType;
			}

			public void setClusterSafetyAuthType(String clusterSafetyAuthType) {
				this.clusterSafetyAuthType = clusterSafetyAuthType;
			}

			public List<String> getUserGroupIds() {
				return this.userGroupIds;
			}

			public void setUserGroupIds(List<String> userGroupIds) {
				this.userGroupIds = userGroupIds;
			}

			public List<String> getUserNames() {
				return this.userNames;
			}

			public void setUserNames(List<String> userNames) {
				this.userNames = userNames;
			}

			public List<String> getUserGroupNames() {
				return this.userGroupNames;
			}

			public void setUserGroupNames(List<String> userGroupNames) {
				this.userGroupNames = userGroupNames;
			}

			public List<String> getUserIds() {
				return this.userIds;
			}

			public void setUserIds(List<String> userIds) {
				this.userIds = userIds;
			}
		}
	}

	@Override
	public GetComputeClusterResponse getInstance(UnmarshallerContext context) {
		return	GetComputeClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
