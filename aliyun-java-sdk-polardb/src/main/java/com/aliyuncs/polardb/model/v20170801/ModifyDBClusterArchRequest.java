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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterArchRequest extends RpcAcsRequest<ModifyDBClusterArchResponse> {
	   

	private String standbyAZ;

	private String dBClusterId;

	private String hotStandbyCluster;
	public ModifyDBClusterArchRequest() {
		super("polardb", "2017-08-01", "ModifyDBClusterArch", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStandbyAZ() {
		return this.standbyAZ;
	}

	public void setStandbyAZ(String standbyAZ) {
		this.standbyAZ = standbyAZ;
		if(standbyAZ != null){
			putQueryParameter("StandbyAZ", standbyAZ);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getHotStandbyCluster() {
		return this.hotStandbyCluster;
	}

	public void setHotStandbyCluster(String hotStandbyCluster) {
		this.hotStandbyCluster = hotStandbyCluster;
		if(hotStandbyCluster != null){
			putQueryParameter("HotStandbyCluster", hotStandbyCluster);
		}
	}

	@Override
	public Class<ModifyDBClusterArchResponse> getResponseClass() {
		return ModifyDBClusterArchResponse.class;
	}

}
