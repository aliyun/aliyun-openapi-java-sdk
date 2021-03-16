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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorExceptionResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorExceptionResponse.ExceptionEvent;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorExceptionResponse.OverviewInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryMonitorExceptionResponseUnmarshaller {

	public static OpsQueryMonitorExceptionResponse unmarshall(OpsQueryMonitorExceptionResponse opsQueryMonitorExceptionResponse, UnmarshallerContext _ctx) {
		
		opsQueryMonitorExceptionResponse.setRequestId(_ctx.stringValue("OpsQueryMonitorExceptionResponse.RequestId"));
		opsQueryMonitorExceptionResponse.setStartTime(_ctx.stringValue("OpsQueryMonitorExceptionResponse.StartTime"));
		opsQueryMonitorExceptionResponse.setEndTime(_ctx.stringValue("OpsQueryMonitorExceptionResponse.EndTime"));

		OverviewInfo overviewInfo = new OverviewInfo();
		overviewInfo.setVCpuCount(_ctx.integerValue("OpsQueryMonitorExceptionResponse.OverviewInfo.VCpuCount"));
		overviewInfo.setMachineId(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.MachineId"));
		overviewInfo.setNcIp(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.NcIp"));
		overviewInfo.setNcId(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.NcId"));
		overviewInfo.setMachineType(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.MachineType"));
		overviewInfo.setAZone(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.AZone"));
		overviewInfo.setInstanceFamily(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.InstanceFamily"));
		overviewInfo.setMachineStatus(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.MachineStatus"));
		overviewInfo.setCluster(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.Cluster"));
		overviewInfo.setExtInfo(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.ExtInfo"));
		overviewInfo.setIsLocalDisk(_ctx.booleanValue("OpsQueryMonitorExceptionResponse.OverviewInfo.IsLocalDisk"));
		overviewInfo.setVips(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.Vips"));
		overviewInfo.setRegionId(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.RegionId"));
		overviewInfo.setStressComparisionState(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.StressComparisionState"));
		overviewInfo.setStressComparisionResult(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.StressComparisionResult"));
		overviewInfo.setStressComparisionStartTime(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.StressComparisionStartTime"));
		overviewInfo.setStressComparisionTime(_ctx.integerValue("OpsQueryMonitorExceptionResponse.OverviewInfo.StressComparisionTime"));
		overviewInfo.setRiskTag(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.RiskTag"));
		overviewInfo.setProductName(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.ProductName"));
		overviewInfo.setMigrateStatus(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.MigrateStatus"));
		overviewInfo.setCanMigrateSla(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.CanMigrateSla"));
		overviewInfo.setCanMigrateBySlb(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.CanMigrateBySlb"));
		overviewInfo.setCanMigrateByType(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.CanMigrateByType"));
		overviewInfo.setCanMigrateByOthers(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.CanMigrateByOthers"));

		List<String> blackListInfo = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryMonitorExceptionResponse.OverviewInfo.BlackListInfo.Length"); i++) {
			blackListInfo.add(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.BlackListInfo["+ i +"]"));
		}
		overviewInfo.setBlackListInfo(blackListInfo);

		List<String> whiteListInfo = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryMonitorExceptionResponse.OverviewInfo.WhiteListInfo.Length"); i++) {
			whiteListInfo.add(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.WhiteListInfo["+ i +"]"));
		}
		overviewInfo.setWhiteListInfo(whiteListInfo);

		List<SnNodeInfo> snNodeInfoList = new ArrayList<SnNodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList.Length"); i++) {
			SnNodeInfo snNodeInfo = new SnNodeInfo();
			snNodeInfo.setNcId(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList["+ i +"].NcId"));
			snNodeInfo.setCnSn(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList["+ i +"].CnSn"));
			snNodeInfo.setMachineStatus(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList["+ i +"].MachineStatus"));
			snNodeInfo.setStressComparisionState(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList["+ i +"].StressComparisionState"));
			snNodeInfo.setStressComparisionResult(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList["+ i +"].StressComparisionResult"));
			snNodeInfo.setStressComparisionStartTime(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList["+ i +"].StressComparisionStartTime"));
			snNodeInfo.setStressComparisionTime(_ctx.integerValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList["+ i +"].StressComparisionTime"));
			snNodeInfo.setRiskTag(_ctx.stringValue("OpsQueryMonitorExceptionResponse.OverviewInfo.SnNodeInfoList["+ i +"].RiskTag"));

			snNodeInfoList.add(snNodeInfo);
		}
		overviewInfo.setSnNodeInfoList(snNodeInfoList);
		opsQueryMonitorExceptionResponse.setOverviewInfo(overviewInfo);

		List<ExceptionEvent> exceptionEvents = new ArrayList<ExceptionEvent>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryMonitorExceptionResponse.ExceptionEvents.Length"); i++) {
			ExceptionEvent exceptionEvent = new ExceptionEvent();
			exceptionEvent.setMachineId(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].MachineId"));
			exceptionEvent.setNcIp(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].NcIp"));
			exceptionEvent.setExceptionTime(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].ExceptionTime"));
			exceptionEvent.setLastExceptionTime(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].LastExceptionTime"));
			exceptionEvent.setExceptionType(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].ExceptionType"));
			exceptionEvent.setReason(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].Reason"));
			exceptionEvent.setExceptionName(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].ExceptionName"));
			exceptionEvent.setExceptionCondition(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].ExceptionCondition"));
			exceptionEvent.setExceptionCount(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].ExceptionCount"));
			exceptionEvent.setWarningLevel(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].WarningLevel"));
			exceptionEvent.setAdditionalInfo(_ctx.stringValue("OpsQueryMonitorExceptionResponse.ExceptionEvents["+ i +"].AdditionalInfo"));

			exceptionEvents.add(exceptionEvent);
		}
		opsQueryMonitorExceptionResponse.setExceptionEvents(exceptionEvents);
	 
	 	return opsQueryMonitorExceptionResponse;
	}
}