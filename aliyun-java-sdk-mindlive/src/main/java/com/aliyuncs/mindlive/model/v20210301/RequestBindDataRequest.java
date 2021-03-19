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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RequestBindDataRequest extends RpcAcsRequest<RequestBindDataResponse> {
	   

	private String liveSource;
	public RequestBindDataRequest() {
		super("MindLive", "2021-03-01", "RequestBindData");
		setMethod(MethodType.POST);
	}

	public String getLiveSource() {
		return this.liveSource;
	}

	public void setLiveSource(String liveSource) {
		this.liveSource = liveSource;
		if(liveSource != null){
			putQueryParameter("LiveSource", liveSource);
		}
	}

	@Override
	public Class<RequestBindDataResponse> getResponseClass() {
		return RequestBindDataResponse.class;
	}

}
