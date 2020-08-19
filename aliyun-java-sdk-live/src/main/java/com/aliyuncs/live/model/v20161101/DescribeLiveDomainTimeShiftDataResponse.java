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
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainTimeShiftDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainTimeShiftDataResponse extends AcsResponse {

	private String requestId;

	private List<DataModule> timeShiftData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataModule> getTimeShiftData() {
		return this.timeShiftData;
	}

	public void setTimeShiftData(List<DataModule> timeShiftData) {
		this.timeShiftData = timeShiftData;
	}

	public static class DataModule {

		private String timeStamp;

		private String size;

		private String type;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeLiveDomainTimeShiftDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainTimeShiftDataResponseUnmarshaller.unmarshall(this, context);
	}
}
