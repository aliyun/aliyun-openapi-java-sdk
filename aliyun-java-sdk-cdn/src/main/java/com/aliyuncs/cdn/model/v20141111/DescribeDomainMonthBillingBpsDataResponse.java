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
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainMonthBillingBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainMonthBillingBpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private Float bandwidth95Bps;

	private Float domesticBandwidth95Bps;

	private Float overseasBandwidth95Bps;

	private Float monthavgBps;

	private Float domesticMonthavgBps;

	private Float overseasMonthavgBps;

	private Float month4thBps;

	private Float domesticMonth4thBps;

	private Float overseasMonth4thBps;

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

	public Float getBandwidth95Bps() {
		return this.bandwidth95Bps;
	}

	public void setBandwidth95Bps(Float bandwidth95Bps) {
		this.bandwidth95Bps = bandwidth95Bps;
	}

	public Float getDomesticBandwidth95Bps() {
		return this.domesticBandwidth95Bps;
	}

	public void setDomesticBandwidth95Bps(Float domesticBandwidth95Bps) {
		this.domesticBandwidth95Bps = domesticBandwidth95Bps;
	}

	public Float getOverseasBandwidth95Bps() {
		return this.overseasBandwidth95Bps;
	}

	public void setOverseasBandwidth95Bps(Float overseasBandwidth95Bps) {
		this.overseasBandwidth95Bps = overseasBandwidth95Bps;
	}

	public Float getMonthavgBps() {
		return this.monthavgBps;
	}

	public void setMonthavgBps(Float monthavgBps) {
		this.monthavgBps = monthavgBps;
	}

	public Float getDomesticMonthavgBps() {
		return this.domesticMonthavgBps;
	}

	public void setDomesticMonthavgBps(Float domesticMonthavgBps) {
		this.domesticMonthavgBps = domesticMonthavgBps;
	}

	public Float getOverseasMonthavgBps() {
		return this.overseasMonthavgBps;
	}

	public void setOverseasMonthavgBps(Float overseasMonthavgBps) {
		this.overseasMonthavgBps = overseasMonthavgBps;
	}

	public Float getMonth4thBps() {
		return this.month4thBps;
	}

	public void setMonth4thBps(Float month4thBps) {
		this.month4thBps = month4thBps;
	}

	public Float getDomesticMonth4thBps() {
		return this.domesticMonth4thBps;
	}

	public void setDomesticMonth4thBps(Float domesticMonth4thBps) {
		this.domesticMonth4thBps = domesticMonth4thBps;
	}

	public Float getOverseasMonth4thBps() {
		return this.overseasMonth4thBps;
	}

	public void setOverseasMonth4thBps(Float overseasMonth4thBps) {
		this.overseasMonth4thBps = overseasMonth4thBps;
	}

	@Override
	public DescribeDomainMonthBillingBpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainMonthBillingBpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
