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

package com.aliyuncs.alimt.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alimt.transform.v20181012.GetTranslateImageBatchResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTranslateImageBatchResultResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private List<CertificateImageTranslateResult> result;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<CertificateImageTranslateResult> getResult() {
			return this.result;
		}

		public void setResult(List<CertificateImageTranslateResult> result) {
			this.result = result;
		}

		public static class CertificateImageTranslateResult {

			private String inPaintingUrl;

			private String finalImageUrl;

			private String templateJson;

			private String sourceImageUrl;

			private Integer code;

			private String message;

			private Boolean success;

			public String getInPaintingUrl() {
				return this.inPaintingUrl;
			}

			public void setInPaintingUrl(String inPaintingUrl) {
				this.inPaintingUrl = inPaintingUrl;
			}

			public String getFinalImageUrl() {
				return this.finalImageUrl;
			}

			public void setFinalImageUrl(String finalImageUrl) {
				this.finalImageUrl = finalImageUrl;
			}

			public String getTemplateJson() {
				return this.templateJson;
			}

			public void setTemplateJson(String templateJson) {
				this.templateJson = templateJson;
			}

			public String getSourceImageUrl() {
				return this.sourceImageUrl;
			}

			public void setSourceImageUrl(String sourceImageUrl) {
				this.sourceImageUrl = sourceImageUrl;
			}

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}
		}
	}

	@Override
	public GetTranslateImageBatchResultResponse getInstance(UnmarshallerContext context) {
		return	GetTranslateImageBatchResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
