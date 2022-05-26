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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyContacterRequest extends RpcAcsRequest<ModifyContacterResponse> {
	   

	private String contacterPosition;

	private String contacterMobile;

	private Long userId;

	private String contacterType;

	private String contacterWangwang;

	private String contacterEmail;

	private Boolean emailConfirmed;

	private String contacterAddress;

	private String contacterName;

	private Boolean mobileConfirmed;

	private String contacterStaffNo;

	private Long contacterId;

	private String contacterDingding;
	public ModifyContacterRequest() {
		super("account-crm", "2016-06-06", "ModifyContacter");
		setMethod(MethodType.POST);
	}

	public String getContacterPosition() {
		return this.contacterPosition;
	}

	public void setContacterPosition(String contacterPosition) {
		this.contacterPosition = contacterPosition;
		if(contacterPosition != null){
			putQueryParameter("ContacterPosition", contacterPosition);
		}
	}

	public String getContacterMobile() {
		return this.contacterMobile;
	}

	public void setContacterMobile(String contacterMobile) {
		this.contacterMobile = contacterMobile;
		if(contacterMobile != null){
			putQueryParameter("ContacterMobile", contacterMobile);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	public String getContacterType() {
		return this.contacterType;
	}

	public void setContacterType(String contacterType) {
		this.contacterType = contacterType;
		if(contacterType != null){
			putQueryParameter("ContacterType", contacterType);
		}
	}

	public String getContacterWangwang() {
		return this.contacterWangwang;
	}

	public void setContacterWangwang(String contacterWangwang) {
		this.contacterWangwang = contacterWangwang;
		if(contacterWangwang != null){
			putQueryParameter("ContacterWangwang", contacterWangwang);
		}
	}

	public String getContacterEmail() {
		return this.contacterEmail;
	}

	public void setContacterEmail(String contacterEmail) {
		this.contacterEmail = contacterEmail;
		if(contacterEmail != null){
			putQueryParameter("ContacterEmail", contacterEmail);
		}
	}

	public Boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(Boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
		if(emailConfirmed != null){
			putQueryParameter("EmailConfirmed", emailConfirmed.toString());
		}
	}

	public String getContacterAddress() {
		return this.contacterAddress;
	}

	public void setContacterAddress(String contacterAddress) {
		this.contacterAddress = contacterAddress;
		if(contacterAddress != null){
			putQueryParameter("ContacterAddress", contacterAddress);
		}
	}

	public String getContacterName() {
		return this.contacterName;
	}

	public void setContacterName(String contacterName) {
		this.contacterName = contacterName;
		if(contacterName != null){
			putQueryParameter("ContacterName", contacterName);
		}
	}

	public Boolean getMobileConfirmed() {
		return this.mobileConfirmed;
	}

	public void setMobileConfirmed(Boolean mobileConfirmed) {
		this.mobileConfirmed = mobileConfirmed;
		if(mobileConfirmed != null){
			putQueryParameter("MobileConfirmed", mobileConfirmed.toString());
		}
	}

	public String getContacterStaffNo() {
		return this.contacterStaffNo;
	}

	public void setContacterStaffNo(String contacterStaffNo) {
		this.contacterStaffNo = contacterStaffNo;
		if(contacterStaffNo != null){
			putQueryParameter("ContacterStaffNo", contacterStaffNo);
		}
	}

	public Long getContacterId() {
		return this.contacterId;
	}

	public void setContacterId(Long contacterId) {
		this.contacterId = contacterId;
		if(contacterId != null){
			putQueryParameter("ContacterId", contacterId.toString());
		}
	}

	public String getContacterDingding() {
		return this.contacterDingding;
	}

	public void setContacterDingding(String contacterDingding) {
		this.contacterDingding = contacterDingding;
		if(contacterDingding != null){
			putQueryParameter("ContacterDingding", contacterDingding);
		}
	}

	@Override
	public Class<ModifyContacterResponse> getResponseClass() {
		return ModifyContacterResponse.class;
	}

}
