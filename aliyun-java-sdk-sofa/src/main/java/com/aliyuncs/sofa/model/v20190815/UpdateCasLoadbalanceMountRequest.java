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
public class UpdateCasLoadbalanceMountRequest extends RpcAcsRequest<UpdateCasLoadbalanceMountResponse> {
	   

	private String id;

	private String domain;

	private List<MountMap> mountMaps;
	public UpdateCasLoadbalanceMountRequest() {
		super("SOFA", "2019-08-15", "UpdateCasLoadbalanceMount", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
		}
	}

	public List<MountMap> getMountMaps() {
		return this.mountMaps;
	}

	public void setMountMaps(List<MountMap> mountMaps) {
		this.mountMaps = mountMaps;	
		if (mountMaps != null) {
			for (int depth1 = 0; depth1 < mountMaps.size(); depth1++) {
				putBodyParameter("MountMap." + (depth1 + 1) + ".Value" , mountMaps.get(depth1).getValue());
				putBodyParameter("MountMap." + (depth1 + 1) + ".Key" , mountMaps.get(depth1).getKey());
			}
		}	
	}

	public static class MountMap {

		private Long value;

		private String key;

		public Long getValue() {
			return this.value;
		}

		public void setValue(Long value) {
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
	public Class<UpdateCasLoadbalanceMountResponse> getResponseClass() {
		return UpdateCasLoadbalanceMountResponse.class;
	}

}
