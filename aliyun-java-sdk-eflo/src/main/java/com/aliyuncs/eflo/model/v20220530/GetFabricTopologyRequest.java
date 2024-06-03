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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetFabricTopologyRequest extends RpcAcsRequest<GetFabricTopologyResponse> {
	   

	private String clusterId;

	private String vpdId;

	private String vpcId;

	private List<String> lniIdss;

	private List<String> nodeIdss;
	public GetFabricTopologyRequest() {
		super("eflo", "2022-05-30", "GetFabricTopology", "eflo");
		setMethod(MethodType.POST);
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getVpdId() {
		return this.vpdId;
	}

	public void setVpdId(String vpdId) {
		this.vpdId = vpdId;
		if(vpdId != null){
			putBodyParameter("VpdId", vpdId);
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

	public List<String> getLniIdss() {
		return this.lniIdss;
	}

	public void setLniIdss(List<String> lniIdss) {
		this.lniIdss = lniIdss;	
		if (lniIdss != null) {
			for (int i = 0; i < lniIdss.size(); i++) {
				putBodyParameter("LniIds." + (i + 1) , lniIdss.get(i));
			}
		}	
	}

	public List<String> getNodeIdss() {
		return this.nodeIdss;
	}

	public void setNodeIdss(List<String> nodeIdss) {
		this.nodeIdss = nodeIdss;	
		if (nodeIdss != null) {
			for (int i = 0; i < nodeIdss.size(); i++) {
				putBodyParameter("NodeIds." + (i + 1) , nodeIdss.get(i));
			}
		}	
	}

	@Override
	public Class<GetFabricTopologyResponse> getResponseClass() {
		return GetFabricTopologyResponse.class;
	}

}
