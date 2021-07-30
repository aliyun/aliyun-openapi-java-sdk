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

package com.aliyuncs.xingzhen.model.v20191121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushDetectDataRequest extends RpcAcsRequest<PushDetectDataResponse> {
	   

	private String detectInfo;

	private String environment;

	private String appName;

	private Long detectId;

	private String requestId;

	private String caseId;

	private String remark;

	private String api;

	private String detailUrl;

	private String caseName;
	public PushDetectDataRequest() {
		super("Xingzhen", "2019-11-21", "PushDetectData");
		setMethod(MethodType.POST);
	}

	public String getDetectInfo() {
		return this.detectInfo;
	}

	public void setDetectInfo(String detectInfo) {
		this.detectInfo = detectInfo;
		if(detectInfo != null){
			putBodyParameter("DetectInfo", detectInfo);
		}
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
		if(environment != null){
			putQueryParameter("Environment", environment);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public Long getDetectId() {
		return this.detectId;
	}

	public void setDetectId(Long detectId) {
		this.detectId = detectId;
		if(detectId != null){
			putQueryParameter("DetectId", detectId.toString());
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
		if(caseId != null){
			putQueryParameter("CaseId", caseId);
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

	public String getApi() {
		return this.api;
	}

	public void setApi(String api) {
		this.api = api;
		if(api != null){
			putQueryParameter("Api", api);
		}
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
		if(detailUrl != null){
			putQueryParameter("DetailUrl", detailUrl);
		}
	}

	public String getCaseName() {
		return this.caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
		if(caseName != null){
			putQueryParameter("CaseName", caseName);
		}
	}

	@Override
	public Class<PushDetectDataResponse> getResponseClass() {
		return PushDetectDataResponse.class;
	}

}
