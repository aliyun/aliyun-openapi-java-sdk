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
public class SetLoadBalancerTCPListenerAttributeRequest extends RpcAcsRequest<SetLoadBalancerTCPListenerAttributeResponse> {
	   

	private String healthCheckURI;

	private Integer establishedTimeout;

	private Integer persistenceTimeout;

	private String healthCheckDomain;

	private String loadBalancerId;

	private Integer healthCheckInterval;

	private Integer healthCheckConnectTimeout;

	private String description;

	private Integer unhealthyThreshold;

	private Integer healthyThreshold;

	private String scheduler;

	private Integer listenerPort;

	private String healthCheckType;

	private Integer healthCheckConnectPort;

	private String healthCheckHttpCode;
	public SetLoadBalancerTCPListenerAttributeRequest() {
		super("Ens", "2017-11-10", "SetLoadBalancerTCPListenerAttribute", "ens");
		setMethod(MethodType.POST);
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
		if(healthCheckURI != null){
			putQueryParameter("HealthCheckURI", healthCheckURI);
		}
	}

	public Integer getEstablishedTimeout() {
		return this.establishedTimeout;
	}

	public void setEstablishedTimeout(Integer establishedTimeout) {
		this.establishedTimeout = establishedTimeout;
		if(establishedTimeout != null){
			putQueryParameter("EstablishedTimeout", establishedTimeout.toString());
		}
	}

	public Integer getPersistenceTimeout() {
		return this.persistenceTimeout;
	}

	public void setPersistenceTimeout(Integer persistenceTimeout) {
		this.persistenceTimeout = persistenceTimeout;
		if(persistenceTimeout != null){
			putQueryParameter("PersistenceTimeout", persistenceTimeout.toString());
		}
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
		if(healthCheckDomain != null){
			putQueryParameter("HealthCheckDomain", healthCheckDomain);
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
		if(healthCheckInterval != null){
			putQueryParameter("HealthCheckInterval", healthCheckInterval.toString());
		}
	}

	public Integer getHealthCheckConnectTimeout() {
		return this.healthCheckConnectTimeout;
	}

	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		this.healthCheckConnectTimeout = healthCheckConnectTimeout;
		if(healthCheckConnectTimeout != null){
			putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
		if(unhealthyThreshold != null){
			putQueryParameter("UnhealthyThreshold", unhealthyThreshold.toString());
		}
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
		if(healthyThreshold != null){
			putQueryParameter("HealthyThreshold", healthyThreshold.toString());
		}
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		if(scheduler != null){
			putQueryParameter("Scheduler", scheduler);
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

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
		if(healthCheckType != null){
			putQueryParameter("HealthCheckType", healthCheckType);
		}
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
		if(healthCheckConnectPort != null){
			putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort.toString());
		}
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
		if(healthCheckHttpCode != null){
			putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
		}
	}

	@Override
	public Class<SetLoadBalancerTCPListenerAttributeResponse> getResponseClass() {
		return SetLoadBalancerTCPListenerAttributeResponse.class;
	}

}
