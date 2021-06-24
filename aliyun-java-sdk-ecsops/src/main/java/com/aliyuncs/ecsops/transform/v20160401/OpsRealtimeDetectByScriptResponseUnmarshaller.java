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

import com.aliyuncs.ecsops.model.v20160401.OpsRealtimeDetectByScriptResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsRealtimeDetectByScriptResponse.DetectResult;
import com.aliyuncs.ecsops.model.v20160401.OpsRealtimeDetectByScriptResponse.DetectResult.DetectItem;
import com.aliyuncs.ecsops.model.v20160401.OpsRealtimeDetectByScriptResponse.OverviewInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsRealtimeDetectByScriptResponseUnmarshaller {

	public static OpsRealtimeDetectByScriptResponse unmarshall(OpsRealtimeDetectByScriptResponse opsRealtimeDetectByScriptResponse, UnmarshallerContext _ctx) {
		
		opsRealtimeDetectByScriptResponse.setRequestId(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.RequestId"));
		opsRealtimeDetectByScriptResponse.setEndTime(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.EndTime"));
		opsRealtimeDetectByScriptResponse.setStartTime(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.StartTime"));

		OverviewInfo overviewInfo = new OverviewInfo();
		overviewInfo.setNcIp(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.NcIp"));
		overviewInfo.setMachineStatus(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.MachineStatus"));
		overviewInfo.setStressComparisionStartTime(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.StressComparisionStartTime"));
		overviewInfo.setCanMigrateSla(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.CanMigrateSla"));
		overviewInfo.setVips(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.Vips"));
		overviewInfo.setIsLocalDisk(_ctx.booleanValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.IsLocalDisk"));
		overviewInfo.setStressComparisionResult(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.StressComparisionResult"));
		overviewInfo.setExtension(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.Extension"));
		overviewInfo.setStressComparisionState(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.StressComparisionState"));
		overviewInfo.setProductName(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.ProductName"));
		overviewInfo.setMachineType(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.MachineType"));
		overviewInfo.setAliUid(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.AliUid"));
		overviewInfo.setHostname(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.Hostname"));
		overviewInfo.setAvailableZone(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.AvailableZone"));
		overviewInfo.setStressComparisionTime(_ctx.integerValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.StressComparisionTime"));
		overviewInfo.setInstanceType(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.InstanceType"));
		overviewInfo.setIntranetIp(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.IntranetIp"));
		overviewInfo.setRegionId(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.RegionId"));
		overviewInfo.setCanMigrateBySlb(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.CanMigrateBySlb"));
		overviewInfo.setRiskTag(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.RiskTag"));
		overviewInfo.setClusterName(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.ClusterName"));
		overviewInfo.setCanMigrateByType(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.CanMigrateByType"));
		overviewInfo.setCpuCoreCount(_ctx.integerValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.CpuCoreCount"));
		overviewInfo.setMigrateStatus(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.MigrateStatus"));
		overviewInfo.setCanMigrateByOthers(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.CanMigrateByOthers"));
		overviewInfo.setMachineId(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.MachineId"));

		List<SnNodeInfo> snNodeInfoList = new ArrayList<SnNodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList.Length"); i++) {
			SnNodeInfo snNodeInfo = new SnNodeInfo();
			snNodeInfo.setNcId(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList["+ i +"].NcId"));
			snNodeInfo.setStressComparisionResult(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList["+ i +"].StressComparisionResult"));
			snNodeInfo.setStressComparisionStartTime(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList["+ i +"].StressComparisionStartTime"));
			snNodeInfo.setStressComparisionState(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList["+ i +"].StressComparisionState"));
			snNodeInfo.setRiskTag(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList["+ i +"].RiskTag"));
			snNodeInfo.setStressComparisionTime(_ctx.integerValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList["+ i +"].StressComparisionTime"));
			snNodeInfo.setMachineStatus(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList["+ i +"].MachineStatus"));
			snNodeInfo.setCnSn(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.OverviewInfo.SnNodeInfoList["+ i +"].CnSn"));

			snNodeInfoList.add(snNodeInfo);
		}
		overviewInfo.setSnNodeInfoList(snNodeInfoList);
		opsRealtimeDetectByScriptResponse.setOverviewInfo(overviewInfo);

		List<DetectResult> detectResults = new ArrayList<DetectResult>();
		for (int i = 0; i < _ctx.lengthValue("OpsRealtimeDetectByScriptResponse.DetectResults.Length"); i++) {
			DetectResult detectResult = new DetectResult();
			detectResult.setStatus(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].Status"));
			detectResult.setConfigName(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].ConfigName"));
			detectResult.setTaskUid(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].TaskUid"));
			detectResult.setGroupName(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].GroupName"));
			detectResult.setSuccess(_ctx.booleanValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].Success"));
			detectResult.setMessage(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].Message"));

			List<DetectItem> detectItems = new ArrayList<DetectItem>();
			for (int j = 0; j < _ctx.lengthValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].DetectItems.Length"); j++) {
				DetectItem detectItem = new DetectItem();
				detectItem.setStatus(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].DetectItems["+ j +"].Status"));
				detectItem.setItemName(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].DetectItems["+ j +"].ItemName"));
				detectItem.setMessage(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].DetectItems["+ j +"].Message"));
				detectItem.setFixScript(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].DetectItems["+ j +"].FixScript"));
				detectItem.setLogFile(_ctx.stringValue("OpsRealtimeDetectByScriptResponse.DetectResults["+ i +"].DetectItems["+ j +"].LogFile"));

				detectItems.add(detectItem);
			}
			detectResult.setDetectItems(detectItems);

			detectResults.add(detectResult);
		}
		opsRealtimeDetectByScriptResponse.setDetectResults(detectResults);
	 
	 	return opsRealtimeDetectByScriptResponse;
	}
}