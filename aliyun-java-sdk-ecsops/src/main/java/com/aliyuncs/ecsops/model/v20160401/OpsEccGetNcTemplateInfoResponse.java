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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsEccGetNcTemplateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsEccGetNcTemplateInfoResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Data data;

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

		private String templateAliasName;

		private String templateDesc;

		private String configs;

		private Long gmtCreate;

		private String templateName;

		private Long gmtModified;

		private String adjustStandModels;

		public String getTemplateAliasName() {
			return this.templateAliasName;
		}

		public void setTemplateAliasName(String templateAliasName) {
			this.templateAliasName = templateAliasName;
		}

		public String getTemplateDesc() {
			return this.templateDesc;
		}

		public void setTemplateDesc(String templateDesc) {
			this.templateDesc = templateDesc;
		}

		public String getConfigs() {
			return this.configs;
		}

		public void setConfigs(String configs) {
			this.configs = configs;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getAdjustStandModels() {
			return this.adjustStandModels;
		}

		public void setAdjustStandModels(String adjustStandModels) {
			this.adjustStandModels = adjustStandModels;
		}
	}

	@Override
	public OpsEccGetNcTemplateInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsEccGetNcTemplateInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
