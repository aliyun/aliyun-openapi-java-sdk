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

package com.aliyuncs.cro.model.v20210705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadWatermarkLogRequest extends RpcAcsRequest<UploadWatermarkLogResponse> {
	   

	private String sign;

	private String time;

	private String body;

	private String nonce;

	private String data;
	public UploadWatermarkLogRequest() {
		super("CRO", "2021-07-05", "UploadWatermarkLog", "cro");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
		if(sign != null){
			putQueryParameter("Sign", sign);
		}
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
		if(time != null){
			putQueryParameter("Time", time);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putQueryParameter("Body", body);
		}
	}

	public String getNonce() {
		return this.nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
		if(nonce != null){
			putQueryParameter("Nonce", nonce);
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	@Override
	public Class<UploadWatermarkLogResponse> getResponseClass() {
		return UploadWatermarkLogResponse.class;
	}

}
