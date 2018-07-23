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

package com.aliyuncs.zhuque.model.v20160701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.zhuque.transform.v20160701.PhysicalServerMachineTypeCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PhysicalServerMachineTypeCountResponse extends AcsResponse {

	private String requestId;

	private List<ProjectItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProjectItem> getData() {
		return this.data;
	}

	public void setData(List<ProjectItem> data) {
		this.data = data;
	}

	public static class ProjectItem {

		private String projectId;

		private List<ServerItem> serverList;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public List<ServerItem> getServerList() {
			return this.serverList;
		}

		public void setServerList(List<ServerItem> serverList) {
			this.serverList = serverList;
		}

		public static class ServerItem {

			private String machineType;

			private Integer totalServerCountByMachineType;

			public String getMachineType() {
				return this.machineType;
			}

			public void setMachineType(String machineType) {
				this.machineType = machineType;
			}

			public Integer getTotalServerCountByMachineType() {
				return this.totalServerCountByMachineType;
			}

			public void setTotalServerCountByMachineType(Integer totalServerCountByMachineType) {
				this.totalServerCountByMachineType = totalServerCountByMachineType;
			}
		}
	}

	@Override
	public PhysicalServerMachineTypeCountResponse getInstance(UnmarshallerContext context) {
		return	PhysicalServerMachineTypeCountResponseUnmarshaller.unmarshall(this, context);
	}
}
