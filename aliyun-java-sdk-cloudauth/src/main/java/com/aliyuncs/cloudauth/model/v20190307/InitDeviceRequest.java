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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InitDeviceRequest extends RpcAcsRequest<InitDeviceResponse> {
	   

	private String channel;

	private String bizData;

	private String merchant;

	private String appVersion;

	private String certifyId;

	private String outerOrderNo;

	private String produceNode;

	private String productName;

	private String certifyPrincipal;

	private String metaInfo;
	public InitDeviceRequest() {
		super("Cloudauth", "2019-03-07", "InitDevice");
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
			putQueryParameter("Channel", channel);
		}
	}

	public String getBizData() {
		return this.bizData;
	}

	public void setBizData(String bizData) {
		this.bizData = bizData;
		if(bizData != null){
			putQueryParameter("BizData", bizData);
		}
	}

	public String getMerchant() {
		return this.merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
		if(merchant != null){
			putQueryParameter("Merchant", merchant);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putQueryParameter("AppVersion", appVersion);
		}
	}

	public String getCertifyId() {
		return this.certifyId;
	}

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
		if(certifyId != null){
			putQueryParameter("CertifyId", certifyId);
		}
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}

	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
		if(outerOrderNo != null){
			putQueryParameter("OuterOrderNo", outerOrderNo);
		}
	}

	public String getProduceNode() {
		return this.produceNode;
	}

	public void setProduceNode(String produceNode) {
		this.produceNode = produceNode;
		if(produceNode != null){
			putQueryParameter("ProduceNode", produceNode);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getCertifyPrincipal() {
		return this.certifyPrincipal;
	}

	public void setCertifyPrincipal(String certifyPrincipal) {
		this.certifyPrincipal = certifyPrincipal;
		if(certifyPrincipal != null){
			putQueryParameter("CertifyPrincipal", certifyPrincipal);
		}
	}

	public String getMetaInfo() {
		return this.metaInfo;
	}

	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
		if(metaInfo != null){
			putQueryParameter("MetaInfo", metaInfo);
		}
	}

	@Override
	public Class<InitDeviceResponse> getResponseClass() {
		return InitDeviceResponse.class;
	}

}
