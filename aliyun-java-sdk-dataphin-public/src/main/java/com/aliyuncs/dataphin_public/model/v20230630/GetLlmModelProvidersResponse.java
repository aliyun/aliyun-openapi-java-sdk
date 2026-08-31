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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetLlmModelProvidersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLlmModelProvidersResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String serviceProvider;

		private Boolean enabled;

		private String providerSource;

		private Long id;

		private String baseUrl;

		private String providerType;

		private List<LlmModel> llmModels;

		public String getServiceProvider() {
			return this.serviceProvider;
		}

		public void setServiceProvider(String serviceProvider) {
			this.serviceProvider = serviceProvider;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getProviderSource() {
			return this.providerSource;
		}

		public void setProviderSource(String providerSource) {
			this.providerSource = providerSource;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBaseUrl() {
			return this.baseUrl;
		}

		public void setBaseUrl(String baseUrl) {
			this.baseUrl = baseUrl;
		}

		public String getProviderType() {
			return this.providerType;
		}

		public void setProviderType(String providerType) {
			this.providerType = providerType;
		}

		public List<LlmModel> getLlmModels() {
			return this.llmModels;
		}

		public void setLlmModels(List<LlmModel> llmModels) {
			this.llmModels = llmModels;
		}

		public static class LlmModel {

			private String cnName;

			private String description;

			private String serviceProvider;

			private String invokeType;

			private Boolean enabled;

			private Long modelId;

			private String name;

			private List<String> modelTypes;

			private List<String> tasks;

			private List<Integer> embeddingDimensions;

			public String getCnName() {
				return this.cnName;
			}

			public void setCnName(String cnName) {
				this.cnName = cnName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getServiceProvider() {
				return this.serviceProvider;
			}

			public void setServiceProvider(String serviceProvider) {
				this.serviceProvider = serviceProvider;
			}

			public String getInvokeType() {
				return this.invokeType;
			}

			public void setInvokeType(String invokeType) {
				this.invokeType = invokeType;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public Long getModelId() {
				return this.modelId;
			}

			public void setModelId(Long modelId) {
				this.modelId = modelId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<String> getModelTypes() {
				return this.modelTypes;
			}

			public void setModelTypes(List<String> modelTypes) {
				this.modelTypes = modelTypes;
			}

			public List<String> getTasks() {
				return this.tasks;
			}

			public void setTasks(List<String> tasks) {
				this.tasks = tasks;
			}

			public List<Integer> getEmbeddingDimensions() {
				return this.embeddingDimensions;
			}

			public void setEmbeddingDimensions(List<Integer> embeddingDimensions) {
				this.embeddingDimensions = embeddingDimensions;
			}
		}
	}

	@Override
	public GetLlmModelProvidersResponse getInstance(UnmarshallerContext context) {
		return	GetLlmModelProvidersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
