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
import com.aliyuncs.uisplus.transform.v20200707.DescribeVnetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVnetResponse extends AcsResponse {

	private String uisId;

	private String kppsQuota;

	private String requestId;

	private String wildcardDomainState;

	private String cidrs;

	private String flowQuota;

	private String mbpsQuota;

	private String state;

	private String vnetId;

	private String name;

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
	}

	public String getKppsQuota() {
		return this.kppsQuota;
	}

	public void setKppsQuota(String kppsQuota) {
		this.kppsQuota = kppsQuota;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWildcardDomainState() {
		return this.wildcardDomainState;
	}

	public void setWildcardDomainState(String wildcardDomainState) {
		this.wildcardDomainState = wildcardDomainState;
	}

	public String getCidrs() {
		return this.cidrs;
	}

	public void setCidrs(String cidrs) {
		this.cidrs = cidrs;
	}

	public String getFlowQuota() {
		return this.flowQuota;
	}

	public void setFlowQuota(String flowQuota) {
		this.flowQuota = flowQuota;
	}

	public String getMbpsQuota() {
		return this.mbpsQuota;
	}

	public void setMbpsQuota(String mbpsQuota) {
		this.mbpsQuota = mbpsQuota;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVnetId() {
		return this.vnetId;
	}

	public void setVnetId(String vnetId) {
		this.vnetId = vnetId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public DescribeVnetResponse getInstance(UnmarshallerContext context) {
		return	DescribeVnetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
