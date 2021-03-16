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
		opsDetailNcResponse.setCode(_ctx.stringValue("OpsDetailNcResponse.Code"));
		opsDetailNcResponse.setMessage(_ctx.stringValue("OpsDetailNcResponse.Message"));
		opsDetailNcResponse.setSuccess(_ctx.stringValue("OpsDetailNcResponse.Success"));
		opsDetailNcResponse.setNcId(_ctx.stringValue("OpsDetailNcResponse.NcId"));
		opsDetailNcResponse.setNcIp(_ctx.stringValue("OpsDetailNcResponse.NcIp"));
		opsDetailNcResponse.setSn(_ctx.stringValue("OpsDetailNcResponse.Sn"));
		opsDetailNcResponse.setHouyiZoneNo(_ctx.stringValue("OpsDetailNcResponse.HouyiZoneNo"));
		opsDetailNcResponse.setHouyiClusterNo(_ctx.stringValue("OpsDetailNcResponse.HouyiClusterNo"));
		opsDetailNcResponse.setRackId(_ctx.stringValue("OpsDetailNcResponse.RackId"));
		opsDetailNcResponse.setTotalCpu(_ctx.integerValue("OpsDetailNcResponse.TotalCpu"));
		opsDetailNcResponse.setTotalMem(_ctx.integerValue("OpsDetailNcResponse.TotalMem"));
		opsDetailNcResponse.setAvailableCpu(_ctx.integerValue("OpsDetailNcResponse.AvailableCpu"));
		opsDetailNcResponse.setAvailableMem(_ctx.integerValue("OpsDetailNcResponse.AvailableMem"));
		opsDetailNcResponse.setTotalDiskIo1(_ctx.integerValue("OpsDetailNcResponse.TotalDiskIo1"));
		opsDetailNcResponse.setTotalDiskIo2(_ctx.integerValue("OpsDetailNcResponse.TotalDiskIo2"));
		opsDetailNcResponse.setAvaliableDiskIo1(_ctx.integerValue("OpsDetailNcResponse.AvaliableDiskIo1"));
		opsDetailNcResponse.setAvaliableDiskIo2(_ctx.integerValue("OpsDetailNcResponse.AvaliableDiskIo2"));
		opsDetailNcResponse.setTotalEcu(_ctx.integerValue("OpsDetailNcResponse.TotalEcu"));
		opsDetailNcResponse.setAvaliableEcu(_ctx.integerValue("OpsDetailNcResponse.AvaliableEcu"));
		opsDetailNcResponse.setTotalGpu(_ctx.integerValue("OpsDetailNcResponse.TotalGpu"));
		opsDetailNcResponse.setAvaliableGpu(_ctx.integerValue("OpsDetailNcResponse.AvaliableGpu"));
		opsDetailNcResponse.setTotalBps(_ctx.longValue("OpsDetailNcResponse.TotalBps"));
		opsDetailNcResponse.setAvailableBps(_ctx.longValue("OpsDetailNcResponse.AvailableBps"));
		opsDetailNcResponse.setTotalPps(_ctx.longValue("OpsDetailNcResponse.TotalPps"));
		opsDetailNcResponse.setAvailablePps(_ctx.longValue("OpsDetailNcResponse.AvailablePps"));
		opsDetailNcResponse.setRealCpu(_ctx.integerValue("OpsDetailNcResponse.RealCpu"));
		opsDetailNcResponse.setRealEcu(_ctx.integerValue("OpsDetailNcResponse.RealEcu"));
		opsDetailNcResponse.setNcType(_ctx.stringValue("OpsDetailNcResponse.NcType"));
		opsDetailNcResponse.setCpuModel(_ctx.stringValue("OpsDetailNcResponse.CpuModel"));
		opsDetailNcResponse.setPodId(_ctx.stringValue("OpsDetailNcResponse.PodId"));
		opsDetailNcResponse.setAswId(_ctx.stringValue("OpsDetailNcResponse.AswId"));
		opsDetailNcResponse.setCanRecover(_ctx.booleanValue("OpsDetailNcResponse.CanRecover"));
		opsDetailNcResponse.setHostname(_ctx.stringValue("OpsDetailNcResponse.Hostname"));
		opsDetailNcResponse.setNcVirtVersion(_ctx.stringValue("OpsDetailNcResponse.NcVirtVersion"));
		opsDetailNcResponse.setLockType(_ctx.stringValue("OpsDetailNcResponse.LockType"));
		opsDetailNcResponse.setLockReason(_ctx.stringValue("OpsDetailNcResponse.LockReason"));
		opsDetailNcResponse.setBizStatus(_ctx.stringValue("OpsDetailNcResponse.BizStatus"));
		opsDetailNcResponse.setStatus(_ctx.stringValue("OpsDetailNcResponse.Status"));
		opsDetailNcResponse.setGrayBizType(_ctx.stringValue("OpsDetailNcResponse.GrayBizType"));
		opsDetailNcResponse.setGrayBizTagA(_ctx.stringValue("OpsDetailNcResponse.GrayBizTagA"));
		opsDetailNcResponse.setNcResourceType(_ctx.stringValue("OpsDetailNcResponse.NcResourceType"));
		opsDetailNcResponse.setDedicatedHostId(_ctx.stringValue("OpsDetailNcResponse.DedicatedHostId"));

		List<VmInfo> vmInfos = new ArrayList<VmInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailNcResponse.VmInfos.Length"); i++) {
			VmInfo vmInfo = new VmInfo();
			vmInfo.setInstanceId(_ctx.stringValue("OpsDetailNcResponse.VmInfos["+ i +"].InstanceId"));
			vmInfo.setHostName(_ctx.stringValue("OpsDetailNcResponse.VmInfos["+ i +"].HostName"));
			vmInfo.setEcsInstanceStatus(_ctx.stringValue("OpsDetailNcResponse.VmInfos["+ i +"].EcsInstanceStatus"));
			vmInfo.setExpectStatus(_ctx.stringValue("OpsDetailNcResponse.VmInfos["+ i +"].ExpectStatus"));

			vmInfos.add(vmInfo);
		}
		opsDetailNcResponse.setVmInfos(vmInfos);
	 
	 	return opsDetailNcResponse;
	}
}