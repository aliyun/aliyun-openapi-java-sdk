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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetAssetDetailByUuidResponse;
import com.aliyuncs.sas.model.v20181203.GetAssetDetailByUuidResponse.AssetDetail;
import com.aliyuncs.sas.model.v20181203.GetAssetDetailByUuidResponse.AssetDetail.DiskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssetDetailByUuidResponseUnmarshaller {

	public static GetAssetDetailByUuidResponse unmarshall(GetAssetDetailByUuidResponse getAssetDetailByUuidResponse, UnmarshallerContext _ctx) {
		
		getAssetDetailByUuidResponse.setRequestId(_ctx.stringValue("GetAssetDetailByUuidResponse.RequestId"));

		AssetDetail assetDetail = new AssetDetail();
		assetDetail.setCpuInfo(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.CpuInfo"));
		assetDetail.setInternetIp(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.InternetIp"));
		assetDetail.setOsDetail(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.OsDetail"));
		assetDetail.setCreateTime(_ctx.longValue("GetAssetDetailByUuidResponse.AssetDetail.CreateTime"));
		assetDetail.setKernel(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.Kernel"));
		assetDetail.setBind(_ctx.booleanValue("GetAssetDetailByUuidResponse.AssetDetail.Bind"));
		assetDetail.setOsName(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.OsName"));
		assetDetail.setTag(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.Tag"));
		assetDetail.setClientStatus(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.ClientStatus"));
		assetDetail.setMem(_ctx.integerValue("GetAssetDetailByUuidResponse.AssetDetail.Mem"));
		assetDetail.setMemory(_ctx.longValue("GetAssetDetailByUuidResponse.AssetDetail.Memory"));
		assetDetail.setVpcInstanceId(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.VpcInstanceId"));
		assetDetail.setAuthVersion(_ctx.integerValue("GetAssetDetailByUuidResponse.AssetDetail.AuthVersion"));
		assetDetail.setInstanceName(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.InstanceName"));
		assetDetail.setRegion(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.Region"));
		assetDetail.setGroupTrace(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.GroupTrace"));
		assetDetail.setIp(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.Ip"));
		assetDetail.setHostName(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.HostName"));
		assetDetail.setOs(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.Os"));
		assetDetail.setAuthModifyTime(_ctx.longValue("GetAssetDetailByUuidResponse.AssetDetail.AuthModifyTime"));
		assetDetail.setInstanceId(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.InstanceId"));
		assetDetail.setIntranetIp(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.IntranetIp"));
		assetDetail.setAssetType(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.AssetType"));
		assetDetail.setRegionId(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.RegionId"));
		assetDetail.setSysInfo(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.SysInfo"));
		assetDetail.setUuid(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.Uuid"));
		assetDetail.setCpu(_ctx.integerValue("GetAssetDetailByUuidResponse.AssetDetail.Cpu"));
		assetDetail.setRegionName(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.RegionName"));
		assetDetail.setInstanceStatus(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.InstanceStatus"));
		assetDetail.setFlag(_ctx.integerValue("GetAssetDetailByUuidResponse.AssetDetail.Flag"));
		assetDetail.setClientVersion(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.ClientVersion"));

		List<String> ipList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAssetDetailByUuidResponse.AssetDetail.IpList.Length"); i++) {
			ipList.add(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.IpList["+ i +"]"));
		}
		assetDetail.setIpList(ipList);

		List<String> macList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAssetDetailByUuidResponse.AssetDetail.MacList.Length"); i++) {
			macList.add(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.MacList["+ i +"]"));
		}
		assetDetail.setMacList(macList);

		List<DiskInfo> diskInfoList = new ArrayList<DiskInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetAssetDetailByUuidResponse.AssetDetail.DiskInfoList.Length"); i++) {
			DiskInfo diskInfo = new DiskInfo();
			diskInfo.setDiskName(_ctx.stringValue("GetAssetDetailByUuidResponse.AssetDetail.DiskInfoList["+ i +"].DiskName"));
			diskInfo.setUseSizeByte(_ctx.longValue("GetAssetDetailByUuidResponse.AssetDetail.DiskInfoList["+ i +"].UseSizeByte"));
			diskInfo.setTotalSize(_ctx.longValue("GetAssetDetailByUuidResponse.AssetDetail.DiskInfoList["+ i +"].TotalSize"));
			diskInfo.setUseSize(_ctx.longValue("GetAssetDetailByUuidResponse.AssetDetail.DiskInfoList["+ i +"].UseSize"));
			diskInfo.setTotalSizeByte(_ctx.longValue("GetAssetDetailByUuidResponse.AssetDetail.DiskInfoList["+ i +"].TotalSizeByte"));

			diskInfoList.add(diskInfo);
		}
		assetDetail.setDiskInfoList(diskInfoList);
		getAssetDetailByUuidResponse.setAssetDetail(assetDetail);
	 
	 	return getAssetDetailByUuidResponse;
	}
}