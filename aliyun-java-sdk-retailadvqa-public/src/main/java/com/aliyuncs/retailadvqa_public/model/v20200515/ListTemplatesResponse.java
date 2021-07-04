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
import com.aliyuncs.retailadvqa_public.transform.v20200515.ListTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTemplatesResponse extends AcsResponse {

	private String errorDesc;

	private String errorCode;

	private Boolean success;

	private String traceId;

	private String requestId;

	private Data data;

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
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

		private Long totalNum;

		private Long pageSize;

		private Long pageNum;

		private List<ContentItem> content;

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

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private String id;

			private Long templateType;

			private Long templateStatus;

			private String smsTemplateCode;

			private String templateName;

			private String templateContent;

			private String smsContentSuffix;

			private String platformName;

			private String workspaceId;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Long getTemplateType() {
				return this.templateType;
			}

			public void setTemplateType(Long templateType) {
				this.templateType = templateType;
			}

			public Long getTemplateStatus() {
				return this.templateStatus;
			}

			public void setTemplateStatus(Long templateStatus) {
				this.templateStatus = templateStatus;
			}

			public String getSmsTemplateCode() {
				return this.smsTemplateCode;
			}

			public void setSmsTemplateCode(String smsTemplateCode) {
				this.smsTemplateCode = smsTemplateCode;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getTemplateContent() {
				return this.templateContent;
			}

			public void setTemplateContent(String templateContent) {
				this.templateContent = templateContent;
			}

			public String getSmsContentSuffix() {
				return this.smsContentSuffix;
			}

			public void setSmsContentSuffix(String smsContentSuffix) {
				this.smsContentSuffix = smsContentSuffix;
			}

			public String getPlatformName() {
				return this.platformName;
			}

			public void setPlatformName(String platformName) {
				this.platformName = platformName;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}
		}
	}

	@Override
	public ListTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
