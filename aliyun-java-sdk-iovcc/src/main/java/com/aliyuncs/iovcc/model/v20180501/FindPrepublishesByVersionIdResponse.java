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
import com.aliyuncs.iovcc.transform.v20180501.FindPrepublishesByVersionIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindPrepublishesByVersionIdResponse extends AcsResponse {

	private String requestId;

	private List<PrepublishListItem> prepublishList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PrepublishListItem> getPrepublishList() {
		return this.prepublishList;
	}

	public void setPrepublishList(List<PrepublishListItem> prepublishList) {
		this.prepublishList = prepublishList;
	}

	public static class PrepublishListItem {

		private String id;

		private String name;

		private String versionType;

		private String versionId;

		private String barrierCount;

		private String deviceModelId;

		private String parentId;

		private String isActive;

		private String isTotalPrepublish;

		private String gmtCreate;

		private String gmtModify;

		private String deviceModelName;

		private String passedCount;

		private Long gmtCreateTimestamp;

		private Long gmtModifyTimestamp;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersionType() {
			return this.versionType;
		}

		public void setVersionType(String versionType) {
			this.versionType = versionType;
		}

		public String getVersionId() {
			return this.versionId;
		}

		public void setVersionId(String versionId) {
			this.versionId = versionId;
		}

		public String getBarrierCount() {
			return this.barrierCount;
		}

		public void setBarrierCount(String barrierCount) {
			this.barrierCount = barrierCount;
		}

		public String getDeviceModelId() {
			return this.deviceModelId;
		}

		public void setDeviceModelId(String deviceModelId) {
			this.deviceModelId = deviceModelId;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getIsActive() {
			return this.isActive;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}

		public String getIsTotalPrepublish() {
			return this.isTotalPrepublish;
		}

		public void setIsTotalPrepublish(String isTotalPrepublish) {
			this.isTotalPrepublish = isTotalPrepublish;
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

		public String getDeviceModelName() {
			return this.deviceModelName;
		}

		public void setDeviceModelName(String deviceModelName) {
			this.deviceModelName = deviceModelName;
		}

		public String getPassedCount() {
			return this.passedCount;
		}

		public void setPassedCount(String passedCount) {
			this.passedCount = passedCount;
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

	@Override
	public FindPrepublishesByVersionIdResponse getInstance(UnmarshallerContext context) {
		return	FindPrepublishesByVersionIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
