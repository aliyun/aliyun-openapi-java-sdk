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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnErUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnErUsageDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private List<ErAccItem> erAccData;

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

	public List<ErAccItem> getErAccData() {
		return this.erAccData;
	}

	public void setErAccData(List<ErAccItem> erAccData) {
		this.erAccData = erAccData;
	}

	public static class ErAccItem {

		private Long erAcc;

		private String timeStamp;

		private String spec;

		private String routine;

		public Long getErAcc() {
			return this.erAcc;
		}

		public void setErAcc(Long erAcc) {
			this.erAcc = erAcc;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getRoutine() {
			return this.routine;
		}

		public void setRoutine(String routine) {
			this.routine = routine;
		}
	}

	@Override
	public DescribeDcdnErUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnErUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
