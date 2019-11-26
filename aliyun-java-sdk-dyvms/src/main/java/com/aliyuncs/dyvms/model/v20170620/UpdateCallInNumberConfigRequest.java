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
public class UpdateCallInNumberConfigRequest extends RpcAcsRequest<UpdateCallInNumberConfigResponse> {
	   

	private String actionType;

	private String externalUrl;

	private String disableTimes;

	private Long resourceOwnerId;

	private String dtmfEndCharacter;

	private String invokeFailMedia;

	private String dtmfNoninMedia;

	private String remark;

	private String notExistMedia;

	private Integer dtmfMaxCycles;

	private String number;

	private String accessKey;

	private String dtmfSwitch;

	private Long id;

	private String resourceOwnerAccount;

	private String transDisableTimeMedia;

	private String actionTypeParam;

	private String prodCode;

	private Long ownerId;

	private String transDisableTimeSwitch;

	private String dtmfFirstMedia;

	private String appsecret;

	private String dtmfReplayCharacter;

	private String transWaitMedia;

	private Integer dtmfNoninOvertime;
	public UpdateCallInNumberConfigRequest() {
		super("Dyvms", "2017-06-20", "UpdateCallInNumberConfig", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType);
		}
	}

	public String getExternalUrl() {
		return this.externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
		if(externalUrl != null){
			putQueryParameter("ExternalUrl", externalUrl);
		}
	}

	public String getDisableTimes() {
		return this.disableTimes;
	}

	public void setDisableTimes(String disableTimes) {
		this.disableTimes = disableTimes;
		if(disableTimes != null){
			putQueryParameter("DisableTimes", disableTimes);
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

	public String getDtmfEndCharacter() {
		return this.dtmfEndCharacter;
	}

	public void setDtmfEndCharacter(String dtmfEndCharacter) {
		this.dtmfEndCharacter = dtmfEndCharacter;
		if(dtmfEndCharacter != null){
			putQueryParameter("DtmfEndCharacter", dtmfEndCharacter);
		}
	}

	public String getInvokeFailMedia() {
		return this.invokeFailMedia;
	}

	public void setInvokeFailMedia(String invokeFailMedia) {
		this.invokeFailMedia = invokeFailMedia;
		if(invokeFailMedia != null){
			putQueryParameter("InvokeFailMedia", invokeFailMedia);
		}
	}

	public String getDtmfNoninMedia() {
		return this.dtmfNoninMedia;
	}

	public void setDtmfNoninMedia(String dtmfNoninMedia) {
		this.dtmfNoninMedia = dtmfNoninMedia;
		if(dtmfNoninMedia != null){
			putQueryParameter("DtmfNoninMedia", dtmfNoninMedia);
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

	public String getNotExistMedia() {
		return this.notExistMedia;
	}

	public void setNotExistMedia(String notExistMedia) {
		this.notExistMedia = notExistMedia;
		if(notExistMedia != null){
			putQueryParameter("NotExistMedia", notExistMedia);
		}
	}

	public Integer getDtmfMaxCycles() {
		return this.dtmfMaxCycles;
	}

	public void setDtmfMaxCycles(Integer dtmfMaxCycles) {
		this.dtmfMaxCycles = dtmfMaxCycles;
		if(dtmfMaxCycles != null){
			putQueryParameter("DtmfMaxCycles", dtmfMaxCycles.toString());
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

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putQueryParameter("AccessKey", accessKey);
		}
	}

	public String getDtmfSwitch() {
		return this.dtmfSwitch;
	}

	public void setDtmfSwitch(String dtmfSwitch) {
		this.dtmfSwitch = dtmfSwitch;
		if(dtmfSwitch != null){
			putQueryParameter("DtmfSwitch", dtmfSwitch);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public String getTransDisableTimeMedia() {
		return this.transDisableTimeMedia;
	}

	public void setTransDisableTimeMedia(String transDisableTimeMedia) {
		this.transDisableTimeMedia = transDisableTimeMedia;
		if(transDisableTimeMedia != null){
			putQueryParameter("TransDisableTimeMedia", transDisableTimeMedia);
		}
	}

	public String getActionTypeParam() {
		return this.actionTypeParam;
	}

	public void setActionTypeParam(String actionTypeParam) {
		this.actionTypeParam = actionTypeParam;
		if(actionTypeParam != null){
			putQueryParameter("ActionTypeParam", actionTypeParam);
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

	public String getTransDisableTimeSwitch() {
		return this.transDisableTimeSwitch;
	}

	public void setTransDisableTimeSwitch(String transDisableTimeSwitch) {
		this.transDisableTimeSwitch = transDisableTimeSwitch;
		if(transDisableTimeSwitch != null){
			putQueryParameter("TransDisableTimeSwitch", transDisableTimeSwitch);
		}
	}

	public String getDtmfFirstMedia() {
		return this.dtmfFirstMedia;
	}

	public void setDtmfFirstMedia(String dtmfFirstMedia) {
		this.dtmfFirstMedia = dtmfFirstMedia;
		if(dtmfFirstMedia != null){
			putQueryParameter("DtmfFirstMedia", dtmfFirstMedia);
		}
	}

	public String getAppsecret() {
		return this.appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
		if(appsecret != null){
			putQueryParameter("Appsecret", appsecret);
		}
	}

	public String getDtmfReplayCharacter() {
		return this.dtmfReplayCharacter;
	}

	public void setDtmfReplayCharacter(String dtmfReplayCharacter) {
		this.dtmfReplayCharacter = dtmfReplayCharacter;
		if(dtmfReplayCharacter != null){
			putQueryParameter("DtmfReplayCharacter", dtmfReplayCharacter);
		}
	}

	public String getTransWaitMedia() {
		return this.transWaitMedia;
	}

	public void setTransWaitMedia(String transWaitMedia) {
		this.transWaitMedia = transWaitMedia;
		if(transWaitMedia != null){
			putQueryParameter("TransWaitMedia", transWaitMedia);
		}
	}

	public Integer getDtmfNoninOvertime() {
		return this.dtmfNoninOvertime;
	}

	public void setDtmfNoninOvertime(Integer dtmfNoninOvertime) {
		this.dtmfNoninOvertime = dtmfNoninOvertime;
		if(dtmfNoninOvertime != null){
			putQueryParameter("DtmfNoninOvertime", dtmfNoninOvertime.toString());
		}
	}

	@Override
	public Class<UpdateCallInNumberConfigResponse> getResponseClass() {
		return UpdateCallInNumberConfigResponse.class;
	}

}
