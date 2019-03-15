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
import com.aliyuncs.vpc.transform.v20160428.ModifySslVpnServerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifySslVpnServerResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private String sslVpnServerId;

	private String vpnGatewayId;

	private String name;

	private String localSubnet;

	private String clientIpPool;

	private Long createTime;

	private String cipher;

	private String proto;

	private Integer port;

	private Boolean compress;

	private Integer connections;

	private Integer maxConnections;

	private String internetIp;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getSslVpnServerId() {
		return this.sslVpnServerId;
	}

	public void setSslVpnServerId(String sslVpnServerId) {
		this.sslVpnServerId = sslVpnServerId;
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

	public String getLocalSubnet() {
		return this.localSubnet;
	}

	public void setLocalSubnet(String localSubnet) {
		this.localSubnet = localSubnet;
	}

	public String getClientIpPool() {
		return this.clientIpPool;
	}

	public void setClientIpPool(String clientIpPool) {
		this.clientIpPool = clientIpPool;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getCipher() {
		return this.cipher;
	}

	public void setCipher(String cipher) {
		this.cipher = cipher;
	}

	public String getProto() {
		return this.proto;
	}

	public void setProto(String proto) {
		this.proto = proto;
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Boolean getCompress() {
		return this.compress;
	}

	public void setCompress(Boolean compress) {
		this.compress = compress;
	}

	public Integer getConnections() {
		return this.connections;
	}

	public void setConnections(Integer connections) {
		this.connections = connections;
	}

	public Integer getMaxConnections() {
		return this.maxConnections;
	}

	public void setMaxConnections(Integer maxConnections) {
		this.maxConnections = maxConnections;
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
	}

	@Override
	public ModifySslVpnServerResponse getInstance(UnmarshallerContext context) {
		return	ModifySslVpnServerResponseUnmarshaller.unmarshall(this, context);
	}
}
