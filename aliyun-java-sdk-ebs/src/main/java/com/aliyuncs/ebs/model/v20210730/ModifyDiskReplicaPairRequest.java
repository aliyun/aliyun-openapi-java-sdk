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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDiskReplicaPairRequest extends RpcAcsRequest<ModifyDiskReplicaPairResponse> {
	   

	private String pairName;

	private String clientToken;

	private String description;

	private Long bandwidth;

	private String replicaPairId;

	private Long rPO;
	public ModifyDiskReplicaPairRequest() {
		super("ebs", "2021-07-30", "ModifyDiskReplicaPair", "ebs");
		setMethod(MethodType.POST);
	}

	public String getPairName() {
		return this.pairName;
	}

	public void setPairName(String pairName) {
		this.pairName = pairName;
		if(pairName != null){
			putQueryParameter("PairName", pairName);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getReplicaPairId() {
		return this.replicaPairId;
	}

	public void setReplicaPairId(String replicaPairId) {
		this.replicaPairId = replicaPairId;
		if(replicaPairId != null){
			putQueryParameter("ReplicaPairId", replicaPairId);
		}
	}

	public Long getRPO() {
		return this.rPO;
	}

	public void setRPO(Long rPO) {
		this.rPO = rPO;
		if(rPO != null){
			putQueryParameter("RPO", rPO.toString());
		}
	}

	@Override
	public Class<ModifyDiskReplicaPairResponse> getResponseClass() {
		return ModifyDiskReplicaPairResponse.class;
	}

}
