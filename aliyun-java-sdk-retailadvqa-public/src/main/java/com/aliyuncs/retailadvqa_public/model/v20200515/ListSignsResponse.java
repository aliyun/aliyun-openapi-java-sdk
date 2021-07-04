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
import com.aliyuncs.retailadvqa_public.transform.v20200515.ListSignsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSignsResponse extends AcsResponse {

	private String errorCode;

	private String errorDesc;

	private Boolean success;

	private String traceId;

	private String requestId;

	private Data data;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
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

		private Long pageNum;

		private Long pageSize;

		private Long totalNum;

		private List<ContentItem> content;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private String id;

			private String platformName;

			private Long gmtCreate;

			private Long signStatus;

			private String qaAccountId;

			private String createUserName;

			private String signName;

			private String errDescription;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getPlatformName() {
				return this.platformName;
			}

			public void setPlatformName(String platformName) {
				this.platformName = platformName;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getSignStatus() {
				return this.signStatus;
			}

			public void setSignStatus(Long signStatus) {
				this.signStatus = signStatus;
			}

			public String getQaAccountId() {
				return this.qaAccountId;
			}

			public void setQaAccountId(String qaAccountId) {
				this.qaAccountId = qaAccountId;
			}

			public String getCreateUserName() {
				return this.createUserName;
			}

			public void setCreateUserName(String createUserName) {
				this.createUserName = createUserName;
			}

			public String getSignName() {
				return this.signName;
			}

			public void setSignName(String signName) {
				this.signName = signName;
			}

			public String getErrDescription() {
				return this.errDescription;
			}

			public void setErrDescription(String errDescription) {
				this.errDescription = errDescription;
			}
		}
	}

	@Override
	public ListSignsResponse getInstance(UnmarshallerContext context) {
		return	ListSignsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
