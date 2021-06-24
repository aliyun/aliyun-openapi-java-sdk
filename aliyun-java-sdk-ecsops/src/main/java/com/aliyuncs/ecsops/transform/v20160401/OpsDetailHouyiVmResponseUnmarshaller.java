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

import com.aliyuncs.ecsops.model.v20160401.OpsDetailHouyiVmResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailHouyiVmResponse.Eip;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailHouyiVmResponse.Group;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailHouyiVmResponse.VmImage;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailHouyiVmResponse.VmPublicIp;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailHouyiVmResponse.VmStatusNote;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDetailHouyiVmResponseUnmarshaller {

	public static OpsDetailHouyiVmResponse unmarshall(OpsDetailHouyiVmResponse opsDetailHouyiVmResponse, UnmarshallerContext _ctx) {
		
		opsDetailHouyiVmResponse.setRequestId(_ctx.stringValue("OpsDetailHouyiVmResponse.RequestId"));
		opsDetailHouyiVmResponse.setRackId(_ctx.stringValue("OpsDetailHouyiVmResponse.RackId"));
		opsDetailHouyiVmResponse.setVlanNo(_ctx.stringValue("OpsDetailHouyiVmResponse.VlanNo"));
		opsDetailHouyiVmResponse.setVncPort(_ctx.integerValue("OpsDetailHouyiVmResponse.VncPort"));
		opsDetailHouyiVmResponse.setIntensiveIo(_ctx.integerValue("OpsDetailHouyiVmResponse.IntensiveIo"));
		opsDetailHouyiVmResponse.setVmPlatform(_ctx.stringValue("OpsDetailHouyiVmResponse.VmPlatform"));
		opsDetailHouyiVmResponse.setVmAliIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmAliIp"));
		opsDetailHouyiVmResponse.setVgwVip(_ctx.stringValue("OpsDetailHouyiVmResponse.VgwVip"));
		opsDetailHouyiVmResponse.setGateway(_ctx.stringValue("OpsDetailHouyiVmResponse.Gateway"));
		opsDetailHouyiVmResponse.setIntensiveCpu(_ctx.integerValue("OpsDetailHouyiVmResponse.IntensiveCpu"));
		opsDetailHouyiVmResponse.setIntensiveNet(_ctx.integerValue("OpsDetailHouyiVmResponse.IntensiveNet"));
		opsDetailHouyiVmResponse.setVpcSubnetId(_ctx.stringValue("OpsDetailHouyiVmResponse.VpcSubnetId"));
		opsDetailHouyiVmResponse.setVmBps(_ctx.integerValue("OpsDetailHouyiVmResponse.VmBps"));
		opsDetailHouyiVmResponse.setVmCores(_ctx.integerValue("OpsDetailHouyiVmResponse.VmCores"));
		opsDetailHouyiVmResponse.setStorageNetworkType(_ctx.stringValue("OpsDetailHouyiVmResponse.StorageNetworkType"));
		opsDetailHouyiVmResponse.setClusterId(_ctx.stringValue("OpsDetailHouyiVmResponse.ClusterId"));
		opsDetailHouyiVmResponse.setSecurityGroupId(_ctx.stringValue("OpsDetailHouyiVmResponse.SecurityGroupId"));
		opsDetailHouyiVmResponse.setVmName(_ctx.stringValue("OpsDetailHouyiVmResponse.VmName"));
		opsDetailHouyiVmResponse.setIntranetTx(_ctx.integerValue("OpsDetailHouyiVmResponse.IntranetTx"));
		opsDetailHouyiVmResponse.setSafetyQuota(_ctx.stringValue("OpsDetailHouyiVmResponse.SafetyQuota"));
		opsDetailHouyiVmResponse.setHostname(_ctx.stringValue("OpsDetailHouyiVmResponse.Hostname"));
		opsDetailHouyiVmResponse.setVmMemory(_ctx.integerValue("OpsDetailHouyiVmResponse.VmMemory"));
		opsDetailHouyiVmResponse.setPayType(_ctx.stringValue("OpsDetailHouyiVmResponse.PayType"));
		opsDetailHouyiVmResponse.setMachineNo(_ctx.stringValue("OpsDetailHouyiVmResponse.MachineNo"));
		opsDetailHouyiVmResponse.setMac(_ctx.stringValue("OpsDetailHouyiVmResponse.Mac"));
		opsDetailHouyiVmResponse.setIntranetRx(_ctx.integerValue("OpsDetailHouyiVmResponse.IntranetRx"));
		opsDetailHouyiVmResponse.setVmInnerIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmInnerIp"));
		opsDetailHouyiVmResponse.setVncHost(_ctx.stringValue("OpsDetailHouyiVmResponse.VncHost"));
		opsDetailHouyiVmResponse.setVpcId(_ctx.stringValue("OpsDetailHouyiVmResponse.VpcId"));
		opsDetailHouyiVmResponse.setSerialNumber(_ctx.stringValue("OpsDetailHouyiVmResponse.SerialNumber"));
		opsDetailHouyiVmResponse.setNcId(_ctx.stringValue("OpsDetailHouyiVmResponse.NcId"));
		opsDetailHouyiVmResponse.setVmDisk(_ctx.integerValue("OpsDetailHouyiVmResponse.VmDisk"));
		opsDetailHouyiVmResponse.setVmStatus(_ctx.stringValue("OpsDetailHouyiVmResponse.VmStatus"));
		opsDetailHouyiVmResponse.setInternetTx(_ctx.integerValue("OpsDetailHouyiVmResponse.InternetTx"));
		opsDetailHouyiVmResponse.setInternetRx(_ctx.integerValue("OpsDetailHouyiVmResponse.InternetRx"));
		opsDetailHouyiVmResponse.setVncPassword(_ctx.stringValue("OpsDetailHouyiVmResponse.VncPassword"));
		opsDetailHouyiVmResponse.setRegionId(_ctx.stringValue("OpsDetailHouyiVmResponse.RegionId"));
		opsDetailHouyiVmResponse.setNetmask(_ctx.stringValue("OpsDetailHouyiVmResponse.Netmask"));

		VmImage vmImage = new VmImage();
		vmImage.setImageName(_ctx.stringValue("OpsDetailHouyiVmResponse.VmImage.ImageName"));
		vmImage.setImageId(_ctx.stringValue("OpsDetailHouyiVmResponse.VmImage.ImageId"));
		opsDetailHouyiVmResponse.setVmImage(vmImage);

		VmStatusNote vmStatusNote = new VmStatusNote();
		vmStatusNote.setNoteCode(_ctx.stringValue("OpsDetailHouyiVmResponse.VmStatusNote.NoteCode"));
		vmStatusNote.setNoteInfo(_ctx.stringValue("OpsDetailHouyiVmResponse.VmStatusNote.NoteInfo"));
		opsDetailHouyiVmResponse.setVmStatusNote(vmStatusNote);

		VmPublicIp vmPublicIp = new VmPublicIp();
		vmPublicIp.setBindIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmPublicIp.BindIp"));
		vmPublicIp.setAssignIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmPublicIp.AssignIp"));
		vmPublicIp.setAssignNatIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmPublicIp.AssignNatIp"));
		opsDetailHouyiVmResponse.setVmPublicIp(vmPublicIp);

		Eip eip = new Eip();
		eip.setInternetTx(_ctx.integerValue("OpsDetailHouyiVmResponse.Eip.InternetTx"));
		eip.setIp(_ctx.stringValue("OpsDetailHouyiVmResponse.Eip.Ip"));
		opsDetailHouyiVmResponse.setEip(eip);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailHouyiVmResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setSecurityGroupId(_ctx.stringValue("OpsDetailHouyiVmResponse.Groups["+ i +"].SecurityGroupId"));

			groups.add(group);
		}
		opsDetailHouyiVmResponse.setGroups(groups);
	 
	 	return opsDetailHouyiVmResponse;
	}
}