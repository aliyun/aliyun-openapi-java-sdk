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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeAlertConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertConfigResponse extends AcsResponse {

	private Integer successConfig;

	private Integer failConfig;

	private Integer rejectConfig;

	private String requestId;

	public Integer getSuccessConfig() {
		return this.successConfig;
	}

	public void setSuccessConfig(Integer successConfig) {
		this.successConfig = successConfig;
	}

	public Integer getFailConfig() {
		return this.failConfig;
	}

	public void setFailConfig(Integer failConfig) {
		this.failConfig = failConfig;
	}

	public Integer getRejectConfig() {
		return this.rejectConfig;
	}

	public void setRejectConfig(Integer rejectConfig) {
		this.rejectConfig = rejectConfig;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public DescribeAlertConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlertConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
