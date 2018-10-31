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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainMax95BpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainMax95BpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String max95Bps;

	private String domesticMax95Bps;

	private String overseasMax95Bps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMax95Bps() {
		return this.max95Bps;
	}

	public void setMax95Bps(String max95Bps) {
		this.max95Bps = max95Bps;
	}

	public String getDomesticMax95Bps() {
		return this.domesticMax95Bps;
	}

	public void setDomesticMax95Bps(String domesticMax95Bps) {
		this.domesticMax95Bps = domesticMax95Bps;
	}

	public String getOverseasMax95Bps() {
		return this.overseasMax95Bps;
	}

	public void setOverseasMax95Bps(String overseasMax95Bps) {
		this.overseasMax95Bps = overseasMax95Bps;
	}

	@Override
	public DescribeDomainMax95BpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainMax95BpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
