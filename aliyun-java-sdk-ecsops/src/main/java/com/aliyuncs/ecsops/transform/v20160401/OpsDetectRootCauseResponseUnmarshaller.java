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

import com.aliyuncs.ecsops.model.v20160401.OpsDetectRootCauseResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDetectRootCauseResponse.ExceptionEvent;
import com.aliyuncs.ecsops.model.v20160401.OpsDetectRootCauseResponse.KeyExceptionEvent;
import com.aliyuncs.ecsops.model.v20160401.OpsDetectRootCauseResponse.OverviewInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsDetectRootCauseResponse.RootCause;
import com.aliyuncs.ecsops.model.v20160401.OpsDetectRootCauseResponse.RootCause.SnNodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDetectRootCauseResponseUnmarshaller {

	public static OpsDetectRootCauseResponse unmarshall(OpsDetectRootCauseResponse opsDetectRootCauseResponse, UnmarshallerContext _ctx) {
		
		opsDetectRootCauseResponse.setRequestId(_ctx.stringValue("OpsDetectRootCauseResponse.RequestId"));
		opsDetectRootCauseResponse.setEndTime(_ctx.stringValue("OpsDetectRootCauseResponse.EndTime"));
		opsDetectRootCauseResponse.setStartTime(_ctx.stringValue("OpsDetectRootCauseResponse.StartTime"));

		RootCause rootCause = new RootCause();
		rootCause.setStressComparisionResult(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.StressComparisionResult"));
		rootCause.setStressComparisionState(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.StressComparisionState"));
		rootCause.setAZone(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.AZone"));
		rootCause.setMessage(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.Message"));
		rootCause.setNcIp(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.NcIp"));
		rootCause.setAdditionalInfo(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.AdditionalInfo"));
		rootCause.setStressComparisionTime(_ctx.integerValue("OpsDetectRootCauseResponse.RootCause.StressComparisionTime"));
		rootCause.setDesc(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.Desc"));
		rootCause.setCnSn(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.CnSn"));
		rootCause.setNcId(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.NcId"));
		rootCause.setStressComparisionStartTime(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.StressComparisionStartTime"));
		rootCause.setRiskTag(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.RiskTag"));
		rootCause.setWarningLevel(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.WarningLevel"));
		rootCause.setExceptionTime(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.ExceptionTime"));
		rootCause.setExceptionName(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.ExceptionName"));
		rootCause.setReason(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.Reason"));
		rootCause.setMachineId(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.MachineId"));

		List<String> supportTeams = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetectRootCauseResponse.RootCause.SupportTeams.Length"); i++) {
			supportTeams.add(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.SupportTeams["+ i +"]"));
		}
		rootCause.setSupportTeams(supportTeams);

		List<SnNodeInfo> snNodeInfoList = new ArrayList<SnNodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetectRootCauseResponse.RootCause.SnNodeInfoList.Length"); i++) {
			SnNodeInfo snNodeInfo = new SnNodeInfo();
			snNodeInfo.setNcId(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.SnNodeInfoList["+ i +"].NcId"));
			snNodeInfo.setStressComparisionResult(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.SnNodeInfoList["+ i +"].StressComparisionResult"));
			snNodeInfo.setStressComparisionStartTime(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.SnNodeInfoList["+ i +"].StressComparisionStartTime"));
			snNodeInfo.setStressComparisionState(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.SnNodeInfoList["+ i +"].StressComparisionState"));
			snNodeInfo.setRiskTag(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.SnNodeInfoList["+ i +"].RiskTag"));
			snNodeInfo.setStressComparisionTime(_ctx.integerValue("OpsDetectRootCauseResponse.RootCause.SnNodeInfoList["+ i +"].StressComparisionTime"));
			snNodeInfo.setCnSn(_ctx.stringValue("OpsDetectRootCauseResponse.RootCause.SnNodeInfoList["+ i +"].CnSn"));

			snNodeInfoList.add(snNodeInfo);
		}
		rootCause.setSnNodeInfoList(snNodeInfoList);
		opsDetectRootCauseResponse.setRootCause(rootCause);

		OverviewInfo overviewInfo = new OverviewInfo();
		overviewInfo.setExtension(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.Extension"));
		overviewInfo.setAZone(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.AZone"));
		overviewInfo.setAliUid(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.AliUid"));
		overviewInfo.setHostname(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.Hostname"));
		overviewInfo.setVCpuCount(_ctx.integerValue("OpsDetectRootCauseResponse.OverviewInfo.VCpuCount"));
		overviewInfo.setNcIp(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.NcIp"));
		overviewInfo.setInstanceType(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.InstanceType"));
		overviewInfo.setIntranetIp(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.IntranetIp"));
		overviewInfo.setCnSn(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.CnSn"));
		overviewInfo.setNcId(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.NcId"));
		overviewInfo.setRegion(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.Region"));
		overviewInfo.setMachineId(_ctx.stringValue("OpsDetectRootCauseResponse.OverviewInfo.MachineId"));
		opsDetectRootCauseResponse.setOverviewInfo(overviewInfo);

		List<ExceptionEvent> exceptionEvents = new ArrayList<ExceptionEvent>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetectRootCauseResponse.ExceptionEvents.Length"); i++) {
			ExceptionEvent exceptionEvent = new ExceptionEvent();
			exceptionEvent.setExceptionType(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].ExceptionType"));
			exceptionEvent.setMessage(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].Message"));
			exceptionEvent.setNcIp(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].NcIp"));
			exceptionEvent.setInstanceType(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].InstanceType"));
			exceptionEvent.setCnSn(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].CnSn"));
			exceptionEvent.setDesc(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].Desc"));
			exceptionEvent.setNcId(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].NcId"));
			exceptionEvent.setWarningLevel(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].WarningLevel"));
			exceptionEvent.setExceptionTime(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].ExceptionTime"));
			exceptionEvent.setExceptionName(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].ExceptionName"));
			exceptionEvent.setMachineId(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].MachineId"));
			exceptionEvent.setReason(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].Reason"));

			List<String> responseTeams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].ResponseTeams.Length"); j++) {
				responseTeams.add(_ctx.stringValue("OpsDetectRootCauseResponse.ExceptionEvents["+ i +"].ResponseTeams["+ j +"]"));
			}
			exceptionEvent.setResponseTeams(responseTeams);

			exceptionEvents.add(exceptionEvent);
		}
		opsDetectRootCauseResponse.setExceptionEvents(exceptionEvents);

		List<KeyExceptionEvent> keyExceptionEvents = new ArrayList<KeyExceptionEvent>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetectRootCauseResponse.KeyExceptionEvents.Length"); i++) {
			KeyExceptionEvent keyExceptionEvent = new KeyExceptionEvent();
			keyExceptionEvent.setStartTime(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].StartTime"));
			keyExceptionEvent.setExceptionType(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].ExceptionType"));
			keyExceptionEvent.setWarningLevel(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].WarningLevel"));
			keyExceptionEvent.setMessage(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].Message"));
			keyExceptionEvent.setLastExceptionTime(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].LastExceptionTime"));
			keyExceptionEvent.setNcIp(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].NcIp"));
			keyExceptionEvent.setExceptionName(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].ExceptionName"));
			keyExceptionEvent.setReason(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].Reason"));
			keyExceptionEvent.setMachineId(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].MachineId"));
			keyExceptionEvent.setDesc(_ctx.stringValue("OpsDetectRootCauseResponse.KeyExceptionEvents["+ i +"].Desc"));

			keyExceptionEvents.add(keyExceptionEvent);
		}
		opsDetectRootCauseResponse.setKeyExceptionEvents(keyExceptionEvents);
	 
	 	return opsDetectRootCauseResponse;
	}
}