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
public class CreateWhitelistSettingRequest extends RpcAcsRequest<CreateWhitelistSettingResponse> {
	   

	private String certifyId;

	private String certNo;

	private String sourceIp;

	private String lang;

	private Integer validDay;

	private String serviceCode;

	private Long sceneId;
	public CreateWhitelistSettingRequest() {
		super("Cloudauth", "2019-03-07", "CreateWhitelistSetting");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
		if(certNo != null){
			putQueryParameter("CertNo", certNo);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getValidDay() {
		return this.validDay;
	}

	public void setValidDay(Integer validDay) {
		this.validDay = validDay;
		if(validDay != null){
			putQueryParameter("ValidDay", validDay.toString());
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putQueryParameter("ServiceCode", serviceCode);
		}
	}

	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId.toString());
		}
	}

	@Override
	public Class<CreateWhitelistSettingResponse> getResponseClass() {
		return CreateWhitelistSettingResponse.class;
	}

}
