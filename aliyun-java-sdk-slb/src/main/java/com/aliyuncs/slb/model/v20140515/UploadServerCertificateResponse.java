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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.UploadServerCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadServerCertificateResponse extends AcsResponse {

	private String requestId;

	private String serverCertificateId;

	private String fingerprint;

	private String serverCertificateName;

	private String regionId;

	private String regionIdAlias;

	private String aliCloudCertificateId;

	private String aliCloudCertificateName;

	private Integer isAliCloudCertificate;

	private String resourceGroupId;

	private String createTime;

	private Long createTimeStamp;

	private String expireTime;

	private Long expireTimeStamp;

	private String commonName;

	private List<String> subjectAlternativeNames;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServerCertificateId() {
		return this.serverCertificateId;
	}

	public void setServerCertificateId(String serverCertificateId) {
		this.serverCertificateId = serverCertificateId;
	}

	public String getFingerprint() {
		return this.fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getServerCertificateName() {
		return this.serverCertificateName;
	}

	public void setServerCertificateName(String serverCertificateName) {
		this.serverCertificateName = serverCertificateName;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRegionIdAlias() {
		return this.regionIdAlias;
	}

	public void setRegionIdAlias(String regionIdAlias) {
		this.regionIdAlias = regionIdAlias;
	}

	public String getAliCloudCertificateId() {
		return this.aliCloudCertificateId;
	}

	public void setAliCloudCertificateId(String aliCloudCertificateId) {
		this.aliCloudCertificateId = aliCloudCertificateId;
	}

	public String getAliCloudCertificateName() {
		return this.aliCloudCertificateName;
	}

	public void setAliCloudCertificateName(String aliCloudCertificateName) {
		this.aliCloudCertificateName = aliCloudCertificateName;
	}

	public Integer getIsAliCloudCertificate() {
		return this.isAliCloudCertificate;
	}

	public void setIsAliCloudCertificate(Integer isAliCloudCertificate) {
		this.isAliCloudCertificate = isAliCloudCertificate;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getCreateTimeStamp() {
		return this.createTimeStamp;
	}

	public void setCreateTimeStamp(Long createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public Long getExpireTimeStamp() {
		return this.expireTimeStamp;
	}

	public void setExpireTimeStamp(Long expireTimeStamp) {
		this.expireTimeStamp = expireTimeStamp;
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public List<String> getSubjectAlternativeNames() {
		return this.subjectAlternativeNames;
	}

	public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
		this.subjectAlternativeNames = subjectAlternativeNames;
	}

	@Override
	public UploadServerCertificateResponse getInstance(UnmarshallerContext context) {
		return	UploadServerCertificateResponseUnmarshaller.unmarshall(this, context);
	}
}
