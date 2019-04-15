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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeScreenHostStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScreenHostStatisticsResponse extends AcsResponse {

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

		private List<String> weaknessUuids;

		private List<String> suspEventUuids;

		private List<String> suspEventMachineNames;

		private List<String> weaknessMachineNames;

		public List<String> getWeaknessUuids() {
			return this.weaknessUuids;
		}

		public void setWeaknessUuids(List<String> weaknessUuids) {
			this.weaknessUuids = weaknessUuids;
		}

		public List<String> getSuspEventUuids() {
			return this.suspEventUuids;
		}

		public void setSuspEventUuids(List<String> suspEventUuids) {
			this.suspEventUuids = suspEventUuids;
		}

		public List<String> getSuspEventMachineNames() {
			return this.suspEventMachineNames;
		}

		public void setSuspEventMachineNames(List<String> suspEventMachineNames) {
			this.suspEventMachineNames = suspEventMachineNames;
		}

		public List<String> getWeaknessMachineNames() {
			return this.weaknessMachineNames;
		}

		public void setWeaknessMachineNames(List<String> weaknessMachineNames) {
			this.weaknessMachineNames = weaknessMachineNames;
		}
	}

	@Override
	public DescribeScreenHostStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeScreenHostStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
