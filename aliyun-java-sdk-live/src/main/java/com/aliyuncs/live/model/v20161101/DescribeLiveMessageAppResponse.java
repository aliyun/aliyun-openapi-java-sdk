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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveMessageAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveMessageAppResponse extends AcsResponse {

	private String requestId;

	private String appId;

	private String appName;

	private String appKey;

	private String appSign;

	private Integer auditType;

	private String auditUrl;

	private String eventCallbackUrl;

	private String callbackUrl;

	private Boolean disable;

	private Long createTime;

	private Long modifyTime;

	private Integer msgLifeCycle;

	private String dataCenter;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAppSign() {
		return this.appSign;
	}

	public void setAppSign(String appSign) {
		this.appSign = appSign;
	}

	public Integer getAuditType() {
		return this.auditType;
	}

	public void setAuditType(Integer auditType) {
		this.auditType = auditType;
	}

	public String getAuditUrl() {
		return this.auditUrl;
	}

	public void setAuditUrl(String auditUrl) {
		this.auditUrl = auditUrl;
	}

	public String getEventCallbackUrl() {
		return this.eventCallbackUrl;
	}

	public void setEventCallbackUrl(String eventCallbackUrl) {
		this.eventCallbackUrl = eventCallbackUrl;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public Boolean getDisable() {
		return this.disable;
	}

	public void setDisable(Boolean disable) {
		this.disable = disable;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getMsgLifeCycle() {
		return this.msgLifeCycle;
	}

	public void setMsgLifeCycle(Integer msgLifeCycle) {
		this.msgLifeCycle = msgLifeCycle;
	}

	public String getDataCenter() {
		return this.dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
	}

	@Override
	public DescribeLiveMessageAppResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveMessageAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
