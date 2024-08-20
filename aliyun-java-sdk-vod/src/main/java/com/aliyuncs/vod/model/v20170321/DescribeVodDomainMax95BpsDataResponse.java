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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeVodDomainMax95BpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodDomainMax95BpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String endTime;

	private String startTime;

	private String domesticMax95Bps;

	private String overseasMax95Bps;

	private String max95Bps;

	private List<Max95Detail> detailData;

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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
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

	public String getMax95Bps() {
		return this.max95Bps;
	}

	public void setMax95Bps(String max95Bps) {
		this.max95Bps = max95Bps;
	}

	public List<Max95Detail> getDetailData() {
		return this.detailData;
	}

	public void setDetailData(List<Max95Detail> detailData) {
		this.detailData = detailData;
	}

	public static class Max95Detail {

		private String timeStamp;

		private String area;

		private String max95BpsPeakTime;

		private Float max95Bps;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getMax95BpsPeakTime() {
			return this.max95BpsPeakTime;
		}

		public void setMax95BpsPeakTime(String max95BpsPeakTime) {
			this.max95BpsPeakTime = max95BpsPeakTime;
		}

		public Float getMax95Bps() {
			return this.max95Bps;
		}

		public void setMax95Bps(Float max95Bps) {
			this.max95Bps = max95Bps;
		}
	}

	@Override
	public DescribeVodDomainMax95BpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodDomainMax95BpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
