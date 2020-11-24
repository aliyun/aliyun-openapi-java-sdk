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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeBlockStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBlockStatusResponse extends AcsResponse {

	private String requestId;

	private List<StatusItem> statusList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatusItem> getStatusList() {
		return this.statusList;
	}

	public void setStatusList(List<StatusItem> statusList) {
		this.statusList = statusList;
	}

	public static class StatusItem {

		private String ip;

		private List<BlockStatusItem> blockStatusList;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public List<BlockStatusItem> getBlockStatusList() {
			return this.blockStatusList;
		}

		public void setBlockStatusList(List<BlockStatusItem> blockStatusList) {
			this.blockStatusList = blockStatusList;
		}

		public static class BlockStatusItem {

			private Long startTime;

			private String line;

			private Long endTime;

			private String blockStatus;

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getLine() {
				return this.line;
			}

			public void setLine(String line) {
				this.line = line;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getBlockStatus() {
				return this.blockStatus;
			}

			public void setBlockStatus(String blockStatus) {
				this.blockStatus = blockStatus;
			}
		}
	}

	@Override
	public DescribeBlockStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeBlockStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
