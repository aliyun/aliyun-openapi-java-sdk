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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSasOrderRequest extends RpcAcsRequest<CreateSasOrderResponse> {
	   

	private String sasWebguardBoolean;

	private Boolean autoUseCoupon;

	private String spec;

	private String instanceCount;

	private String sasWebguardOrderNum;

	private Integer autoRenewPeriod;

	private Integer period;

	private Boolean autoPay;

	private String sasAntiRansomware;

	private String periodUnit;

	private String sasSc;

	private String sasSlsStorage;

	private String sasProductService;
	public CreateSasOrderRequest() {
		super("Sas", "2018-12-03", "CreateSasOrder", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSasWebguardBoolean() {
		return this.sasWebguardBoolean;
	}

	public void setSasWebguardBoolean(String sasWebguardBoolean) {
		this.sasWebguardBoolean = sasWebguardBoolean;
		if(sasWebguardBoolean != null){
			putQueryParameter("SasWebguardBoolean", sasWebguardBoolean);
		}
	}

	public Boolean getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(Boolean autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon.toString());
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
		}
	}

	public String getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(String instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putQueryParameter("InstanceCount", instanceCount);
		}
	}

	public String getSasWebguardOrderNum() {
		return this.sasWebguardOrderNum;
	}

	public void setSasWebguardOrderNum(String sasWebguardOrderNum) {
		this.sasWebguardOrderNum = sasWebguardOrderNum;
		if(sasWebguardOrderNum != null){
			putQueryParameter("SasWebguardOrderNum", sasWebguardOrderNum);
		}
	}

	public Integer getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Integer autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getSasAntiRansomware() {
		return this.sasAntiRansomware;
	}

	public void setSasAntiRansomware(String sasAntiRansomware) {
		this.sasAntiRansomware = sasAntiRansomware;
		if(sasAntiRansomware != null){
			putQueryParameter("SasAntiRansomware", sasAntiRansomware);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public String getSasSc() {
		return this.sasSc;
	}

	public void setSasSc(String sasSc) {
		this.sasSc = sasSc;
		if(sasSc != null){
			putQueryParameter("SasSc", sasSc);
		}
	}

	public String getSasSlsStorage() {
		return this.sasSlsStorage;
	}

	public void setSasSlsStorage(String sasSlsStorage) {
		this.sasSlsStorage = sasSlsStorage;
		if(sasSlsStorage != null){
			putQueryParameter("SasSlsStorage", sasSlsStorage);
		}
	}

	public String getSasProductService() {
		return this.sasProductService;
	}

	public void setSasProductService(String sasProductService) {
		this.sasProductService = sasProductService;
		if(sasProductService != null){
			putQueryParameter("SasProductService", sasProductService);
		}
	}

	@Override
	public Class<CreateSasOrderResponse> getResponseClass() {
		return CreateSasOrderResponse.class;
	}

}
