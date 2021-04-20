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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.DescribesDoubleVerificationGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribesDoubleVerificationGroupsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private DoubleVerificationGroups doubleVerificationGroups;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public DoubleVerificationGroups getDoubleVerificationGroups() {
		return this.doubleVerificationGroups;
	}

	public void setDoubleVerificationGroups(DoubleVerificationGroups doubleVerificationGroups) {
		this.doubleVerificationGroups = doubleVerificationGroups;
	}

	public static class DoubleVerificationGroups {

		private Long totalNum;

		private Long pageSize;

		private Long pageNum;

		private List<DoubleVerificationGroupListItem> doubleVerificationGroupList;

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public List<DoubleVerificationGroupListItem> getDoubleVerificationGroupList() {
			return this.doubleVerificationGroupList;
		}

		public void setDoubleVerificationGroupList(List<DoubleVerificationGroupListItem> doubleVerificationGroupList) {
			this.doubleVerificationGroupList = doubleVerificationGroupList;
		}

		public static class DoubleVerificationGroupListItem {

			private String deviceId;

			private String lastChange;

			private Long memberNumber;

			private String enabled;

			private Long interval;

			private String groupId;

			private List<PersonIdListItem> personIdList;

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getLastChange() {
				return this.lastChange;
			}

			public void setLastChange(String lastChange) {
				this.lastChange = lastChange;
			}

			public Long getMemberNumber() {
				return this.memberNumber;
			}

			public void setMemberNumber(Long memberNumber) {
				this.memberNumber = memberNumber;
			}

			public String getEnabled() {
				return this.enabled;
			}

			public void setEnabled(String enabled) {
				this.enabled = enabled;
			}

			public Long getInterval() {
				return this.interval;
			}

			public void setInterval(Long interval) {
				this.interval = interval;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public List<PersonIdListItem> getPersonIdList() {
				return this.personIdList;
			}

			public void setPersonIdList(List<PersonIdListItem> personIdList) {
				this.personIdList = personIdList;
			}

			public static class PersonIdListItem {

				private String personTableId;

				private String personId;

				public String getPersonTableId() {
					return this.personTableId;
				}

				public void setPersonTableId(String personTableId) {
					this.personTableId = personTableId;
				}

				public String getPersonId() {
					return this.personId;
				}

				public void setPersonId(String personId) {
					this.personId = personId;
				}
			}
		}
	}

	@Override
	public DescribesDoubleVerificationGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribesDoubleVerificationGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
