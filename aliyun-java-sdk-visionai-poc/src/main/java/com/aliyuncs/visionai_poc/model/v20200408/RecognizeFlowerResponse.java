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

package com.aliyuncs.visionai_poc.model.v20200408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.visionai_poc.transform.v20200408.RecognizeFlowerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeFlowerResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Boolean success;

	private Response response;

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

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private Boolean success;

		private String url;

		private String requestId;

		private String errorCode;

		private String errorMessage;

		private Data data;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String external;

			private String confidence;

			private String roid;

			private String version;

			private String tips;

			private String modelName;

			private String prop;

			private String name;

			private String picUrl;

			private String sptId;

			private String description;

			private String predictRes;

			private List<Node> predictability;

			public String getExternal() {
				return this.external;
			}

			public void setExternal(String external) {
				this.external = external;
			}

			public String getConfidence() {
				return this.confidence;
			}

			public void setConfidence(String confidence) {
				this.confidence = confidence;
			}

			public String getRoid() {
				return this.roid;
			}

			public void setRoid(String roid) {
				this.roid = roid;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getTips() {
				return this.tips;
			}

			public void setTips(String tips) {
				this.tips = tips;
			}

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}

			public String getProp() {
				return this.prop;
			}

			public void setProp(String prop) {
				this.prop = prop;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPicUrl() {
				return this.picUrl;
			}

			public void setPicUrl(String picUrl) {
				this.picUrl = picUrl;
			}

			public String getSptId() {
				return this.sptId;
			}

			public void setSptId(String sptId) {
				this.sptId = sptId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getPredictRes() {
				return this.predictRes;
			}

			public void setPredictRes(String predictRes) {
				this.predictRes = predictRes;
			}

			public List<Node> getPredictability() {
				return this.predictability;
			}

			public void setPredictability(List<Node> predictability) {
				this.predictability = predictability;
			}

			public static class Node {

				private String score;

				private String tag;

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getTag() {
					return this.tag;
				}

				public void setTag(String tag) {
					this.tag = tag;
				}
			}
		}
	}

	@Override
	public RecognizeFlowerResponse getInstance(UnmarshallerContext context) {
		return	RecognizeFlowerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
