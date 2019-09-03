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
import com.aliyuncs.rds.transform.v20140815.DescribeHASwitchConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHASwitchConfigResponse extends AcsResponse {

	private String requestId;

	private String hAConfig;

	private String manualHATime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHAConfig() {
		return this.hAConfig;
	}

	public void setHAConfig(String hAConfig) {
		this.hAConfig = hAConfig;
	}

	public String getManualHATime() {
		return this.manualHATime;
	}

	public void setManualHATime(String manualHATime) {
		this.manualHATime = manualHATime;
	}

	@Override
	public DescribeHASwitchConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeHASwitchConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
