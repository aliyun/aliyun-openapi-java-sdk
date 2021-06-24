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
public class OpsRemoveZoneGroupWaterLevelRequest extends RpcAcsRequest<OpsRemoveZoneGroupWaterLevelResponse> {
	   

	private String clusterGroup;

	private Long highLevel;

	private String izNo;

	private Integer ioOptimized;

	private Integer networkType;

	private String operator;

	private String grayBizType;

	private Integer resourceType;

	private String flavor;

	private String bizType;

	private Long lowLevel;

	private Long riLevel;

	private String auditParamStr;
	public OpsRemoveZoneGroupWaterLevelRequest() {
		super("Ecsops", "2016-04-01", "OpsRemoveZoneGroupWaterLevel", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getClusterGroup() {
		return this.clusterGroup;
	}

	public void setClusterGroup(String clusterGroup) {
		this.clusterGroup = clusterGroup;
		if(clusterGroup != null){
			putQueryParameter("ClusterGroup", clusterGroup);
		}
	}

	public Long getHighLevel() {
		return this.highLevel;
	}

	public void setHighLevel(Long highLevel) {
		this.highLevel = highLevel;
		if(highLevel != null){
			putQueryParameter("HighLevel", highLevel.toString());
		}
	}

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
		if(izNo != null){
			putQueryParameter("IzNo", izNo);
		}
	}

	public Integer getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Integer ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
		}
	}

	public Integer getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(Integer networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType.toString());
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

	public String getGrayBizType() {
		return this.grayBizType;
	}

	public void setGrayBizType(String grayBizType) {
		this.grayBizType = grayBizType;
		if(grayBizType != null){
			putQueryParameter("GrayBizType", grayBizType);
		}
	}

	public Integer getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType.toString());
		}
	}

	public String getFlavor() {
		return this.flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
		if(flavor != null){
			putQueryParameter("Flavor", flavor);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public Long getLowLevel() {
		return this.lowLevel;
	}

	public void setLowLevel(Long lowLevel) {
		this.lowLevel = lowLevel;
		if(lowLevel != null){
			putQueryParameter("LowLevel", lowLevel.toString());
		}
	}

	public Long getRiLevel() {
		return this.riLevel;
	}

	public void setRiLevel(Long riLevel) {
		this.riLevel = riLevel;
		if(riLevel != null){
			putQueryParameter("RiLevel", riLevel.toString());
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
	public Class<OpsRemoveZoneGroupWaterLevelResponse> getResponseClass() {
		return OpsRemoveZoneGroupWaterLevelResponse.class;
	}

}
