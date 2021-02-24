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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.CreatesSlotTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatesSlotTemplateResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private String requestId;

	private Model model;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private Long createTime;

		private Long modifyTime;

		private String tenantId;

		private String adSlotTemplateId;

		private String adSlotTemplateName;

		private String adSlotTemplateTitle;

		private String adSlotTemplatePic;

		private String adSlotTemplatePreview;

		private String adSlotTemplateDescription;

		private String adSlotType;

		private String templateConfig;

		private String extInfo;

		private Long version;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getAdSlotTemplateId() {
			return this.adSlotTemplateId;
		}

		public void setAdSlotTemplateId(String adSlotTemplateId) {
			this.adSlotTemplateId = adSlotTemplateId;
		}

		public String getAdSlotTemplateName() {
			return this.adSlotTemplateName;
		}

		public void setAdSlotTemplateName(String adSlotTemplateName) {
			this.adSlotTemplateName = adSlotTemplateName;
		}

		public String getAdSlotTemplateTitle() {
			return this.adSlotTemplateTitle;
		}

		public void setAdSlotTemplateTitle(String adSlotTemplateTitle) {
			this.adSlotTemplateTitle = adSlotTemplateTitle;
		}

		public String getAdSlotTemplatePic() {
			return this.adSlotTemplatePic;
		}

		public void setAdSlotTemplatePic(String adSlotTemplatePic) {
			this.adSlotTemplatePic = adSlotTemplatePic;
		}

		public String getAdSlotTemplatePreview() {
			return this.adSlotTemplatePreview;
		}

		public void setAdSlotTemplatePreview(String adSlotTemplatePreview) {
			this.adSlotTemplatePreview = adSlotTemplatePreview;
		}

		public String getAdSlotTemplateDescription() {
			return this.adSlotTemplateDescription;
		}

		public void setAdSlotTemplateDescription(String adSlotTemplateDescription) {
			this.adSlotTemplateDescription = adSlotTemplateDescription;
		}

		public String getAdSlotType() {
			return this.adSlotType;
		}

		public void setAdSlotType(String adSlotType) {
			this.adSlotType = adSlotType;
		}

		public String getTemplateConfig() {
			return this.templateConfig;
		}

		public void setTemplateConfig(String templateConfig) {
			this.templateConfig = templateConfig;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}
	}

	@Override
	public CreatesSlotTemplateResponse getInstance(UnmarshallerContext context) {
		return	CreatesSlotTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
