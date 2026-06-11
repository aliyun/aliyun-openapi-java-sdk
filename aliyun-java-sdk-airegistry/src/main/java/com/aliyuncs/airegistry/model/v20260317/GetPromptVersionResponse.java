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

package com.aliyuncs.airegistry.model.v20260317;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airegistry.transform.v20260317.GetPromptVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPromptVersionResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private String promptKey;

		private String version;

		private String status;

		private String template;

		private String commitMsg;

		private String srcUser;

		private Long gmtModified;

		private String md5;

		private List<Variable> variables;

		public String getPromptKey() {
			return this.promptKey;
		}

		public void setPromptKey(String promptKey) {
			this.promptKey = promptKey;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public String getCommitMsg() {
			return this.commitMsg;
		}

		public void setCommitMsg(String commitMsg) {
			this.commitMsg = commitMsg;
		}

		public String getSrcUser() {
			return this.srcUser;
		}

		public void setSrcUser(String srcUser) {
			this.srcUser = srcUser;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public List<Variable> getVariables() {
			return this.variables;
		}

		public void setVariables(List<Variable> variables) {
			this.variables = variables;
		}

		public static class Variable {

			private String name;

			private String defaultValue;

			private String description;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public GetPromptVersionResponse getInstance(UnmarshallerContext context) {
		return	GetPromptVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
