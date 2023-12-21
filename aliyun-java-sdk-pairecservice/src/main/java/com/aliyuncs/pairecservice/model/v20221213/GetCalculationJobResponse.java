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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetCalculationJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCalculationJobResponse extends AcsResponse {

	private String requestId;

	private String aBMetricId;

	private String aBMetricName;

	private String status;

	private String config;

	private String gmtRanTime;

	private String bizDate;

	private String jobSource;

	private List<String> jobMessage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getABMetricId() {
		return this.aBMetricId;
	}

	public void setABMetricId(String aBMetricId) {
		this.aBMetricId = aBMetricId;
	}

	public String getABMetricName() {
		return this.aBMetricName;
	}

	public void setABMetricName(String aBMetricName) {
		this.aBMetricName = aBMetricName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getGmtRanTime() {
		return this.gmtRanTime;
	}

	public void setGmtRanTime(String gmtRanTime) {
		this.gmtRanTime = gmtRanTime;
	}

	public String getBizDate() {
		return this.bizDate;
	}

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getJobSource() {
		return this.jobSource;
	}

	public void setJobSource(String jobSource) {
		this.jobSource = jobSource;
	}

	public List<String> getJobMessage() {
		return this.jobMessage;
	}

	public void setJobMessage(List<String> jobMessage) {
		this.jobMessage = jobMessage;
	}

	@Override
	public GetCalculationJobResponse getInstance(UnmarshallerContext context) {
		return	GetCalculationJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
