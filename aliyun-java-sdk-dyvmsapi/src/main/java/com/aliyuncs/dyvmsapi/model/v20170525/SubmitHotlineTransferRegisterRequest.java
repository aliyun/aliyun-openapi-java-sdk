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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvmsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitHotlineTransferRegisterRequest extends RpcAcsRequest<SubmitHotlineTransferRegisterResponse> {
	   

	private String operatorIdentityCard;

	private Long resourceOwnerId;

	private String operatorMail;

	private String hotlineNumber;

	private List<TransferPhoneNumberInfos> transferPhoneNumberInfoss;

	private String operatorMobileVerifyCode;

	private String agreement;

	private String qualificationId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String operatorMobile;

	private String operatorMailVerifyCode;

	private String operatorName;
	public SubmitHotlineTransferRegisterRequest() {
		super("Dyvmsapi", "2017-05-25", "SubmitHotlineTransferRegister", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperatorIdentityCard() {
		return this.operatorIdentityCard;
	}

	public void setOperatorIdentityCard(String operatorIdentityCard) {
		this.operatorIdentityCard = operatorIdentityCard;
		if(operatorIdentityCard != null){
			putQueryParameter("OperatorIdentityCard", operatorIdentityCard);
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

	public String getOperatorMail() {
		return this.operatorMail;
	}

	public void setOperatorMail(String operatorMail) {
		this.operatorMail = operatorMail;
		if(operatorMail != null){
			putQueryParameter("OperatorMail", operatorMail);
		}
	}

	public String getHotlineNumber() {
		return this.hotlineNumber;
	}

	public void setHotlineNumber(String hotlineNumber) {
		this.hotlineNumber = hotlineNumber;
		if(hotlineNumber != null){
			putQueryParameter("HotlineNumber", hotlineNumber);
		}
	}

	public List<TransferPhoneNumberInfos> getTransferPhoneNumberInfoss() {
		return this.transferPhoneNumberInfoss;
	}

	public void setTransferPhoneNumberInfoss(List<TransferPhoneNumberInfos> transferPhoneNumberInfoss) {
		this.transferPhoneNumberInfoss = transferPhoneNumberInfoss;	
		if (transferPhoneNumberInfoss != null) {
			for (int depth1 = 0; depth1 < transferPhoneNumberInfoss.size(); depth1++) {
				putQueryParameter("TransferPhoneNumberInfos." + (depth1 + 1) + ".PhoneNumber" , transferPhoneNumberInfoss.get(depth1).getPhoneNumber());
				putQueryParameter("TransferPhoneNumberInfos." + (depth1 + 1) + ".PhoneNumberOwnerName" , transferPhoneNumberInfoss.get(depth1).getPhoneNumberOwnerName());
				putQueryParameter("TransferPhoneNumberInfos." + (depth1 + 1) + ".IdentityCard" , transferPhoneNumberInfoss.get(depth1).getIdentityCard());
			}
		}	
	}

	public String getOperatorMobileVerifyCode() {
		return this.operatorMobileVerifyCode;
	}

	public void setOperatorMobileVerifyCode(String operatorMobileVerifyCode) {
		this.operatorMobileVerifyCode = operatorMobileVerifyCode;
		if(operatorMobileVerifyCode != null){
			putQueryParameter("OperatorMobileVerifyCode", operatorMobileVerifyCode);
		}
	}

	public String getAgreement() {
		return this.agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
		if(agreement != null){
			putQueryParameter("Agreement", agreement);
		}
	}

	public String getQualificationId() {
		return this.qualificationId;
	}

	public void setQualificationId(String qualificationId) {
		this.qualificationId = qualificationId;
		if(qualificationId != null){
			putQueryParameter("QualificationId", qualificationId);
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

	public String getOperatorMobile() {
		return this.operatorMobile;
	}

	public void setOperatorMobile(String operatorMobile) {
		this.operatorMobile = operatorMobile;
		if(operatorMobile != null){
			putQueryParameter("OperatorMobile", operatorMobile);
		}
	}

	public String getOperatorMailVerifyCode() {
		return this.operatorMailVerifyCode;
	}

	public void setOperatorMailVerifyCode(String operatorMailVerifyCode) {
		this.operatorMailVerifyCode = operatorMailVerifyCode;
		if(operatorMailVerifyCode != null){
			putQueryParameter("OperatorMailVerifyCode", operatorMailVerifyCode);
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putQueryParameter("OperatorName", operatorName);
		}
	}

	public static class TransferPhoneNumberInfos {

		private String phoneNumber;

		private String phoneNumberOwnerName;

		private String identityCard;

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneNumberOwnerName() {
			return this.phoneNumberOwnerName;
		}

		public void setPhoneNumberOwnerName(String phoneNumberOwnerName) {
			this.phoneNumberOwnerName = phoneNumberOwnerName;
		}

		public String getIdentityCard() {
			return this.identityCard;
		}

		public void setIdentityCard(String identityCard) {
			this.identityCard = identityCard;
		}
	}

	@Override
	public Class<SubmitHotlineTransferRegisterResponse> getResponseClass() {
		return SubmitHotlineTransferRegisterResponse.class;
	}

}
