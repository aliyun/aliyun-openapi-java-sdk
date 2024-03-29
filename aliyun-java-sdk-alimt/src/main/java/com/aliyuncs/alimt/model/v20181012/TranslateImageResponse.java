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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alimt.transform.v20181012.TranslateImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TranslateImageResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String inPaintingUrl;

		private String templateJson;

		private String finalImageUrl;

		public String getInPaintingUrl() {
			return this.inPaintingUrl;
		}

		public void setInPaintingUrl(String inPaintingUrl) {
			this.inPaintingUrl = inPaintingUrl;
		}

		public String getTemplateJson() {
			return this.templateJson;
		}

		public void setTemplateJson(String templateJson) {
			this.templateJson = templateJson;
		}

		public String getFinalImageUrl() {
			return this.finalImageUrl;
		}

		public void setFinalImageUrl(String finalImageUrl) {
			this.finalImageUrl = finalImageUrl;
		}
	}

	@Override
	public TranslateImageResponse getInstance(UnmarshallerContext context) {
		return	TranslateImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
