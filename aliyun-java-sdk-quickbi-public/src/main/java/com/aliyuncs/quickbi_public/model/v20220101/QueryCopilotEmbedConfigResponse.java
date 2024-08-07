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
import com.aliyuncs.quickbi_public.transform.v20220101.QueryCopilotEmbedConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCopilotEmbedConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<ResultItem> result;

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String copilotId;

		private String showName;

		private String createUser;

		private String createUserName;

		private String modifyUser;

		private String moduleName;

		private String agentName;

		private DataRange dataRange;

		public String getCopilotId() {
			return this.copilotId;
		}

		public void setCopilotId(String copilotId) {
			this.copilotId = copilotId;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getCreateUser() {
			return this.createUser;
		}

		public void setCreateUser(String createUser) {
			this.createUser = createUser;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public String getModifyUser() {
			return this.modifyUser;
		}

		public void setModifyUser(String modifyUser) {
			this.modifyUser = modifyUser;
		}

		public String getModuleName() {
			return this.moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}

		public String getAgentName() {
			return this.agentName;
		}

		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}

		public DataRange getDataRange() {
			return this.dataRange;
		}

		public void setDataRange(DataRange dataRange) {
			this.dataRange = dataRange;
		}

		public static class DataRange {

			private Boolean allTheme;

			private Boolean allCube;

			private List<String> themes;

			private List<String> llmCubes;

			public Boolean getAllTheme() {
				return this.allTheme;
			}

			public void setAllTheme(Boolean allTheme) {
				this.allTheme = allTheme;
			}

			public Boolean getAllCube() {
				return this.allCube;
			}

			public void setAllCube(Boolean allCube) {
				this.allCube = allCube;
			}

			public List<String> getThemes() {
				return this.themes;
			}

			public void setThemes(List<String> themes) {
				this.themes = themes;
			}

			public List<String> getLlmCubes() {
				return this.llmCubes;
			}

			public void setLlmCubes(List<String> llmCubes) {
				this.llmCubes = llmCubes;
			}
		}
	}

	@Override
	public QueryCopilotEmbedConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryCopilotEmbedConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
