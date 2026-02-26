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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeLatestScanTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLatestScanTaskResponse extends AcsResponse {

	private String targetInfo;

	private String requestId;

	private Long lastCheckTime;

	private Integer riskNum;

	private List<String> uuids;

	public String getTargetInfo() {
		return this.targetInfo;
	}

	public void setTargetInfo(String targetInfo) {
		this.targetInfo = targetInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getLastCheckTime() {
		return this.lastCheckTime;
	}

	public void setLastCheckTime(Long lastCheckTime) {
		this.lastCheckTime = lastCheckTime;
	}

	public Integer getRiskNum() {
		return this.riskNum;
	}

	public void setRiskNum(Integer riskNum) {
		this.riskNum = riskNum;
	}

	public List<String> getUuids() {
		return this.uuids;
	}

	public void setUuids(List<String> uuids) {
		this.uuids = uuids;
	}

	@Override
	public DescribeLatestScanTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeLatestScanTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
