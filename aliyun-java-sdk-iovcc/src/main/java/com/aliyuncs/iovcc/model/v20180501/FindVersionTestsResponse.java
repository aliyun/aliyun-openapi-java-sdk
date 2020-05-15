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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.FindVersionTestsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindVersionTestsResponse extends AcsResponse {

	private String requestId;

	private VersionTestList versionTestList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VersionTestList getVersionTestList() {
		return this.versionTestList;
	}

	public void setVersionTestList(VersionTestList versionTestList) {
		this.versionTestList = versionTestList;
	}

	public static class VersionTestList {

		private Integer totalCount;

		private List<ItemsItem> items;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private Long id;

			private String versionId;

			private String versionType;

			private String name;

			private String description;

			private String gmtCreate;

			private String gmtModify;

			private String deviceGroupId;

			private String deviceGroupName;

			private String succeededCount;

			private String failedCount;

			private String skippedCount;

			private Long gmtCreateTimestamp;

			private Long gmtModifyTimestamp;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getVersionId() {
				return this.versionId;
			}

			public void setVersionId(String versionId) {
				this.versionId = versionId;
			}

			public String getVersionType() {
				return this.versionType;
			}

			public void setVersionType(String versionType) {
				this.versionType = versionType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}

			public String getDeviceGroupId() {
				return this.deviceGroupId;
			}

			public void setDeviceGroupId(String deviceGroupId) {
				this.deviceGroupId = deviceGroupId;
			}

			public String getDeviceGroupName() {
				return this.deviceGroupName;
			}

			public void setDeviceGroupName(String deviceGroupName) {
				this.deviceGroupName = deviceGroupName;
			}

			public String getSucceededCount() {
				return this.succeededCount;
			}

			public void setSucceededCount(String succeededCount) {
				this.succeededCount = succeededCount;
			}

			public String getFailedCount() {
				return this.failedCount;
			}

			public void setFailedCount(String failedCount) {
				this.failedCount = failedCount;
			}

			public String getSkippedCount() {
				return this.skippedCount;
			}

			public void setSkippedCount(String skippedCount) {
				this.skippedCount = skippedCount;
			}

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}

			public Long getGmtModifyTimestamp() {
				return this.gmtModifyTimestamp;
			}

			public void setGmtModifyTimestamp(Long gmtModifyTimestamp) {
				this.gmtModifyTimestamp = gmtModifyTimestamp;
			}
		}
	}

	@Override
	public FindVersionTestsResponse getInstance(UnmarshallerContext context) {
		return	FindVersionTestsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
