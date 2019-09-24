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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.DescribeSitePairResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSitePairResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String sitePairId;

	private String sitePairType;

	private String localSiteName;

	private String cloudSiteName;

	private String primarySiteId;

	private String secondarySiteId;

	private String primarySiteName;

	private String secondarySiteName;

	private String bucketName;

	private Long createdTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSitePairId() {
		return this.sitePairId;
	}

	public void setSitePairId(String sitePairId) {
		this.sitePairId = sitePairId;
	}

	public String getSitePairType() {
		return this.sitePairType;
	}

	public void setSitePairType(String sitePairType) {
		this.sitePairType = sitePairType;
	}

	public String getLocalSiteName() {
		return this.localSiteName;
	}

	public void setLocalSiteName(String localSiteName) {
		this.localSiteName = localSiteName;
	}

	public String getCloudSiteName() {
		return this.cloudSiteName;
	}

	public void setCloudSiteName(String cloudSiteName) {
		this.cloudSiteName = cloudSiteName;
	}

	public String getPrimarySiteId() {
		return this.primarySiteId;
	}

	public void setPrimarySiteId(String primarySiteId) {
		this.primarySiteId = primarySiteId;
	}

	public String getSecondarySiteId() {
		return this.secondarySiteId;
	}

	public void setSecondarySiteId(String secondarySiteId) {
		this.secondarySiteId = secondarySiteId;
	}

	public String getPrimarySiteName() {
		return this.primarySiteName;
	}

	public void setPrimarySiteName(String primarySiteName) {
		this.primarySiteName = primarySiteName;
	}

	public String getSecondarySiteName() {
		return this.secondarySiteName;
	}

	public void setSecondarySiteName(String secondarySiteName) {
		this.secondarySiteName = secondarySiteName;
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public Long getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public DescribeSitePairResponse getInstance(UnmarshallerContext context) {
		return	DescribeSitePairResponseUnmarshaller.unmarshall(this, context);
	}
}
