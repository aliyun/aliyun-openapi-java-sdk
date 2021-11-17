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

package com.aliyuncs.mindlive_biz.model.v20210214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mindlive_biz.transform.v20210214.QueryAvailableSellPointTemplateDemosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAvailableSellPointTemplateDemosResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private List<SellPointTemplateDemoDTO> data;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<SellPointTemplateDemoDTO> getData() {
		return this.data;
	}

	public void setData(List<SellPointTemplateDemoDTO> data) {
		this.data = data;
	}

	public static class SellPointTemplateDemoDTO {

		private String demoUrl;

		private String templateUuid;

		public String getDemoUrl() {
			return this.demoUrl;
		}

		public void setDemoUrl(String demoUrl) {
			this.demoUrl = demoUrl;
		}

		public String getTemplateUuid() {
			return this.templateUuid;
		}

		public void setTemplateUuid(String templateUuid) {
			this.templateUuid = templateUuid;
		}
	}

	@Override
	public QueryAvailableSellPointTemplateDemosResponse getInstance(UnmarshallerContext context) {
		return	QueryAvailableSellPointTemplateDemosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
