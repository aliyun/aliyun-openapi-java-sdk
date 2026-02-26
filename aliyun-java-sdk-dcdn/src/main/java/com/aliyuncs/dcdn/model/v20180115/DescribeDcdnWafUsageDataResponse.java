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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnWafUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnWafUsageDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private List<WafUsageDataItem> wafUsageData;

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

	public List<WafUsageDataItem> getWafUsageData() {
		return this.wafUsageData;
	}

	public void setWafUsageData(List<WafUsageDataItem> wafUsageData) {
		this.wafUsageData = wafUsageData;
	}

	public static class WafUsageDataItem {

		private Long observeCnt;

		private String domain;

		private Long blockCnt;

		private Long accessCnt;

		private String timeStamp;

		private Long secCu;

		public Long getObserveCnt() {
			return this.observeCnt;
		}

		public void setObserveCnt(Long observeCnt) {
			this.observeCnt = observeCnt;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Long getBlockCnt() {
			return this.blockCnt;
		}

		public void setBlockCnt(Long blockCnt) {
			this.blockCnt = blockCnt;
		}

		public Long getAccessCnt() {
			return this.accessCnt;
		}

		public void setAccessCnt(Long accessCnt) {
			this.accessCnt = accessCnt;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Long getSecCu() {
			return this.secCu;
		}

		public void setSecCu(Long secCu) {
			this.secCu = secCu;
		}
	}

	@Override
	public DescribeDcdnWafUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnWafUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
