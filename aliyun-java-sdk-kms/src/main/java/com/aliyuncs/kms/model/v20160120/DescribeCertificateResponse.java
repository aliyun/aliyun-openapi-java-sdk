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

package com.aliyuncs.kms.model.v20160120;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.DescribeCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCertificateResponse extends AcsResponse {

	private String status;

	private String serial;

	private String createdAt;

	private Map<Object,Object> tags;

	private String subjectKeyIdentifier;

	private Boolean exportablePrivateKey;

	private String issuer;

	private String signatureAlgorithm;

	private String notAfter;

	private String arn;

	private String certificateId;

	private String requestId;

	private String keySpec;

	private String protectionLevel;

	private String subjectPublicKey;

	private String subject;

	private String notBefore;

	private String updatedAt;

	private List<String> subjectAlternativeNames;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Map<Object,Object> getTags() {
		return this.tags;
	}

	public void setTags(Map<Object,Object> tags) {
		this.tags = tags;
	}

	public String getSubjectKeyIdentifier() {
		return this.subjectKeyIdentifier;
	}

	public void setSubjectKeyIdentifier(String subjectKeyIdentifier) {
		this.subjectKeyIdentifier = subjectKeyIdentifier;
	}

	public Boolean getExportablePrivateKey() {
		return this.exportablePrivateKey;
	}

	public void setExportablePrivateKey(Boolean exportablePrivateKey) {
		this.exportablePrivateKey = exportablePrivateKey;
	}

	public String getIssuer() {
		return this.issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getSignatureAlgorithm() {
		return this.signatureAlgorithm;
	}

	public void setSignatureAlgorithm(String signatureAlgorithm) {
		this.signatureAlgorithm = signatureAlgorithm;
	}

	public String getNotAfter() {
		return this.notAfter;
	}

	public void setNotAfter(String notAfter) {
		this.notAfter = notAfter;
	}

	public String getArn() {
		return this.arn;
	}

	public void setArn(String arn) {
		this.arn = arn;
	}

	public String getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getKeySpec() {
		return this.keySpec;
	}

	public void setKeySpec(String keySpec) {
		this.keySpec = keySpec;
	}

	public String getProtectionLevel() {
		return this.protectionLevel;
	}

	public void setProtectionLevel(String protectionLevel) {
		this.protectionLevel = protectionLevel;
	}

	public String getSubjectPublicKey() {
		return this.subjectPublicKey;
	}

	public void setSubjectPublicKey(String subjectPublicKey) {
		this.subjectPublicKey = subjectPublicKey;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getNotBefore() {
		return this.notBefore;
	}

	public void setNotBefore(String notBefore) {
		this.notBefore = notBefore;
	}

	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<String> getSubjectAlternativeNames() {
		return this.subjectAlternativeNames;
	}

	public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
		this.subjectAlternativeNames = subjectAlternativeNames;
	}

	@Override
	public DescribeCertificateResponse getInstance(UnmarshallerContext context) {
		return	DescribeCertificateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
