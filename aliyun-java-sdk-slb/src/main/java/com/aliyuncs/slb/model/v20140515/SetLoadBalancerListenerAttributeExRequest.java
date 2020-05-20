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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.slb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetLoadBalancerListenerAttributeExRequest extends RpcAcsRequest<SetLoadBalancerListenerAttributeExResponse> {
	   

	private Integer listenerPort;

	private List<KvAttribute> kvAttributes;

	private String protocol;

	private String loadBalancerId;
	public SetLoadBalancerListenerAttributeExRequest() {
		super("Slb", "2014-05-15", "SetLoadBalancerListenerAttributeEx", "slb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<KvAttribute> getKvAttributes() {
		return this.kvAttributes;
	}

	public void setKvAttributes(List<KvAttribute> kvAttributes) {
		this.kvAttributes = kvAttributes;	
		if (kvAttributes != null) {
			for (int depth1 = 0; depth1 < kvAttributes.size(); depth1++) {
				putQueryParameter("KvAttribute." + (depth1 + 1) + ".Value" , kvAttributes.get(depth1).getValue());
				putQueryParameter("KvAttribute." + (depth1 + 1) + ".Key" , kvAttributes.get(depth1).getKey());
			}
		}	
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
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

	public static class KvAttribute {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<SetLoadBalancerListenerAttributeExResponse> getResponseClass() {
		return SetLoadBalancerListenerAttributeExResponse.class;
	}

}
