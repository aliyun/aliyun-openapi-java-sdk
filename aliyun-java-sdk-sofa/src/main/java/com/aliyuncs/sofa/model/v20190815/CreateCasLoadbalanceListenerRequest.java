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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCasLoadbalanceListenerRequest extends RpcAcsRequest<CreateCasLoadbalanceListenerResponse> {
	   

	private String gmSignCertIaasId;

	private String type;

	private String scheduler;

	private Long establishedTimeout;

	private String gmCryptoCertIaasId;

	private String healthMonitorJsonStr;

	private String certificateIaasId;

	private Long cookieTimeout;

	private String stickySessionType;

	private String id;

	private Long listenerPort;

	private String cookie;

	private Long bandwidth;

	private String certificateId;

	private String tlsCipherPolicy;

	private Long persistTimeout;

	private Long backendServerPort;

	private String vComputerGroupId;
	public CreateCasLoadbalanceListenerRequest() {
		super("SOFA", "2019-08-15", "CreateCasLoadbalanceListener", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGmSignCertIaasId() {
		return this.gmSignCertIaasId;
	}

	public void setGmSignCertIaasId(String gmSignCertIaasId) {
		this.gmSignCertIaasId = gmSignCertIaasId;
		if(gmSignCertIaasId != null){
			putBodyParameter("GmSignCertIaasId", gmSignCertIaasId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		if(scheduler != null){
			putBodyParameter("Scheduler", scheduler);
		}
	}

	public Long getEstablishedTimeout() {
		return this.establishedTimeout;
	}

	public void setEstablishedTimeout(Long establishedTimeout) {
		this.establishedTimeout = establishedTimeout;
		if(establishedTimeout != null){
			putBodyParameter("EstablishedTimeout", establishedTimeout.toString());
		}
	}

	public String getGmCryptoCertIaasId() {
		return this.gmCryptoCertIaasId;
	}

	public void setGmCryptoCertIaasId(String gmCryptoCertIaasId) {
		this.gmCryptoCertIaasId = gmCryptoCertIaasId;
		if(gmCryptoCertIaasId != null){
			putBodyParameter("GmCryptoCertIaasId", gmCryptoCertIaasId);
		}
	}

	public String getHealthMonitorJsonStr() {
		return this.healthMonitorJsonStr;
	}

	public void setHealthMonitorJsonStr(String healthMonitorJsonStr) {
		this.healthMonitorJsonStr = healthMonitorJsonStr;
		if(healthMonitorJsonStr != null){
			putBodyParameter("HealthMonitorJsonStr", healthMonitorJsonStr);
		}
	}

	public String getCertificateIaasId() {
		return this.certificateIaasId;
	}

	public void setCertificateIaasId(String certificateIaasId) {
		this.certificateIaasId = certificateIaasId;
		if(certificateIaasId != null){
			putBodyParameter("CertificateIaasId", certificateIaasId);
		}
	}

	public Long getCookieTimeout() {
		return this.cookieTimeout;
	}

	public void setCookieTimeout(Long cookieTimeout) {
		this.cookieTimeout = cookieTimeout;
		if(cookieTimeout != null){
			putBodyParameter("CookieTimeout", cookieTimeout.toString());
		}
	}

	public String getStickySessionType() {
		return this.stickySessionType;
	}

	public void setStickySessionType(String stickySessionType) {
		this.stickySessionType = stickySessionType;
		if(stickySessionType != null){
			putBodyParameter("StickySessionType", stickySessionType);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public Long getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Long listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putBodyParameter("ListenerPort", listenerPort.toString());
		}
	}

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
		if(cookie != null){
			putBodyParameter("Cookie", cookie);
		}
	}

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putBodyParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
		if(certificateId != null){
			putBodyParameter("CertificateId", certificateId);
		}
	}

	public String getTlsCipherPolicy() {
		return this.tlsCipherPolicy;
	}

	public void setTlsCipherPolicy(String tlsCipherPolicy) {
		this.tlsCipherPolicy = tlsCipherPolicy;
		if(tlsCipherPolicy != null){
			putBodyParameter("TlsCipherPolicy", tlsCipherPolicy);
		}
	}

	public Long getPersistTimeout() {
		return this.persistTimeout;
	}

	public void setPersistTimeout(Long persistTimeout) {
		this.persistTimeout = persistTimeout;
		if(persistTimeout != null){
			putBodyParameter("PersistTimeout", persistTimeout.toString());
		}
	}

	public Long getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Long backendServerPort) {
		this.backendServerPort = backendServerPort;
		if(backendServerPort != null){
			putBodyParameter("BackendServerPort", backendServerPort.toString());
		}
	}

	public String getVComputerGroupId() {
		return this.vComputerGroupId;
	}

	public void setVComputerGroupId(String vComputerGroupId) {
		this.vComputerGroupId = vComputerGroupId;
		if(vComputerGroupId != null){
			putBodyParameter("VComputerGroupId", vComputerGroupId);
		}
	}

	@Override
	public Class<CreateCasLoadbalanceListenerResponse> getResponseClass() {
		return CreateCasLoadbalanceListenerResponse.class;
	}

}
