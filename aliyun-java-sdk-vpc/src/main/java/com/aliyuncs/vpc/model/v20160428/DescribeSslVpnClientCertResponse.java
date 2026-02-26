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
import com.aliyuncs.vpc.transform.v20160428.DescribeSslVpnClientCertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSslVpnClientCertResponse extends AcsResponse {

	private String status;

	private Long createTime;

	private String clientKey;

	private String regionId;

	private String clientConfig;

	private Long endTime;

	private String requestId;

	private String clientCert;

	private String caCert;

	private String sslVpnClientCertId;

	private String sslVpnServerId;

	private String name;

	private String resourceGroupId;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getClientKey() {
		return this.clientKey;
	}

	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getClientConfig() {
		return this.clientConfig;
	}

	public void setClientConfig(String clientConfig) {
		this.clientConfig = clientConfig;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClientCert() {
		return this.clientCert;
	}

	public void setClientCert(String clientCert) {
		this.clientCert = clientCert;
	}

	public String getCaCert() {
		return this.caCert;
	}

	public void setCaCert(String caCert) {
		this.caCert = caCert;
	}

	public String getSslVpnClientCertId() {
		return this.sslVpnClientCertId;
	}

	public void setSslVpnClientCertId(String sslVpnClientCertId) {
		this.sslVpnClientCertId = sslVpnClientCertId;
	}

	public String getSslVpnServerId() {
		return this.sslVpnServerId;
	}

	public void setSslVpnServerId(String sslVpnServerId) {
		this.sslVpnServerId = sslVpnServerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	@Override
	public DescribeSslVpnClientCertResponse getInstance(UnmarshallerContext context) {
		return	DescribeSslVpnClientCertResponseUnmarshaller.unmarshall(this, context);
	}
}
