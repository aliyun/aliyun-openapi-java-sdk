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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeOssCallbackSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssCallbackSettingResponse extends AcsResponse {

	private String requestId;

	private String callbackUrl;

	private Boolean scanCallback;

	private Boolean auditCallback;

	private String callbackSeed;

	private List<String> scanCallbackSuggestions;

	private List<String> serviceModules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public Boolean getScanCallback() {
		return this.scanCallback;
	}

	public void setScanCallback(Boolean scanCallback) {
		this.scanCallback = scanCallback;
	}

	public Boolean getAuditCallback() {
		return this.auditCallback;
	}

	public void setAuditCallback(Boolean auditCallback) {
		this.auditCallback = auditCallback;
	}

	public String getCallbackSeed() {
		return this.callbackSeed;
	}

	public void setCallbackSeed(String callbackSeed) {
		this.callbackSeed = callbackSeed;
	}

	public List<String> getScanCallbackSuggestions() {
		return this.scanCallbackSuggestions;
	}

	public void setScanCallbackSuggestions(List<String> scanCallbackSuggestions) {
		this.scanCallbackSuggestions = scanCallbackSuggestions;
	}

	public List<String> getServiceModules() {
		return this.serviceModules;
	}

	public void setServiceModules(List<String> serviceModules) {
		this.serviceModules = serviceModules;
	}

	@Override
	public DescribeOssCallbackSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssCallbackSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
