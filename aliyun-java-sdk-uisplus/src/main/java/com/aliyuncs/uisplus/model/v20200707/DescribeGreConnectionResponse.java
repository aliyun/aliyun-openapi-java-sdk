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

package com.aliyuncs.uisplus.model.v20200707;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.uisplus.transform.v20200707.DescribeGreConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGreConnectionResponse extends AcsResponse {

	private String uisId;

	private String state;

	private Long createTime;

	private String uisName;

	private String greConnectionId;

	private String customerIp;

	private String customerTunnelIp;

	private String requestId;

	private String localTunnelIp;

	private String cidrs;

	private String description;

	private String name;

	private String localIp;

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getUisName() {
		return this.uisName;
	}

	public void setUisName(String uisName) {
		this.uisName = uisName;
	}

	public String getGreConnectionId() {
		return this.greConnectionId;
	}

	public void setGreConnectionId(String greConnectionId) {
		this.greConnectionId = greConnectionId;
	}

	public String getCustomerIp() {
		return this.customerIp;
	}

	public void setCustomerIp(String customerIp) {
		this.customerIp = customerIp;
	}

	public String getCustomerTunnelIp() {
		return this.customerTunnelIp;
	}

	public void setCustomerTunnelIp(String customerTunnelIp) {
		this.customerTunnelIp = customerTunnelIp;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLocalTunnelIp() {
		return this.localTunnelIp;
	}

	public void setLocalTunnelIp(String localTunnelIp) {
		this.localTunnelIp = localTunnelIp;
	}

	public String getCidrs() {
		return this.cidrs;
	}

	public void setCidrs(String cidrs) {
		this.cidrs = cidrs;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalIp() {
		return this.localIp;
	}

	public void setLocalIp(String localIp) {
		this.localIp = localIp;
	}

	@Override
	public DescribeGreConnectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeGreConnectionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
