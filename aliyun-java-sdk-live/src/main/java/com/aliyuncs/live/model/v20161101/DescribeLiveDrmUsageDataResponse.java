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
import com.aliyuncs.live.transform.v20161101.DescribeLiveDrmUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDrmUsageDataResponse extends AcsResponse {

	private String requestId;

	private List<DataModule> drmUsageData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataModule> getDrmUsageData() {
		return this.drmUsageData;
	}

	public void setDrmUsageData(List<DataModule> drmUsageData) {
		this.drmUsageData = drmUsageData;
	}

	public static class DataModule {

		private String domain;

		private String timeStamp;

		private Long count;

		private String drmType;

		private String region;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public String getDrmType() {
			return this.drmType;
		}

		public void setDrmType(String drmType) {
			this.drmType = drmType;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
	}

	@Override
	public DescribeLiveDrmUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDrmUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
