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

package com.aliyuncs.miniapplcdp.model.v20200113;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.miniapplcdp.transform.v20200113.GetRealtimeStatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRealtimeStatsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Map<Object,Object> totalUvCount;

		private Map<Object,Object> totalPvCount;

		private Map<Object,Object> todayPvCount;

		private Map<Object,Object> todayUvCount;

		public Map<Object,Object> getTotalUvCount() {
			return this.totalUvCount;
		}

		public void setTotalUvCount(Map<Object,Object> totalUvCount) {
			this.totalUvCount = totalUvCount;
		}

		public Map<Object,Object> getTotalPvCount() {
			return this.totalPvCount;
		}

		public void setTotalPvCount(Map<Object,Object> totalPvCount) {
			this.totalPvCount = totalPvCount;
		}

		public Map<Object,Object> getTodayPvCount() {
			return this.todayPvCount;
		}

		public void setTodayPvCount(Map<Object,Object> todayPvCount) {
			this.todayPvCount = todayPvCount;
		}

		public Map<Object,Object> getTodayUvCount() {
			return this.todayUvCount;
		}

		public void setTodayUvCount(Map<Object,Object> todayUvCount) {
			this.todayUvCount = todayUvCount;
		}
	}

	@Override
	public GetRealtimeStatsResponse getInstance(UnmarshallerContext context) {
		return	GetRealtimeStatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
