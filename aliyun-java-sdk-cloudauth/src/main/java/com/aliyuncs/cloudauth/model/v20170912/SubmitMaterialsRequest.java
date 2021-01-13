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

package com.aliyuncs.cloudauth.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitMaterialsRequest extends RpcAcsRequest<SubmitMaterialsResponse> {
	   

	private List<Material> materials;

	private String verifyToken;
	public SubmitMaterialsRequest() {
		super("Cloudauth", "2017-09-12", "SubmitMaterials", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Material> getMaterials() {
		return this.materials;
	}

	public void setMaterials(List<Material> materials) {
		this.materials = materials;	
		if (materials != null) {
			for (int depth1 = 0; depth1 < materials.size(); depth1++) {
				putQueryParameter("Material." + (depth1 + 1) + ".MaterialType" , materials.get(depth1).getMaterialType());
				putQueryParameter("Material." + (depth1 + 1) + ".Value" , materials.get(depth1).getValue());
			}
		}	
	}

	public String getVerifyToken() {
		return this.verifyToken;
	}

	public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
		if(verifyToken != null){
			putQueryParameter("VerifyToken", verifyToken);
		}
	}

	public static class Material {

		private String materialType;

		private String value;

		public String getMaterialType() {
			return this.materialType;
		}

		public void setMaterialType(String materialType) {
			this.materialType = materialType;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<SubmitMaterialsResponse> getResponseClass() {
		return SubmitMaterialsResponse.class;
	}

}
