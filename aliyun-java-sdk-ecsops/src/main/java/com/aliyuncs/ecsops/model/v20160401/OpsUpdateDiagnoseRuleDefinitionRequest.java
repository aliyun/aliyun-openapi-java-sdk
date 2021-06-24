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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateDiagnoseRuleDefinitionRequest extends RpcAcsRequest<OpsUpdateDiagnoseRuleDefinitionResponse> {
	   

	private String reason;

	private String targetType;

	private Integer delayExec;

	private List<String> exclusions;

	private String opsType;

	private String modifiedUser;

	private Integer maxTimes;

	private Boolean enable;

	private Long silent;

	private String level;

	private String shortDesc;

	private List<String> conditions;

	private String name;

	private List<String> targetActions;

	private String auditParamStr;
	public OpsUpdateDiagnoseRuleDefinitionRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateDiagnoseRuleDefinition", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public Integer getDelayExec() {
		return this.delayExec;
	}

	public void setDelayExec(Integer delayExec) {
		this.delayExec = delayExec;
		if(delayExec != null){
			putQueryParameter("DelayExec", delayExec.toString());
		}
	}

	public List<String> getExclusions() {
		return this.exclusions;
	}

	public void setExclusions(List<String> exclusions) {
		this.exclusions = exclusions;	
		if (exclusions != null) {
			for (int i = 0; i < exclusions.size(); i++) {
				putQueryParameter("Exclusion." + (i + 1) , exclusions.get(i));
			}
		}	
	}

	public String getOpsType() {
		return this.opsType;
	}

	public void setOpsType(String opsType) {
		this.opsType = opsType;
		if(opsType != null){
			putQueryParameter("OpsType", opsType);
		}
	}

	public String getModifiedUser() {
		return this.modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
		if(modifiedUser != null){
			putQueryParameter("ModifiedUser", modifiedUser);
		}
	}

	public Integer getMaxTimes() {
		return this.maxTimes;
	}

	public void setMaxTimes(Integer maxTimes) {
		this.maxTimes = maxTimes;
		if(maxTimes != null){
			putQueryParameter("MaxTimes", maxTimes.toString());
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public Long getSilent() {
		return this.silent;
	}

	public void setSilent(Long silent) {
		this.silent = silent;
		if(silent != null){
			putQueryParameter("Silent", silent.toString());
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public String getShortDesc() {
		return this.shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
		if(shortDesc != null){
			putQueryParameter("ShortDesc", shortDesc);
		}
	}

	public List<String> getConditions() {
		return this.conditions;
	}

	public void setConditions(List<String> conditions) {
		this.conditions = conditions;	
		if (conditions != null) {
			for (int i = 0; i < conditions.size(); i++) {
				putQueryParameter("Condition." + (i + 1) , conditions.get(i));
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public List<String> getTargetActions() {
		return this.targetActions;
	}

	public void setTargetActions(List<String> targetActions) {
		this.targetActions = targetActions;	
		if (targetActions != null) {
			for (int i = 0; i < targetActions.size(); i++) {
				putQueryParameter("TargetAction." + (i + 1) , targetActions.get(i));
			}
		}	
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsUpdateDiagnoseRuleDefinitionResponse> getResponseClass() {
		return OpsUpdateDiagnoseRuleDefinitionResponse.class;
	}

}
