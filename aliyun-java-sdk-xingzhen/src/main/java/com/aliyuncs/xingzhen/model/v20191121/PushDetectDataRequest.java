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
	   

	private String errorMessage;

	private String schema;

	private String caseOwner;

	private Long regionCode;

	private Long detectId;

	private String endTime;

	private String remark;

	private String startTime;

	private String env;

	private String appName;

	private Long processId;

	private String requestId;

	private String api;

	private String detailUrl;

	private String errorCode;
	public PushDetectDataRequest() {
		super("Xingzhen", "2019-11-21", "PushDetectData");
		setMethod(MethodType.POST);
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		if(errorMessage != null){
			putQueryParameter("ErrorMessage", errorMessage);
		}
	}

	public String getSchema() {
		return this.schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
		if(schema != null){
			putQueryParameter("Schema", schema);
		}
	}

	public String getCaseOwner() {
		return this.caseOwner;
	}

	public void setCaseOwner(String caseOwner) {
		this.caseOwner = caseOwner;
		if(caseOwner != null){
			putQueryParameter("CaseOwner", caseOwner);
		}
	}

	public Long getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(Long regionCode) {
		this.regionCode = regionCode;
		if(regionCode != null){
			putQueryParameter("RegionCode", regionCode.toString());
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
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

	public Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
		if(processId != null){
			putQueryParameter("ProcessId", processId.toString());
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		if(errorCode != null){
			putQueryParameter("ErrorCode", errorCode);
		}
	}

	@Override
	public Class<PushDetectDataResponse> getResponseClass() {
		return PushDetectDataResponse.class;
	}

}
