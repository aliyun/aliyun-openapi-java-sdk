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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTrademarkOrderRequest extends RpcAcsRequest<CreateTrademarkOrderResponse> {
	   

	private String realUserName;

	private String orderData;

	private String channel;

	private Integer type;

	private String materialId;

	private Long userId;

	private String tmComment;

	private String tmNameType;

	private String tmIcon;

	private String uid;

	private String renewInfoId;

	private String rootCode;

	private String loaOssKey;

	private String registerNumber;

	private String tmName;

	private String partnerCode;

	private String phoneNum;

	private String registerName;

	private Boolean isBlackIcon;

	private String bizId;
	public CreateTrademarkOrderRequest() {
		super("Trademark", "2018-07-24", "CreateTrademarkOrder");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRealUserName() {
		return this.realUserName;
	}

	public void setRealUserName(String realUserName) {
		this.realUserName = realUserName;
		if(realUserName != null){
			putQueryParameter("RealUserName", realUserName);
		}
	}

	public String getOrderData() {
		return this.orderData;
	}

	public void setOrderData(String orderData) {
		this.orderData = orderData;
		if(orderData != null){
			putQueryParameter("OrderData", orderData);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
		if(materialId != null){
			putQueryParameter("MaterialId", materialId);
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

	public String getTmComment() {
		return this.tmComment;
	}

	public void setTmComment(String tmComment) {
		this.tmComment = tmComment;
		if(tmComment != null){
			putQueryParameter("TmComment", tmComment);
		}
	}

	public String getTmNameType() {
		return this.tmNameType;
	}

	public void setTmNameType(String tmNameType) {
		this.tmNameType = tmNameType;
		if(tmNameType != null){
			putQueryParameter("TmNameType", tmNameType);
		}
	}

	public String getTmIcon() {
		return this.tmIcon;
	}

	public void setTmIcon(String tmIcon) {
		this.tmIcon = tmIcon;
		if(tmIcon != null){
			putQueryParameter("TmIcon", tmIcon);
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public String getRenewInfoId() {
		return this.renewInfoId;
	}

	public void setRenewInfoId(String renewInfoId) {
		this.renewInfoId = renewInfoId;
		if(renewInfoId != null){
			putQueryParameter("RenewInfoId", renewInfoId);
		}
	}

	public String getRootCode() {
		return this.rootCode;
	}

	public void setRootCode(String rootCode) {
		this.rootCode = rootCode;
		if(rootCode != null){
			putQueryParameter("RootCode", rootCode);
		}
	}

	public String getLoaOssKey() {
		return this.loaOssKey;
	}

	public void setLoaOssKey(String loaOssKey) {
		this.loaOssKey = loaOssKey;
		if(loaOssKey != null){
			putQueryParameter("LoaOssKey", loaOssKey);
		}
	}

	public String getRegisterNumber() {
		return this.registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
		if(registerNumber != null){
			putQueryParameter("RegisterNumber", registerNumber);
		}
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putQueryParameter("TmName", tmName);
		}
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}

	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
		if(partnerCode != null){
			putQueryParameter("PartnerCode", partnerCode);
		}
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
		if(phoneNum != null){
			putQueryParameter("PhoneNum", phoneNum);
		}
	}

	public String getRegisterName() {
		return this.registerName;
	}

	public void setRegisterName(String registerName) {
		this.registerName = registerName;
		if(registerName != null){
			putQueryParameter("RegisterName", registerName);
		}
	}

	public Boolean getIsBlackIcon() {
		return this.isBlackIcon;
	}

	public void setIsBlackIcon(Boolean isBlackIcon) {
		this.isBlackIcon = isBlackIcon;
		if(isBlackIcon != null){
			putQueryParameter("IsBlackIcon", isBlackIcon.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	@Override
	public Class<CreateTrademarkOrderResponse> getResponseClass() {
		return CreateTrademarkOrderResponse.class;
	}

}
