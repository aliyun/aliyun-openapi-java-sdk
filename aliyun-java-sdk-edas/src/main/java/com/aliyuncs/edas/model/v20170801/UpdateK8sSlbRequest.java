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
public class UpdateK8sSlbRequest extends RoaAcsRequest<UpdateK8sSlbResponse> {
	   

	private String servicePortInfos;

	private String slbProtocol;

	private String port;

	private String appId;

	private String clusterId;

	private String type;

	private String targetPort;
	public UpdateK8sSlbRequest() {
		super("Edas", "2017-08-01", "UpdateK8sSlb", "Edas");
		setUriPattern("/pop/v5/k8s/acs/k8s_slb_binding");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServicePortInfos() {
		return this.servicePortInfos;
	}

	public void setServicePortInfos(String servicePortInfos) {
		this.servicePortInfos = servicePortInfos;
		if(servicePortInfos != null){
			putQueryParameter("ServicePortInfos", servicePortInfos);
		}
	}

	public String getSlbProtocol() {
		return this.slbProtocol;
	}

	public void setSlbProtocol(String slbProtocol) {
		this.slbProtocol = slbProtocol;
		if(slbProtocol != null){
			putQueryParameter("SlbProtocol", slbProtocol);
		}
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getTargetPort() {
		return this.targetPort;
	}

	public void setTargetPort(String targetPort) {
		this.targetPort = targetPort;
		if(targetPort != null){
			putQueryParameter("TargetPort", targetPort);
		}
	}

	@Override
	public Class<UpdateK8sSlbResponse> getResponseClass() {
		return UpdateK8sSlbResponse.class;
	}

}
