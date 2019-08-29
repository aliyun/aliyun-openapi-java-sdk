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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeStreamResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStreamResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String name;

	private String pushDomain;

	private String playDomain;

	private String app;

	private String protocol;

	private String groupId;

	private String deviceId;

	private Boolean enabled;

	private String status;

	private String createdTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPushDomain() {
		return this.pushDomain;
	}

	public void setPushDomain(String pushDomain) {
		this.pushDomain = pushDomain;
	}

	public String getPlayDomain() {
		return this.playDomain;
	}

	public void setPlayDomain(String playDomain) {
		this.playDomain = playDomain;
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @deprecated use getBizProtocol instead of this.
	 */
	@Deprecated
	public String getProtocol() {
		return this.protocol;
	}

	/**
	 * @deprecated use setBizProtocol instead of this.
	 */
	@Deprecated
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public DescribeStreamResponse getInstance(UnmarshallerContext context) {
		return	DescribeStreamResponseUnmarshaller.unmarshall(this, context);
	}
}
