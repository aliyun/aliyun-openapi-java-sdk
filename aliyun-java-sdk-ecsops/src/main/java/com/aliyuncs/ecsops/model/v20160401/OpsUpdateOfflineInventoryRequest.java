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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateOfflineInventoryRequest extends RpcAcsRequest<OpsUpdateOfflineInventoryResponse> {
	   

	private String operator;

	private List<OfflineInventoryModel> offlineInventoryModels;

	private String auditParamStr;
	public OpsUpdateOfflineInventoryRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateOfflineInventory", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<OfflineInventoryModel> getOfflineInventoryModels() {
		return this.offlineInventoryModels;
	}

	public void setOfflineInventoryModels(List<OfflineInventoryModel> offlineInventoryModels) {
		this.offlineInventoryModels = offlineInventoryModels;	
		if (offlineInventoryModels != null) {
			for (int depth1 = 0; depth1 < offlineInventoryModels.size(); depth1++) {
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".NcType" , offlineInventoryModels.get(depth1).getNcType());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".IzNo" , offlineInventoryModels.get(depth1).getIzNo());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".VmCnt" , offlineInventoryModels.get(depth1).getVmCnt());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".RackCnt" , offlineInventoryModels.get(depth1).getRackCnt());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".InstanceType" , offlineInventoryModels.get(depth1).getInstanceType());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".Idc" , offlineInventoryModels.get(depth1).getIdc());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".PeriodDay" , offlineInventoryModels.get(depth1).getPeriodDay());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".NetworkArch" , offlineInventoryModels.get(depth1).getNetworkArch());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".RegionNo" , offlineInventoryModels.get(depth1).getRegionNo());
				putQueryParameter("OfflineInventoryModel." + (depth1 + 1) + ".Capacity" , offlineInventoryModels.get(depth1).getCapacity());
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

	public static class OfflineInventoryModel {

		private String ncType;

		private String izNo;

		private Integer vmCnt;

		private Integer rackCnt;

		private String instanceType;

		private String idc;

		private Integer periodDay;

		private String networkArch;

		private String regionNo;

		private Integer capacity;

		public String getNcType() {
			return this.ncType;
		}

		public void setNcType(String ncType) {
			this.ncType = ncType;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public Integer getVmCnt() {
			return this.vmCnt;
		}

		public void setVmCnt(Integer vmCnt) {
			this.vmCnt = vmCnt;
		}

		public Integer getRackCnt() {
			return this.rackCnt;
		}

		public void setRackCnt(Integer rackCnt) {
			this.rackCnt = rackCnt;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getIdc() {
			return this.idc;
		}

		public void setIdc(String idc) {
			this.idc = idc;
		}

		public Integer getPeriodDay() {
			return this.periodDay;
		}

		public void setPeriodDay(Integer periodDay) {
			this.periodDay = periodDay;
		}

		public String getNetworkArch() {
			return this.networkArch;
		}

		public void setNetworkArch(String networkArch) {
			this.networkArch = networkArch;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public Integer getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}
	}

	@Override
	public Class<OpsUpdateOfflineInventoryResponse> getResponseClass() {
		return OpsUpdateOfflineInventoryResponse.class;
	}

}
