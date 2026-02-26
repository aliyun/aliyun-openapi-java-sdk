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

package com.aliyuncs.mseap.model.v20210118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushRpaTaskDetailRequest extends RpcAcsRequest<PushRpaTaskDetailResponse> {
	   

	private Long userCallerParentId;

	private String apiType;

	private Long modelDetailId;

	private String userKp;

	private String lang;

	private Long taskId;

	private String userCallerType;

	private String userSecurityToken;

	private String userAccessKeyId;

	private String aliyunKp;

	private String userBid;

	private String originalRequest;

	private String inputScreenshot;

	private String inputData;

	private String outputData;

	private String inputHtml;

	private Long taskDetailId;

	private String outputHtml;

	private String userClientIp;

	private String bid;

	private String outputScreenshot;

	private Integer status;
	public PushRpaTaskDetailRequest() {
		super("mseap", "2021-01-18", "PushRpaTaskDetail");
		setMethod(MethodType.POST);
	}

	public Long getUserCallerParentId() {
		return this.userCallerParentId;
	}

	public void setUserCallerParentId(Long userCallerParentId) {
		this.userCallerParentId = userCallerParentId;
		if(userCallerParentId != null){
			putQueryParameter("UserCallerParentId", userCallerParentId.toString());
		}
	}

	public String getApiType() {
		return this.apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
		if(apiType != null){
			putQueryParameter("ApiType", apiType);
		}
	}

	public Long getModelDetailId() {
		return this.modelDetailId;
	}

	public void setModelDetailId(Long modelDetailId) {
		this.modelDetailId = modelDetailId;
		if(modelDetailId != null){
			putQueryParameter("ModelDetailId", modelDetailId.toString());
		}
	}

	public String getUserKp() {
		return this.userKp;
	}

	public void setUserKp(String userKp) {
		this.userKp = userKp;
		if(userKp != null){
			putQueryParameter("UserKp", userKp);
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

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	public String getUserCallerType() {
		return this.userCallerType;
	}

	public void setUserCallerType(String userCallerType) {
		this.userCallerType = userCallerType;
		if(userCallerType != null){
			putQueryParameter("UserCallerType", userCallerType);
		}
	}

	public String getUserSecurityToken() {
		return this.userSecurityToken;
	}

	public void setUserSecurityToken(String userSecurityToken) {
		this.userSecurityToken = userSecurityToken;
		if(userSecurityToken != null){
			putQueryParameter("UserSecurityToken", userSecurityToken);
		}
	}

	public String getUserAccessKeyId() {
		return this.userAccessKeyId;
	}

	public void setUserAccessKeyId(String userAccessKeyId) {
		this.userAccessKeyId = userAccessKeyId;
		if(userAccessKeyId != null){
			putQueryParameter("UserAccessKeyId", userAccessKeyId);
		}
	}

	public String getAliyunKp() {
		return this.aliyunKp;
	}

	public void setAliyunKp(String aliyunKp) {
		this.aliyunKp = aliyunKp;
		if(aliyunKp != null){
			putQueryParameter("AliyunKp", aliyunKp);
		}
	}

	public String getUserBid() {
		return this.userBid;
	}

	public void setUserBid(String userBid) {
		this.userBid = userBid;
		if(userBid != null){
			putQueryParameter("UserBid", userBid);
		}
	}

	public String getOriginalRequest() {
		return this.originalRequest;
	}

	public void setOriginalRequest(String originalRequest) {
		this.originalRequest = originalRequest;
		if(originalRequest != null){
			putQueryParameter("OriginalRequest", originalRequest);
		}
	}

	public String getInputScreenshot() {
		return this.inputScreenshot;
	}

	public void setInputScreenshot(String inputScreenshot) {
		this.inputScreenshot = inputScreenshot;
		if(inputScreenshot != null){
			putQueryParameter("InputScreenshot", inputScreenshot);
		}
	}

	public String getInputData() {
		return this.inputData;
	}

	public void setInputData(String inputData) {
		this.inputData = inputData;
		if(inputData != null){
			putQueryParameter("InputData", inputData);
		}
	}

	public String getOutputData() {
		return this.outputData;
	}

	public void setOutputData(String outputData) {
		this.outputData = outputData;
		if(outputData != null){
			putQueryParameter("OutputData", outputData);
		}
	}

	public String getInputHtml() {
		return this.inputHtml;
	}

	public void setInputHtml(String inputHtml) {
		this.inputHtml = inputHtml;
		if(inputHtml != null){
			putQueryParameter("InputHtml", inputHtml);
		}
	}

	public Long getTaskDetailId() {
		return this.taskDetailId;
	}

	public void setTaskDetailId(Long taskDetailId) {
		this.taskDetailId = taskDetailId;
		if(taskDetailId != null){
			putQueryParameter("TaskDetailId", taskDetailId.toString());
		}
	}

	public String getOutputHtml() {
		return this.outputHtml;
	}

	public void setOutputHtml(String outputHtml) {
		this.outputHtml = outputHtml;
		if(outputHtml != null){
			putQueryParameter("OutputHtml", outputHtml);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public String getOutputScreenshot() {
		return this.outputScreenshot;
	}

	public void setOutputScreenshot(String outputScreenshot) {
		this.outputScreenshot = outputScreenshot;
		if(outputScreenshot != null){
			putQueryParameter("OutputScreenshot", outputScreenshot);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<PushRpaTaskDetailResponse> getResponseClass() {
		return PushRpaTaskDetailResponse.class;
	}

}
