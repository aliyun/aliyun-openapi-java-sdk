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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeStrategyProcessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStrategyProcessResponse extends AcsResponse {

	private String requestId;

	private Long strategyId;

	private Integer processRate;

	private Integer execStatus;

	private String passRate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(Long strategyId) {
		this.strategyId = strategyId;
	}

	public Integer getProcessRate() {
		return this.processRate;
	}

	public void setProcessRate(Integer processRate) {
		this.processRate = processRate;
	}

	public Integer getExecStatus() {
		return this.execStatus;
	}

	public void setExecStatus(Integer execStatus) {
		this.execStatus = execStatus;
	}

	public String getPassRate() {
		return this.passRate;
	}

	public void setPassRate(String passRate) {
		this.passRate = passRate;
	}

	@Override
	public DescribeStrategyProcessResponse getInstance(UnmarshallerContext context) {
		return	DescribeStrategyProcessResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
