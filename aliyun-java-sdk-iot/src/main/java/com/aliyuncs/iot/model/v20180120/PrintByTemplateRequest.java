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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PrintByTemplateRequest extends RpcAcsRequest<PrintByTemplateResponse> {
	   

	private String templateBizCode;

	private String iotId;

	private String iotInstanceId;

	private Boolean historyPrintTopic;

	private String productKey;

	private String paramsJsonString;

	private String deviceName;
	public PrintByTemplateRequest() {
		super("Iot", "2018-01-20", "PrintByTemplate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplateBizCode() {
		return this.templateBizCode;
	}

	public void setTemplateBizCode(String templateBizCode) {
		this.templateBizCode = templateBizCode;
		if(templateBizCode != null){
			putBodyParameter("TemplateBizCode", templateBizCode);
		}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putBodyParameter("IotId", iotId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Boolean getHistoryPrintTopic() {
		return this.historyPrintTopic;
	}

	public void setHistoryPrintTopic(Boolean historyPrintTopic) {
		this.historyPrintTopic = historyPrintTopic;
		if(historyPrintTopic != null){
			putBodyParameter("HistoryPrintTopic", historyPrintTopic.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putBodyParameter("ProductKey", productKey);
		}
	}

	public String getParamsJsonString() {
		return this.paramsJsonString;
	}

	public void setParamsJsonString(String paramsJsonString) {
		this.paramsJsonString = paramsJsonString;
		if(paramsJsonString != null){
			putBodyParameter("ParamsJsonString", paramsJsonString);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putBodyParameter("DeviceName", deviceName);
		}
	}

	@Override
	public Class<PrintByTemplateResponse> getResponseClass() {
		return PrintByTemplateResponse.class;
	}

}
