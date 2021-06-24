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

import com.aliyuncs.ecsops.model.v20160401.OpsDetailNcResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailNcResponse.VmInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDetailNcResponseUnmarshaller {

	public static OpsDetailNcResponse unmarshall(OpsDetailNcResponse opsDetailNcResponse, UnmarshallerContext _ctx) {
		
		opsDetailNcResponse.setRequestId(_ctx.stringValue("OpsDetailNcResponse.RequestId"));
		opsDetailNcResponse.setRackId(_ctx.stringValue("OpsDetailNcResponse.RackId"));
		opsDetailNcResponse.setCpuModel(_ctx.stringValue("OpsDetailNcResponse.CpuModel"));
		opsDetailNcResponse.setDedicatedHostId(_ctx.stringValue("OpsDetailNcResponse.DedicatedHostId"));
		opsDetailNcResponse.setAvaliableDiskIo2(_ctx.integerValue("OpsDetailNcResponse.AvaliableDiskIo2"));
		opsDetailNcResponse.setAvaliableGpu(_ctx.integerValue("OpsDetailNcResponse.AvaliableGpu"));
		opsDetailNcResponse.setMessage(_ctx.stringValue("OpsDetailNcResponse.Message"));
		opsDetailNcResponse.setAvaliableDiskIo1(_ctx.integerValue("OpsDetailNcResponse.AvaliableDiskIo1"));
		opsDetailNcResponse.setAvailablePps(_ctx.longValue("OpsDetailNcResponse.AvailablePps"));
		opsDetailNcResponse.setLockType(_ctx.stringValue("OpsDetailNcResponse.LockType"));
		opsDetailNcResponse.setSuccess(_ctx.stringValue("OpsDetailNcResponse.Success"));
		opsDetailNcResponse.setGrayBizType(_ctx.stringValue("OpsDetailNcResponse.GrayBizType"));
		opsDetailNcResponse.setNcVirtVersion(_ctx.stringValue("OpsDetailNcResponse.NcVirtVersion"));
		opsDetailNcResponse.setTotalBps(_ctx.longValue("OpsDetailNcResponse.TotalBps"));
		opsDetailNcResponse.setDragonboxNc(_ctx.stringValue("OpsDetailNcResponse.DragonboxNc"));
		opsDetailNcResponse.setTotalCpu(_ctx.integerValue("OpsDetailNcResponse.TotalCpu"));
		opsDetailNcResponse.setRealEcu(_ctx.integerValue("OpsDetailNcResponse.RealEcu"));
		opsDetailNcResponse.setTotalGpu(_ctx.integerValue("OpsDetailNcResponse.TotalGpu"));
		opsDetailNcResponse.setNcType(_ctx.stringValue("OpsDetailNcResponse.NcType"));
		opsDetailNcResponse.setHouyiZoneNo(_ctx.stringValue("OpsDetailNcResponse.HouyiZoneNo"));
		opsDetailNcResponse.setLockReason(_ctx.stringValue("OpsDetailNcResponse.LockReason"));
		opsDetailNcResponse.setTotalPps(_ctx.longValue("OpsDetailNcResponse.TotalPps"));
		opsDetailNcResponse.setStatus(_ctx.stringValue("OpsDetailNcResponse.Status"));
		opsDetailNcResponse.setTotalMem(_ctx.integerValue("OpsDetailNcResponse.TotalMem"));
		opsDetailNcResponse.setTotalEcu(_ctx.integerValue("OpsDetailNcResponse.TotalEcu"));
		opsDetailNcResponse.setTotalDiskIo1(_ctx.integerValue("OpsDetailNcResponse.TotalDiskIo1"));
		opsDetailNcResponse.setHostname(_ctx.stringValue("OpsDetailNcResponse.Hostname"));
		opsDetailNcResponse.setTotalDiskIo2(_ctx.integerValue("OpsDetailNcResponse.TotalDiskIo2"));
		opsDetailNcResponse.setAswId(_ctx.stringValue("OpsDetailNcResponse.AswId"));
		opsDetailNcResponse.setRealCpu(_ctx.integerValue("OpsDetailNcResponse.RealCpu"));
		opsDetailNcResponse.setCode(_ctx.stringValue("OpsDetailNcResponse.Code"));
		opsDetailNcResponse.setAvailableMem(_ctx.integerValue("OpsDetailNcResponse.AvailableMem"));
		opsDetailNcResponse.setBizStatus(_ctx.stringValue("OpsDetailNcResponse.BizStatus"));
		opsDetailNcResponse.setGrayBizTagA(_ctx.stringValue("OpsDetailNcResponse.GrayBizTagA"));
		opsDetailNcResponse.setCanRecover(_ctx.booleanValue("OpsDetailNcResponse.CanRecover"));
		opsDetailNcResponse.setNcId(_ctx.stringValue("OpsDetailNcResponse.NcId"));
		opsDetailNcResponse.setHouyiClusterNo(_ctx.stringValue("OpsDetailNcResponse.HouyiClusterNo"));
		opsDetailNcResponse.setNcIp(_ctx.stringValue("OpsDetailNcResponse.NcIp"));
		opsDetailNcResponse.setPodId(_ctx.stringValue("OpsDetailNcResponse.PodId"));
		opsDetailNcResponse.setSn(_ctx.stringValue("OpsDetailNcResponse.Sn"));
		opsDetailNcResponse.setNcResourceType(_ctx.stringValue("OpsDetailNcResponse.NcResourceType"));
		opsDetailNcResponse.setAvailableBps(_ctx.longValue("OpsDetailNcResponse.AvailableBps"));
		opsDetailNcResponse.setAvailableCpu(_ctx.integerValue("OpsDetailNcResponse.AvailableCpu"));
		opsDetailNcResponse.setAvaliableEcu(_ctx.integerValue("OpsDetailNcResponse.AvaliableEcu"));

		List<VmInfo> vmInfos = new ArrayList<VmInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailNcResponse.VmInfos.Length"); i++) {
			VmInfo vmInfo = new VmInfo();
			vmInfo.setExpectStatus(_ctx.stringValue("OpsDetailNcResponse.VmInfos["+ i +"].ExpectStatus"));
			vmInfo.setHostName(_ctx.stringValue("OpsDetailNcResponse.VmInfos["+ i +"].HostName"));
			vmInfo.setInstanceId(_ctx.stringValue("OpsDetailNcResponse.VmInfos["+ i +"].InstanceId"));
			vmInfo.setEcsInstanceStatus(_ctx.stringValue("OpsDetailNcResponse.VmInfos["+ i +"].EcsInstanceStatus"));

			vmInfos.add(vmInfo);
		}
		opsDetailNcResponse.setVmInfos(vmInfos);
	 
	 	return opsDetailNcResponse;
	}
}