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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetRumExceptionStackRequest extends RpcAcsRequest<GetRumExceptionStackResponse> {
	   

	private String sourcemapType;

	private String exceptionThreadId;

	private String pid;

	private String exceptionBinaryImages;

	private String extraInfo;

	private String exceptionStack;
	public GetRumExceptionStackRequest() {
		super("ARMS", "2019-08-08", "GetRumExceptionStack", "arms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourcemapType() {
		return this.sourcemapType;
	}

	public void setSourcemapType(String sourcemapType) {
		this.sourcemapType = sourcemapType;
		if(sourcemapType != null){
			putQueryParameter("SourcemapType", sourcemapType);
		}
	}

	public String getExceptionThreadId() {
		return this.exceptionThreadId;
	}

	public void setExceptionThreadId(String exceptionThreadId) {
		this.exceptionThreadId = exceptionThreadId;
		if(exceptionThreadId != null){
			putQueryParameter("ExceptionThreadId", exceptionThreadId);
		}
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	public String getExceptionBinaryImages() {
		return this.exceptionBinaryImages;
	}

	public void setExceptionBinaryImages(String exceptionBinaryImages) {
		this.exceptionBinaryImages = exceptionBinaryImages;
		if(exceptionBinaryImages != null){
			putQueryParameter("ExceptionBinaryImages", exceptionBinaryImages);
		}
	}

	public String getExtraInfo() {
		return this.extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
		if(extraInfo != null){
			putQueryParameter("ExtraInfo", extraInfo);
		}
	}

	public String getExceptionStack() {
		return this.exceptionStack;
	}

	public void setExceptionStack(String exceptionStack) {
		this.exceptionStack = exceptionStack;
		if(exceptionStack != null){
			putQueryParameter("ExceptionStack", exceptionStack);
		}
	}

	@Override
	public Class<GetRumExceptionStackResponse> getResponseClass() {
		return GetRumExceptionStackResponse.class;
	}

}
