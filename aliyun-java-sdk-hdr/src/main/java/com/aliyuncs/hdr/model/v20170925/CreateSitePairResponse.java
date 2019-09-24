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
import com.aliyuncs.hdr.transform.v20170925.CreateSitePairResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateSitePairResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String sitePairId;

	private String bucketName;

	private String gatewayId;

	private Long uid;

	private String primarySiteId;

	private String secondarySiteId;

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

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
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

	@Override
	public CreateSitePairResponse getInstance(UnmarshallerContext context) {
		return	CreateSitePairResponseUnmarshaller.unmarshall(this, context);
	}
}
