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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryGlobalBlackListAlarmCenterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryGlobalBlackListAlarmCenterResponse extends AcsResponse {

	private MonitorBlackList monitorBlackList;

	private OpsBlackList opsBlackList;

	public MonitorBlackList getMonitorBlackList() {
		return this.monitorBlackList;
	}

	public void setMonitorBlackList(MonitorBlackList monitorBlackList) {
		this.monitorBlackList = monitorBlackList;
	}

	public OpsBlackList getOpsBlackList() {
		return this.opsBlackList;
	}

	public void setOpsBlackList(OpsBlackList opsBlackList) {
		this.opsBlackList = opsBlackList;
	}

	public static class MonitorBlackList {

		private String name;

		private List<String> clusterIds;

		private List<String> ncIps;

		private List<String> instanceIds;

		private List<String> regionIds;

		private List<String> zoneIds;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getClusterIds() {
			return this.clusterIds;
		}

		public void setClusterIds(List<String> clusterIds) {
			this.clusterIds = clusterIds;
		}

		public List<String> getNcIps() {
			return this.ncIps;
		}

		public void setNcIps(List<String> ncIps) {
			this.ncIps = ncIps;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
		}

		public List<String> getRegionIds() {
			return this.regionIds;
		}

		public void setRegionIds(List<String> regionIds) {
			this.regionIds = regionIds;
		}

		public List<String> getZoneIds() {
			return this.zoneIds;
		}

		public void setZoneIds(List<String> zoneIds) {
			this.zoneIds = zoneIds;
		}
	}

	public static class OpsBlackList {

		private String name;

		private List<String> clusterIds1;

		private List<String> ncIps2;

		private List<String> instanceIds3;

		private List<String> regionIds4;

		private List<String> zoneIds5;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getClusterIds1() {
			return this.clusterIds1;
		}

		public void setClusterIds1(List<String> clusterIds1) {
			this.clusterIds1 = clusterIds1;
		}

		public List<String> getNcIps2() {
			return this.ncIps2;
		}

		public void setNcIps2(List<String> ncIps2) {
			this.ncIps2 = ncIps2;
		}

		public List<String> getInstanceIds3() {
			return this.instanceIds3;
		}

		public void setInstanceIds3(List<String> instanceIds3) {
			this.instanceIds3 = instanceIds3;
		}

		public List<String> getRegionIds4() {
			return this.regionIds4;
		}

		public void setRegionIds4(List<String> regionIds4) {
			this.regionIds4 = regionIds4;
		}

		public List<String> getZoneIds5() {
			return this.zoneIds5;
		}

		public void setZoneIds5(List<String> zoneIds5) {
			this.zoneIds5 = zoneIds5;
		}
	}

	@Override
	public OpsQueryGlobalBlackListAlarmCenterResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryGlobalBlackListAlarmCenterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
