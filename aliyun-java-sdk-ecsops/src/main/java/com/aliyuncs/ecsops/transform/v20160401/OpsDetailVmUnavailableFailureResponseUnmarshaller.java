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
		opsDetailVmUnavailableFailureResponse.setPageNumber(_ctx.integerValue("OpsDetailVmUnavailableFailureResponse.PageNumber"));
		opsDetailVmUnavailableFailureResponse.setPageSize(_ctx.integerValue("OpsDetailVmUnavailableFailureResponse.PageSize"));

		List<DetailNc> detailImpactNcs = new ArrayList<DetailNc>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs.Length"); i++) {
			DetailNc detailNc = new DetailNc();
			detailNc.setNcIp(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].NcIp"));
			detailNc.setRegionId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].RegionId"));
			detailNc.setZoneId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].ZoneId"));
			detailNc.setClusterId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].ClusterId"));
			detailNc.setHouyiNcState(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].HouyiNcState"));
			detailNc.setPingState(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].PingState"));
			detailNc.setSshState(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].SshState"));
			detailNc.setIsLocalDisk(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].IsLocalDisk"));
			detailNc.setExceptionTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].ExceptionTime"));
			detailNc.setFirstExceptionTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].FirstExceptionTime"));
			detailNc.setRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].RecoverTime"));
			detailNc.setReason(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].Reason"));
			detailNc.setFailureTypes(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactNcs["+ i +"].FailureTypes"));

			detailImpactNcs.add(detailNc);
		}
		opsDetailVmUnavailableFailureResponse.setDetailImpactNcs(detailImpactNcs);

		List<DetailVm> detailImpactVms = new ArrayList<DetailVm>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms.Length"); i++) {
			DetailVm detailVm = new DetailVm();
			detailVm.setInstanceId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].InstanceId"));
			detailVm.setTag(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Tag"));
			detailVm.setVmCurrentNcIp(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].VmCurrentNcIp"));
			detailVm.setAliuid(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Aliuid"));
			detailVm.setBid(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Bid"));
			detailVm.setNcIp(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].NcIp"));
			detailVm.setCpu(_ctx.integerValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Cpu"));
			detailVm.setGcLevel(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].GcLevel"));
			detailVm.setClusterId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].ClusterId"));
			detailVm.setZoneId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].ZoneId"));
			detailVm.setRegionId(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].RegionId"));
			detailVm.setIdc(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Idc"));
			detailVm.setGocCores(_ctx.floatValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].GocCores"));
			detailVm.setVcpuMod(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].VcpuMod"));
			detailVm.setIsLocalDisk(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].IsLocalDisk"));
			detailVm.setInstanceType(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].InstanceType"));
			detailVm.setHouyiVmState(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].HouyiVmState"));
			detailVm.setIsVmDownRecover(_ctx.booleanValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].IsVmDownRecover"));
			detailVm.setNetworkState(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].NetworkState"));
			detailVm.setStorageState(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].StorageState"));
			detailVm.setExceptionTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].ExceptionTime"));
			detailVm.setFirstExceptionTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].FirstExceptionTime"));
			detailVm.setMigrateRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].MigrateRecoverTime"));
			detailVm.setNetworkRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].NetworkRecoverTime"));
			detailVm.setStorageRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].StorageRecoverTime"));
			detailVm.setOverallRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].OverallRecoverTime"));
			detailVm.setControllerRecoverTime(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].ControllerRecoverTime"));
			detailVm.setReason(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].Reason"));
			detailVm.setFailureTypes(_ctx.stringValue("OpsDetailVmUnavailableFailureResponse.DetailImpactVms["+ i +"].FailureTypes"));

			detailImpactVms.add(detailVm);
		}
		opsDetailVmUnavailableFailureResponse.setDetailImpactVms(detailImpactVms);
	 
	 	return opsDetailVmUnavailableFailureResponse;
	}
}