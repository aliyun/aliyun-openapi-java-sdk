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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListStandardGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStandardGroupsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private List<StandardGroupListItem> standardGroupList;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<StandardGroupListItem> getStandardGroupList() {
		return this.standardGroupList;
	}

	public void setStandardGroupList(List<StandardGroupListItem> standardGroupList) {
		this.standardGroupList = standardGroupList;
	}

	public static class StandardGroupListItem {

		private String groupName;

		private String description;

		private String dbType;

		private Long lastMenderId;

		private String groupMode;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public Long getLastMenderId() {
			return this.lastMenderId;
		}

		public void setLastMenderId(Long lastMenderId) {
			this.lastMenderId = lastMenderId;
		}

		public String getGroupMode() {
			return this.groupMode;
		}

		public void setGroupMode(String groupMode) {
			this.groupMode = groupMode;
		}
	}

	@Override
	public ListStandardGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListStandardGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
