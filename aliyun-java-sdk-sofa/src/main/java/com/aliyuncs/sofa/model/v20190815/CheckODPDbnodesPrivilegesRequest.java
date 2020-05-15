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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckODPDbnodesPrivilegesRequest extends RpcAcsRequest<CheckODPDbnodesPrivilegesResponse> {
	   

	private List<Dbnodes> dbnodess;

	private String instanceId;
	public CheckODPDbnodesPrivilegesRequest() {
		super("SOFA", "2019-08-15", "CheckODPDbnodesPrivileges", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Dbnodes> getDbnodess() {
		return this.dbnodess;
	}

	public void setDbnodess(List<Dbnodes> dbnodess) {
		this.dbnodess = dbnodess;	
		if (dbnodess != null) {
			for (int depth1 = 0; depth1 < dbnodess.size(); depth1++) {
				putBodyParameter("Dbnodes." + (depth1 + 1) + ".Password" , dbnodess.get(depth1).getPassword());
				putBodyParameter("Dbnodes." + (depth1 + 1) + ".NodeId" , dbnodess.get(depth1).getNodeId());
				putBodyParameter("Dbnodes." + (depth1 + 1) + ".Username" , dbnodess.get(depth1).getUsername());
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public static class Dbnodes {

		private String password;

		private String nodeId;

		private String username;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	}

	@Override
	public Class<CheckODPDbnodesPrivilegesResponse> getResponseClass() {
		return CheckODPDbnodesPrivilegesResponse.class;
	}

}
