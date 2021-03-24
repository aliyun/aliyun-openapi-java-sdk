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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeUuidsByVulNamesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUuidsByVulNamesResponse extends AcsResponse {

	private String requestId;

	private List<MachineInfoStatistic> machineInfoStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MachineInfoStatistic> getMachineInfoStatistics() {
		return this.machineInfoStatistics;
	}

	public void setMachineInfoStatistics(List<MachineInfoStatistic> machineInfoStatistics) {
		this.machineInfoStatistics = machineInfoStatistics;
	}

	public static class MachineInfoStatistic {

		private String machineIp;

		private String machineName;

		private String os;

		private String machineInstanceId;

		private String uuid;

		private String regionId;

		public String getMachineIp() {
			return this.machineIp;
		}

		public void setMachineIp(String machineIp) {
			this.machineIp = machineIp;
		}

		public String getMachineName() {
			return this.machineName;
		}

		public void setMachineName(String machineName) {
			this.machineName = machineName;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getMachineInstanceId() {
			return this.machineInstanceId;
		}

		public void setMachineInstanceId(String machineInstanceId) {
			this.machineInstanceId = machineInstanceId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeUuidsByVulNamesResponse getInstance(UnmarshallerContext context) {
		return	DescribeUuidsByVulNamesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
