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
import com.aliyuncs.outboundbot.transform.v20191226.ListScriptsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScriptsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Scripts scripts;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Scripts getScripts() {
		return this.scripts;
	}

	public void setScripts(Scripts scripts) {
		this.scripts = scripts;
	}

	public static class Scripts {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Script> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Script> getList() {
			return this.list;
		}

		public void setList(List<Script> list) {
			this.list = list;
		}

		public static class Script {

			private String status;

			private Long updateTime;

			private String scriptId;

			private Boolean isDebugDrafted;

			private String industry;

			private String scriptDescription;

			private Boolean isDrafted;

			private String debugStatus;

			private Boolean miniPlaybackEnable;

			private String rejectReason;

			private String failReason;

			private String scene;

			private String scriptName;

			private Boolean newBargeInEnable;

			private Boolean longWaitEnable;

			private Boolean emotionEnable;

			private Boolean isPreset;

			private String agentKey;

			private Boolean agentLlm;

			private Long agentId;

			private String nluEngine;

			private String nluAccessType;

			private Long createTime;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public String getScriptId() {
				return this.scriptId;
			}

			public void setScriptId(String scriptId) {
				this.scriptId = scriptId;
			}

			public Boolean getIsDebugDrafted() {
				return this.isDebugDrafted;
			}

			public void setIsDebugDrafted(Boolean isDebugDrafted) {
				this.isDebugDrafted = isDebugDrafted;
			}

			public String getIndustry() {
				return this.industry;
			}

			public void setIndustry(String industry) {
				this.industry = industry;
			}

			public String getScriptDescription() {
				return this.scriptDescription;
			}

			public void setScriptDescription(String scriptDescription) {
				this.scriptDescription = scriptDescription;
			}

			public Boolean getIsDrafted() {
				return this.isDrafted;
			}

			public void setIsDrafted(Boolean isDrafted) {
				this.isDrafted = isDrafted;
			}

			public String getDebugStatus() {
				return this.debugStatus;
			}

			public void setDebugStatus(String debugStatus) {
				this.debugStatus = debugStatus;
			}

			public Boolean getMiniPlaybackEnable() {
				return this.miniPlaybackEnable;
			}

			public void setMiniPlaybackEnable(Boolean miniPlaybackEnable) {
				this.miniPlaybackEnable = miniPlaybackEnable;
			}

			public String getRejectReason() {
				return this.rejectReason;
			}

			public void setRejectReason(String rejectReason) {
				this.rejectReason = rejectReason;
			}

			public String getFailReason() {
				return this.failReason;
			}

			public void setFailReason(String failReason) {
				this.failReason = failReason;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getScriptName() {
				return this.scriptName;
			}

			public void setScriptName(String scriptName) {
				this.scriptName = scriptName;
			}

			public Boolean getNewBargeInEnable() {
				return this.newBargeInEnable;
			}

			public void setNewBargeInEnable(Boolean newBargeInEnable) {
				this.newBargeInEnable = newBargeInEnable;
			}

			public Boolean getLongWaitEnable() {
				return this.longWaitEnable;
			}

			public void setLongWaitEnable(Boolean longWaitEnable) {
				this.longWaitEnable = longWaitEnable;
			}

			public Boolean getEmotionEnable() {
				return this.emotionEnable;
			}

			public void setEmotionEnable(Boolean emotionEnable) {
				this.emotionEnable = emotionEnable;
			}

			public Boolean getIsPreset() {
				return this.isPreset;
			}

			public void setIsPreset(Boolean isPreset) {
				this.isPreset = isPreset;
			}

			public String getAgentKey() {
				return this.agentKey;
			}

			public void setAgentKey(String agentKey) {
				this.agentKey = agentKey;
			}

			public Boolean getAgentLlm() {
				return this.agentLlm;
			}

			public void setAgentLlm(Boolean agentLlm) {
				this.agentLlm = agentLlm;
			}

			public Long getAgentId() {
				return this.agentId;
			}

			public void setAgentId(Long agentId) {
				this.agentId = agentId;
			}

			public String getNluEngine() {
				return this.nluEngine;
			}

			public void setNluEngine(String nluEngine) {
				this.nluEngine = nluEngine;
			}

			public String getNluAccessType() {
				return this.nluAccessType;
			}

			public void setNluAccessType(String nluAccessType) {
				this.nluAccessType = nluAccessType;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}
		}
	}

	@Override
	public ListScriptsResponse getInstance(UnmarshallerContext context) {
		return	ListScriptsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
