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

package com.aliyuncs.cloudauth.model.v20180916;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitVerificationRequest extends RpcAcsRequest<SubmitVerificationResponse> {
	
	public SubmitVerificationRequest() {
		super("Cloudauth", "2018-09-16", "SubmitVerification", "CloudAuth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private Long resourceOwnerId;

	private String biz;

	private String sourceIp;

	private List<Material> materials;

	private String ticketId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		if(biz != null){
			putBodyParameter("Biz", biz);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public List<Material> getMaterials() {
		return this.materials;
	}

	public void setMaterials(List<Material> materials) {
		this.materials = materials;	
		if (materials != null) {
			for (int depth1 = 0; depth1 < materials.size(); depth1++) {
				putBodyParameter("Material." + (depth1 + 1) + ".MaterialType" , materials.get(depth1).getMaterialType());
				putBodyParameter("Material." + (depth1 + 1) + ".Value" , materials.get(depth1).getValue());
			}
		}	
	}

	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putBodyParameter("TicketId", ticketId);
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
	public Class<SubmitVerificationResponse> getResponseClass() {
		return SubmitVerificationResponse.class;
	}

}
