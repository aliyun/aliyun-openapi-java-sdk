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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.ModifyActionEventPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyActionEventPolicyResponse extends AcsResponse {

	private String enableEventLog;

	private String regionId;

	private String requestId;

	public String getEnableEventLog() {
		return this.enableEventLog;
	}

	public void setEnableEventLog(String enableEventLog) {
		this.enableEventLog = enableEventLog;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public ModifyActionEventPolicyResponse getInstance(UnmarshallerContext context) {
		return	ModifyActionEventPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
