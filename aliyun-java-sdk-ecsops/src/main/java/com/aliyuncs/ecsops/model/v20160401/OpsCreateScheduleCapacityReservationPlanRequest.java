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
public class OpsCreateScheduleCapacityReservationPlanRequest extends RpcAcsRequest<OpsCreateScheduleCapacityReservationPlanResponse> {
	   

	private String approveNotes;

	private Long onlineAmount;

	private String packageId;

	private Integer planType;

	private String operator;

	private String approveCode;

	private String instanceType;

	private String crId;

	private String matchCriteria;

	private Long offlineAmount;

	private String demandId;

	private String planId;

	private String izId;

	private String auditParamStr;

	private Integer status;

	private Long instanceAmount;
	public OpsCreateScheduleCapacityReservationPlanRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateScheduleCapacityReservationPlan", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getApproveNotes() {
		return this.approveNotes;
	}

	public void setApproveNotes(String approveNotes) {
		this.approveNotes = approveNotes;
		if(approveNotes != null){
			putQueryParameter("ApproveNotes", approveNotes);
		}
	}

	public Long getOnlineAmount() {
		return this.onlineAmount;
	}

	public void setOnlineAmount(Long onlineAmount) {
		this.onlineAmount = onlineAmount;
		if(onlineAmount != null){
			putQueryParameter("OnlineAmount", onlineAmount.toString());
		}
	}

	public String getPackageId() {
		return this.packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
		if(packageId != null){
			putQueryParameter("PackageId", packageId);
		}
	}

	public Integer getPlanType() {
		return this.planType;
	}

	public void setPlanType(Integer planType) {
		this.planType = planType;
		if(planType != null){
			putQueryParameter("PlanType", planType.toString());
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

	public String getApproveCode() {
		return this.approveCode;
	}

	public void setApproveCode(String approveCode) {
		this.approveCode = approveCode;
		if(approveCode != null){
			putQueryParameter("ApproveCode", approveCode);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getCrId() {
		return this.crId;
	}

	public void setCrId(String crId) {
		this.crId = crId;
		if(crId != null){
			putQueryParameter("CrId", crId);
		}
	}

	public String getMatchCriteria() {
		return this.matchCriteria;
	}

	public void setMatchCriteria(String matchCriteria) {
		this.matchCriteria = matchCriteria;
		if(matchCriteria != null){
			putQueryParameter("MatchCriteria", matchCriteria);
		}
	}

	public Long getOfflineAmount() {
		return this.offlineAmount;
	}

	public void setOfflineAmount(Long offlineAmount) {
		this.offlineAmount = offlineAmount;
		if(offlineAmount != null){
			putQueryParameter("OfflineAmount", offlineAmount.toString());
		}
	}

	public String getDemandId() {
		return this.demandId;
	}

	public void setDemandId(String demandId) {
		this.demandId = demandId;
		if(demandId != null){
			putQueryParameter("DemandId", demandId);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	public String getIzId() {
		return this.izId;
	}

	public void setIzId(String izId) {
		this.izId = izId;
		if(izId != null){
			putQueryParameter("IzId", izId);
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public Long getInstanceAmount() {
		return this.instanceAmount;
	}

	public void setInstanceAmount(Long instanceAmount) {
		this.instanceAmount = instanceAmount;
		if(instanceAmount != null){
			putQueryParameter("InstanceAmount", instanceAmount.toString());
		}
	}

	@Override
	public Class<OpsCreateScheduleCapacityReservationPlanResponse> getResponseClass() {
		return OpsCreateScheduleCapacityReservationPlanResponse.class;
	}

}
