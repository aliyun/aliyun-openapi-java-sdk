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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnBgpTrafficDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnBgpTrafficDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private List<BgpData> bgpDataInterval;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BgpData> getBgpDataInterval() {
		return this.bgpDataInterval;
	}

	public void setBgpDataInterval(List<BgpData> bgpDataInterval) {
		this.bgpDataInterval = bgpDataInterval;
	}

	public static class BgpData {

		private Long out;

		private Long in;

		private String timeStamp;

		public Long getOut() {
			return this.out;
		}

		public void setOut(Long out) {
			this.out = out;
		}

		public Long getIn() {
			return this.in;
		}

		public void setIn(Long in) {
			this.in = in;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeDcdnBgpTrafficDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnBgpTrafficDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
