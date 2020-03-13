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
public class ImportAKSClusterNodeRequest extends RpcAcsRequest<ImportAKSClusterNodeResponse> {
	   

	private String workspace;

	private List<Nodes> nodess;

	private String operatorName;
	public ImportAKSClusterNodeRequest() {
		super("SOFA", "2019-08-15", "ImportAKSClusterNode", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public List<Nodes> getNodess() {
		return this.nodess;
	}

	public void setNodess(List<Nodes> nodess) {
		this.nodess = nodess;	
		if (nodess != null) {
			for (int depth1 = 0; depth1 < nodess.size(); depth1++) {
				putBodyParameter("Nodes." + (depth1 + 1) + ".Node" , nodess.get(depth1).getNode());
				putBodyParameter("Nodes." + (depth1 + 1) + ".Cell" , nodess.get(depth1).getCell());
			}
		}	
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	public static class Nodes {

		private String node;

		private String cell;

		public String getNode() {
			return this.node;
		}

		public void setNode(String node) {
			this.node = node;
		}

		public String getCell() {
			return this.cell;
		}

		public void setCell(String cell) {
			this.cell = cell;
		}
	}

	@Override
	public Class<ImportAKSClusterNodeResponse> getResponseClass() {
		return ImportAKSClusterNodeResponse.class;
	}

}
