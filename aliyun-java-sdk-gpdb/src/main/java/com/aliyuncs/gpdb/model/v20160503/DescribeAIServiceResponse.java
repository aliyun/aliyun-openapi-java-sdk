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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeAIServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAIServiceResponse extends AcsResponse {

	private String status;

	private String serviceAccount;

	private String privateApiDevUrl;

	private String description;

	private String requestId;

	private String publicWorkbenchUrl;

	private String publicApiDevUrl;

	private String securityIpList;

	private String createTime;

	private String privateWorkbenchUrl;

	private String serviceId;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getServiceAccount() {
		return this.serviceAccount;
	}

	public void setServiceAccount(String serviceAccount) {
		this.serviceAccount = serviceAccount;
	}

	public String getPrivateApiDevUrl() {
		return this.privateApiDevUrl;
	}

	public void setPrivateApiDevUrl(String privateApiDevUrl) {
		this.privateApiDevUrl = privateApiDevUrl;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPublicWorkbenchUrl() {
		return this.publicWorkbenchUrl;
	}

	public void setPublicWorkbenchUrl(String publicWorkbenchUrl) {
		this.publicWorkbenchUrl = publicWorkbenchUrl;
	}

	public String getPublicApiDevUrl() {
		return this.publicApiDevUrl;
	}

	public void setPublicApiDevUrl(String publicApiDevUrl) {
		this.publicApiDevUrl = publicApiDevUrl;
	}

	public String getSecurityIpList() {
		return this.securityIpList;
	}

	public void setSecurityIpList(String securityIpList) {
		this.securityIpList = securityIpList;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPrivateWorkbenchUrl() {
		return this.privateWorkbenchUrl;
	}

	public void setPrivateWorkbenchUrl(String privateWorkbenchUrl) {
		this.privateWorkbenchUrl = privateWorkbenchUrl;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	@Override
	public DescribeAIServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAIServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
