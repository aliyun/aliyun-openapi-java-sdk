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
import com.aliyuncs.iovcc.transform.v20180501.FindOsVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindOsVersionsResponse extends AcsResponse {

	private String requestId;

	private OsVersionList osVersionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OsVersionList getOsVersionList() {
		return this.osVersionList;
	}

	public void setOsVersionList(OsVersionList osVersionList) {
		this.osVersionList = osVersionList;
	}

	public static class OsVersionList {

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

			private String deviceModelId;

			private String systemVersion;

			private String status;

			private String isMilestone;

			private String isForceUpgrade;

			private String isSilentUpgrade;

			private String isForceReboot;

			private String isForceNightUpgrade;

			private String gmtCreate;

			private String gmtModify;

			private String remark;

			private String statusName;

			private String deviceModelName;

			private Long gmtCreateTimestamp;

			private Long gmtModifyTimestamp;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getDeviceModelId() {
				return this.deviceModelId;
			}

			public void setDeviceModelId(String deviceModelId) {
				this.deviceModelId = deviceModelId;
			}

			public String getSystemVersion() {
				return this.systemVersion;
			}

			public void setSystemVersion(String systemVersion) {
				this.systemVersion = systemVersion;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getIsMilestone() {
				return this.isMilestone;
			}

			public void setIsMilestone(String isMilestone) {
				this.isMilestone = isMilestone;
			}

			public String getIsForceUpgrade() {
				return this.isForceUpgrade;
			}

			public void setIsForceUpgrade(String isForceUpgrade) {
				this.isForceUpgrade = isForceUpgrade;
			}

			public String getIsSilentUpgrade() {
				return this.isSilentUpgrade;
			}

			public void setIsSilentUpgrade(String isSilentUpgrade) {
				this.isSilentUpgrade = isSilentUpgrade;
			}

			public String getIsForceReboot() {
				return this.isForceReboot;
			}

			public void setIsForceReboot(String isForceReboot) {
				this.isForceReboot = isForceReboot;
			}

			public String getIsForceNightUpgrade() {
				return this.isForceNightUpgrade;
			}

			public void setIsForceNightUpgrade(String isForceNightUpgrade) {
				this.isForceNightUpgrade = isForceNightUpgrade;
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

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getStatusName() {
				return this.statusName;
			}

			public void setStatusName(String statusName) {
				this.statusName = statusName;
			}

			public String getDeviceModelName() {
				return this.deviceModelName;
			}

			public void setDeviceModelName(String deviceModelName) {
				this.deviceModelName = deviceModelName;
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
	public FindOsVersionsResponse getInstance(UnmarshallerContext context) {
		return	FindOsVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
