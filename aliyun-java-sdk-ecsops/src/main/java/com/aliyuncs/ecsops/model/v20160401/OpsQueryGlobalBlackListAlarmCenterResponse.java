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

		private List<String> zoneIds;

		private List<String> regionIds;

		private List<String> ncIps;

		private List<String> instanceIds;

		private List<String> clusterIds;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getZoneIds() {
			return this.zoneIds;
		}

		public void setZoneIds(List<String> zoneIds) {
			this.zoneIds = zoneIds;
		}

		public List<String> getRegionIds() {
			return this.regionIds;
		}

		public void setRegionIds(List<String> regionIds) {
			this.regionIds = regionIds;
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

		public List<String> getClusterIds() {
			return this.clusterIds;
		}

		public void setClusterIds(List<String> clusterIds) {
			this.clusterIds = clusterIds;
		}
	}

	public static class OpsBlackList {

		private String name;

		private List<String> zoneIds1;

		private List<String> regionIds2;

		private List<String> ncIps3;

		private List<String> instanceIds4;

		private List<String> clusterIds5;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getZoneIds1() {
			return this.zoneIds1;
		}

		public void setZoneIds1(List<String> zoneIds1) {
			this.zoneIds1 = zoneIds1;
		}

		public List<String> getRegionIds2() {
			return this.regionIds2;
		}

		public void setRegionIds2(List<String> regionIds2) {
			this.regionIds2 = regionIds2;
		}

		public List<String> getNcIps3() {
			return this.ncIps3;
		}

		public void setNcIps3(List<String> ncIps3) {
			this.ncIps3 = ncIps3;
		}

		public List<String> getInstanceIds4() {
			return this.instanceIds4;
		}

		public void setInstanceIds4(List<String> instanceIds4) {
			this.instanceIds4 = instanceIds4;
		}

		public List<String> getClusterIds5() {
			return this.clusterIds5;
		}

		public void setClusterIds5(List<String> clusterIds5) {
			this.clusterIds5 = clusterIds5;
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
