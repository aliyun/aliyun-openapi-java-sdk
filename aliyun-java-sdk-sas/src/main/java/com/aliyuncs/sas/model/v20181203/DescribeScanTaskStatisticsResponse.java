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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeScanTaskStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScanTaskStatisticsResponse extends AcsResponse {

	private Long totalTaskNum;

	private Long userNum;

	private String requestId;

	private Integer dealedRiskNum;

	private Long personalTaskNum;

	public Long getTotalTaskNum() {
		return this.totalTaskNum;
	}

	public void setTotalTaskNum(Long totalTaskNum) {
		this.totalTaskNum = totalTaskNum;
	}

	public Long getUserNum() {
		return this.userNum;
	}

	public void setUserNum(Long userNum) {
		this.userNum = userNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getDealedRiskNum() {
		return this.dealedRiskNum;
	}

	public void setDealedRiskNum(Integer dealedRiskNum) {
		this.dealedRiskNum = dealedRiskNum;
	}

	public Long getPersonalTaskNum() {
		return this.personalTaskNum;
	}

	public void setPersonalTaskNum(Long personalTaskNum) {
		this.personalTaskNum = personalTaskNum;
	}

	@Override
	public DescribeScanTaskStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeScanTaskStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
