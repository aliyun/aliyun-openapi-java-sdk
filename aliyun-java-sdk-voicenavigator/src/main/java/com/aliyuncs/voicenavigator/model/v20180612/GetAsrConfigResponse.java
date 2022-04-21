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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.GetAsrConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAsrConfigResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Integer httpStatusCode;

	private String code;

	private String errorMsg;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String asrVocabularyId;

		private String asrCustomizationId;

		private String asrAcousticModelId;

		private String asrClassVocabularyId;

		public String getAsrVocabularyId() {
			return this.asrVocabularyId;
		}

		public void setAsrVocabularyId(String asrVocabularyId) {
			this.asrVocabularyId = asrVocabularyId;
		}

		public String getAsrCustomizationId() {
			return this.asrCustomizationId;
		}

		public void setAsrCustomizationId(String asrCustomizationId) {
			this.asrCustomizationId = asrCustomizationId;
		}

		public String getAsrAcousticModelId() {
			return this.asrAcousticModelId;
		}

		public void setAsrAcousticModelId(String asrAcousticModelId) {
			this.asrAcousticModelId = asrAcousticModelId;
		}

		public String getAsrClassVocabularyId() {
			return this.asrClassVocabularyId;
		}

		public void setAsrClassVocabularyId(String asrClassVocabularyId) {
			this.asrClassVocabularyId = asrClassVocabularyId;
		}
	}

	@Override
	public GetAsrConfigResponse getInstance(UnmarshallerContext context) {
		return	GetAsrConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
