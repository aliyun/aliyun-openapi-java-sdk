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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitTraceAbJobRequest extends RpcAcsRequest<SubmitTraceAbJobResponse> {
	   

	private Long startTime;

	private String output;

	private String userData;

	private String cipherBase64ed;

	private Long level;

	private String url;

	private String input;

	private Long totalTime;

	private String callBack;
	public SubmitTraceAbJobRequest() {
		super("Mts", "2014-06-18", "SubmitTraceAbJob", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
		if(output != null){
			putQueryParameter("Output", output);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getCipherBase64ed() {
		return this.cipherBase64ed;
	}

	public void setCipherBase64ed(String cipherBase64ed) {
		this.cipherBase64ed = cipherBase64ed;
		if(cipherBase64ed != null){
			putQueryParameter("CipherBase64ed", cipherBase64ed);
		}
	}

	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level.toString());
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putQueryParameter("Url", url);
		}
	}

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
		if(input != null){
			putQueryParameter("Input", input);
		}
	}

	public Long getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(Long totalTime) {
		this.totalTime = totalTime;
		if(totalTime != null){
			putQueryParameter("TotalTime", totalTime.toString());
		}
	}

	public String getCallBack() {
		return this.callBack;
	}

	public void setCallBack(String callBack) {
		this.callBack = callBack;
		if(callBack != null){
			putQueryParameter("CallBack", callBack);
		}
	}

	@Override
	public Class<SubmitTraceAbJobResponse> getResponseClass() {
		return SubmitTraceAbJobResponse.class;
	}

}
