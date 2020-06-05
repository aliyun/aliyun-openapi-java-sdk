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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitNodeLocalConfigAddingTaskRequest extends RpcAcsRequest<SubmitNodeLocalConfigAddingTaskResponse> {
	   

	private Integer freq;

	private Integer datr;

	private String d2dKey;

	private String devEui;

	private String d2dAddr;
	public SubmitNodeLocalConfigAddingTaskRequest() {
		super("LinkWAN", "2019-03-01", "SubmitNodeLocalConfigAddingTask", "linkwan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getFreq() {
		return this.freq;
	}

	public void setFreq(Integer freq) {
		this.freq = freq;
		if(freq != null){
			putQueryParameter("Freq", freq.toString());
		}
	}

	public Integer getDatr() {
		return this.datr;
	}

	public void setDatr(Integer datr) {
		this.datr = datr;
		if(datr != null){
			putQueryParameter("Datr", datr.toString());
		}
	}

	public String getD2dKey() {
		return this.d2dKey;
	}

	public void setD2dKey(String d2dKey) {
		this.d2dKey = d2dKey;
		if(d2dKey != null){
			putQueryParameter("D2dKey", d2dKey);
		}
	}

	public String getDevEui() {
		return this.devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
		if(devEui != null){
			putQueryParameter("DevEui", devEui);
		}
	}

	public String getD2dAddr() {
		return this.d2dAddr;
	}

	public void setD2dAddr(String d2dAddr) {
		this.d2dAddr = d2dAddr;
		if(d2dAddr != null){
			putQueryParameter("D2dAddr", d2dAddr);
		}
	}

	@Override
	public Class<SubmitNodeLocalConfigAddingTaskResponse> getResponseClass() {
		return SubmitNodeLocalConfigAddingTaskResponse.class;
	}

}
