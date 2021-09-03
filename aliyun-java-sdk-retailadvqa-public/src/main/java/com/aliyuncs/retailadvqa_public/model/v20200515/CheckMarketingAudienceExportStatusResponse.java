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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.CheckMarketingAudienceExportStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckMarketingAudienceExportStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorDesc;

	private String traceId;

	private String errorCode;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String ossFilePath;

		private String exportStatus;

		public String getOssFilePath() {
			return this.ossFilePath;
		}

		public void setOssFilePath(String ossFilePath) {
			this.ossFilePath = ossFilePath;
		}

		public String getExportStatus() {
			return this.exportStatus;
		}

		public void setExportStatus(String exportStatus) {
			this.exportStatus = exportStatus;
		}
	}

	@Override
	public CheckMarketingAudienceExportStatusResponse getInstance(UnmarshallerContext context) {
		return	CheckMarketingAudienceExportStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
