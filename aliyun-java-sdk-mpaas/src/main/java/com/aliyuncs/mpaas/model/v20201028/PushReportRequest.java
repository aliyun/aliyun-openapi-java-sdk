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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushReportRequest extends RpcAcsRequest<PushReportResponse> {
	   

	private String channel;

	private String imsi;

	private String model;

	private String deliveryToken;

	private String thirdChannelDeviceToken;

	private String appVersion;

	private Integer osType;

	private String pushVersion;

	private String connectType;

	private String appId;

	private String imei;

	private Integer thirdChannel;

	private String workspaceId;
	public PushReportRequest() {
		super("mPaaS", "2020-10-28", "PushReport");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putBodyParameter("Channel", channel);
		}
	}

	public String getImsi() {
		return this.imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
		if(imsi != null){
			putBodyParameter("Imsi", imsi);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public String getDeliveryToken() {
		return this.deliveryToken;
	}

	public void setDeliveryToken(String deliveryToken) {
		this.deliveryToken = deliveryToken;
		if(deliveryToken != null){
			putBodyParameter("DeliveryToken", deliveryToken);
		}
	}

	public String getThirdChannelDeviceToken() {
		return this.thirdChannelDeviceToken;
	}

	public void setThirdChannelDeviceToken(String thirdChannelDeviceToken) {
		this.thirdChannelDeviceToken = thirdChannelDeviceToken;
		if(thirdChannelDeviceToken != null){
			putBodyParameter("ThirdChannelDeviceToken", thirdChannelDeviceToken);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putBodyParameter("AppVersion", appVersion);
		}
	}

	public Integer getOsType() {
		return this.osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
		if(osType != null){
			putBodyParameter("OsType", osType.toString());
		}
	}

	public String getPushVersion() {
		return this.pushVersion;
	}

	public void setPushVersion(String pushVersion) {
		this.pushVersion = pushVersion;
		if(pushVersion != null){
			putBodyParameter("PushVersion", pushVersion);
		}
	}

	public String getConnectType() {
		return this.connectType;
	}

	public void setConnectType(String connectType) {
		this.connectType = connectType;
		if(connectType != null){
			putBodyParameter("ConnectType", connectType);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
		if(imei != null){
			putBodyParameter("Imei", imei);
		}
	}

	public Integer getThirdChannel() {
		return this.thirdChannel;
	}

	public void setThirdChannel(Integer thirdChannel) {
		this.thirdChannel = thirdChannel;
		if(thirdChannel != null){
			putBodyParameter("ThirdChannel", thirdChannel.toString());
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<PushReportResponse> getResponseClass() {
		return PushReportResponse.class;
	}

}
