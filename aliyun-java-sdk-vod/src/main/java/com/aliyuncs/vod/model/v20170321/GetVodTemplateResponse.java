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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetVodTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVodTemplateResponse extends AcsResponse {

	private String requestId;

	private VodTemplateInfo vodTemplateInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VodTemplateInfo getVodTemplateInfo() {
		return this.vodTemplateInfo;
	}

	public void setVodTemplateInfo(VodTemplateInfo vodTemplateInfo) {
		this.vodTemplateInfo = vodTemplateInfo;
	}

	public static class VodTemplateInfo {

		private String name;

		private String vodTemplateId;

		private String templateType;

		private String subTemplateType;

		private String source;

		private String isDefault;

		private String templateConfig;

		private String creationTime;

		private String modifyTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVodTemplateId() {
			return this.vodTemplateId;
		}

		public void setVodTemplateId(String vodTemplateId) {
			this.vodTemplateId = vodTemplateId;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public String getSubTemplateType() {
			return this.subTemplateType;
		}

		public void setSubTemplateType(String subTemplateType) {
			this.subTemplateType = subTemplateType;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(String isDefault) {
			this.isDefault = isDefault;
		}

		public String getTemplateConfig() {
			return this.templateConfig;
		}

		public void setTemplateConfig(String templateConfig) {
			this.templateConfig = templateConfig;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public GetVodTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetVodTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
