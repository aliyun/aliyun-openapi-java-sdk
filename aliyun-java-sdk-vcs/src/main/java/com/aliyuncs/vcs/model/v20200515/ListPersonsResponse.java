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
import com.aliyuncs.vcs.transform.v20200515.ListPersonsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPersonsResponse extends AcsResponse {

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

		private String totalCount;

		private String pageSize;

		private String totalPage;

		private String pageNo;

		private List<RecordsItem> records;

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public String getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(String totalPage) {
			this.totalPage = totalPage;
		}

		public String getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(String pageNo) {
			this.pageNo = pageNo;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String firstAppearTime;

			private String personId;

			private String picUrl;

			private List<TagListItem> tagList;

			public String getFirstAppearTime() {
				return this.firstAppearTime;
			}

			public void setFirstAppearTime(String firstAppearTime) {
				this.firstAppearTime = firstAppearTime;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}

			public String getPicUrl() {
				return this.picUrl;
			}

			public void setPicUrl(String picUrl) {
				this.picUrl = picUrl;
			}

			public List<TagListItem> getTagList() {
				return this.tagList;
			}

			public void setTagList(List<TagListItem> tagList) {
				this.tagList = tagList;
			}

			public static class TagListItem {

				private String tagName;

				private String tagValueId;

				private String tagCode;

				private String tagValue;

				public String getTagName() {
					return this.tagName;
				}

				public void setTagName(String tagName) {
					this.tagName = tagName;
				}

				public String getTagValueId() {
					return this.tagValueId;
				}

				public void setTagValueId(String tagValueId) {
					this.tagValueId = tagValueId;
				}

				public String getTagCode() {
					return this.tagCode;
				}

				public void setTagCode(String tagCode) {
					this.tagCode = tagCode;
				}

				public String getTagValue() {
					return this.tagValue;
				}

				public void setTagValue(String tagValue) {
					this.tagValue = tagValue;
				}
			}
		}
	}

	@Override
	public ListPersonsResponse getInstance(UnmarshallerContext context) {
		return	ListPersonsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
