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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserRequest extends RpcAcsRequest<UpdateUserResponse> {
	   

	private String corpId;

	private String faceImageContent;

	private Integer gender;

	private String plateNo;

	private String idNumber;

	private String faceImageUrl;

	private Long userId;

	private String attachment;

	private String isvSubId;

	private String address;

	private Long userGroupId;

	private String phoneNo;

	private String bizId;

	private Integer age;

	private String userName;
	public UpdateUserRequest() {
		super("Vcs", "2020-05-15", "UpdateUser");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getFaceImageContent() {
		return this.faceImageContent;
	}

	public void setFaceImageContent(String faceImageContent) {
		this.faceImageContent = faceImageContent;
		if(faceImageContent != null){
			putBodyParameter("FaceImageContent", faceImageContent);
		}
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
		if(gender != null){
			putBodyParameter("Gender", gender.toString());
		}
	}

	public String getPlateNo() {
		return this.plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
		if(plateNo != null){
			putBodyParameter("PlateNo", plateNo);
		}
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
		if(idNumber != null){
			putBodyParameter("IdNumber", idNumber);
		}
	}

	public String getFaceImageUrl() {
		return this.faceImageUrl;
	}

	public void setFaceImageUrl(String faceImageUrl) {
		this.faceImageUrl = faceImageUrl;
		if(faceImageUrl != null){
			putBodyParameter("FaceImageUrl", faceImageUrl);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId.toString());
		}
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
		if(attachment != null){
			putBodyParameter("Attachment", attachment);
		}
	}

	public String getIsvSubId() {
		return this.isvSubId;
	}

	public void setIsvSubId(String isvSubId) {
		this.isvSubId = isvSubId;
		if(isvSubId != null){
			putBodyParameter("IsvSubId", isvSubId);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putBodyParameter("Address", address);
		}
	}

	public Long getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(Long userGroupId) {
		this.userGroupId = userGroupId;
		if(userGroupId != null){
			putBodyParameter("UserGroupId", userGroupId.toString());
		}
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
		if(phoneNo != null){
			putBodyParameter("PhoneNo", phoneNo);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
		if(age != null){
			putBodyParameter("Age", age.toString());
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putBodyParameter("UserName", userName);
		}
	}

	@Override
	public Class<UpdateUserResponse> getResponseClass() {
		return UpdateUserResponse.class;
	}

}
