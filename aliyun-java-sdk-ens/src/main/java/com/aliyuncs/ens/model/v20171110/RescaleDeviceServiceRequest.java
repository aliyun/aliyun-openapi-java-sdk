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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RescaleDeviceServiceRequest extends RpcAcsRequest<RescaleDeviceServiceResponse> {
	   

	private String rescaleType;

	private String resourceSelector;

	private Long timeout;

	private String rescaleLevel;

	private String appId;
	public RescaleDeviceServiceRequest() {
		super("Ens", "2017-11-10", "RescaleDeviceService", "ens");
		setMethod(MethodType.POST);
	}

	public String getRescaleType() {
		return this.rescaleType;
	}

	public void setRescaleType(String rescaleType) {
		this.rescaleType = rescaleType;
		if(rescaleType != null){
			putQueryParameter("RescaleType", rescaleType);
		}
	}

	public String getResourceSelector() {
		return this.resourceSelector;
	}

	public void setResourceSelector(String resourceSelector) {
		this.resourceSelector = resourceSelector;
		if(resourceSelector != null){
			putBodyParameter("ResourceSelector", resourceSelector);
		}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public String getRescaleLevel() {
		return this.rescaleLevel;
	}

	public void setRescaleLevel(String rescaleLevel) {
		this.rescaleLevel = rescaleLevel;
		if(rescaleLevel != null){
			putQueryParameter("RescaleLevel", rescaleLevel);
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

	@Override
	public Class<RescaleDeviceServiceResponse> getResponseClass() {
		return RescaleDeviceServiceResponse.class;
	}

}
