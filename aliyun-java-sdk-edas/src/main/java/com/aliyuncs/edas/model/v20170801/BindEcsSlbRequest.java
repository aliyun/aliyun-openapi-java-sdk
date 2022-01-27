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
public class BindEcsSlbRequest extends RoaAcsRequest<BindEcsSlbResponse> {
	   

	private String vServerGroupId;

	private Integer listenerPort;

	private String vForwardingUrlRule;

	private String slbId;

	private String deployGroupId;

	private String listenerHealthCheckUrl;

	private String appId;

	private String listenerProtocol;

	private String vServerGroupName;
	public BindEcsSlbRequest() {
		super("Edas", "2017-08-01", "BindEcsSlb", "Edas");
		setUriPattern("/pop/v5/app/slb/bind_slb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		if(vServerGroupId != null){
			putQueryParameter("VServerGroupId", vServerGroupId);
		}
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putQueryParameter("ListenerPort", listenerPort.toString());
		}
	}

	public String getVForwardingUrlRule() {
		return this.vForwardingUrlRule;
	}

	public void setVForwardingUrlRule(String vForwardingUrlRule) {
		this.vForwardingUrlRule = vForwardingUrlRule;
		if(vForwardingUrlRule != null){
			putQueryParameter("VForwardingUrlRule", vForwardingUrlRule);
		}
	}

	public String getSlbId() {
		return this.slbId;
	}

	public void setSlbId(String slbId) {
		this.slbId = slbId;
		if(slbId != null){
			putQueryParameter("SlbId", slbId);
		}
	}

	public String getDeployGroupId() {
		return this.deployGroupId;
	}

	public void setDeployGroupId(String deployGroupId) {
		this.deployGroupId = deployGroupId;
		if(deployGroupId != null){
			putQueryParameter("DeployGroupId", deployGroupId);
		}
	}

	public String getListenerHealthCheckUrl() {
		return this.listenerHealthCheckUrl;
	}

	public void setListenerHealthCheckUrl(String listenerHealthCheckUrl) {
		this.listenerHealthCheckUrl = listenerHealthCheckUrl;
		if(listenerHealthCheckUrl != null){
			putQueryParameter("ListenerHealthCheckUrl", listenerHealthCheckUrl);
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

	public String getListenerProtocol() {
		return this.listenerProtocol;
	}

	public void setListenerProtocol(String listenerProtocol) {
		this.listenerProtocol = listenerProtocol;
		if(listenerProtocol != null){
			putQueryParameter("ListenerProtocol", listenerProtocol);
		}
	}

	public String getVServerGroupName() {
		return this.vServerGroupName;
	}

	public void setVServerGroupName(String vServerGroupName) {
		this.vServerGroupName = vServerGroupName;
		if(vServerGroupName != null){
			putQueryParameter("VServerGroupName", vServerGroupName);
		}
	}

	@Override
	public Class<BindEcsSlbResponse> getResponseClass() {
		return BindEcsSlbResponse.class;
	}

}
