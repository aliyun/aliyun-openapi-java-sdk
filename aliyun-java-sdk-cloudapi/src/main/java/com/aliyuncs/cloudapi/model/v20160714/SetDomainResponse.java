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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.SetDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetDomainResponse extends AcsResponse {

	private String requestId;

	private String domainLegalStatus;

	private String groupId;

	private String subDomain;

	private String domainName;

	private String domainBindingStatus;

	private String domainRemark;

	private String domainWebSocketStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainLegalStatus() {
		return this.domainLegalStatus;
	}

	public void setDomainLegalStatus(String domainLegalStatus) {
		this.domainLegalStatus = domainLegalStatus;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getSubDomain() {
		return this.subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDomainBindingStatus() {
		return this.domainBindingStatus;
	}

	public void setDomainBindingStatus(String domainBindingStatus) {
		this.domainBindingStatus = domainBindingStatus;
	}

	public String getDomainRemark() {
		return this.domainRemark;
	}

	public void setDomainRemark(String domainRemark) {
		this.domainRemark = domainRemark;
	}

	public String getDomainWebSocketStatus() {
		return this.domainWebSocketStatus;
	}

	public void setDomainWebSocketStatus(String domainWebSocketStatus) {
		this.domainWebSocketStatus = domainWebSocketStatus;
	}

	@Override
	public SetDomainResponse getInstance(UnmarshallerContext context) {
		return	SetDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
