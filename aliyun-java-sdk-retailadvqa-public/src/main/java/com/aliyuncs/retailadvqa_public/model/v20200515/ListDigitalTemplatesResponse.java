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
import com.aliyuncs.retailadvqa_public.transform.v20200515.ListDigitalTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDigitalTemplatesResponse extends AcsResponse {

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

			private String templateName;

			private String templateTheme;

			private String smsTemplateCode;

			private Long templateStatus;

			private String platformName;

			private String platformId;

			private String reason;

			private String sign;

			private String supportProvider;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getTemplateTheme() {
				return this.templateTheme;
			}

			public void setTemplateTheme(String templateTheme) {
				this.templateTheme = templateTheme;
			}

			public String getSmsTemplateCode() {
				return this.smsTemplateCode;
			}

			public void setSmsTemplateCode(String smsTemplateCode) {
				this.smsTemplateCode = smsTemplateCode;
			}

			public Long getTemplateStatus() {
				return this.templateStatus;
			}

			public void setTemplateStatus(Long templateStatus) {
				this.templateStatus = templateStatus;
			}

			public String getPlatformName() {
				return this.platformName;
			}

			public void setPlatformName(String platformName) {
				this.platformName = platformName;
			}

			public String getPlatformId() {
				return this.platformId;
			}

			public void setPlatformId(String platformId) {
				this.platformId = platformId;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public String getSign() {
				return this.sign;
			}

			public void setSign(String sign) {
				this.sign = sign;
			}

			public String getSupportProvider() {
				return this.supportProvider;
			}

			public void setSupportProvider(String supportProvider) {
				this.supportProvider = supportProvider;
			}
		}
	}

	@Override
	public ListDigitalTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListDigitalTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
