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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushFcstPlanSopRequest extends RpcAcsRequest<PushFcstPlanSopResponse> {
	   

	private String regionCode;

	private String classZoneCode;

	private String cmP;

	private String product2;

	private String product1;

	private String nic;

	private String logicZoneCode;

	private String cmU;

	private String source;

	private Integer type;

	private String azCode;

	private String cmV;

	private String operator;

	private String product3;

	private String machineType;

	private String scenario;

	private Integer nakedDelivery;

	private String cloudDeployProduct3;

	private String orgKey;

	private String netArch;

	private String business;

	private String cloudDeployProduct1;

	private String cloudDeployProduct2;

	private Integer cnt;

	private String safeZoneCode;

	private String timeStr;

	private String priority;

	private String requireType;

	private Integer install;

	private String cmC;

	private Long planId;

	private String outId;

	private String roomCode;

	private String comment;

	private Integer modelLoad;
	public PushFcstPlanSopRequest() {
		super("brinekingdom", "2019-06-27", "PushFcstPlanSop");
		setMethod(MethodType.POST);
	}

	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
		if(regionCode != null){
			putQueryParameter("RegionCode", regionCode);
		}
	}

	public String getClassZoneCode() {
		return this.classZoneCode;
	}

	public void setClassZoneCode(String classZoneCode) {
		this.classZoneCode = classZoneCode;
		if(classZoneCode != null){
			putQueryParameter("ClassZoneCode", classZoneCode);
		}
	}

	public String getCmP() {
		return this.cmP;
	}

	public void setCmP(String cmP) {
		this.cmP = cmP;
		if(cmP != null){
			putQueryParameter("CmP", cmP);
		}
	}

	public String getProduct2() {
		return this.product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
		if(product2 != null){
			putQueryParameter("Product2", product2);
		}
	}

	public String getProduct1() {
		return this.product1;
	}

	public void setProduct1(String product1) {
		this.product1 = product1;
		if(product1 != null){
			putQueryParameter("Product1", product1);
		}
	}

	public String getNic() {
		return this.nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
		if(nic != null){
			putQueryParameter("Nic", nic);
		}
	}

	public String getLogicZoneCode() {
		return this.logicZoneCode;
	}

	public void setLogicZoneCode(String logicZoneCode) {
		this.logicZoneCode = logicZoneCode;
		if(logicZoneCode != null){
			putQueryParameter("LogicZoneCode", logicZoneCode);
		}
	}

	public String getCmU() {
		return this.cmU;
	}

	public void setCmU(String cmU) {
		this.cmU = cmU;
		if(cmU != null){
			putQueryParameter("CmU", cmU);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getAzCode() {
		return this.azCode;
	}

	public void setAzCode(String azCode) {
		this.azCode = azCode;
		if(azCode != null){
			putQueryParameter("AzCode", azCode);
		}
	}

	public String getCmV() {
		return this.cmV;
	}

	public void setCmV(String cmV) {
		this.cmV = cmV;
		if(cmV != null){
			putQueryParameter("CmV", cmV);
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

	public String getProduct3() {
		return this.product3;
	}

	public void setProduct3(String product3) {
		this.product3 = product3;
		if(product3 != null){
			putQueryParameter("Product3", product3);
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

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
		if(scenario != null){
			putQueryParameter("Scenario", scenario);
		}
	}

	public Integer getNakedDelivery() {
		return this.nakedDelivery;
	}

	public void setNakedDelivery(Integer nakedDelivery) {
		this.nakedDelivery = nakedDelivery;
		if(nakedDelivery != null){
			putQueryParameter("NakedDelivery", nakedDelivery.toString());
		}
	}

	public String getCloudDeployProduct3() {
		return this.cloudDeployProduct3;
	}

	public void setCloudDeployProduct3(String cloudDeployProduct3) {
		this.cloudDeployProduct3 = cloudDeployProduct3;
		if(cloudDeployProduct3 != null){
			putQueryParameter("CloudDeployProduct3", cloudDeployProduct3);
		}
	}

	public String getOrgKey() {
		return this.orgKey;
	}

	public void setOrgKey(String orgKey) {
		this.orgKey = orgKey;
		if(orgKey != null){
			putQueryParameter("OrgKey", orgKey);
		}
	}

	public String getNetArch() {
		return this.netArch;
	}

	public void setNetArch(String netArch) {
		this.netArch = netArch;
		if(netArch != null){
			putQueryParameter("NetArch", netArch);
		}
	}

	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
		if(business != null){
			putQueryParameter("Business", business);
		}
	}

	public String getCloudDeployProduct1() {
		return this.cloudDeployProduct1;
	}

	public void setCloudDeployProduct1(String cloudDeployProduct1) {
		this.cloudDeployProduct1 = cloudDeployProduct1;
		if(cloudDeployProduct1 != null){
			putQueryParameter("CloudDeployProduct1", cloudDeployProduct1);
		}
	}

	public String getCloudDeployProduct2() {
		return this.cloudDeployProduct2;
	}

	public void setCloudDeployProduct2(String cloudDeployProduct2) {
		this.cloudDeployProduct2 = cloudDeployProduct2;
		if(cloudDeployProduct2 != null){
			putQueryParameter("CloudDeployProduct2", cloudDeployProduct2);
		}
	}

	public Integer getCnt() {
		return this.cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
		if(cnt != null){
			putQueryParameter("Cnt", cnt.toString());
		}
	}

	public String getSafeZoneCode() {
		return this.safeZoneCode;
	}

	public void setSafeZoneCode(String safeZoneCode) {
		this.safeZoneCode = safeZoneCode;
		if(safeZoneCode != null){
			putQueryParameter("SafeZoneCode", safeZoneCode);
		}
	}

	public String getTimeStr() {
		return this.timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
		if(timeStr != null){
			putQueryParameter("TimeStr", timeStr);
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority);
		}
	}

	public String getRequireType() {
		return this.requireType;
	}

	public void setRequireType(String requireType) {
		this.requireType = requireType;
		if(requireType != null){
			putQueryParameter("RequireType", requireType);
		}
	}

	public Integer getInstall() {
		return this.install;
	}

	public void setInstall(Integer install) {
		this.install = install;
		if(install != null){
			putQueryParameter("Install", install.toString());
		}
	}

	public String getCmC() {
		return this.cmC;
	}

	public void setCmC(String cmC) {
		this.cmC = cmC;
		if(cmC != null){
			putQueryParameter("CmC", cmC);
		}
	}

	public Long getPlanId() {
		return this.planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId.toString());
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

	public String getRoomCode() {
		return this.roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
		if(roomCode != null){
			putQueryParameter("RoomCode", roomCode);
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

	public Integer getModelLoad() {
		return this.modelLoad;
	}

	public void setModelLoad(Integer modelLoad) {
		this.modelLoad = modelLoad;
		if(modelLoad != null){
			putQueryParameter("ModelLoad", modelLoad.toString());
		}
	}

	@Override
	public Class<PushFcstPlanSopResponse> getResponseClass() {
		return PushFcstPlanSopResponse.class;
	}

}
