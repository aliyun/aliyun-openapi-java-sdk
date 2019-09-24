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
import com.aliyuncs.hdr.transform.v20170925.ActivateDrGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ActivateDrGatewayResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long accountId;

	private String gatewayId;

	private String mqttBroker;

	private String pubToken;

	private String subToken;

	private String bucketName;

	private String regionId;

	private Integer protectedServerQuota;

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

	public Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public String getMqttBroker() {
		return this.mqttBroker;
	}

	public void setMqttBroker(String mqttBroker) {
		this.mqttBroker = mqttBroker;
	}

	public String getPubToken() {
		return this.pubToken;
	}

	public void setPubToken(String pubToken) {
		this.pubToken = pubToken;
	}

	public String getSubToken() {
		return this.subToken;
	}

	public void setSubToken(String subToken) {
		this.subToken = subToken;
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Integer getProtectedServerQuota() {
		return this.protectedServerQuota;
	}

	public void setProtectedServerQuota(Integer protectedServerQuota) {
		this.protectedServerQuota = protectedServerQuota;
	}

	@Override
	public ActivateDrGatewayResponse getInstance(UnmarshallerContext context) {
		return	ActivateDrGatewayResponseUnmarshaller.unmarshall(this, context);
	}
}
