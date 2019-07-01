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

	private String cluster;

	private String replaceAzone;

	private Integer bufferCnt;

	private Integer pickCnt;

	private List<OpsDemandBatch> opsDemandBatchs;

	private String machineType;

	private Integer requireCnt;

	private Long itemId;

	private Long demandId;

	private String roomCode;

	private String region;

	private String azone;

	private String info;

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putQueryParameter("Cluster", cluster);
		}
	}

	public String getReplaceAzone() {
		return this.replaceAzone;
	}

	public void setReplaceAzone(String replaceAzone) {
		this.replaceAzone = replaceAzone;
		if(replaceAzone != null){
			putQueryParameter("ReplaceAzone", replaceAzone);
		}
	}

	public Integer getBufferCnt() {
		return this.bufferCnt;
	}

	public void setBufferCnt(Integer bufferCnt) {
		this.bufferCnt = bufferCnt;
		if(bufferCnt != null){
			putQueryParameter("BufferCnt", bufferCnt.toString());
		}
	}

	public Integer getPickCnt() {
		return this.pickCnt;
	}

	public void setPickCnt(Integer pickCnt) {
		this.pickCnt = pickCnt;
		if(pickCnt != null){
			putQueryParameter("PickCnt", pickCnt.toString());
		}
	}

	public List<OpsDemandBatch> getOpsDemandBatchs() {
		return this.opsDemandBatchs;
	}

	public void setOpsDemandBatchs(List<OpsDemandBatch> opsDemandBatchs) {
		this.opsDemandBatchs = opsDemandBatchs;	
		if (opsDemandBatchs != null) {
			for (int depth1 = 0; depth1 < opsDemandBatchs.size(); depth1++) {
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".Amount" , opsDemandBatchs.get(depth1).getAmount());
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".SafeZone" , opsDemandBatchs.get(depth1).getSafeZone());
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".SupplyType" , opsDemandBatchs.get(depth1).getSupplyType());
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".NetArch" , opsDemandBatchs.get(depth1).getNetArch());
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".LogicZone" , opsDemandBatchs.get(depth1).getLogicZone());
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".Nic" , opsDemandBatchs.get(depth1).getNic());
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".ClassZone" , opsDemandBatchs.get(depth1).getClassZone());
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".Model" , opsDemandBatchs.get(depth1).getModel());
				putQueryParameter("OpsDemandBatch." + (depth1 + 1) + ".ExpectDate" , opsDemandBatchs.get(depth1).getExpectDate());
			}
		}	
	}

	public String getMachineType() {
		return this.machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
		if(machineType != null){
			putQueryParameter("MachineType", machineType);
		}
	}

	public Integer getRequireCnt() {
		return this.requireCnt;
	}

	public void setRequireCnt(Integer requireCnt) {
		this.requireCnt = requireCnt;
		if(requireCnt != null){
			putQueryParameter("RequireCnt", requireCnt.toString());
		}
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId.toString());
		}
	}

	public Long getDemandId() {
		return this.demandId;
	}

	public void setDemandId(Long demandId) {
		this.demandId = demandId;
		if(demandId != null){
			putQueryParameter("DemandId", demandId.toString());
		}
	}

	public String getRoomCode() {
		return this.roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
		if(roomCode != null){
			putQueryParameter("RoomCode", roomCode);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getAzone() {
		return this.azone;
	}

	public void setAzone(String azone) {
		this.azone = azone;
		if(azone != null){
			putQueryParameter("Azone", azone);
		}
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
		if(info != null){
			putQueryParameter("Info", info);
		}
	}

	public static class OpsDemandBatch {

		private Integer amount;

		private String safeZone;

		private Integer supplyType;

		private String netArch;

		private String logicZone;

		private String nic;

		private String classZone;

		private String model;

		private String expectDate;

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getSafeZone() {
			return this.safeZone;
		}

		public void setSafeZone(String safeZone) {
			this.safeZone = safeZone;
		}

		public Integer getSupplyType() {
			return this.supplyType;
		}

		public void setSupplyType(Integer supplyType) {
			this.supplyType = supplyType;
		}

		public String getNetArch() {
			return this.netArch;
		}

		public void setNetArch(String netArch) {
			this.netArch = netArch;
		}

		public String getLogicZone() {
			return this.logicZone;
		}

		public void setLogicZone(String logicZone) {
			this.logicZone = logicZone;
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

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getExpectDate() {
			return this.expectDate;
		}

		public void setExpectDate(String expectDate) {
			this.expectDate = expectDate;
		}
	}

	@Override
	public Class<SubmitPlanningResultResponse> getResponseClass() {
		return SubmitPlanningResultResponse.class;
	}

}
