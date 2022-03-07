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

package com.aliyuncs.voicenavigator.model.v20180612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.BatchCreateSandBoxWhileListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchCreateSandBoxWhileListResponse extends AcsResponse {

	private String requestId;

	private Boolean repeat;

	private List<WhiteListItem> whiteList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getRepeat() {
		return this.repeat;
	}

	public void setRepeat(Boolean repeat) {
		this.repeat = repeat;
	}

	public List<WhiteListItem> getWhiteList() {
		return this.whiteList;
	}

	public void setWhiteList(List<WhiteListItem> whiteList) {
		this.whiteList = whiteList;
	}

	public static class WhiteListItem {

		private String uuid;

		private String phoneNumber;

		private String description;

		private Integer isEnable;

		private Long gmtCreate;

		private String instanceId;

		private Long gmtModified;

		private String name;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getIsEnable() {
			return this.isEnable;
		}

		public void setIsEnable(Integer isEnable) {
			this.isEnable = isEnable;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public BatchCreateSandBoxWhileListResponse getInstance(UnmarshallerContext context) {
		return	BatchCreateSandBoxWhileListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
