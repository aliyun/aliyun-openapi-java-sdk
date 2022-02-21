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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateContainerConfigurationRequest extends RoaAcsRequest<UpdateContainerConfigurationResponse> {
	   

	private Boolean useBodyEncoding;

	private Integer maxThreads;

	private String uRIEncoding;

	private String appId;

	private String groupId;

	private Integer httpPort;

	private String contextPath;
	public UpdateContainerConfigurationRequest() {
		super("Edas", "2017-08-01", "UpdateContainerConfiguration", "Edas");
		setUriPattern("/pop/v5/app/container_config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getUseBodyEncoding() {
		return this.useBodyEncoding;
	}

	public void setUseBodyEncoding(Boolean useBodyEncoding) {
		this.useBodyEncoding = useBodyEncoding;
		if(useBodyEncoding != null){
			putQueryParameter("UseBodyEncoding", useBodyEncoding.toString());
		}
	}

	public Integer getMaxThreads() {
		return this.maxThreads;
	}

	public void setMaxThreads(Integer maxThreads) {
		this.maxThreads = maxThreads;
		if(maxThreads != null){
			putQueryParameter("MaxThreads", maxThreads.toString());
		}
	}

	public String getURIEncoding() {
		return this.uRIEncoding;
	}

	public void setURIEncoding(String uRIEncoding) {
		this.uRIEncoding = uRIEncoding;
		if(uRIEncoding != null){
			putQueryParameter("URIEncoding", uRIEncoding);
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Integer getHttpPort() {
		return this.httpPort;
	}

	public void setHttpPort(Integer httpPort) {
		this.httpPort = httpPort;
		if(httpPort != null){
			putQueryParameter("HttpPort", httpPort.toString());
		}
	}

	public String getContextPath() {
		return this.contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
		if(contextPath != null){
			putQueryParameter("ContextPath", contextPath);
		}
	}

	@Override
	public Class<UpdateContainerConfigurationResponse> getResponseClass() {
		return UpdateContainerConfigurationResponse.class;
	}

}
