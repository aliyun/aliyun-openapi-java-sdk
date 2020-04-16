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

import com.aliyuncs.sas.model.v20181203.DescribeAssetDetailByUuidResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAssetDetailByUuidResponse.AssetDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAssetDetailByUuidResponseUnmarshaller {

	public static DescribeAssetDetailByUuidResponse unmarshall(DescribeAssetDetailByUuidResponse describeAssetDetailByUuidResponse, UnmarshallerContext _ctx) {
		
		describeAssetDetailByUuidResponse.setRequestId(_ctx.stringValue("DescribeAssetDetailByUuidResponse.RequestId"));

		AssetDetail assetDetail = new AssetDetail();
		assetDetail.setInternetIp(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.InternetIp"));
		assetDetail.setIntranetIp(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.IntranetIp"));
		assetDetail.setInstanceName(_ctx.integerValue("DescribeAssetDetailByUuidResponse.AssetDetail.InstanceName"));
		assetDetail.setInstanceId(_ctx.integerValue("DescribeAssetDetailByUuidResponse.AssetDetail.InstanceId"));
		assetDetail.setIp(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Ip"));
		assetDetail.setUuid(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Uuid"));
		assetDetail.setAssetType(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.AssetType"));
		assetDetail.setOs(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Os"));
		assetDetail.setClientStatus(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.ClientStatus"));
		assetDetail.setRegion(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Region"));
		assetDetail.setRegionName(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.RegionName"));
		assetDetail.setTag(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Tag"));
		assetDetail.setGroupTrace(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.GroupTrace"));
		assetDetail.setCpu(_ctx.integerValue("DescribeAssetDetailByUuidResponse.AssetDetail.Cpu"));
		assetDetail.setCpuInfo(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.CpuInfo"));
		assetDetail.setKernel(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.Kernel"));
		assetDetail.setOsDetail(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.OsDetail"));
		assetDetail.setMem(_ctx.integerValue("DescribeAssetDetailByUuidResponse.AssetDetail.Mem"));
		assetDetail.setSysInfo(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.SysInfo"));
		assetDetail.setHostName(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.HostName"));
		assetDetail.setOsName(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.OsName"));
		assetDetail.setVpcInstanceId(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.VpcInstanceId"));
		assetDetail.setOsName1(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.OsName"));

		List<String> ipList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAssetDetailByUuidResponse.AssetDetail.IpList.Length"); i++) {
			ipList.add(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.IpList["+ i +"]"));
		}
		assetDetail.setIpList(ipList);

		List<String> macList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAssetDetailByUuidResponse.AssetDetail.MacList.Length"); i++) {
			macList.add(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.MacList["+ i +"]"));
		}
		assetDetail.setMacList(macList);

		List<String> diskInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAssetDetailByUuidResponse.AssetDetail.DiskInfoList.Length"); i++) {
			diskInfoList.add(_ctx.stringValue("DescribeAssetDetailByUuidResponse.AssetDetail.DiskInfoList["+ i +"]"));
		}
		assetDetail.setDiskInfoList(diskInfoList);
		describeAssetDetailByUuidResponse.setAssetDetail(assetDetail);
	 
	 	return describeAssetDetailByUuidResponse;
	}
}