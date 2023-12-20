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

package com.aliyuncs.cas.model.v20200407;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200407.GetUserCertificateDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserCertificateDetailResponse extends AcsResponse {

	private String cert;

	private String key;

	private String encryptCert;

	private String encryptPrivateKey;

	private String signCert;

	private String signPrivateKey;

	private Long id;

	private String name;

	private String requestId;

	private String common;

	private String fingerprint;

	private String issuer;

	private String orgName;

	private String province;

	private String city;

	private String country;

	private String startDate;

	private String endDate;

	private String sans;

	private Boolean expired;

	private Boolean buyInAliyun;

	private Long orderId;

	private String resourceGroupId;

	private String algorithm;

	public String getCert() {
		return this.cert;
	}

	public void setCert(String cert) {
		this.cert = cert;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getEncryptCert() {
		return this.encryptCert;
	}

	public void setEncryptCert(String encryptCert) {
		this.encryptCert = encryptCert;
	}

	public String getEncryptPrivateKey() {
		return this.encryptPrivateKey;
	}

	public void setEncryptPrivateKey(String encryptPrivateKey) {
		this.encryptPrivateKey = encryptPrivateKey;
	}

	public String getSignCert() {
		return this.signCert;
	}

	public void setSignCert(String signCert) {
		this.signCert = signCert;
	}

	public String getSignPrivateKey() {
		return this.signPrivateKey;
	}

	public void setSignPrivateKey(String signPrivateKey) {
		this.signPrivateKey = signPrivateKey;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCommon() {
		return this.common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getFingerprint() {
		return this.fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getIssuer() {
		return this.issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSans() {
		return this.sans;
	}

	public void setSans(String sans) {
		this.sans = sans;
	}

	public Boolean getExpired() {
		return this.expired;
	}

	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	public Boolean getBuyInAliyun() {
		return this.buyInAliyun;
	}

	public void setBuyInAliyun(Boolean buyInAliyun) {
		this.buyInAliyun = buyInAliyun;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	@Override
	public GetUserCertificateDetailResponse getInstance(UnmarshallerContext context) {
		return	GetUserCertificateDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
