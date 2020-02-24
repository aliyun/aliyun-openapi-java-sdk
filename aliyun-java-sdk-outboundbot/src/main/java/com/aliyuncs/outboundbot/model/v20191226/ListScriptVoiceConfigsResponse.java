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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListScriptVoiceConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScriptVoiceConfigsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private ScriptVoiceConfigs scriptVoiceConfigs;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public ScriptVoiceConfigs getScriptVoiceConfigs() {
		return this.scriptVoiceConfigs;
	}

	public void setScriptVoiceConfigs(ScriptVoiceConfigs scriptVoiceConfigs) {
		this.scriptVoiceConfigs = scriptVoiceConfigs;
	}

	public static class ScriptVoiceConfigs {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<ScriptVoiceConfig> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<ScriptVoiceConfig> getList() {
			return this.list;
		}

		public void setList(List<ScriptVoiceConfig> list) {
			this.list = list;
		}

		public static class ScriptVoiceConfig {

			private String scriptVoiceConfigId;

			private String instanceId;

			private String scriptId;

			private String scriptContent;

			private String source;

			private String type;

			private String scriptWaveformRelation;

			public String getScriptVoiceConfigId() {
				return this.scriptVoiceConfigId;
			}

			public void setScriptVoiceConfigId(String scriptVoiceConfigId) {
				this.scriptVoiceConfigId = scriptVoiceConfigId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getScriptId() {
				return this.scriptId;
			}

			public void setScriptId(String scriptId) {
				this.scriptId = scriptId;
			}

			public String getScriptContent() {
				return this.scriptContent;
			}

			public void setScriptContent(String scriptContent) {
				this.scriptContent = scriptContent;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getScriptWaveformRelation() {
				return this.scriptWaveformRelation;
			}

			public void setScriptWaveformRelation(String scriptWaveformRelation) {
				this.scriptWaveformRelation = scriptWaveformRelation;
			}
		}
	}

	@Override
	public ListScriptVoiceConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListScriptVoiceConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
