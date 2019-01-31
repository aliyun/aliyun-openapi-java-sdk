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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListDeployGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeployGroupResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<DeployGroup> deployGroupList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DeployGroup> getDeployGroupList() {
		return this.deployGroupList;
	}

	public void setDeployGroupList(List<DeployGroup> deployGroupList) {
		this.deployGroupList = deployGroupList;
	}

	public static class DeployGroup {

		private String groupId;

		private String groupName;

		private String appId;

		private String packageVersionId;

		private String appVersionId;

		private Integer groupType;

		private String clusterId;

		private Long createTime;

		private Long updateTime;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getPackageVersionId() {
			return this.packageVersionId;
		}

		public void setPackageVersionId(String packageVersionId) {
			this.packageVersionId = packageVersionId;
		}

		public String getAppVersionId() {
			return this.appVersionId;
		}

		public void setAppVersionId(String appVersionId) {
			this.appVersionId = appVersionId;
		}

		public Integer getGroupType() {
			return this.groupType;
		}

		public void setGroupType(Integer groupType) {
			this.groupType = groupType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public ListDeployGroupResponse getInstance(UnmarshallerContext context) {
		return	ListDeployGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
