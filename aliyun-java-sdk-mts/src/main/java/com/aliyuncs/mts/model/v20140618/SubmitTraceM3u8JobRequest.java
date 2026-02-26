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
public class SubmitTraceM3u8JobRequest extends RpcAcsRequest<SubmitTraceM3u8JobResponse> {
	   

	private String mediaId;

	private String params;

	private String output;

	private String trace;

	private String keyUri;
	public SubmitTraceM3u8JobRequest() {
		super("Mts", "2014-06-18", "SubmitTraceM3u8Job", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
		if(mediaId != null){
			putQueryParameter("MediaId", mediaId);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
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

	public String getTrace() {
		return this.trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
		if(trace != null){
			putQueryParameter("Trace", trace);
		}
	}

	public String getKeyUri() {
		return this.keyUri;
	}

	public void setKeyUri(String keyUri) {
		this.keyUri = keyUri;
		if(keyUri != null){
			putQueryParameter("KeyUri", keyUri);
		}
	}

	@Override
	public Class<SubmitTraceM3u8JobResponse> getResponseClass() {
		return SubmitTraceM3u8JobResponse.class;
	}

}
