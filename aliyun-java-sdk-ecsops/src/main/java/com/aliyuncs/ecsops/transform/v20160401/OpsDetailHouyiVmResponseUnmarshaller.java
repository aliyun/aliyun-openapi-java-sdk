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
		opsDetailHouyiVmResponse.setMachineNo(_ctx.stringValue("OpsDetailHouyiVmResponse.MachineNo"));
		opsDetailHouyiVmResponse.setSerialNumber(_ctx.stringValue("OpsDetailHouyiVmResponse.SerialNumber"));
		opsDetailHouyiVmResponse.setVmName(_ctx.stringValue("OpsDetailHouyiVmResponse.VmName"));
		opsDetailHouyiVmResponse.setHostname(_ctx.stringValue("OpsDetailHouyiVmResponse.Hostname"));
		opsDetailHouyiVmResponse.setVmStatus(_ctx.stringValue("OpsDetailHouyiVmResponse.VmStatus"));
		opsDetailHouyiVmResponse.setRegionId(_ctx.stringValue("OpsDetailHouyiVmResponse.RegionId"));
		opsDetailHouyiVmResponse.setClusterId(_ctx.stringValue("OpsDetailHouyiVmResponse.ClusterId"));
		opsDetailHouyiVmResponse.setNcId(_ctx.stringValue("OpsDetailHouyiVmResponse.NcId"));
		opsDetailHouyiVmResponse.setVlanNo(_ctx.stringValue("OpsDetailHouyiVmResponse.VlanNo"));
		opsDetailHouyiVmResponse.setRackId(_ctx.stringValue("OpsDetailHouyiVmResponse.RackId"));
		opsDetailHouyiVmResponse.setSecurityGroupId(_ctx.stringValue("OpsDetailHouyiVmResponse.SecurityGroupId"));
		opsDetailHouyiVmResponse.setVmInnerIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmInnerIp"));
		opsDetailHouyiVmResponse.setVmCores(_ctx.integerValue("OpsDetailHouyiVmResponse.VmCores"));
		opsDetailHouyiVmResponse.setVgwVip(_ctx.stringValue("OpsDetailHouyiVmResponse.VgwVip"));
		opsDetailHouyiVmResponse.setStorageNetworkType(_ctx.stringValue("OpsDetailHouyiVmResponse.StorageNetworkType"));
		opsDetailHouyiVmResponse.setVmMemory(_ctx.integerValue("OpsDetailHouyiVmResponse.VmMemory"));
		opsDetailHouyiVmResponse.setVmDisk(_ctx.integerValue("OpsDetailHouyiVmResponse.VmDisk"));
		opsDetailHouyiVmResponse.setVmBps(_ctx.integerValue("OpsDetailHouyiVmResponse.VmBps"));
		opsDetailHouyiVmResponse.setVmPlatform(_ctx.stringValue("OpsDetailHouyiVmResponse.VmPlatform"));
		opsDetailHouyiVmResponse.setMac(_ctx.stringValue("OpsDetailHouyiVmResponse.Mac"));
		opsDetailHouyiVmResponse.setGateway(_ctx.stringValue("OpsDetailHouyiVmResponse.Gateway"));
		opsDetailHouyiVmResponse.setNetmask(_ctx.stringValue("OpsDetailHouyiVmResponse.Netmask"));
		opsDetailHouyiVmResponse.setIntranetRx(_ctx.integerValue("OpsDetailHouyiVmResponse.IntranetRx"));
		opsDetailHouyiVmResponse.setIntranetTx(_ctx.integerValue("OpsDetailHouyiVmResponse.IntranetTx"));
		opsDetailHouyiVmResponse.setInternetRx(_ctx.integerValue("OpsDetailHouyiVmResponse.InternetRx"));
		opsDetailHouyiVmResponse.setInternetTx(_ctx.integerValue("OpsDetailHouyiVmResponse.InternetTx"));
		opsDetailHouyiVmResponse.setSafetyQuota(_ctx.stringValue("OpsDetailHouyiVmResponse.SafetyQuota"));
		opsDetailHouyiVmResponse.setIntensiveIo(_ctx.integerValue("OpsDetailHouyiVmResponse.IntensiveIo"));
		opsDetailHouyiVmResponse.setIntensiveCpu(_ctx.integerValue("OpsDetailHouyiVmResponse.IntensiveCpu"));
		opsDetailHouyiVmResponse.setIntensiveNet(_ctx.integerValue("OpsDetailHouyiVmResponse.IntensiveNet"));
		opsDetailHouyiVmResponse.setPayType(_ctx.stringValue("OpsDetailHouyiVmResponse.PayType"));
		opsDetailHouyiVmResponse.setVncHost(_ctx.stringValue("OpsDetailHouyiVmResponse.VncHost"));
		opsDetailHouyiVmResponse.setVncPort(_ctx.integerValue("OpsDetailHouyiVmResponse.VncPort"));
		opsDetailHouyiVmResponse.setVncPassword(_ctx.stringValue("OpsDetailHouyiVmResponse.VncPassword"));
		opsDetailHouyiVmResponse.setVpcId(_ctx.stringValue("OpsDetailHouyiVmResponse.VpcId"));
		opsDetailHouyiVmResponse.setVpcSubnetId(_ctx.stringValue("OpsDetailHouyiVmResponse.VpcSubnetId"));
		opsDetailHouyiVmResponse.setVmAliIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmAliIp"));

		VmStatusNote vmStatusNote = new VmStatusNote();
		vmStatusNote.setNoteCode(_ctx.stringValue("OpsDetailHouyiVmResponse.VmStatusNote.NoteCode"));
		vmStatusNote.setNoteInfo(_ctx.stringValue("OpsDetailHouyiVmResponse.VmStatusNote.NoteInfo"));
		opsDetailHouyiVmResponse.setVmStatusNote(vmStatusNote);

		VmPublicIp vmPublicIp = new VmPublicIp();
		vmPublicIp.setBindIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmPublicIp.BindIp"));
		vmPublicIp.setAssignIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmPublicIp.AssignIp"));
		vmPublicIp.setAssignNatIp(_ctx.stringValue("OpsDetailHouyiVmResponse.VmPublicIp.AssignNatIp"));
		opsDetailHouyiVmResponse.setVmPublicIp(vmPublicIp);

		VmImage vmImage = new VmImage();
		vmImage.setImageId(_ctx.stringValue("OpsDetailHouyiVmResponse.VmImage.ImageId"));
		vmImage.setImageName(_ctx.stringValue("OpsDetailHouyiVmResponse.VmImage.ImageName"));
		opsDetailHouyiVmResponse.setVmImage(vmImage);

		Eip eip = new Eip();
		eip.setIp(_ctx.stringValue("OpsDetailHouyiVmResponse.Eip.Ip"));
		eip.setInternetTx(_ctx.integerValue("OpsDetailHouyiVmResponse.Eip.InternetTx"));
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