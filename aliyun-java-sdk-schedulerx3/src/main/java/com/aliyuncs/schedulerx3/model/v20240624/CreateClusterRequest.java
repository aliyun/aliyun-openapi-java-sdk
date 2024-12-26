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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends RpcAcsRequest<CreateClusterResponse> {
	   

	private String clusterName;

	private String engineType;

	@SerializedName("vSwitches")
	private List<VSwitches> vSwitches;

	private String clusterSpec;

	private String vpcId;
	public CreateClusterRequest() {
		super("SchedulerX3", "2024-06-24", "CreateCluster");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putBodyParameter("ClusterName", clusterName);
		}
	}

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
		if(engineType != null){
			putBodyParameter("EngineType", engineType);
		}
	}

	public List<VSwitches> getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(List<VSwitches> vSwitches) {
		this.vSwitches = vSwitches;	
		if (vSwitches != null) {
			putBodyParameter("VSwitches" , new Gson().toJson(vSwitches));
		}	
	}

	public String getClusterSpec() {
		return this.clusterSpec;
	}

	public void setClusterSpec(String clusterSpec) {
		this.clusterSpec = clusterSpec;
		if(clusterSpec != null){
			putBodyParameter("ClusterSpec", clusterSpec);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public static class VSwitches {

		@SerializedName("VSwitchId")
		private String vSwitchId;

		@SerializedName("ZoneId")
		private String zoneId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
