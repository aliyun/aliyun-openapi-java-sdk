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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryDataRangeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDataRangeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<ApiCopilotLlmCubeModelsItem> apiCopilotLlmCubeModels;

		private List<ApiCopilotThemeModelsItem> apiCopilotThemeModels;

		public List<ApiCopilotLlmCubeModelsItem> getApiCopilotLlmCubeModels() {
			return this.apiCopilotLlmCubeModels;
		}

		public void setApiCopilotLlmCubeModels(List<ApiCopilotLlmCubeModelsItem> apiCopilotLlmCubeModels) {
			this.apiCopilotLlmCubeModels = apiCopilotLlmCubeModels;
		}

		public List<ApiCopilotThemeModelsItem> getApiCopilotThemeModels() {
			return this.apiCopilotThemeModels;
		}

		public void setApiCopilotThemeModels(List<ApiCopilotThemeModelsItem> apiCopilotThemeModels) {
			this.apiCopilotThemeModels = apiCopilotThemeModels;
		}

		public static class ApiCopilotLlmCubeModelsItem {

			private String llmCubeId;

			private String alias;

			private String createUser;

			public String getLlmCubeId() {
				return this.llmCubeId;
			}

			public void setLlmCubeId(String llmCubeId) {
				this.llmCubeId = llmCubeId;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public String getCreateUser() {
				return this.createUser;
			}

			public void setCreateUser(String createUser) {
				this.createUser = createUser;
			}
		}

		public static class ApiCopilotThemeModelsItem {

			private String themeId;

			private String themeName;

			private String createUser;

			private List<ApiCopilotLlmCubeModelsItem2> apiCopilotLlmCubeModels1;

			public String getThemeId() {
				return this.themeId;
			}

			public void setThemeId(String themeId) {
				this.themeId = themeId;
			}

			public String getThemeName() {
				return this.themeName;
			}

			public void setThemeName(String themeName) {
				this.themeName = themeName;
			}

			public String getCreateUser() {
				return this.createUser;
			}

			public void setCreateUser(String createUser) {
				this.createUser = createUser;
			}

			public List<ApiCopilotLlmCubeModelsItem2> getApiCopilotLlmCubeModels1() {
				return this.apiCopilotLlmCubeModels1;
			}

			public void setApiCopilotLlmCubeModels1(List<ApiCopilotLlmCubeModelsItem2> apiCopilotLlmCubeModels1) {
				this.apiCopilotLlmCubeModels1 = apiCopilotLlmCubeModels1;
			}

			public static class ApiCopilotLlmCubeModelsItem2 {

				private String llmCubeId;

				private String alias;

				private String createUser;

				public String getLlmCubeId() {
					return this.llmCubeId;
				}

				public void setLlmCubeId(String llmCubeId) {
					this.llmCubeId = llmCubeId;
				}

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public String getCreateUser() {
					return this.createUser;
				}

				public void setCreateUser(String createUser) {
					this.createUser = createUser;
				}
			}
		}
	}

	@Override
	public QueryDataRangeResponse getInstance(UnmarshallerContext context) {
		return	QueryDataRangeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
