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
public class CreateLoadBalancerUDPListenerRequest extends RpcAcsRequest<CreateLoadBalancerUDPListenerResponse> {
	   

	private Integer establishedTimeout;

	private String loadBalancerId;

	private String healthCheckReq;

	private Integer healthCheckInterval;

	private Integer backendServerPort;

	private String healthCheckExp;

	private Integer healthCheckConnectTimeout;

	private String description;

	private Integer unhealthyThreshold;

	private Integer healthyThreshold;

	private String scheduler;

	private String eipTransmit;

	private Integer listenerPort;

	private Integer healthCheckConnectPort;
	public CreateLoadBalancerUDPListenerRequest() {
		super("Ens", "2017-11-10", "CreateLoadBalancerUDPListener", "ens");
		setMethod(MethodType.POST);
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

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public String getHealthCheckReq() {
		return this.healthCheckReq;
	}

	public void setHealthCheckReq(String healthCheckReq) {
		this.healthCheckReq = healthCheckReq;
		if(healthCheckReq != null){
			putQueryParameter("HealthCheckReq", healthCheckReq);
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

	public Integer getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
		if(backendServerPort != null){
			putQueryParameter("BackendServerPort", backendServerPort.toString());
		}
	}

	public String getHealthCheckExp() {
		return this.healthCheckExp;
	}

	public void setHealthCheckExp(String healthCheckExp) {
		this.healthCheckExp = healthCheckExp;
		if(healthCheckExp != null){
			putQueryParameter("HealthCheckExp", healthCheckExp);
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

	public String getEipTransmit() {
		return this.eipTransmit;
	}

	public void setEipTransmit(String eipTransmit) {
		this.eipTransmit = eipTransmit;
		if(eipTransmit != null){
			putQueryParameter("EipTransmit", eipTransmit);
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

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
		if(healthCheckConnectPort != null){
			putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort.toString());
		}
	}

	@Override
	public Class<CreateLoadBalancerUDPListenerResponse> getResponseClass() {
		return CreateLoadBalancerUDPListenerResponse.class;
	}

}
