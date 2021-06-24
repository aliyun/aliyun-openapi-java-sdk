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
import com.aliyuncs.ecsops.transform.v20160401.OpsBatchCreateScheduleCapacityReservationPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsBatchCreateScheduleCapacityReservationPlanResponse extends AcsResponse {

	private String requestId;

	private List<EcsAcrDemandPlanModel> ecsAcrDemandPlanModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EcsAcrDemandPlanModel> getEcsAcrDemandPlanModels() {
		return this.ecsAcrDemandPlanModels;
	}

	public void setEcsAcrDemandPlanModels(List<EcsAcrDemandPlanModel> ecsAcrDemandPlanModels) {
		this.ecsAcrDemandPlanModels = ecsAcrDemandPlanModels;
	}

	public static class EcsAcrDemandPlanModel {

		private String matchCriteria;

		private Integer status;

		private Long onlineAmount;

		private String izId;

		private String demandId;

		private String approveCode;

		private String crId;

		private String instanceType;

		private String planId;

		private Long instanceAmount;

		private Long offlineAmount;

		private String approveNotes;

		private String packageId;

		private Integer planType;

		private Long version;

		public String getMatchCriteria() {
			return this.matchCriteria;
		}

		public void setMatchCriteria(String matchCriteria) {
			this.matchCriteria = matchCriteria;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getOnlineAmount() {
			return this.onlineAmount;
		}

		public void setOnlineAmount(Long onlineAmount) {
			this.onlineAmount = onlineAmount;
		}

		public String getIzId() {
			return this.izId;
		}

		public void setIzId(String izId) {
			this.izId = izId;
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

		public String getCrId() {
			return this.crId;
		}

		public void setCrId(String crId) {
			this.crId = crId;
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

		public Long getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Long instanceAmount) {
			this.instanceAmount = instanceAmount;
		}

		public Long getOfflineAmount() {
			return this.offlineAmount;
		}

		public void setOfflineAmount(Long offlineAmount) {
			this.offlineAmount = offlineAmount;
		}

		public String getApproveNotes() {
			return this.approveNotes;
		}

		public void setApproveNotes(String approveNotes) {
			this.approveNotes = approveNotes;
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

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}
	}

	@Override
	public OpsBatchCreateScheduleCapacityReservationPlanResponse getInstance(UnmarshallerContext context) {
		return	OpsBatchCreateScheduleCapacityReservationPlanResponseUnmarshaller.unmarshall(this, context);
	}
}
