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
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAINodesRequest extends RpcAcsRequest<CreateAINodesResponse> {
	   

	private List<DBNodes> dBNodess;

	private String dBClusterId;
	public CreateAINodesRequest() {
		super("polardb", "2017-08-01", "CreateAINodes", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DBNodes> getDBNodess() {
		return this.dBNodess;
	}

	public void setDBNodess(List<DBNodes> dBNodess) {
		this.dBNodess = dBNodess;	
		if (dBNodess != null) {
			for (int depth1 = 0; depth1 < dBNodess.size(); depth1++) {
				putQueryParameter("DBNodes." + (depth1 + 1) + ".DBNodeClass" , dBNodess.get(depth1).getDBNodeClass());
			}
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

	public static class DBNodes {

		private String dBNodeClass;

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}
	}

	@Override
	public Class<CreateAINodesResponse> getResponseClass() {
		return CreateAINodesResponse.class;
	}

}
