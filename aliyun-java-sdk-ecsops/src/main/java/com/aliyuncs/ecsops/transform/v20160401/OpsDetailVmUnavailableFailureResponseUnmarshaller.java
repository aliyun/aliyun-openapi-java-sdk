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

import com.aliyuncs.ecsops.model.v20160401.OpsDetailVmUnavailableFailureResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailVmUnavailableFailureResponse.DetailNc;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailVmUnavailableFailureResponse.DetailVm;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDetailVmUnavailableFailureResponseUnmarshaller {

	public static OpsDetailVmUnavailableFailureResponse unmarshall(OpsDetailVmUnavailableFailureResponse opsDetailVmUnavailableFailureResponse, UnmarshallerContext _ctx) {
		
		opsDetailVmUnavailableFailureResponse.setRequestId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.RequestId"));
		opsDetailVmUnavailableFailureResponse.setTotalCnt(_ctx.integerValue("OpsDetailVmUnavailableFailureResponse.TotalCnt"));
		opsDetailVmUnavailableFailureResponse.setPageSize(_ctx.integerValue("OpsDetailVmUnavailableFailureResponse.PageSize"));
		opsDetailVmUnavailableFailureResponse.setPageNumber(_ctx.integerValue("OpsDetailVmUnavailableFailureResponse.PageNumber"));

		List<DetailVm> detailImpactVms = new ArrayList<DetailVm>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms.Length"); i++) {
			DetailVm detailVm = new DetailVm();
			detailVm.setGcLevel(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].GcLevel"));
			detailVm.setControllerRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].ControllerRecoverTime"));
			detailVm.setFirstExceptionTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].FirstExceptionTime"));
			detailVm.setIsVmDownRecover(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].IsVmDownRecover"));
			detailVm.setTag(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Tag"));
			detailVm.setNcIp(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].NcIp"));
			detailVm.setBid(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Bid"));
			detailVm.setGocCores(_ctx.floatValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].GocCores"));
			detailVm.setMigrateRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].MigrateRecoverTime"));
			detailVm.setNetworkRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].NetworkRecoverTime"));
			detailVm.setExceptionTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].ExceptionTime"));
			detailVm.setIsLocalDisk(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].IsLocalDisk"));
			detailVm.setIdc(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Idc"));
			detailVm.setClusterId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].ClusterId"));
			detailVm.setAliuid(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Aliuid"));
			detailVm.setStorageState(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].StorageState"));
			detailVm.setFailureTypes(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].FailureTypes"));
			detailVm.setInstanceId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].InstanceId"));
			detailVm.setOverallRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].OverallRecoverTime"));
			detailVm.setInstanceType(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].InstanceType"));
			detailVm.setRegionId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].RegionId"));
			detailVm.setStorageRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].StorageRecoverTime"));
			detailVm.setCpu(_ctx.integerValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Cpu"));
			detailVm.setHouyiVmState(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].HouyiVmState"));
			detailVm.setZoneId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].ZoneId"));
			detailVm.setNetworkState(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].NetworkState"));
			detailVm.setVcpuMod(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].VcpuMod"));
			detailVm.setVmCurrentNcIp(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].VmCurrentNcIp"));
			detailVm.setReason(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Reason"));
			detailVm.setAliProductName(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].AliProductName"));

			detailImpactVms.add(detailVm);
		}
		opsDetailVmUnavailableFailureResponse.setDetailImpactVms(detailImpactVms);

		List<DetailNc> detailImpactNcs = new ArrayList<DetailNc>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs.Length"); i++) {
			DetailNc detailNc = new DetailNc();
			detailNc.setSshState(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].SshState"));
			detailNc.setRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].RecoverTime"));
			detailNc.setFirstExceptionTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].FirstExceptionTime"));
			detailNc.setFailureTypes(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].FailureTypes"));
			detailNc.setNcIp(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].NcIp"));
			detailNc.setHouyiNcState(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].HouyiNcState"));
			detailNc.setRegionId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].RegionId"));
			detailNc.setZoneId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].ZoneId"));
			detailNc.setExceptionTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].ExceptionTime"));
			detailNc.setPingState(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].PingState"));
			detailNc.setIsLocalDisk(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].IsLocalDisk"));
			detailNc.setReason(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].Reason"));
			detailNc.setClusterId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].ClusterId"));

			detailImpactNcs.add(detailNc);
		}
		opsDetailVmUnavailableFailureResponse.setDetailImpactNcs(detailImpactNcs);
	 
	 	return opsDetailVmUnavailableFailureResponse;
	}
}