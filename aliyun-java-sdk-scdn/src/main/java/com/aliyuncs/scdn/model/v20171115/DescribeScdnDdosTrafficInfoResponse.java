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

package com.aliyuncs.scdn.model.v20171115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnDdosTrafficInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnDdosTrafficInfoResponse extends AcsResponse {

	private String requestId;

	private List<TimeScope> timeScopes;

	private List<String> bpsDrops;

	private List<String> bpsTotals;

	private List<String> ppsTotals;

	private List<String> ppsDrops;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TimeScope> getTimeScopes() {
		return this.timeScopes;
	}

	public void setTimeScopes(List<TimeScope> timeScopes) {
		this.timeScopes = timeScopes;
	}

	public List<String> getBpsDrops() {
		return this.bpsDrops;
	}

	public void setBpsDrops(List<String> bpsDrops) {
		this.bpsDrops = bpsDrops;
	}

	public List<String> getBpsTotals() {
		return this.bpsTotals;
	}

	public void setBpsTotals(List<String> bpsTotals) {
		this.bpsTotals = bpsTotals;
	}

	public List<String> getPpsTotals() {
		return this.ppsTotals;
	}

	public void setPpsTotals(List<String> ppsTotals) {
		this.ppsTotals = ppsTotals;
	}

	public List<String> getPpsDrops() {
		return this.ppsDrops;
	}

	public void setPpsDrops(List<String> ppsDrops) {
		this.ppsDrops = ppsDrops;
	}

	public static class TimeScope {

		private String interval;

		private String start;

		public String getInterval() {
			return this.interval;
		}

		public void setInterval(String interval) {
			this.interval = interval;
		}

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}
	}

	@Override
	public DescribeScdnDdosTrafficInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnDdosTrafficInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
