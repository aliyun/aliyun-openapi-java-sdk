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
import com.aliyuncs.visionai_poc.transform.v20200408.RecognizeLabelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeLabelResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Response response;

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

			private List<Node> objects;

			public List<Node> getObjects() {
				return this.objects;
			}

			public void setObjects(List<Node> objects) {
				this.objects = objects;
			}

			public static class Node {

				private PropertiesResults propertiesResults;

				public PropertiesResults getPropertiesResults() {
					return this.propertiesResults;
				}

				public void setPropertiesResults(PropertiesResults propertiesResults) {
					this.propertiesResults = propertiesResults;
				}

				public static class PropertiesResults {

					private String propertyId;

					private String propertyName;

					private List<SubNode> values;

					public String getPropertyId() {
						return this.propertyId;
					}

					public void setPropertyId(String propertyId) {
						this.propertyId = propertyId;
					}

					public String getPropertyName() {
						return this.propertyName;
					}

					public void setPropertyName(String propertyName) {
						this.propertyName = propertyName;
					}

					public List<SubNode> getValues() {
						return this.values;
					}

					public void setValues(List<SubNode> values) {
						this.values = values;
					}

					public static class SubNode {

						private Integer probability;

						private String valueId;

						private String valueName;

						public Integer getProbability() {
							return this.probability;
						}

						public void setProbability(Integer probability) {
							this.probability = probability;
						}

						public String getValueId() {
							return this.valueId;
						}

						public void setValueId(String valueId) {
							this.valueId = valueId;
						}

						public String getValueName() {
							return this.valueName;
						}

						public void setValueName(String valueName) {
							this.valueName = valueName;
						}
					}
				}
			}
		}
	}

	@Override
	public RecognizeLabelResponse getInstance(UnmarshallerContext context) {
		return	RecognizeLabelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
