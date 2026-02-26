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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainResponse extends AcsResponse {

	private String certificatePrivateKey;

	private String domainName;

	private String domainBindingStatus;

	private String domainRemark;

	private String certificateId;

	private String domainWebSocketStatus;

	private String requestId;

	private String certificateName;

	private String domainLegalStatus;

	private String groupId;

	private String certificateBody;

	private String subDomain;

	private String domainCNAMEStatus;

	private Long certificateValidStart;

	private Long certificateValidEnd;

	public String getCertificatePrivateKey() {
		return this.certificatePrivateKey;
	}

	public void setCertificatePrivateKey(String certificatePrivateKey) {
		this.certificatePrivateKey = certificatePrivateKey;
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

	public String getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getDomainWebSocketStatus() {
		return this.domainWebSocketStatus;
	}

	public void setDomainWebSocketStatus(String domainWebSocketStatus) {
		this.domainWebSocketStatus = domainWebSocketStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCertificateName() {
		return this.certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
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

	public String getCertificateBody() {
		return this.certificateBody;
	}

	public void setCertificateBody(String certificateBody) {
		this.certificateBody = certificateBody;
	}

	public String getSubDomain() {
		return this.subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getDomainCNAMEStatus() {
		return this.domainCNAMEStatus;
	}

	public void setDomainCNAMEStatus(String domainCNAMEStatus) {
		this.domainCNAMEStatus = domainCNAMEStatus;
	}

	public Long getCertificateValidStart() {
		return this.certificateValidStart;
	}

	public void setCertificateValidStart(Long certificateValidStart) {
		this.certificateValidStart = certificateValidStart;
	}

	public Long getCertificateValidEnd() {
		return this.certificateValidEnd;
	}

	public void setCertificateValidEnd(Long certificateValidEnd) {
		this.certificateValidEnd = certificateValidEnd;
	}

	@Override
	public DescribeDomainResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
