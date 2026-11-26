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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddAINodeRequest extends RpcAcsRequest<AddAINodeResponse> {
	   

	private String dBInstanceId;

	private String aINodePoolId;

	private List<AINodeSpecInfos> aINodeSpecInfoss;
	public AddAINodeRequest() {
		super("gpdb", "2016-05-03", "AddAINode", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getAINodePoolId() {
		return this.aINodePoolId;
	}

	public void setAINodePoolId(String aINodePoolId) {
		this.aINodePoolId = aINodePoolId;
		if(aINodePoolId != null){
			putQueryParameter("AINodePoolId", aINodePoolId);
		}
	}

	public List<AINodeSpecInfos> getAINodeSpecInfoss() {
		return this.aINodeSpecInfoss;
	}

	public void setAINodeSpecInfoss(List<AINodeSpecInfos> aINodeSpecInfoss) {
		this.aINodeSpecInfoss = aINodeSpecInfoss;	
		if (aINodeSpecInfoss != null) {
			for (int depth1 = 0; depth1 < aINodeSpecInfoss.size(); depth1++) {
				putQueryParameter("AINodeSpecInfos." + (depth1 + 1) + ".NodeSpec" , aINodeSpecInfoss.get(depth1).getNodeSpec());
				putQueryParameter("AINodeSpecInfos." + (depth1 + 1) + ".NodeNum" , aINodeSpecInfoss.get(depth1).getNodeNum());
			}
		}	
	}

	public static class AINodeSpecInfos {

		private String nodeSpec;

		private String nodeNum;

		public String getNodeSpec() {
			return this.nodeSpec;
		}

		public void setNodeSpec(String nodeSpec) {
			this.nodeSpec = nodeSpec;
		}

		public String getNodeNum() {
			return this.nodeNum;
		}

		public void setNodeNum(String nodeNum) {
			this.nodeNum = nodeNum;
		}
	}

	@Override
	public Class<AddAINodeResponse> getResponseClass() {
		return AddAINodeResponse.class;
	}

}
