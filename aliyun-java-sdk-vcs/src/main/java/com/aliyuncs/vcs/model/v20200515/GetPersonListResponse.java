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
import com.aliyuncs.vcs.transform.v20200515.GetPersonListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPersonListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNumber;

		private Long pageSize;

		private Long totalCount;

		private List<RecordsItem> records;

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String faceUrl;

			private Long firstShotTime;

			private String personId;

			private String searchMatchingRate;

			private Long lastShotTime;

			private List<TagList> propertyTagList;

			public String getFaceUrl() {
				return this.faceUrl;
			}

			public void setFaceUrl(String faceUrl) {
				this.faceUrl = faceUrl;
			}

			public Long getFirstShotTime() {
				return this.firstShotTime;
			}

			public void setFirstShotTime(Long firstShotTime) {
				this.firstShotTime = firstShotTime;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}

			public String getSearchMatchingRate() {
				return this.searchMatchingRate;
			}

			public void setSearchMatchingRate(String searchMatchingRate) {
				this.searchMatchingRate = searchMatchingRate;
			}

			public Long getLastShotTime() {
				return this.lastShotTime;
			}

			public void setLastShotTime(Long lastShotTime) {
				this.lastShotTime = lastShotTime;
			}

			public List<TagList> getPropertyTagList() {
				return this.propertyTagList;
			}

			public void setPropertyTagList(List<TagList> propertyTagList) {
				this.propertyTagList = propertyTagList;
			}

			public static class TagList {

				private String code;

				private String tagCodeName;

				private String tagName;

				private String value;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getTagCodeName() {
					return this.tagCodeName;
				}

				public void setTagCodeName(String tagCodeName) {
					this.tagCodeName = tagCodeName;
				}

				public String getTagName() {
					return this.tagName;
				}

				public void setTagName(String tagName) {
					this.tagName = tagName;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public GetPersonListResponse getInstance(UnmarshallerContext context) {
		return	GetPersonListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
