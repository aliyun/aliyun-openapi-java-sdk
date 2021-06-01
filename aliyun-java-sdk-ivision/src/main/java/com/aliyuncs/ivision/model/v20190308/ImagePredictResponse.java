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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.ImagePredictResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ImagePredictResponse extends AcsResponse {

	private String requestId;

	private ImagePredict imagePredict;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ImagePredict getImagePredict() {
		return this.imagePredict;
	}

	public void setImagePredict(ImagePredict imagePredict) {
		this.imagePredict = imagePredict;
	}

	public static class ImagePredict {

		private String status;

		private String predictResult;

		private String predictId;

		private String predictTime;

		private String dataUrl;

		private String code;

		private String message;

		private String modelId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPredictResult() {
			return this.predictResult;
		}

		public void setPredictResult(String predictResult) {
			this.predictResult = predictResult;
		}

		public String getPredictId() {
			return this.predictId;
		}

		public void setPredictId(String predictId) {
			this.predictId = predictId;
		}

		public String getPredictTime() {
			return this.predictTime;
		}

		public void setPredictTime(String predictTime) {
			this.predictTime = predictTime;
		}

		public String getDataUrl() {
			return this.dataUrl;
		}

		public void setDataUrl(String dataUrl) {
			this.dataUrl = dataUrl;
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

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}
	}

	@Override
	public ImagePredictResponse getInstance(UnmarshallerContext context) {
		return	ImagePredictResponseUnmarshaller.unmarshall(this, context);
	}
}
