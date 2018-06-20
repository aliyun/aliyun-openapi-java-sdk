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

package com.aliyuncs.jarvis_public.model.v20180621;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis_public.transform.v20180621.DescribePhoneInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePhoneInfoResponse extends AcsResponse {

	private String requestId;

	private String module;

	private Long phoneNum;

	private Long riskLevel;

	private String detectTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Long getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Long getRiskLevel() {
		return this.riskLevel;
	}

	public void setRiskLevel(Long riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getDetectTime() {
		return this.detectTime;
	}

	public void setDetectTime(String detectTime) {
		this.detectTime = detectTime;
	}

	@Override
	public DescribePhoneInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribePhoneInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
