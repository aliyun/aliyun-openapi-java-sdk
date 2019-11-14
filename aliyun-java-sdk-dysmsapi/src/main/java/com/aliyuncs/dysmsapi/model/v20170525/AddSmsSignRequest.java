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

package com.aliyuncs.dysmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dysmsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddSmsSignRequest extends RpcAcsRequest<AddSmsSignResponse> {
	   

	private Long resourceOwnerId;

	private String remark;

	private String signName;

	private List<SignFileList> signFileLists;

	private String resourceOwnerAccount;

	private Long ownerId;

	private Integer signSource;
	public AddSmsSignRequest() {
		super("Dysmsapi", "2017-05-25", "AddSmsSign", "dysms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getSignName() {
		return this.signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
		if(signName != null){
			putQueryParameter("SignName", signName);
		}
	}

	public List<SignFileList> getSignFileLists() {
		return this.signFileLists;
	}

	public void setSignFileLists(List<SignFileList> signFileLists) {
		this.signFileLists = signFileLists;	
		if (signFileLists != null) {
			for (int depth1 = 0; depth1 < signFileLists.size(); depth1++) {
				putQueryParameter("SignFileList." + (depth1 + 1) + ".FileContents" , signFileLists.get(depth1).getFileContents());
				putQueryParameter("SignFileList." + (depth1 + 1) + ".FileSuffix" , signFileLists.get(depth1).getFileSuffix());
			}
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getSignSource() {
		return this.signSource;
	}

	public void setSignSource(Integer signSource) {
		this.signSource = signSource;
		if(signSource != null){
			putQueryParameter("SignSource", signSource.toString());
		}
	}

	public static class SignFileList {

		private String fileContents;

		private String fileSuffix;

		public String getFileContents() {
			return this.fileContents;
		}

		public void setFileContents(String fileContents) {
			this.fileContents = fileContents;
		}

		public String getFileSuffix() {
			return this.fileSuffix;
		}

		public void setFileSuffix(String fileSuffix) {
			this.fileSuffix = fileSuffix;
		}
	}

	@Override
	public Class<AddSmsSignResponse> getResponseClass() {
		return AddSmsSignResponse.class;
	}

}
