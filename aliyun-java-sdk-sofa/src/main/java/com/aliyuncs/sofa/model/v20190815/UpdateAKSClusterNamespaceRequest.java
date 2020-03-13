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
public class UpdateAKSClusterNamespaceRequest extends RpcAcsRequest<UpdateAKSClusterNamespaceResponse> {
	   

	private String workspace;

	private List<Labels> labelss;

	private String name;
	public UpdateAKSClusterNamespaceRequest() {
		super("SOFA", "2019-08-15", "UpdateAKSClusterNamespace", "ApplySidecarCert");
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

	public List<Labels> getLabelss() {
		return this.labelss;
	}

	public void setLabelss(List<Labels> labelss) {
		this.labelss = labelss;	
		if (labelss != null) {
			for (int depth1 = 0; depth1 < labelss.size(); depth1++) {
				putBodyParameter("Labels." + (depth1 + 1) + ".Value" , labelss.get(depth1).getValue());
				putBodyParameter("Labels." + (depth1 + 1) + ".Key" , labelss.get(depth1).getKey());
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public static class Labels {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<UpdateAKSClusterNamespaceResponse> getResponseClass() {
		return UpdateAKSClusterNamespaceResponse.class;
	}

}
