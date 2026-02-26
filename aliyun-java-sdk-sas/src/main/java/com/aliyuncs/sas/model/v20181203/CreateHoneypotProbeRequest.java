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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateHoneypotProbeRequest extends RpcAcsRequest<CreateHoneypotProbeResponse> {
	   

	private String controlNodeId;

	private String proxyIp;

	private Boolean ping;

	private String uuid;

	private String probeVersion;

	private List<HoneypotBindList> honeypotBindLists;

	private Boolean arp;

	private String probeType;

	private String businessGroupId;

	private String displayName;

	private String vpcId;
	public CreateHoneypotProbeRequest() {
		super("Sas", "2018-12-03", "CreateHoneypotProbe");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getControlNodeId() {
		return this.controlNodeId;
	}

	public void setControlNodeId(String controlNodeId) {
		this.controlNodeId = controlNodeId;
		if(controlNodeId != null){
			putQueryParameter("ControlNodeId", controlNodeId);
		}
	}

	public String getProxyIp() {
		return this.proxyIp;
	}

	public void setProxyIp(String proxyIp) {
		this.proxyIp = proxyIp;
		if(proxyIp != null){
			putQueryParameter("ProxyIp", proxyIp);
		}
	}

	public Boolean getPing() {
		return this.ping;
	}

	public void setPing(Boolean ping) {
		this.ping = ping;
		if(ping != null){
			putQueryParameter("Ping", ping.toString());
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getProbeVersion() {
		return this.probeVersion;
	}

	public void setProbeVersion(String probeVersion) {
		this.probeVersion = probeVersion;
		if(probeVersion != null){
			putQueryParameter("ProbeVersion", probeVersion);
		}
	}

	public List<HoneypotBindList> getHoneypotBindLists() {
		return this.honeypotBindLists;
	}

	public void setHoneypotBindLists(List<HoneypotBindList> honeypotBindLists) {
		this.honeypotBindLists = honeypotBindLists;	
		if (honeypotBindLists != null) {
			for (int depth1 = 0; depth1 < honeypotBindLists.size(); depth1++) {
				if (honeypotBindLists.get(depth1).getBindPortLists() != null) {
					for (int depth2 = 0; depth2 < honeypotBindLists.get(depth1).getBindPortLists().size(); depth2++) {
						putQueryParameter("HoneypotBindList." + (depth1 + 1) + ".BindPortList." + (depth2 + 1) + ".StartPort" , honeypotBindLists.get(depth1).getBindPortLists().get(depth2).getStartPort());
						putQueryParameter("HoneypotBindList." + (depth1 + 1) + ".BindPortList." + (depth2 + 1) + ".BindPort" , honeypotBindLists.get(depth1).getBindPortLists().get(depth2).getBindPort());
						putQueryParameter("HoneypotBindList." + (depth1 + 1) + ".BindPortList." + (depth2 + 1) + ".Fixed" , honeypotBindLists.get(depth1).getBindPortLists().get(depth2).getFixed());
						putQueryParameter("HoneypotBindList." + (depth1 + 1) + ".BindPortList." + (depth2 + 1) + ".EndPort" , honeypotBindLists.get(depth1).getBindPortLists().get(depth2).getEndPort());
						putQueryParameter("HoneypotBindList." + (depth1 + 1) + ".BindPortList." + (depth2 + 1) + ".TargetPort" , honeypotBindLists.get(depth1).getBindPortLists().get(depth2).getTargetPort());
					}
				}
				putQueryParameter("HoneypotBindList." + (depth1 + 1) + ".HoneypotId" , honeypotBindLists.get(depth1).getHoneypotId());
			}
		}	
	}

	public Boolean getArp() {
		return this.arp;
	}

	public void setArp(Boolean arp) {
		this.arp = arp;
		if(arp != null){
			putQueryParameter("Arp", arp.toString());
		}
	}

	public String getProbeType() {
		return this.probeType;
	}

	public void setProbeType(String probeType) {
		this.probeType = probeType;
		if(probeType != null){
			putQueryParameter("ProbeType", probeType);
		}
	}

	public String getBusinessGroupId() {
		return this.businessGroupId;
	}

	public void setBusinessGroupId(String businessGroupId) {
		this.businessGroupId = businessGroupId;
		if(businessGroupId != null){
			putQueryParameter("BusinessGroupId", businessGroupId);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public static class HoneypotBindList {

		private List<BindPortList> bindPortLists;

		private String honeypotId;

		public List<BindPortList> getBindPortLists() {
			return this.bindPortLists;
		}

		public void setBindPortLists(List<BindPortList> bindPortLists) {
			this.bindPortLists = bindPortLists;
		}

		public String getHoneypotId() {
			return this.honeypotId;
		}

		public void setHoneypotId(String honeypotId) {
			this.honeypotId = honeypotId;
		}

		public static class BindPortList {

			private Integer startPort;

			private Boolean bindPort;

			private Boolean fixed;

			private Integer endPort;

			private Integer targetPort;

			public Integer getStartPort() {
				return this.startPort;
			}

			public void setStartPort(Integer startPort) {
				this.startPort = startPort;
			}

			public Boolean getBindPort() {
				return this.bindPort;
			}

			public void setBindPort(Boolean bindPort) {
				this.bindPort = bindPort;
			}

			public Boolean getFixed() {
				return this.fixed;
			}

			public void setFixed(Boolean fixed) {
				this.fixed = fixed;
			}

			public Integer getEndPort() {
				return this.endPort;
			}

			public void setEndPort(Integer endPort) {
				this.endPort = endPort;
			}

			public Integer getTargetPort() {
				return this.targetPort;
			}

			public void setTargetPort(Integer targetPort) {
				this.targetPort = targetPort;
			}
		}
	}

	@Override
	public Class<CreateHoneypotProbeResponse> getResponseClass() {
		return CreateHoneypotProbeResponse.class;
	}

}
