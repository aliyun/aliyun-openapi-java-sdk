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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.ListNodesByNodeGroupIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodesByNodeGroupIdResponse extends AcsResponse {

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

		private List<NodeGroup> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<NodeGroup> getList() {
			return this.list;
		}

		public void setList(List<NodeGroup> list) {
			this.list = list;
		}

		public static class NodeGroup {

			private String devEui;

			private String devAddr;

			private String classMode;

			private Long lastJoinMillis;

			private Long boundMillis;

			public String getDevEui() {
				return this.devEui;
			}

			public void setDevEui(String devEui) {
				this.devEui = devEui;
			}

			public String getDevAddr() {
				return this.devAddr;
			}

			public void setDevAddr(String devAddr) {
				this.devAddr = devAddr;
			}

			public String getClassMode() {
				return this.classMode;
			}

			public void setClassMode(String classMode) {
				this.classMode = classMode;
			}

			public Long getLastJoinMillis() {
				return this.lastJoinMillis;
			}

			public void setLastJoinMillis(Long lastJoinMillis) {
				this.lastJoinMillis = lastJoinMillis;
			}

			public Long getBoundMillis() {
				return this.boundMillis;
			}

			public void setBoundMillis(Long boundMillis) {
				this.boundMillis = boundMillis;
			}
		}
	}

	@Override
	public ListNodesByNodeGroupIdResponse getInstance(UnmarshallerContext context) {
		return	ListNodesByNodeGroupIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
