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
public class Get400CorpPdfOssUrlRequest extends RpcAcsRequest<Get400CorpPdfOssUrlResponse> {
	   

	private Long resourceOwnerId;

	private String managerMobilePhone;

	private String number;

	private String managerCertEffDate;

	private String managerName;

	private String managerCertPic;

	private String managerCertType;

	private String resourceOwnerAccount;

	private String prodCode;

	private Long ownerId;

	private String managerCertExpDate;

	private String managerCertNumber;
	public Get400CorpPdfOssUrlRequest() {
		super("Dyvms", "2017-06-20", "Get400CorpPdfOssUrl", "dyvms");
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

	public String getManagerMobilePhone() {
		return this.managerMobilePhone;
	}

	public void setManagerMobilePhone(String managerMobilePhone) {
		this.managerMobilePhone = managerMobilePhone;
		if(managerMobilePhone != null){
			putQueryParameter("ManagerMobilePhone", managerMobilePhone);
		}
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
		}
	}

	public String getManagerCertEffDate() {
		return this.managerCertEffDate;
	}

	public void setManagerCertEffDate(String managerCertEffDate) {
		this.managerCertEffDate = managerCertEffDate;
		if(managerCertEffDate != null){
			putQueryParameter("ManagerCertEffDate", managerCertEffDate);
		}
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
		if(managerName != null){
			putQueryParameter("ManagerName", managerName);
		}
	}

	public String getManagerCertPic() {
		return this.managerCertPic;
	}

	public void setManagerCertPic(String managerCertPic) {
		this.managerCertPic = managerCertPic;
		if(managerCertPic != null){
			putQueryParameter("ManagerCertPic", managerCertPic);
		}
	}

	public String getManagerCertType() {
		return this.managerCertType;
	}

	public void setManagerCertType(String managerCertType) {
		this.managerCertType = managerCertType;
		if(managerCertType != null){
			putQueryParameter("ManagerCertType", managerCertType);
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

	public String getManagerCertExpDate() {
		return this.managerCertExpDate;
	}

	public void setManagerCertExpDate(String managerCertExpDate) {
		this.managerCertExpDate = managerCertExpDate;
		if(managerCertExpDate != null){
			putQueryParameter("ManagerCertExpDate", managerCertExpDate);
		}
	}

	public String getManagerCertNumber() {
		return this.managerCertNumber;
	}

	public void setManagerCertNumber(String managerCertNumber) {
		this.managerCertNumber = managerCertNumber;
		if(managerCertNumber != null){
			putQueryParameter("ManagerCertNumber", managerCertNumber);
		}
	}

	@Override
	public Class<Get400CorpPdfOssUrlResponse> getResponseClass() {
		return Get400CorpPdfOssUrlResponse.class;
	}

}
