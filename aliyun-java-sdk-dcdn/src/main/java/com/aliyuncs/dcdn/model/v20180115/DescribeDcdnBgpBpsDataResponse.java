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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnBgpBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnBgpBpsDataResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private List<BgpData> bgpDataInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<BgpData> getBgpDataInterval() {
		return this.bgpDataInterval;
	}

	public void setBgpDataInterval(List<BgpData> bgpDataInterval) {
		this.bgpDataInterval = bgpDataInterval;
	}

	public static class BgpData {

		private Float in;

		private Float out;

		private String timeStamp;

		public Float getIn() {
			return this.in;
		}

		public void setIn(Float in) {
			this.in = in;
		}

		public Float getOut() {
			return this.out;
		}

		public void setOut(Float out) {
			this.out = out;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeDcdnBgpBpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnBgpBpsDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
