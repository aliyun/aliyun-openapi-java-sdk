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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddMonitorRequest extends RpcAcsRequest<AddMonitorResponse> {
	   

	private String monitorType;

	private String corpId;

	private String description;

	private String notifierAppSecret;

	private String notifierExtendValues;

	private String notifierUrl;

	private String notifierType;

	private Integer batchIndicator;

	private Integer notifierTimeOut;

	private String algorithmVendor;
	public AddMonitorRequest() {
		super("CDRS", "2020-11-01", "AddMonitor");
		setMethod(MethodType.POST);
	}

	public String getMonitorType() {
		return this.monitorType;
	}

	public void setMonitorType(String monitorType) {
		this.monitorType = monitorType;
		if(monitorType != null){
			putBodyParameter("MonitorType", monitorType);
		}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getNotifierAppSecret() {
		return this.notifierAppSecret;
	}

	public void setNotifierAppSecret(String notifierAppSecret) {
		this.notifierAppSecret = notifierAppSecret;
		if(notifierAppSecret != null){
			putBodyParameter("NotifierAppSecret", notifierAppSecret);
		}
	}

	public String getNotifierExtendValues() {
		return this.notifierExtendValues;
	}

	public void setNotifierExtendValues(String notifierExtendValues) {
		this.notifierExtendValues = notifierExtendValues;
		if(notifierExtendValues != null){
			putBodyParameter("NotifierExtendValues", notifierExtendValues);
		}
	}

	public String getNotifierUrl() {
		return this.notifierUrl;
	}

	public void setNotifierUrl(String notifierUrl) {
		this.notifierUrl = notifierUrl;
		if(notifierUrl != null){
			putBodyParameter("NotifierUrl", notifierUrl);
		}
	}

	public String getNotifierType() {
		return this.notifierType;
	}

	public void setNotifierType(String notifierType) {
		this.notifierType = notifierType;
		if(notifierType != null){
			putBodyParameter("NotifierType", notifierType);
		}
	}

	public Integer getBatchIndicator() {
		return this.batchIndicator;
	}

	public void setBatchIndicator(Integer batchIndicator) {
		this.batchIndicator = batchIndicator;
		if(batchIndicator != null){
			putBodyParameter("BatchIndicator", batchIndicator.toString());
		}
	}

	public Integer getNotifierTimeOut() {
		return this.notifierTimeOut;
	}

	public void setNotifierTimeOut(Integer notifierTimeOut) {
		this.notifierTimeOut = notifierTimeOut;
		if(notifierTimeOut != null){
			putBodyParameter("NotifierTimeOut", notifierTimeOut.toString());
		}
	}

	public String getAlgorithmVendor() {
		return this.algorithmVendor;
	}

	public void setAlgorithmVendor(String algorithmVendor) {
		this.algorithmVendor = algorithmVendor;
		if(algorithmVendor != null){
			putBodyParameter("AlgorithmVendor", algorithmVendor);
		}
	}

	@Override
	public Class<AddMonitorResponse> getResponseClass() {
		return AddMonitorResponse.class;
	}

}
