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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.ListAudienceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAudienceResponse extends AcsResponse {

	private String requestId;

	private String errorDesc;

	private String traceId;

	private String errorCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String pageNum;

		private String pageSize;

		private String totalNum;

		private List<ContentItem> content;

		public String getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(String pageNum) {
			this.pageNum = pageNum;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public String getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(String totalNum) {
			this.totalNum = totalNum;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private String latestDataModifyStatus;

			private String errorMessage;

			private String numberOfAudiences;

			private String latestDataModifyTime;

			private String gmtCreate;

			private String gmtModified;

			private String name;

			private Boolean isDynamic;

			private String id;

			private List<String> mappingTypes;

			public String getLatestDataModifyStatus() {
				return this.latestDataModifyStatus;
			}

			public void setLatestDataModifyStatus(String latestDataModifyStatus) {
				this.latestDataModifyStatus = latestDataModifyStatus;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getNumberOfAudiences() {
				return this.numberOfAudiences;
			}

			public void setNumberOfAudiences(String numberOfAudiences) {
				this.numberOfAudiences = numberOfAudiences;
			}

			public String getLatestDataModifyTime() {
				return this.latestDataModifyTime;
			}

			public void setLatestDataModifyTime(String latestDataModifyTime) {
				this.latestDataModifyTime = latestDataModifyTime;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getIsDynamic() {
				return this.isDynamic;
			}

			public void setIsDynamic(Boolean isDynamic) {
				this.isDynamic = isDynamic;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getMappingTypes() {
				return this.mappingTypes;
			}

			public void setMappingTypes(List<String> mappingTypes) {
				this.mappingTypes = mappingTypes;
			}
		}
	}

	@Override
	public ListAudienceResponse getInstance(UnmarshallerContext context) {
		return	ListAudienceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
