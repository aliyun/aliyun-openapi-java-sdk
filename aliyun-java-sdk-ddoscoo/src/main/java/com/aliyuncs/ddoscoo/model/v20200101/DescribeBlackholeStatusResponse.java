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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeBlackholeStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBlackholeStatusResponse extends AcsResponse {

	private String requestId;

	private List<BlackholeStatusItem> blackholeStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BlackholeStatusItem> getBlackholeStatus() {
		return this.blackholeStatus;
	}

	public void setBlackholeStatus(List<BlackholeStatusItem> blackholeStatus) {
		this.blackholeStatus = blackholeStatus;
	}

	public static class BlackholeStatusItem {

		private Long startTime;

		private Long endTime;

		private String ip;

		private String blackStatus;

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getBlackStatus() {
			return this.blackStatus;
		}

		public void setBlackStatus(String blackStatus) {
			this.blackStatus = blackStatus;
		}
	}

	@Override
	public DescribeBlackholeStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeBlackholeStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
