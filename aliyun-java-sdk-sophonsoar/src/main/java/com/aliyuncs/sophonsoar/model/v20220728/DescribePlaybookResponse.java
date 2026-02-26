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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribePlaybookResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlaybookResponse extends AcsResponse {

	private String requestId;

	private Playbook playbook;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Playbook getPlaybook() {
		return this.playbook;
	}

	public void setPlaybook(Playbook playbook) {
		this.playbook = playbook;
	}

	public static class Playbook {

		private String gmtCreate;

		private String gmtModified;

		private String playbookUuid;

		private String taskflow;

		private String taskflowType;

		private String taskconfig;

		private String tenantId;

		private String inputtype;

		private String ownType;

		private Integer successExeNum;

		private Integer failExeNum;

		private Long lastExeTime;

		private String triggerInfo;

		private String operateType;

		private String displayName;

		private Integer riskLevel;

		private String type;

		private String inputParams;

		private String description;

		private String oss;

		private Boolean active;

		private String compiledresult;

		private String onlineOss;

		private Boolean onlineActive;

		private String onlineCompiledresult;

		private String executeMode;

		private String cron;

		private String onlineExecuteMode;

		private String onlineCron;

		private Long schedulerId;

		private Long onlineSchedulerId;

		private Integer parentId;

		private String outputParams;

		private String taskflowMd5;

		private String onlineReleaseUuid;

		private String onlineReleaseTime;

		private String releaseUuid;

		private String releaseTime;

		private String onlineReleaseTaskflowMd5;

		private String releaseTaskflowMd5;

		private Integer flag;

		private String rightLevel;

		private String taskFlowDesc;

		private String debugFlag;

		private Integer playbookStatus;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getPlaybookUuid() {
			return this.playbookUuid;
		}

		public void setPlaybookUuid(String playbookUuid) {
			this.playbookUuid = playbookUuid;
		}

		public String getTaskflow() {
			return this.taskflow;
		}

		public void setTaskflow(String taskflow) {
			this.taskflow = taskflow;
		}

		public String getTaskflowType() {
			return this.taskflowType;
		}

		public void setTaskflowType(String taskflowType) {
			this.taskflowType = taskflowType;
		}

		public String getTaskconfig() {
			return this.taskconfig;
		}

		public void setTaskconfig(String taskconfig) {
			this.taskconfig = taskconfig;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getInputtype() {
			return this.inputtype;
		}

		public void setInputtype(String inputtype) {
			this.inputtype = inputtype;
		}

		public String getOwnType() {
			return this.ownType;
		}

		public void setOwnType(String ownType) {
			this.ownType = ownType;
		}

		public Integer getSuccessExeNum() {
			return this.successExeNum;
		}

		public void setSuccessExeNum(Integer successExeNum) {
			this.successExeNum = successExeNum;
		}

		public Integer getFailExeNum() {
			return this.failExeNum;
		}

		public void setFailExeNum(Integer failExeNum) {
			this.failExeNum = failExeNum;
		}

		public Long getLastExeTime() {
			return this.lastExeTime;
		}

		public void setLastExeTime(Long lastExeTime) {
			this.lastExeTime = lastExeTime;
		}

		public String getTriggerInfo() {
			return this.triggerInfo;
		}

		public void setTriggerInfo(String triggerInfo) {
			this.triggerInfo = triggerInfo;
		}

		public String getOperateType() {
			return this.operateType;
		}

		public void setOperateType(String operateType) {
			this.operateType = operateType;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getInputParams() {
			return this.inputParams;
		}

		public void setInputParams(String inputParams) {
			this.inputParams = inputParams;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOss() {
			return this.oss;
		}

		public void setOss(String oss) {
			this.oss = oss;
		}

		public Boolean getActive() {
			return this.active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		public String getCompiledresult() {
			return this.compiledresult;
		}

		public void setCompiledresult(String compiledresult) {
			this.compiledresult = compiledresult;
		}

		public String getOnlineOss() {
			return this.onlineOss;
		}

		public void setOnlineOss(String onlineOss) {
			this.onlineOss = onlineOss;
		}

		public Boolean getOnlineActive() {
			return this.onlineActive;
		}

		public void setOnlineActive(Boolean onlineActive) {
			this.onlineActive = onlineActive;
		}

		public String getOnlineCompiledresult() {
			return this.onlineCompiledresult;
		}

		public void setOnlineCompiledresult(String onlineCompiledresult) {
			this.onlineCompiledresult = onlineCompiledresult;
		}

		public String getExecuteMode() {
			return this.executeMode;
		}

		public void setExecuteMode(String executeMode) {
			this.executeMode = executeMode;
		}

		public String getCron() {
			return this.cron;
		}

		public void setCron(String cron) {
			this.cron = cron;
		}

		public String getOnlineExecuteMode() {
			return this.onlineExecuteMode;
		}

		public void setOnlineExecuteMode(String onlineExecuteMode) {
			this.onlineExecuteMode = onlineExecuteMode;
		}

		public String getOnlineCron() {
			return this.onlineCron;
		}

		public void setOnlineCron(String onlineCron) {
			this.onlineCron = onlineCron;
		}

		public Long getSchedulerId() {
			return this.schedulerId;
		}

		public void setSchedulerId(Long schedulerId) {
			this.schedulerId = schedulerId;
		}

		public Long getOnlineSchedulerId() {
			return this.onlineSchedulerId;
		}

		public void setOnlineSchedulerId(Long onlineSchedulerId) {
			this.onlineSchedulerId = onlineSchedulerId;
		}

		public Integer getParentId() {
			return this.parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}

		public String getOutputParams() {
			return this.outputParams;
		}

		public void setOutputParams(String outputParams) {
			this.outputParams = outputParams;
		}

		public String getTaskflowMd5() {
			return this.taskflowMd5;
		}

		public void setTaskflowMd5(String taskflowMd5) {
			this.taskflowMd5 = taskflowMd5;
		}

		public String getOnlineReleaseUuid() {
			return this.onlineReleaseUuid;
		}

		public void setOnlineReleaseUuid(String onlineReleaseUuid) {
			this.onlineReleaseUuid = onlineReleaseUuid;
		}

		public String getOnlineReleaseTime() {
			return this.onlineReleaseTime;
		}

		public void setOnlineReleaseTime(String onlineReleaseTime) {
			this.onlineReleaseTime = onlineReleaseTime;
		}

		public String getReleaseUuid() {
			return this.releaseUuid;
		}

		public void setReleaseUuid(String releaseUuid) {
			this.releaseUuid = releaseUuid;
		}

		public String getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(String releaseTime) {
			this.releaseTime = releaseTime;
		}

		public String getOnlineReleaseTaskflowMd5() {
			return this.onlineReleaseTaskflowMd5;
		}

		public void setOnlineReleaseTaskflowMd5(String onlineReleaseTaskflowMd5) {
			this.onlineReleaseTaskflowMd5 = onlineReleaseTaskflowMd5;
		}

		public String getReleaseTaskflowMd5() {
			return this.releaseTaskflowMd5;
		}

		public void setReleaseTaskflowMd5(String releaseTaskflowMd5) {
			this.releaseTaskflowMd5 = releaseTaskflowMd5;
		}

		public Integer getFlag() {
			return this.flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}

		public String getRightLevel() {
			return this.rightLevel;
		}

		public void setRightLevel(String rightLevel) {
			this.rightLevel = rightLevel;
		}

		public String getTaskFlowDesc() {
			return this.taskFlowDesc;
		}

		public void setTaskFlowDesc(String taskFlowDesc) {
			this.taskFlowDesc = taskFlowDesc;
		}

		public String getDebugFlag() {
			return this.debugFlag;
		}

		public void setDebugFlag(String debugFlag) {
			this.debugFlag = debugFlag;
		}

		public Integer getPlaybookStatus() {
			return this.playbookStatus;
		}

		public void setPlaybookStatus(Integer playbookStatus) {
			this.playbookStatus = playbookStatus;
		}
	}

	@Override
	public DescribePlaybookResponse getInstance(UnmarshallerContext context) {
		return	DescribePlaybookResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
