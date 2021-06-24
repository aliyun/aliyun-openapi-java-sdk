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
public class OpsCreateDemandRequest extends RpcAcsRequest<OpsCreateDemandResponse> {
	   

	private String demandTime;

	private String demandSupplyPmName;

	private String sumitterName;

	private String sumitterUid;

	private String batchName;

	private String demandSupplyPmUid;

	private Long customerUid;

	private String demandId;

	private String outId;

	private String comment;

	private List<SubDemand> subDemands;

	private String customerName;

	private String projectId;

	private String auditParamStr;
	public OpsCreateDemandRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateDemand", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDemandTime() {
		return this.demandTime;
	}

	public void setDemandTime(String demandTime) {
		this.demandTime = demandTime;
		if(demandTime != null){
			putQueryParameter("DemandTime", demandTime);
		}
	}

	public String getDemandSupplyPmName() {
		return this.demandSupplyPmName;
	}

	public void setDemandSupplyPmName(String demandSupplyPmName) {
		this.demandSupplyPmName = demandSupplyPmName;
		if(demandSupplyPmName != null){
			putQueryParameter("demandSupplyPmName", demandSupplyPmName);
		}
	}

	public String getSumitterName() {
		return this.sumitterName;
	}

	public void setSumitterName(String sumitterName) {
		this.sumitterName = sumitterName;
		if(sumitterName != null){
			putQueryParameter("SumitterName", sumitterName);
		}
	}

	public String getSumitterUid() {
		return this.sumitterUid;
	}

	public void setSumitterUid(String sumitterUid) {
		this.sumitterUid = sumitterUid;
		if(sumitterUid != null){
			putQueryParameter("SumitterUid", sumitterUid);
		}
	}

	public String getBatchName() {
		return this.batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
		if(batchName != null){
			putQueryParameter("BatchName", batchName);
		}
	}

	public String getDemandSupplyPmUid() {
		return this.demandSupplyPmUid;
	}

	public void setDemandSupplyPmUid(String demandSupplyPmUid) {
		this.demandSupplyPmUid = demandSupplyPmUid;
		if(demandSupplyPmUid != null){
			putQueryParameter("demandSupplyPmUid", demandSupplyPmUid);
		}
	}

	public Long getCustomerUid() {
		return this.customerUid;
	}

	public void setCustomerUid(Long customerUid) {
		this.customerUid = customerUid;
		if(customerUid != null){
			putQueryParameter("CustomerUid", customerUid.toString());
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

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public List<SubDemand> getSubDemands() {
		return this.subDemands;
	}

	public void setSubDemands(List<SubDemand> subDemands) {
		this.subDemands = subDemands;	
		if (subDemands != null) {
			for (int depth1 = 0; depth1 < subDemands.size(); depth1++) {
				putQueryParameter("SubDemand." + (depth1 + 1) + ".PayDuration" , subDemands.get(depth1).getPayDuration());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".PayDurationUnit" , subDemands.get(depth1).getPayDurationUnit());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".SubDemandSupplyPmUid" , subDemands.get(depth1).getSubDemandSupplyPmUid());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".NetworkType" , subDemands.get(depth1).getNetworkType());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".SubDemandSupplyPmName" , subDemands.get(depth1).getSubDemandSupplyPmName());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".BusinessType" , subDemands.get(depth1).getBusinessType());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".ExpectPayTimeBegin" , subDemands.get(depth1).getExpectPayTimeBegin());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".Iz" , subDemands.get(depth1).getIz());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".SubDemandId" , subDemands.get(depth1).getSubDemandId());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".InstanceType" , subDemands.get(depth1).getInstanceType());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".Comment" , subDemands.get(depth1).getComment());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".OutId" , subDemands.get(depth1).getOutId());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".DemandCount" , subDemands.get(depth1).getDemandCount());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".Region" , subDemands.get(depth1).getRegion());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".PayType" , subDemands.get(depth1).getPayType());
				putQueryParameter("SubDemand." + (depth1 + 1) + ".ExpectPayTimeEnd" , subDemands.get(depth1).getExpectPayTimeEnd());
			}
		}	
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		if(customerName != null){
			putQueryParameter("CustomerName", customerName);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
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

	public static class SubDemand {

		private Integer payDuration;

		private String payDurationUnit;

		private String subDemandSupplyPmUid;

		private String networkType;

		private String subDemandSupplyPmName;

		private String businessType;

		private String expectPayTimeBegin;

		private String iz;

		private String subDemandId;

		private String instanceType;

		private String comment;

		private String outId;

		private Integer demandCount;

		private String region;

		private String payType;

		private String expectPayTimeEnd;

		public Integer getPayDuration() {
			return this.payDuration;
		}

		public void setPayDuration(Integer payDuration) {
			this.payDuration = payDuration;
		}

		public String getPayDurationUnit() {
			return this.payDurationUnit;
		}

		public void setPayDurationUnit(String payDurationUnit) {
			this.payDurationUnit = payDurationUnit;
		}

		public String getSubDemandSupplyPmUid() {
			return this.subDemandSupplyPmUid;
		}

		public void setSubDemandSupplyPmUid(String subDemandSupplyPmUid) {
			this.subDemandSupplyPmUid = subDemandSupplyPmUid;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getSubDemandSupplyPmName() {
			return this.subDemandSupplyPmName;
		}

		public void setSubDemandSupplyPmName(String subDemandSupplyPmName) {
			this.subDemandSupplyPmName = subDemandSupplyPmName;
		}

		public String getBusinessType() {
			return this.businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}

		public String getExpectPayTimeBegin() {
			return this.expectPayTimeBegin;
		}

		public void setExpectPayTimeBegin(String expectPayTimeBegin) {
			this.expectPayTimeBegin = expectPayTimeBegin;
		}

		public String getIz() {
			return this.iz;
		}

		public void setIz(String iz) {
			this.iz = iz;
		}

		public String getSubDemandId() {
			return this.subDemandId;
		}

		public void setSubDemandId(String subDemandId) {
			this.subDemandId = subDemandId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getOutId() {
			return this.outId;
		}

		public void setOutId(String outId) {
			this.outId = outId;
		}

		public Integer getDemandCount() {
			return this.demandCount;
		}

		public void setDemandCount(Integer demandCount) {
			this.demandCount = demandCount;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getExpectPayTimeEnd() {
			return this.expectPayTimeEnd;
		}

		public void setExpectPayTimeEnd(String expectPayTimeEnd) {
			this.expectPayTimeEnd = expectPayTimeEnd;
		}
	}

	@Override
	public Class<OpsCreateDemandResponse> getResponseClass() {
		return OpsCreateDemandResponse.class;
	}

}
