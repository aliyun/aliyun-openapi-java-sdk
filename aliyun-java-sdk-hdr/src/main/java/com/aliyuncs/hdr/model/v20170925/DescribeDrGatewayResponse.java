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
import com.aliyuncs.hdr.transform.v20170925.DescribeDrGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrGatewayResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String gatewayId;

	private String siteId;

	private String name;

	private String description;

	private String version;

	private String ipAddress;

	private String gatewayClass;

	private String status;

	private String imageType;

	private Long upstreamSpeed;

	private Long downstreamSpeed;

	private String operations;

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

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBizVersion() {
		return this.version;
	}

	public void setBizVersion(String version) {
		this.version = version;
	}

	/**
	 * @deprecated use getBizVersion instead of this.
	 */
	@Deprecated
	public String getVersion() {
		return this.version;
	}

	/**
	 * @deprecated use setBizVersion instead of this.
	 */
	@Deprecated
	public void setVersion(String version) {
		this.version = version;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getGatewayClass() {
		return this.gatewayClass;
	}

	public void setGatewayClass(String gatewayClass) {
		this.gatewayClass = gatewayClass;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public Long getUpstreamSpeed() {
		return this.upstreamSpeed;
	}

	public void setUpstreamSpeed(Long upstreamSpeed) {
		this.upstreamSpeed = upstreamSpeed;
	}

	public Long getDownstreamSpeed() {
		return this.downstreamSpeed;
	}

	public void setDownstreamSpeed(Long downstreamSpeed) {
		this.downstreamSpeed = downstreamSpeed;
	}

	public String getOperations() {
		return this.operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	public Long getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public DescribeDrGatewayResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrGatewayResponseUnmarshaller.unmarshall(this, context);
	}
}
