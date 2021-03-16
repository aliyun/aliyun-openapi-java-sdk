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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryGlobalBlackListAlarmCenterResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryGlobalBlackListAlarmCenterResponseUnmarshaller {

	public static OpsQueryGlobalBlackListAlarmCenterResponse unmarshall(OpsQueryGlobalBlackListAlarmCenterResponse opsQueryGlobalBlackListAlarmCenterResponse, UnmarshallerContext _ctx) {
		

		MonitorBlackList monitorBlackList = new MonitorBlackList();
		monitorBlackList.setName(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.Name"));

		List<String> zoneIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.ZoneIds.Length"); i++) {
			zoneIds.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.ZoneIds["+ i +"]"));
		}
		monitorBlackList.setZoneIds(zoneIds);

		List<String> regionIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.RegionIds.Length"); i++) {
			regionIds.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.RegionIds["+ i +"]"));
		}
		monitorBlackList.setRegionIds(regionIds);

		List<String> ncIps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.NcIps.Length"); i++) {
			ncIps.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.NcIps["+ i +"]"));
		}
		monitorBlackList.setNcIps(ncIps);

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.InstanceIds["+ i +"]"));
		}
		monitorBlackList.setInstanceIds(instanceIds);

		List<String> clusterIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.ClusterIds.Length"); i++) {
			clusterIds.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.MonitorBlackList.ClusterIds["+ i +"]"));
		}
		monitorBlackList.setClusterIds(clusterIds);
		opsQueryGlobalBlackListAlarmCenterResponse.setMonitorBlackList(monitorBlackList);

		OpsBlackList opsBlackList = new OpsBlackList();
		opsBlackList.setName(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.Name"));

		List<String> zoneIds1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.ZoneIds.Length"); i++) {
			zoneIds1.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.ZoneIds["+ i +"]"));
		}
		opsBlackList.setZoneIds1(zoneIds1);

		List<String> regionIds2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.RegionIds.Length"); i++) {
			regionIds2.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.RegionIds["+ i +"]"));
		}
		opsBlackList.setRegionIds2(regionIds2);

		List<String> ncIps3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.NcIps.Length"); i++) {
			ncIps3.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.NcIps["+ i +"]"));
		}
		opsBlackList.setNcIps3(ncIps3);

		List<String> instanceIds4 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.InstanceIds.Length"); i++) {
			instanceIds4.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.InstanceIds["+ i +"]"));
		}
		opsBlackList.setInstanceIds4(instanceIds4);

		List<String> clusterIds5 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.ClusterIds.Length"); i++) {
			clusterIds5.add(_ctx.stringValue("OpsQueryGlobalBlackListAlarmCenterResponse.OpsBlackList.ClusterIds["+ i +"]"));
		}
		opsBlackList.setClusterIds5(clusterIds5);
		opsQueryGlobalBlackListAlarmCenterResponse.setOpsBlackList(opsBlackList);
	 
	 	return opsQueryGlobalBlackListAlarmCenterResponse;
	}
}