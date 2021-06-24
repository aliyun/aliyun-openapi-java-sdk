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
public class OpsBatchCreateScheduleCapacityReservationPlanRequest extends RpcAcsRequest<OpsBatchCreateScheduleCapacityReservationPlanResponse> {
	   

	private List<EcsAcrDemandPlanModel> ecsAcrDemandPlanModels;

	private String operator;

	private Boolean isRecommended;

	private String demandId;

	private String auditParamStr;
	public OpsBatchCreateScheduleCapacityReservationPlanRequest() {
		super("Ecsops", "2016-04-01", "OpsBatchCreateScheduleCapacityReservationPlan", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<EcsAcrDemandPlanModel> getEcsAcrDemandPlanModels() {
		return this.ecsAcrDemandPlanModels;
	}

	public void setEcsAcrDemandPlanModels(List<EcsAcrDemandPlanModel> ecsAcrDemandPlanModels) {
		this.ecsAcrDemandPlanModels = ecsAcrDemandPlanModels;	
		if (ecsAcrDemandPlanModels != null) {
			for (int depth1 = 0; depth1 < ecsAcrDemandPlanModels.size(); depth1++) {
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".ApproveNotes" , ecsAcrDemandPlanModels.get(depth1).getApproveNotes());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".OnlineAmount" , ecsAcrDemandPlanModels.get(depth1).getOnlineAmount());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".CrId" , ecsAcrDemandPlanModels.get(depth1).getCrId());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".PackageId" , ecsAcrDemandPlanModels.get(depth1).getPackageId());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".PlanType" , ecsAcrDemandPlanModels.get(depth1).getPlanType());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".MatchCriteria" , ecsAcrDemandPlanModels.get(depth1).getMatchCriteria());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".Version" , ecsAcrDemandPlanModels.get(depth1).getVersion());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".OfflineAmount" , ecsAcrDemandPlanModels.get(depth1).getOfflineAmount());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".DemandId" , ecsAcrDemandPlanModels.get(depth1).getDemandId());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".ApproveCode" , ecsAcrDemandPlanModels.get(depth1).getApproveCode());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".InstanceType" , ecsAcrDemandPlanModels.get(depth1).getInstanceType());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".PlanId" , ecsAcrDemandPlanModels.get(depth1).getPlanId());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".IzId" , ecsAcrDemandPlanModels.get(depth1).getIzId());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".Status" , ecsAcrDemandPlanModels.get(depth1).getStatus());
				putQueryParameter("EcsAcrDemandPlanModel." + (depth1 + 1) + ".InstanceAmount" , ecsAcrDemandPlanModels.get(depth1).getInstanceAmount());
			}
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

	public Boolean getIsRecommended() {
		return this.isRecommended;
	}

	public void setIsRecommended(Boolean isRecommended) {
		this.isRecommended = isRecommended;
		if(isRecommended != null){
			putQueryParameter("IsRecommended", isRecommended.toString());
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

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public static class EcsAcrDemandPlanModel {

		private String approveNotes;

		private Long onlineAmount;

		private String crId;

		private String packageId;

		private Integer planType;

		private String matchCriteria;

		private Long version;

		private Long offlineAmount;

		private String demandId;

		private String approveCode;

		private String instanceType;

		private String planId;

		private String izId;

		private Integer status;

		private Long instanceAmount;

		public String getApproveNotes() {
			return this.approveNotes;
		}

		public void setApproveNotes(String approveNotes) {
			this.approveNotes = approveNotes;
		}

		public Long getOnlineAmount() {
			return this.onlineAmount;
		}

		public void setOnlineAmount(Long onlineAmount) {
			this.onlineAmount = onlineAmount;
		}

		public String getCrId() {
			return this.crId;
		}

		public void setCrId(String crId) {
			this.crId = crId;
		}

		public String getPackageId() {
			return this.packageId;
		}

		public void setPackageId(String packageId) {
			this.packageId = packageId;
		}

		public Integer getPlanType() {
			return this.planType;
		}

		public void setPlanType(Integer planType) {
			this.planType = planType;
		}

		public String getMatchCriteria() {
			return this.matchCriteria;
		}

		public void setMatchCriteria(String matchCriteria) {
			this.matchCriteria = matchCriteria;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public Long getOfflineAmount() {
			return this.offlineAmount;
		}

		public void setOfflineAmount(Long offlineAmount) {
			this.offlineAmount = offlineAmount;
		}

		public String getDemandId() {
			return this.demandId;
		}

		public void setDemandId(String demandId) {
			this.demandId = demandId;
		}

		public String getApproveCode() {
			return this.approveCode;
		}

		public void setApproveCode(String approveCode) {
			this.approveCode = approveCode;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getIzId() {
			return this.izId;
		}

		public void setIzId(String izId) {
			this.izId = izId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Long instanceAmount) {
			this.instanceAmount = instanceAmount;
		}
	}

	@Override
	public Class<OpsBatchCreateScheduleCapacityReservationPlanResponse> getResponseClass() {
		return OpsBatchCreateScheduleCapacityReservationPlanResponse.class;
	}

}
