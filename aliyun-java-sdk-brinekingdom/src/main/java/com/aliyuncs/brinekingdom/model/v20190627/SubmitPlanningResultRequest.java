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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class SubmitPlanningResultRequest extends RpcAcsRequest<SubmitPlanningResultResponse> {
	
	public SubmitPlanningResultRequest() {
		super("brinekingdom", "2019-06-27", "SubmitPlanningResult");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long demandId;

	private Long subDemandId;

	private Integer demandCount;

	private List<ResourceMethod> resourceMethods;

	public Long getDemandId() {
		return this.demandId;
	}

	public void setDemandId(Long demandId) {
		this.demandId = demandId;
		if(demandId != null){
			putQueryParameter("DemandId", demandId.toString());
		}
	}

	public Long getSubDemandId() {
		return this.subDemandId;
	}

	public void setSubDemandId(Long subDemandId) {
		this.subDemandId = subDemandId;
		if(subDemandId != null){
			putQueryParameter("SubDemandId", subDemandId.toString());
		}
	}

	public Integer getDemandCount() {
		return this.demandCount;
	}

	public void setDemandCount(Integer demandCount) {
		this.demandCount = demandCount;
		if(demandCount != null){
			putQueryParameter("DemandCount", demandCount.toString());
		}
	}

	public List<ResourceMethod> getResourceMethods() {
		return this.resourceMethods;
	}

	public void setResourceMethods(List<ResourceMethod> resourceMethods) {
		this.resourceMethods = resourceMethods;	
		if (resourceMethods != null) {
			for (int depth1 = 0; depth1 < resourceMethods.size(); depth1++) {
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".FinalAvzone" , resourceMethods.get(depth1).getFinalAvzone());
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".Cluster" , resourceMethods.get(depth1).getCluster());
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".ConvertHostCnt" , resourceMethods.get(depth1).getConvertHostCnt());
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".BufferCnt" , resourceMethods.get(depth1).getBufferCnt());
				if (resourceMethods.get(depth1).getSupplyPlans() != null) {
					for (int depth2 = 0; depth2 < resourceMethods.get(depth1).getSupplyPlans().size(); depth2++) {
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".SafeZone" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getSafeZone());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".NetArch" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getNetArch());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".SupplyType" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getSupplyType());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".LogicZone" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getLogicZone());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".SupplyAmount" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getSupplyAmount());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".SupplyDate" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getSupplyDate());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".Nic" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getNic());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".ClassZone" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getClassZone());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".ConvertHostType" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getConvertHostType());
						putQueryParameter("ResourceMethod." + (depth1 + 1) + ".SupplyPlan." + (depth2 + 1) + ".Product3" , resourceMethods.get(depth1).getSupplyPlans().get(depth2).getProduct3());
					}
				}
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".RoomCode" , resourceMethods.get(depth1).getRoomCode());
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".Comment" , resourceMethods.get(depth1).getComment());
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".Region" , resourceMethods.get(depth1).getRegion());
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".ConvertHostType" , resourceMethods.get(depth1).getConvertHostType());
				putQueryParameter("ResourceMethod." + (depth1 + 1) + ".Azone" , resourceMethods.get(depth1).getAzone());
			}
		}	
	}

	public static class ResourceMethod {

		private String finalAvzone;

		private String cluster;

		private Integer convertHostCnt;

		private Integer bufferCnt;

		private List<SupplyPlan> supplyPlans;

		private String roomCode;

		private String comment;

		private String region;

		private String convertHostType;

		private String azone;

		public String getFinalAvzone() {
			return this.finalAvzone;
		}

		public void setFinalAvzone(String finalAvzone) {
			this.finalAvzone = finalAvzone;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public Integer getConvertHostCnt() {
			return this.convertHostCnt;
		}

		public void setConvertHostCnt(Integer convertHostCnt) {
			this.convertHostCnt = convertHostCnt;
		}

		public Integer getBufferCnt() {
			return this.bufferCnt;
		}

		public void setBufferCnt(Integer bufferCnt) {
			this.bufferCnt = bufferCnt;
		}

		public List<SupplyPlan> getSupplyPlans() {
			return this.supplyPlans;
		}

		public void setSupplyPlans(List<SupplyPlan> supplyPlans) {
			this.supplyPlans = supplyPlans;
		}

		public String getRoomCode() {
			return this.roomCode;
		}

		public void setRoomCode(String roomCode) {
			this.roomCode = roomCode;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getConvertHostType() {
			return this.convertHostType;
		}

		public void setConvertHostType(String convertHostType) {
			this.convertHostType = convertHostType;
		}

		public String getAzone() {
			return this.azone;
		}

		public void setAzone(String azone) {
			this.azone = azone;
		}

		public static class SupplyPlan {

			private String safeZone;

			private String netArch;

			private Integer supplyType;

			private String logicZone;

			private Integer supplyAmount;

			private String supplyDate;

			private String nic;

			private String classZone;

			private String convertHostType;

			private String product3;

			public String getSafeZone() {
				return this.safeZone;
			}

			public void setSafeZone(String safeZone) {
				this.safeZone = safeZone;
			}

			public String getNetArch() {
				return this.netArch;
			}

			public void setNetArch(String netArch) {
				this.netArch = netArch;
			}

			public Integer getSupplyType() {
				return this.supplyType;
			}

			public void setSupplyType(Integer supplyType) {
				this.supplyType = supplyType;
			}

			public String getLogicZone() {
				return this.logicZone;
			}

			public void setLogicZone(String logicZone) {
				this.logicZone = logicZone;
			}

			public Integer getSupplyAmount() {
				return this.supplyAmount;
			}

			public void setSupplyAmount(Integer supplyAmount) {
				this.supplyAmount = supplyAmount;
			}

			public String getSupplyDate() {
				return this.supplyDate;
			}

			public void setSupplyDate(String supplyDate) {
				this.supplyDate = supplyDate;
			}

			public String getNic() {
				return this.nic;
			}

			public void setNic(String nic) {
				this.nic = nic;
			}

			public String getClassZone() {
				return this.classZone;
			}

			public void setClassZone(String classZone) {
				this.classZone = classZone;
			}

			public String getConvertHostType() {
				return this.convertHostType;
			}

			public void setConvertHostType(String convertHostType) {
				this.convertHostType = convertHostType;
			}

			public String getProduct3() {
				return this.product3;
			}

			public void setProduct3(String product3) {
				this.product3 = product3;
			}
		}
	}

	@Override
	public Class<SubmitPlanningResultResponse> getResponseClass() {
		return SubmitPlanningResultResponse.class;
	}

}
