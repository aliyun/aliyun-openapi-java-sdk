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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ResizeMultiZoneClusterNodeCountRequest extends RpcAcsRequest<ResizeMultiZoneClusterNodeCountResponse> {
	   

	private String primaryVSwitchId;

	private String standbyVSwitchId;

	private Integer logNodeCount;

	private String clusterId;

	private Integer primaryCoreNodeCount;

	private Integer coreNodeCount;

	private Integer standbyCoreNodeCount;

	private String arbiterVSwitchId;
	public ResizeMultiZoneClusterNodeCountRequest() {
		super("HBase", "2019-01-01", "ResizeMultiZoneClusterNodeCount", "hbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPrimaryVSwitchId() {
		return this.primaryVSwitchId;
	}

	public void setPrimaryVSwitchId(String primaryVSwitchId) {
		this.primaryVSwitchId = primaryVSwitchId;
		if(primaryVSwitchId != null){
			putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
		}
	}

	public String getStandbyVSwitchId() {
		return this.standbyVSwitchId;
	}

	public void setStandbyVSwitchId(String standbyVSwitchId) {
		this.standbyVSwitchId = standbyVSwitchId;
		if(standbyVSwitchId != null){
			putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
		}
	}

	public Integer getLogNodeCount() {
		return this.logNodeCount;
	}

	public void setLogNodeCount(Integer logNodeCount) {
		this.logNodeCount = logNodeCount;
		if(logNodeCount != null){
			putQueryParameter("LogNodeCount", logNodeCount.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Integer getPrimaryCoreNodeCount() {
		return this.primaryCoreNodeCount;
	}

	public void setPrimaryCoreNodeCount(Integer primaryCoreNodeCount) {
		this.primaryCoreNodeCount = primaryCoreNodeCount;
		if(primaryCoreNodeCount != null){
			putQueryParameter("PrimaryCoreNodeCount", primaryCoreNodeCount.toString());
		}
	}

	public Integer getCoreNodeCount() {
		return this.coreNodeCount;
	}

	public void setCoreNodeCount(Integer coreNodeCount) {
		this.coreNodeCount = coreNodeCount;
		if(coreNodeCount != null){
			putQueryParameter("CoreNodeCount", coreNodeCount.toString());
		}
	}

	public Integer getStandbyCoreNodeCount() {
		return this.standbyCoreNodeCount;
	}

	public void setStandbyCoreNodeCount(Integer standbyCoreNodeCount) {
		this.standbyCoreNodeCount = standbyCoreNodeCount;
		if(standbyCoreNodeCount != null){
			putQueryParameter("StandbyCoreNodeCount", standbyCoreNodeCount.toString());
		}
	}

	public String getArbiterVSwitchId() {
		return this.arbiterVSwitchId;
	}

	public void setArbiterVSwitchId(String arbiterVSwitchId) {
		this.arbiterVSwitchId = arbiterVSwitchId;
		if(arbiterVSwitchId != null){
			putQueryParameter("ArbiterVSwitchId", arbiterVSwitchId);
		}
	}

	@Override
	public Class<ResizeMultiZoneClusterNodeCountResponse> getResponseClass() {
		return ResizeMultiZoneClusterNodeCountResponse.class;
	}

}
