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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryRealtimeDetectConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryRealtimeDetectConfigResponse extends AcsResponse {

	private String requestId;

	private List<ScriptConfig> scriptConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScriptConfig> getScriptConfigs() {
		return this.scriptConfigs;
	}

	public void setScriptConfigs(List<ScriptConfig> scriptConfigs) {
		this.scriptConfigs = scriptConfigs;
	}

	public static class ScriptConfig {

		private Integer timeout;

		private Integer execFlowControl;

		private String execMode;

		private String execCondition;

		private String desc;

		private Boolean batchDetect;

		private String detectConfig;

		private String command;

		private String handler;

		private String name;

		private String target;

		private String configDesc;

		private Boolean enable;

		private List<String> params;

		private List<String> detectItems;

		public Integer getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Integer timeout) {
			this.timeout = timeout;
		}

		public Integer getExecFlowControl() {
			return this.execFlowControl;
		}

		public void setExecFlowControl(Integer execFlowControl) {
			this.execFlowControl = execFlowControl;
		}

		public String getExecMode() {
			return this.execMode;
		}

		public void setExecMode(String execMode) {
			this.execMode = execMode;
		}

		public String getExecCondition() {
			return this.execCondition;
		}

		public void setExecCondition(String execCondition) {
			this.execCondition = execCondition;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Boolean getBatchDetect() {
			return this.batchDetect;
		}

		public void setBatchDetect(Boolean batchDetect) {
			this.batchDetect = batchDetect;
		}

		public String getDetectConfig() {
			return this.detectConfig;
		}

		public void setDetectConfig(String detectConfig) {
			this.detectConfig = detectConfig;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}

		public String getHandler() {
			return this.handler;
		}

		public void setHandler(String handler) {
			this.handler = handler;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getConfigDesc() {
			return this.configDesc;
		}

		public void setConfigDesc(String configDesc) {
			this.configDesc = configDesc;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public List<String> getParams() {
			return this.params;
		}

		public void setParams(List<String> params) {
			this.params = params;
		}

		public List<String> getDetectItems() {
			return this.detectItems;
		}

		public void setDetectItems(List<String> detectItems) {
			this.detectItems = detectItems;
		}
	}

	@Override
	public OpsQueryRealtimeDetectConfigResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryRealtimeDetectConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
