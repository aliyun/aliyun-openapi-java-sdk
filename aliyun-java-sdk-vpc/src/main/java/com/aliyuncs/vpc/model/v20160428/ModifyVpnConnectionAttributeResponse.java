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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ModifyVpnConnectionAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyVpnConnectionAttributeResponse extends AcsResponse {

	private String requestId;

	private String vpnConnectionId;

	private String customerGatewayId;

	private String vpnGatewayId;

	private String name;

	private String description;

	private String localSubnet;

	private String remoteSubnet;

	private Long createTime;

	private Boolean effectImmediately;

	private IkeConfig ikeConfig;

	private IpsecConfig ipsecConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVpnConnectionId() {
		return this.vpnConnectionId;
	}

	public void setVpnConnectionId(String vpnConnectionId) {
		this.vpnConnectionId = vpnConnectionId;
	}

	public String getCustomerGatewayId() {
		return this.customerGatewayId;
	}

	public void setCustomerGatewayId(String customerGatewayId) {
		this.customerGatewayId = customerGatewayId;
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocalSubnet() {
		return this.localSubnet;
	}

	public void setLocalSubnet(String localSubnet) {
		this.localSubnet = localSubnet;
	}

	public String getRemoteSubnet() {
		return this.remoteSubnet;
	}

	public void setRemoteSubnet(String remoteSubnet) {
		this.remoteSubnet = remoteSubnet;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Boolean getEffectImmediately() {
		return this.effectImmediately;
	}

	public void setEffectImmediately(Boolean effectImmediately) {
		this.effectImmediately = effectImmediately;
	}

	public IkeConfig getIkeConfig() {
		return this.ikeConfig;
	}

	public void setIkeConfig(IkeConfig ikeConfig) {
		this.ikeConfig = ikeConfig;
	}

	public IpsecConfig getIpsecConfig() {
		return this.ipsecConfig;
	}

	public void setIpsecConfig(IpsecConfig ipsecConfig) {
		this.ipsecConfig = ipsecConfig;
	}

	public static class IkeConfig {

		private String psk;

		private String ikeVersion;

		private String ikeMode;

		private String ikeEncAlg;

		private String ikeAuthAlg;

		private String ikePfs;

		private Long ikeLifetime;

		private String localId;

		private String remoteId;

		public String getPsk() {
			return this.psk;
		}

		public void setPsk(String psk) {
			this.psk = psk;
		}

		public String getIkeVersion() {
			return this.ikeVersion;
		}

		public void setIkeVersion(String ikeVersion) {
			this.ikeVersion = ikeVersion;
		}

		public String getIkeMode() {
			return this.ikeMode;
		}

		public void setIkeMode(String ikeMode) {
			this.ikeMode = ikeMode;
		}

		public String getIkeEncAlg() {
			return this.ikeEncAlg;
		}

		public void setIkeEncAlg(String ikeEncAlg) {
			this.ikeEncAlg = ikeEncAlg;
		}

		public String getIkeAuthAlg() {
			return this.ikeAuthAlg;
		}

		public void setIkeAuthAlg(String ikeAuthAlg) {
			this.ikeAuthAlg = ikeAuthAlg;
		}

		public String getIkePfs() {
			return this.ikePfs;
		}

		public void setIkePfs(String ikePfs) {
			this.ikePfs = ikePfs;
		}

		public Long getIkeLifetime() {
			return this.ikeLifetime;
		}

		public void setIkeLifetime(Long ikeLifetime) {
			this.ikeLifetime = ikeLifetime;
		}

		public String getLocalId() {
			return this.localId;
		}

		public void setLocalId(String localId) {
			this.localId = localId;
		}

		public String getRemoteId() {
			return this.remoteId;
		}

		public void setRemoteId(String remoteId) {
			this.remoteId = remoteId;
		}
	}

	public static class IpsecConfig {

		private String ipsecEncAlg;

		private String ipsecAuthAlg;

		private String ipsecPfs;

		private Long ipsecLifetime;

		public String getIpsecEncAlg() {
			return this.ipsecEncAlg;
		}

		public void setIpsecEncAlg(String ipsecEncAlg) {
			this.ipsecEncAlg = ipsecEncAlg;
		}

		public String getIpsecAuthAlg() {
			return this.ipsecAuthAlg;
		}

		public void setIpsecAuthAlg(String ipsecAuthAlg) {
			this.ipsecAuthAlg = ipsecAuthAlg;
		}

		public String getIpsecPfs() {
			return this.ipsecPfs;
		}

		public void setIpsecPfs(String ipsecPfs) {
			this.ipsecPfs = ipsecPfs;
		}

		public Long getIpsecLifetime() {
			return this.ipsecLifetime;
		}

		public void setIpsecLifetime(Long ipsecLifetime) {
			this.ipsecLifetime = ipsecLifetime;
		}
	}

	@Override
	public ModifyVpnConnectionAttributeResponse getInstance(UnmarshallerContext context) {
		return	ModifyVpnConnectionAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
