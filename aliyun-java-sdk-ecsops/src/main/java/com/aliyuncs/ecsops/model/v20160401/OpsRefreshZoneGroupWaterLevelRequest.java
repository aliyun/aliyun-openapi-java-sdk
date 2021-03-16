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
public class OpsRefreshZoneGroupWaterLevelRequest extends RpcAcsRequest<OpsRefreshZoneGroupWaterLevelResponse> {
	   

	private String operator;

	private List<BatchZoneGroupWaterLevels> batchZoneGroupWaterLevelss;

	private String auditParamStr;
	public OpsRefreshZoneGroupWaterLevelRequest() {
		super("Ecsops", "2016-04-01", "OpsRefreshZoneGroupWaterLevel", "ecs");
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

	public List<BatchZoneGroupWaterLevels> getBatchZoneGroupWaterLevelss() {
		return this.batchZoneGroupWaterLevelss;
	}

	public void setBatchZoneGroupWaterLevelss(List<BatchZoneGroupWaterLevels> batchZoneGroupWaterLevelss) {
		this.batchZoneGroupWaterLevelss = batchZoneGroupWaterLevelss;	
		if (batchZoneGroupWaterLevelss != null) {
			for (int depth1 = 0; depth1 < batchZoneGroupWaterLevelss.size(); depth1++) {
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".Flavor" , batchZoneGroupWaterLevelss.get(depth1).getFlavor());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".BizType" , batchZoneGroupWaterLevelss.get(depth1).getBizType());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".ClusterGroup" , batchZoneGroupWaterLevelss.get(depth1).getClusterGroup());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".HighLevel" , batchZoneGroupWaterLevelss.get(depth1).getHighLevel());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".IzNo" , batchZoneGroupWaterLevelss.get(depth1).getIzNo());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".LowLevel" , batchZoneGroupWaterLevelss.get(depth1).getLowLevel());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".IoOptimized" , batchZoneGroupWaterLevelss.get(depth1).getIoOptimized());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".RiLevel" , batchZoneGroupWaterLevelss.get(depth1).getRiLevel());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".GrayBizType" , batchZoneGroupWaterLevelss.get(depth1).getGrayBizType());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".NetworkType" , batchZoneGroupWaterLevelss.get(depth1).getNetworkType());
				putQueryParameter("BatchZoneGroupWaterLevels." + (depth1 + 1) + ".ResourceType" , batchZoneGroupWaterLevelss.get(depth1).getResourceType());
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

	public static class BatchZoneGroupWaterLevels {

		private String flavor;

		private String bizType;

		private String clusterGroup;

		private Long highLevel;

		private String izNo;

		private Long lowLevel;

		private Integer ioOptimized;

		private Long riLevel;

		private String grayBizType;

		private Integer networkType;

		private Integer resourceType;

		public String getFlavor() {
			return this.flavor;
		}

		public void setFlavor(String flavor) {
			this.flavor = flavor;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getClusterGroup() {
			return this.clusterGroup;
		}

		public void setClusterGroup(String clusterGroup) {
			this.clusterGroup = clusterGroup;
		}

		public Long getHighLevel() {
			return this.highLevel;
		}

		public void setHighLevel(Long highLevel) {
			this.highLevel = highLevel;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public Long getLowLevel() {
			return this.lowLevel;
		}

		public void setLowLevel(Long lowLevel) {
			this.lowLevel = lowLevel;
		}

		public Integer getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Integer ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Long getRiLevel() {
			return this.riLevel;
		}

		public void setRiLevel(Long riLevel) {
			this.riLevel = riLevel;
		}

		public String getGrayBizType() {
			return this.grayBizType;
		}

		public void setGrayBizType(String grayBizType) {
			this.grayBizType = grayBizType;
		}

		public Integer getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(Integer networkType) {
			this.networkType = networkType;
		}

		public Integer getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(Integer resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public Class<OpsRefreshZoneGroupWaterLevelResponse> getResponseClass() {
		return OpsRefreshZoneGroupWaterLevelResponse.class;
	}

}
