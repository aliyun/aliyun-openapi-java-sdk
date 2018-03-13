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
package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.DescribeCaptchaRiskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCaptchaRiskResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private Integer numOfThisMonth;

	private Integer numOfLastMonth;

	private String riskLevel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Integer getNumOfThisMonth() {
		return this.numOfThisMonth;
	}

	public void setNumOfThisMonth(Integer numOfThisMonth) {
		this.numOfThisMonth = numOfThisMonth;
	}

	public Integer getNumOfLastMonth() {
		return this.numOfLastMonth;
	}

	public void setNumOfLastMonth(Integer numOfLastMonth) {
		this.numOfLastMonth = numOfLastMonth;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	@Override
	public DescribeCaptchaRiskResponse getInstance(UnmarshallerContext context) {
		return	DescribeCaptchaRiskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
