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
import com.aliyuncs.sas.transform.v20181203.GetAgentlessTaskCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAgentlessTaskCountResponse extends AcsResponse {

	private String requestId;

	private Integer riskMachine;

	private Integer scanMachine;

	private Integer maliciousFile;

	private Integer vulnerability;

	private Long lastTaskTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getRiskMachine() {
		return this.riskMachine;
	}

	public void setRiskMachine(Integer riskMachine) {
		this.riskMachine = riskMachine;
	}

	public Integer getScanMachine() {
		return this.scanMachine;
	}

	public void setScanMachine(Integer scanMachine) {
		this.scanMachine = scanMachine;
	}

	public Integer getMaliciousFile() {
		return this.maliciousFile;
	}

	public void setMaliciousFile(Integer maliciousFile) {
		this.maliciousFile = maliciousFile;
	}

	public Integer getVulnerability() {
		return this.vulnerability;
	}

	public void setVulnerability(Integer vulnerability) {
		this.vulnerability = vulnerability;
	}

	public Long getLastTaskTime() {
		return this.lastTaskTime;
	}

	public void setLastTaskTime(Long lastTaskTime) {
		this.lastTaskTime = lastTaskTime;
	}

	@Override
	public GetAgentlessTaskCountResponse getInstance(UnmarshallerContext context) {
		return	GetAgentlessTaskCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
