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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListHostGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHostGroupsResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Long totalCount;

	private String nextToken;

	private List<HostGroup> hostGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<HostGroup> getHostGroups() {
		return this.hostGroups;
	}

	public void setHostGroups(List<HostGroup> hostGroups) {
		this.hostGroups = hostGroups;
	}

	public static class HostGroup {

		private String creatorAccountId;

		private Long updateTime;

		private Long hostNum;

		private String modifierAccountId;

		private String description;

		private String type;

		private Long createTime;

		private String ecsType;

		private String aliyunRegion;

		private String ecsLabelKey;

		private String name;

		private Long id;

		private Long serviceConnectionId;

		private String ecsLabelValue;

		public String getCreatorAccountId() {
			return this.creatorAccountId;
		}

		public void setCreatorAccountId(String creatorAccountId) {
			this.creatorAccountId = creatorAccountId;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getHostNum() {
			return this.hostNum;
		}

		public void setHostNum(Long hostNum) {
			this.hostNum = hostNum;
		}

		public String getModifierAccountId() {
			return this.modifierAccountId;
		}

		public void setModifierAccountId(String modifierAccountId) {
			this.modifierAccountId = modifierAccountId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getEcsType() {
			return this.ecsType;
		}

		public void setEcsType(String ecsType) {
			this.ecsType = ecsType;
		}

		public String getAliyunRegion() {
			return this.aliyunRegion;
		}

		public void setAliyunRegion(String aliyunRegion) {
			this.aliyunRegion = aliyunRegion;
		}

		public String getEcsLabelKey() {
			return this.ecsLabelKey;
		}

		public void setEcsLabelKey(String ecsLabelKey) {
			this.ecsLabelKey = ecsLabelKey;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getServiceConnectionId() {
			return this.serviceConnectionId;
		}

		public void setServiceConnectionId(Long serviceConnectionId) {
			this.serviceConnectionId = serviceConnectionId;
		}

		public String getEcsLabelValue() {
			return this.ecsLabelValue;
		}

		public void setEcsLabelValue(String ecsLabelValue) {
			this.ecsLabelValue = ecsLabelValue;
		}
	}

	@Override
	public ListHostGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListHostGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
