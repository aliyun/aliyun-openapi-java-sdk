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

package com.aliyuncs.linkwan.model.v20190301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.ListGatewayOnlineRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayOnlineRecordsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<Record> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Record> getList() {
			return this.list;
		}

		public void setList(List<Record> list) {
			this.list = list;
		}

		public static class Record {

			private String onlineState;

			private Long stateChangedMillis;

			private String gwEui;

			public String getOnlineState() {
				return this.onlineState;
			}

			public void setOnlineState(String onlineState) {
				this.onlineState = onlineState;
			}

			public Long getStateChangedMillis() {
				return this.stateChangedMillis;
			}

			public void setStateChangedMillis(Long stateChangedMillis) {
				this.stateChangedMillis = stateChangedMillis;
			}

			public String getGwEui() {
				return this.gwEui;
			}

			public void setGwEui(String gwEui) {
				this.gwEui = gwEui;
			}
		}
	}

	@Override
	public ListGatewayOnlineRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayOnlineRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
