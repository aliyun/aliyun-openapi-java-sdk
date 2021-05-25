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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeLoadBalancerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerAttributeResponse extends AcsResponse {

	private String requestId;

	private String loadBalancerId;

	private String loadBalancerName;

	private String loadBalancerStatus;

	private String ensRegionId;

	private String address;

	private String networkId;

	private String vSwitchId;

	private Integer bandwidth;

	private String loadBalancerSpec;

	private String createTime;

	private String endTime;

	private String addressIPVersion;

	private List<Rs> backendServers;

	private List<Listener> listenerPortsAndProtocols;

	private List<String> listenerPorts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getLoadBalancerSpec() {
		return this.loadBalancerSpec;
	}

	public void setLoadBalancerSpec(String loadBalancerSpec) {
		this.loadBalancerSpec = loadBalancerSpec;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getAddressIPVersion() {
		return this.addressIPVersion;
	}

	public void setAddressIPVersion(String addressIPVersion) {
		this.addressIPVersion = addressIPVersion;
	}

	public List<Rs> getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(List<Rs> backendServers) {
		this.backendServers = backendServers;
	}

	public List<Listener> getListenerPortsAndProtocols() {
		return this.listenerPortsAndProtocols;
	}

	public void setListenerPortsAndProtocols(List<Listener> listenerPortsAndProtocols) {
		this.listenerPortsAndProtocols = listenerPortsAndProtocols;
	}

	public List<String> getListenerPorts() {
		return this.listenerPorts;
	}

	public void setListenerPorts(List<String> listenerPorts) {
		this.listenerPorts = listenerPorts;
	}

	public static class Rs {

		private String serverId;

		private String ip;

		private String port;

		private String type;

		private Integer weight;

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}
	}

	public static class Listener {

		private Integer listenerPort;

		private String listenerProtocol;

		private String description;

		private String listenerForward;

		private Integer forwardPort;

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getListenerProtocol() {
			return this.listenerProtocol;
		}

		public void setListenerProtocol(String listenerProtocol) {
			this.listenerProtocol = listenerProtocol;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getListenerForward() {
			return this.listenerForward;
		}

		public void setListenerForward(String listenerForward) {
			this.listenerForward = listenerForward;
		}

		public Integer getForwardPort() {
			return this.forwardPort;
		}

		public void setForwardPort(Integer forwardPort) {
			this.forwardPort = forwardPort;
		}
	}

	@Override
	public DescribeLoadBalancerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
