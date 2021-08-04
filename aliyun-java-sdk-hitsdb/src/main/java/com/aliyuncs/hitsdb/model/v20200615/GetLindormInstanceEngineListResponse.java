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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLindormInstanceEngineListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLindormInstanceEngineListResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<EngineInfo> engineList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<EngineInfo> getEngineList() {
		return this.engineList;
	}

	public void setEngineList(List<EngineInfo> engineList) {
		this.engineList = engineList;
	}

	public static class EngineInfo {

		private String engineType;

		private List<NetInfo> netInfoList;

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public List<NetInfo> getNetInfoList() {
			return this.netInfoList;
		}

		public void setNetInfoList(List<NetInfo> netInfoList) {
			this.netInfoList = netInfoList;
		}

		public static class NetInfo {

			private String netType;

			private String connectionString;

			private Integer port;

			private Integer accessType;

			public String getNetType() {
				return this.netType;
			}

			public void setNetType(String netType) {
				this.netType = netType;
			}

			public String getConnectionString() {
				return this.connectionString;
			}

			public void setConnectionString(String connectionString) {
				this.connectionString = connectionString;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public Integer getAccessType() {
				return this.accessType;
			}

			public void setAccessType(Integer accessType) {
				this.accessType = accessType;
			}
		}
	}

	@Override
	public GetLindormInstanceEngineListResponse getInstance(UnmarshallerContext context) {
		return	GetLindormInstanceEngineListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
