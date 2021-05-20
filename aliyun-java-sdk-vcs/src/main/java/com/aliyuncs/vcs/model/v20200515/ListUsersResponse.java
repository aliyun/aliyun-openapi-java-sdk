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
import com.aliyuncs.vcs.transform.v20200515.ListUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageSize;

		private Long pageNumber;

		private Long total;

		private Long success;

		private List<RecordsItem> records;

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getSuccess() {
			return this.success;
		}

		public void setSuccess(Long success) {
			this.success = success;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String userName;

			private String personId;

			private String idNumber;

			private Integer userId;

			private Integer userGroupId;

			private String matchingRate;

			private String isvSubId;

			private String attachment;

			private String gender;

			private String bizId;

			private String age;

			private String faceImageUrl;

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}

			public String getIdNumber() {
				return this.idNumber;
			}

			public void setIdNumber(String idNumber) {
				this.idNumber = idNumber;
			}

			public Integer getUserId() {
				return this.userId;
			}

			public void setUserId(Integer userId) {
				this.userId = userId;
			}

			public Integer getUserGroupId() {
				return this.userGroupId;
			}

			public void setUserGroupId(Integer userGroupId) {
				this.userGroupId = userGroupId;
			}

			public String getMatchingRate() {
				return this.matchingRate;
			}

			public void setMatchingRate(String matchingRate) {
				this.matchingRate = matchingRate;
			}

			public String getIsvSubId() {
				return this.isvSubId;
			}

			public void setIsvSubId(String isvSubId) {
				this.isvSubId = isvSubId;
			}

			public String getAttachment() {
				return this.attachment;
			}

			public void setAttachment(String attachment) {
				this.attachment = attachment;
			}

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getAge() {
				return this.age;
			}

			public void setAge(String age) {
				this.age = age;
			}

			public String getFaceImageUrl() {
				return this.faceImageUrl;
			}

			public void setFaceImageUrl(String faceImageUrl) {
				this.faceImageUrl = faceImageUrl;
			}
		}
	}

	@Override
	public ListUsersResponse getInstance(UnmarshallerContext context) {
		return	ListUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
