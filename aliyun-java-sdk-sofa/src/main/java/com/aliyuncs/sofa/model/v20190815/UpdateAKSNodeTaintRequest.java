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
public class UpdateAKSNodeTaintRequest extends RpcAcsRequest<UpdateAKSNodeTaintResponse> {
	   

	private String workspace;

	private List<Taints> taintss;

	private String node;
	public UpdateAKSNodeTaintRequest() {
		super("SOFA", "2019-08-15", "UpdateAKSNodeTaint", "ApplySidecarCert");
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

	public List<Taints> getTaintss() {
		return this.taintss;
	}

	public void setTaintss(List<Taints> taintss) {
		this.taintss = taintss;	
		if (taintss != null) {
			for (int depth1 = 0; depth1 < taintss.size(); depth1++) {
				putBodyParameter("Taints." + (depth1 + 1) + ".Effect" , taintss.get(depth1).getEffect());
				putBodyParameter("Taints." + (depth1 + 1) + ".Value" , taintss.get(depth1).getValue());
				putBodyParameter("Taints." + (depth1 + 1) + ".Key" , taintss.get(depth1).getKey());
			}
		}	
	}

	public String getNode() {
		return this.node;
	}

	public void setNode(String node) {
		this.node = node;
		if(node != null){
			putBodyParameter("Node", node);
		}
	}

	public static class Taints {

		private String effect;

		private String value;

		private String key;

		public String getEffect() {
			return this.effect;
		}

		public void setEffect(String effect) {
			this.effect = effect;
		}

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
	public Class<UpdateAKSNodeTaintResponse> getResponseClass() {
		return UpdateAKSNodeTaintResponse.class;
	}

}
