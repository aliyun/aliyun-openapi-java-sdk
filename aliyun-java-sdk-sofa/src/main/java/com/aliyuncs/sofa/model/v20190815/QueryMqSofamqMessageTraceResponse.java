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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMqSofamqMessageTraceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMqSofamqMessageTraceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<TrackListItem> trackList;

		public List<TrackListItem> getTrackList() {
			return this.trackList;
		}

		public void setTrackList(List<TrackListItem> trackList) {
			this.trackList = trackList;
		}

		public static class TrackListItem {

			private String consumerGroup;

			private String instanceId;

			private String trackType;

			public String getConsumerGroup() {
				return this.consumerGroup;
			}

			public void setConsumerGroup(String consumerGroup) {
				this.consumerGroup = consumerGroup;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTrackType() {
				return this.trackType;
			}

			public void setTrackType(String trackType) {
				this.trackType = trackType;
			}
		}
	}

	@Override
	public QueryMqSofamqMessageTraceResponse getInstance(UnmarshallerContext context) {
		return	QueryMqSofamqMessageTraceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
