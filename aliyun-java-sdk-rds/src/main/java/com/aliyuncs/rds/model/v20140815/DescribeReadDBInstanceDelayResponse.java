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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeReadDBInstanceDelayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReadDBInstanceDelayResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String readDBInstanceId;

	private Integer delayTime;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getReadDBInstanceId() {
		return this.readDBInstanceId;
	}

	public void setReadDBInstanceId(String readDBInstanceId) {
		this.readDBInstanceId = readDBInstanceId;
	}

	public Integer getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(Integer delayTime) {
		this.delayTime = delayTime;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String dBInstanceId;

		private List<ReadonlyInstanceDelayItem> readonlyInstanceDelay;

		private List<String> readDBInstanceNames;

		private List<String> readDelayTimes;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public List<ReadonlyInstanceDelayItem> getReadonlyInstanceDelay() {
			return this.readonlyInstanceDelay;
		}

		public void setReadonlyInstanceDelay(List<ReadonlyInstanceDelayItem> readonlyInstanceDelay) {
			this.readonlyInstanceDelay = readonlyInstanceDelay;
		}

		public List<String> getReadDBInstanceNames() {
			return this.readDBInstanceNames;
		}

		public void setReadDBInstanceNames(List<String> readDBInstanceNames) {
			this.readDBInstanceNames = readDBInstanceNames;
		}

		public List<String> getReadDelayTimes() {
			return this.readDelayTimes;
		}

		public void setReadDelayTimes(List<String> readDelayTimes) {
			this.readDelayTimes = readDelayTimes;
		}

		public static class ReadonlyInstanceDelayItem {

			private String replayLatency;

			private String flushLag;

			private String flushLatency;

			private String sendLatency;

			private String writeLag;

			private String replayLag;

			private String writeLatency;

			private String readDBInstanceName;

			public String getReplayLatency() {
				return this.replayLatency;
			}

			public void setReplayLatency(String replayLatency) {
				this.replayLatency = replayLatency;
			}

			public String getFlushLag() {
				return this.flushLag;
			}

			public void setFlushLag(String flushLag) {
				this.flushLag = flushLag;
			}

			public String getFlushLatency() {
				return this.flushLatency;
			}

			public void setFlushLatency(String flushLatency) {
				this.flushLatency = flushLatency;
			}

			public String getSendLatency() {
				return this.sendLatency;
			}

			public void setSendLatency(String sendLatency) {
				this.sendLatency = sendLatency;
			}

			public String getWriteLag() {
				return this.writeLag;
			}

			public void setWriteLag(String writeLag) {
				this.writeLag = writeLag;
			}

			public String getReplayLag() {
				return this.replayLag;
			}

			public void setReplayLag(String replayLag) {
				this.replayLag = replayLag;
			}

			public String getWriteLatency() {
				return this.writeLatency;
			}

			public void setWriteLatency(String writeLatency) {
				this.writeLatency = writeLatency;
			}

			public String getReadDBInstanceName() {
				return this.readDBInstanceName;
			}

			public void setReadDBInstanceName(String readDBInstanceName) {
				this.readDBInstanceName = readDBInstanceName;
			}
		}
	}

	@Override
	public DescribeReadDBInstanceDelayResponse getInstance(UnmarshallerContext context) {
		return	DescribeReadDBInstanceDelayResponseUnmarshaller.unmarshall(this, context);
	}
}
