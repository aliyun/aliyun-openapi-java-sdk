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
public class DeleteRumAppRequest extends RpcAcsRequest<DeleteRumAppResponse> {
	   

	private String appGroup;

	private String appId;

	private String realRegionId;
	public DeleteRumAppRequest() {
		super("ARMS", "2019-08-08", "DeleteRumApp", "arms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppGroup() {
		return this.appGroup;
	}

	public void setAppGroup(String appGroup) {
		this.appGroup = appGroup;
		if(appGroup != null){
			putQueryParameter("AppGroup", appGroup);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getRealRegionId() {
		return this.realRegionId;
	}

	public void setRealRegionId(String realRegionId) {
		this.realRegionId = realRegionId;
		if(realRegionId != null){
			putQueryParameter("RealRegionId", realRegionId);
		}
	}

	@Override
	public Class<DeleteRumAppResponse> getResponseClass() {
		return DeleteRumAppResponse.class;
	}

}
