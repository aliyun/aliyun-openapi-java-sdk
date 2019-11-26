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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeArtcCallinConfigRequest extends RpcAcsRequest<ChangeArtcCallinConfigResponse> {
	   

	private String defaultFile;

	private Long resourceOwnerId;

	private String overdueFile;

	private String rpcFailFile;

	private String rejectFile;

	private String invalidAccountFile;

	private String transferFile;

	private String resourceOwnerAccount;

	private String prodCode;

	private Long ownerId;

	private String url;
	public ChangeArtcCallinConfigRequest() {
		super("Dyvms", "2017-06-20", "ChangeArtcCallinConfig", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDefaultFile() {
		return this.defaultFile;
	}

	public void setDefaultFile(String defaultFile) {
		this.defaultFile = defaultFile;
		if(defaultFile != null){
			putQueryParameter("DefaultFile", defaultFile);
		}
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

	public String getOverdueFile() {
		return this.overdueFile;
	}

	public void setOverdueFile(String overdueFile) {
		this.overdueFile = overdueFile;
		if(overdueFile != null){
			putQueryParameter("OverdueFile", overdueFile);
		}
	}

	public String getRpcFailFile() {
		return this.rpcFailFile;
	}

	public void setRpcFailFile(String rpcFailFile) {
		this.rpcFailFile = rpcFailFile;
		if(rpcFailFile != null){
			putQueryParameter("RpcFailFile", rpcFailFile);
		}
	}

	public String getRejectFile() {
		return this.rejectFile;
	}

	public void setRejectFile(String rejectFile) {
		this.rejectFile = rejectFile;
		if(rejectFile != null){
			putQueryParameter("RejectFile", rejectFile);
		}
	}

	public String getInvalidAccountFile() {
		return this.invalidAccountFile;
	}

	public void setInvalidAccountFile(String invalidAccountFile) {
		this.invalidAccountFile = invalidAccountFile;
		if(invalidAccountFile != null){
			putQueryParameter("InvalidAccountFile", invalidAccountFile);
		}
	}

	public String getTransferFile() {
		return this.transferFile;
	}

	public void setTransferFile(String transferFile) {
		this.transferFile = transferFile;
		if(transferFile != null){
			putQueryParameter("TransferFile", transferFile);
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

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putQueryParameter("Url", url);
		}
	}

	@Override
	public Class<ChangeArtcCallinConfigResponse> getResponseClass() {
		return ChangeArtcCallinConfigResponse.class;
	}

}
