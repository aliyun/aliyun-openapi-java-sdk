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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsLiveMigrateEcsInstanceRequest extends RpcAcsRequest<OpsLiveMigrateEcsInstanceResponse> {
	   

	private Boolean noNeedCheckXenVpc;

	private String strictMatchExpression;

	private Boolean noNeedCheckSlb;

	private Boolean noNeedCheckPackage;

	private Boolean needCpuTune;

	private Boolean needVirtPreCheck;

	private Boolean noNeedCheckCpu;

	private Boolean ignorePerNcLimit;

	private String operator;

	private Long timeout;

	private Boolean noNeedCheckTapdisk;

	private Long rate;

	private String nonStrictMatchExpression;

	private String destinationNcId;

	private Boolean forceScheduleInZone;

	private Boolean canCpuOverhead;

	private Boolean forceScheduleInZoneGroup;

	private Long downtime;

	private String workOrderId;

	private String instanceId;

	private Boolean noNeedCheckImage;

	private String workFlowBizId;

	private Boolean noNeedCheckLoad;

	private Boolean canUseReservedNc;

	private String auditParamStr;
	public OpsLiveMigrateEcsInstanceRequest() {
		super("Ecsops", "2016-04-01", "OpsLiveMigrateEcsInstance", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getNoNeedCheckXenVpc() {
		return this.noNeedCheckXenVpc;
	}

	public void setNoNeedCheckXenVpc(Boolean noNeedCheckXenVpc) {
		this.noNeedCheckXenVpc = noNeedCheckXenVpc;
		if(noNeedCheckXenVpc != null){
			putQueryParameter("NoNeedCheckXenVpc", noNeedCheckXenVpc.toString());
		}
	}

	public String getStrictMatchExpression() {
		return this.strictMatchExpression;
	}

	public void setStrictMatchExpression(String strictMatchExpression) {
		this.strictMatchExpression = strictMatchExpression;
		if(strictMatchExpression != null){
			putQueryParameter("StrictMatchExpression", strictMatchExpression);
		}
	}

	public Boolean getNoNeedCheckSlb() {
		return this.noNeedCheckSlb;
	}

	public void setNoNeedCheckSlb(Boolean noNeedCheckSlb) {
		this.noNeedCheckSlb = noNeedCheckSlb;
		if(noNeedCheckSlb != null){
			putQueryParameter("NoNeedCheckSlb", noNeedCheckSlb.toString());
		}
	}

	public Boolean getNoNeedCheckPackage() {
		return this.noNeedCheckPackage;
	}

	public void setNoNeedCheckPackage(Boolean noNeedCheckPackage) {
		this.noNeedCheckPackage = noNeedCheckPackage;
		if(noNeedCheckPackage != null){
			putQueryParameter("NoNeedCheckPackage", noNeedCheckPackage.toString());
		}
	}

	public Boolean getNeedCpuTune() {
		return this.needCpuTune;
	}

	public void setNeedCpuTune(Boolean needCpuTune) {
		this.needCpuTune = needCpuTune;
		if(needCpuTune != null){
			putQueryParameter("NeedCpuTune", needCpuTune.toString());
		}
	}

	public Boolean getNeedVirtPreCheck() {
		return this.needVirtPreCheck;
	}

	public void setNeedVirtPreCheck(Boolean needVirtPreCheck) {
		this.needVirtPreCheck = needVirtPreCheck;
		if(needVirtPreCheck != null){
			putQueryParameter("NeedVirtPreCheck", needVirtPreCheck.toString());
		}
	}

	public Boolean getNoNeedCheckCpu() {
		return this.noNeedCheckCpu;
	}

	public void setNoNeedCheckCpu(Boolean noNeedCheckCpu) {
		this.noNeedCheckCpu = noNeedCheckCpu;
		if(noNeedCheckCpu != null){
			putQueryParameter("NoNeedCheckCpu", noNeedCheckCpu.toString());
		}
	}

	public Boolean getIgnorePerNcLimit() {
		return this.ignorePerNcLimit;
	}

	public void setIgnorePerNcLimit(Boolean ignorePerNcLimit) {
		this.ignorePerNcLimit = ignorePerNcLimit;
		if(ignorePerNcLimit != null){
			putQueryParameter("IgnorePerNcLimit", ignorePerNcLimit.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public Boolean getNoNeedCheckTapdisk() {
		return this.noNeedCheckTapdisk;
	}

	public void setNoNeedCheckTapdisk(Boolean noNeedCheckTapdisk) {
		this.noNeedCheckTapdisk = noNeedCheckTapdisk;
		if(noNeedCheckTapdisk != null){
			putQueryParameter("NoNeedCheckTapdisk", noNeedCheckTapdisk.toString());
		}
	}

	public Long getRate() {
		return this.rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
		if(rate != null){
			putQueryParameter("Rate", rate.toString());
		}
	}

	public String getNonStrictMatchExpression() {
		return this.nonStrictMatchExpression;
	}

	public void setNonStrictMatchExpression(String nonStrictMatchExpression) {
		this.nonStrictMatchExpression = nonStrictMatchExpression;
		if(nonStrictMatchExpression != null){
			putQueryParameter("NonStrictMatchExpression", nonStrictMatchExpression);
		}
	}

	public String getDestinationNcId() {
		return this.destinationNcId;
	}

	public void setDestinationNcId(String destinationNcId) {
		this.destinationNcId = destinationNcId;
		if(destinationNcId != null){
			putQueryParameter("DestinationNcId", destinationNcId);
		}
	}

	public Boolean getForceScheduleInZone() {
		return this.forceScheduleInZone;
	}

	public void setForceScheduleInZone(Boolean forceScheduleInZone) {
		this.forceScheduleInZone = forceScheduleInZone;
		if(forceScheduleInZone != null){
			putQueryParameter("ForceScheduleInZone", forceScheduleInZone.toString());
		}
	}

	public Boolean getCanCpuOverhead() {
		return this.canCpuOverhead;
	}

	public void setCanCpuOverhead(Boolean canCpuOverhead) {
		this.canCpuOverhead = canCpuOverhead;
		if(canCpuOverhead != null){
			putQueryParameter("CanCpuOverhead", canCpuOverhead.toString());
		}
	}

	public Boolean getForceScheduleInZoneGroup() {
		return this.forceScheduleInZoneGroup;
	}

	public void setForceScheduleInZoneGroup(Boolean forceScheduleInZoneGroup) {
		this.forceScheduleInZoneGroup = forceScheduleInZoneGroup;
		if(forceScheduleInZoneGroup != null){
			putQueryParameter("ForceScheduleInZoneGroup", forceScheduleInZoneGroup.toString());
		}
	}

	public Long getDowntime() {
		return this.downtime;
	}

	public void setDowntime(Long downtime) {
		this.downtime = downtime;
		if(downtime != null){
			putQueryParameter("Downtime", downtime.toString());
		}
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Boolean getNoNeedCheckImage() {
		return this.noNeedCheckImage;
	}

	public void setNoNeedCheckImage(Boolean noNeedCheckImage) {
		this.noNeedCheckImage = noNeedCheckImage;
		if(noNeedCheckImage != null){
			putQueryParameter("NoNeedCheckImage", noNeedCheckImage.toString());
		}
	}

	public String getWorkFlowBizId() {
		return this.workFlowBizId;
	}

	public void setWorkFlowBizId(String workFlowBizId) {
		this.workFlowBizId = workFlowBizId;
		if(workFlowBizId != null){
			putQueryParameter("WorkFlowBizId", workFlowBizId);
		}
	}

	public Boolean getNoNeedCheckLoad() {
		return this.noNeedCheckLoad;
	}

	public void setNoNeedCheckLoad(Boolean noNeedCheckLoad) {
		this.noNeedCheckLoad = noNeedCheckLoad;
		if(noNeedCheckLoad != null){
			putQueryParameter("NoNeedCheckLoad", noNeedCheckLoad.toString());
		}
	}

	public Boolean getCanUseReservedNc() {
		return this.canUseReservedNc;
	}

	public void setCanUseReservedNc(Boolean canUseReservedNc) {
		this.canUseReservedNc = canUseReservedNc;
		if(canUseReservedNc != null){
			putQueryParameter("CanUseReservedNc", canUseReservedNc.toString());
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
	public Class<OpsLiveMigrateEcsInstanceResponse> getResponseClass() {
		return OpsLiveMigrateEcsInstanceResponse.class;
	}

}
