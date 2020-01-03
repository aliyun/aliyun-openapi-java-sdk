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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.GetIfEcsTypeSupportHtConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIfEcsTypeSupportHtConfigResponse extends AcsResponse {

	private String requestId;

	private String instanceType;

	private Boolean supportHtConfig;

	private Boolean defaultHtEnabled;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public Boolean getSupportHtConfig() {
		return this.supportHtConfig;
	}

	public void setSupportHtConfig(Boolean supportHtConfig) {
		this.supportHtConfig = supportHtConfig;
	}

	public Boolean getDefaultHtEnabled() {
		return this.defaultHtEnabled;
	}

	public void setDefaultHtEnabled(Boolean defaultHtEnabled) {
		this.defaultHtEnabled = defaultHtEnabled;
	}

	@Override
	public GetIfEcsTypeSupportHtConfigResponse getInstance(UnmarshallerContext context) {
		return	GetIfEcsTypeSupportHtConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
