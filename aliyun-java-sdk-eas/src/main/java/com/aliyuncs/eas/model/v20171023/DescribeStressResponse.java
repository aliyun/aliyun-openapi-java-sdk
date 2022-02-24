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

package com.aliyuncs.eas.model.v20171023;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20171023.DescribeStressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStressResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String serviceName;

	private String stressName;

	private String token;

	private String callerUid;

	private String parentUid;

	private Long desiredAgent;

	private Long availableAgent;

	private String status;

	private String reason;

	private String message;

	private Long duration;

	private String config;

	private String createTime;

	private String updateTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getStressName() {
		return this.stressName;
	}

	public void setStressName(String stressName) {
		this.stressName = stressName;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(String callerUid) {
		this.callerUid = callerUid;
	}

	public String getParentUid() {
		return this.parentUid;
	}

	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public Long getDesiredAgent() {
		return this.desiredAgent;
	}

	public void setDesiredAgent(Long desiredAgent) {
		this.desiredAgent = desiredAgent;
	}

	public Long getAvailableAgent() {
		return this.availableAgent;
	}

	public void setAvailableAgent(Long availableAgent) {
		this.availableAgent = availableAgent;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public DescribeStressResponse getInstance(UnmarshallerContext context) {
		return	DescribeStressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
