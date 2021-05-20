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
import com.aliyuncs.vcs.transform.v20200515.GetProfileListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProfileListResponse extends AcsResponse {

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

		private Boolean success;

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

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String sceneType;

			private Integer profileId;

			private String personId;

			private String idNumber;

			private String isvSubId;

			private String searchMatchingRate;

			private String gender;

			private String bizId;

			private Integer catalogId;

			private String faceUrl;

			private String name;

			public String getSceneType() {
				return this.sceneType;
			}

			public void setSceneType(String sceneType) {
				this.sceneType = sceneType;
			}

			public Integer getProfileId() {
				return this.profileId;
			}

			public void setProfileId(Integer profileId) {
				this.profileId = profileId;
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

			public String getIsvSubId() {
				return this.isvSubId;
			}

			public void setIsvSubId(String isvSubId) {
				this.isvSubId = isvSubId;
			}

			public String getSearchMatchingRate() {
				return this.searchMatchingRate;
			}

			public void setSearchMatchingRate(String searchMatchingRate) {
				this.searchMatchingRate = searchMatchingRate;
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

			public Integer getCatalogId() {
				return this.catalogId;
			}

			public void setCatalogId(Integer catalogId) {
				this.catalogId = catalogId;
			}

			public String getFaceUrl() {
				return this.faceUrl;
			}

			public void setFaceUrl(String faceUrl) {
				this.faceUrl = faceUrl;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetProfileListResponse getInstance(UnmarshallerContext context) {
		return	GetProfileListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
