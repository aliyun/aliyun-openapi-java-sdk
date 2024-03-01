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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainPublishErrorCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainPublishErrorCodeResponse extends AcsResponse {

	private String requestId;

	private String dataInterval;

	private String domainName;

	private String startTime;

	private String endTime;

	private List<Rtcd> realTimeCodeData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
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

	public List<Rtcd> getRealTimeCodeData() {
		return this.realTimeCodeData;
	}

	public void setRealTimeCodeData(List<Rtcd> realTimeCodeData) {
		this.realTimeCodeData = realTimeCodeData;
	}

	public static class Rtcd {

		private String timeStamp;

		private List<Cd> codeData;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public List<Cd> getCodeData() {
			return this.codeData;
		}

		public void setCodeData(List<Cd> codeData) {
			this.codeData = codeData;
		}

		public static class Cd {

			private String code;

			private String count;

			private String proportion;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getCount() {
				return this.count;
			}

			public void setCount(String count) {
				this.count = count;
			}

			public String getProportion() {
				return this.proportion;
			}

			public void setProportion(String proportion) {
				this.proportion = proportion;
			}
		}
	}

	@Override
	public DescribeLiveDomainPublishErrorCodeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainPublishErrorCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
