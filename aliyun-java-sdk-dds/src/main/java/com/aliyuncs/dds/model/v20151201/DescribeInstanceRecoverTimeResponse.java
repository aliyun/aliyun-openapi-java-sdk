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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeInstanceRecoverTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceRecoverTimeResponse extends AcsResponse {

	private String requestId;

	private List<AvailableRestoreTime> restoreRanges;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AvailableRestoreTime> getRestoreRanges() {
		return this.restoreRanges;
	}

	public void setRestoreRanges(List<AvailableRestoreTime> restoreRanges) {
		this.restoreRanges = restoreRanges;
	}

	public static class AvailableRestoreTime {

		private String restoreBeginTime;

		private String restoreEndTime;

		private String restoreType;

		public String getRestoreBeginTime() {
			return this.restoreBeginTime;
		}

		public void setRestoreBeginTime(String restoreBeginTime) {
			this.restoreBeginTime = restoreBeginTime;
		}

		public String getRestoreEndTime() {
			return this.restoreEndTime;
		}

		public void setRestoreEndTime(String restoreEndTime) {
			this.restoreEndTime = restoreEndTime;
		}

		public String getRestoreType() {
			return this.restoreType;
		}

		public void setRestoreType(String restoreType) {
			this.restoreType = restoreType;
		}
	}

	@Override
	public DescribeInstanceRecoverTimeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceRecoverTimeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
