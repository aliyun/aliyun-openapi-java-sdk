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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.ListChatappTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListChatappTemplateResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer total;

	private String accessDeniedDetail;

	private List<Template> listTemplate;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<Template> getListTemplate() {
		return this.listTemplate;
	}

	public void setListTemplate(List<Template> listTemplate) {
		this.listTemplate = listTemplate;
	}

	public static class Template {

		private String templateName;

		private String templateCode;

		private String auditStatus;

		private String language;

		private String category;

		private String templateType;

		private String reason;

		private Long lastUpdateTime;

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getTemplateCode() {
			return this.templateCode;
		}

		public void setTemplateCode(String templateCode) {
			this.templateCode = templateCode;
		}

		public String getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(String auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Long getLastUpdateTime() {
			return this.lastUpdateTime;
		}

		public void setLastUpdateTime(Long lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}
	}

	@Override
	public ListChatappTemplateResponse getInstance(UnmarshallerContext context) {
		return	ListChatappTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
