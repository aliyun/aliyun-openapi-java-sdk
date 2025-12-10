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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.DescribePolarFsAttributeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribePolarFsAttributeResponse.MountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolarFsAttributeResponseUnmarshaller {

	public static DescribePolarFsAttributeResponse unmarshall(DescribePolarFsAttributeResponse describePolarFsAttributeResponse, UnmarshallerContext _ctx) {
		
		describePolarFsAttributeResponse.setRequestId(_ctx.stringValue("DescribePolarFsAttributeResponse.RequestId"));
		describePolarFsAttributeResponse.setRelativeDbClusterId(_ctx.stringValue("DescribePolarFsAttributeResponse.RelativeDbClusterId"));
		describePolarFsAttributeResponse.setPolarFsInstanceId(_ctx.stringValue("DescribePolarFsAttributeResponse.PolarFsInstanceId"));
		describePolarFsAttributeResponse.setPolarFsStatus(_ctx.stringValue("DescribePolarFsAttributeResponse.PolarFsStatus"));
		describePolarFsAttributeResponse.setPolarFsVersion(_ctx.stringValue("DescribePolarFsAttributeResponse.PolarFsVersion"));
		describePolarFsAttributeResponse.setPayType(_ctx.stringValue("DescribePolarFsAttributeResponse.PayType"));
		describePolarFsAttributeResponse.setDBType(_ctx.stringValue("DescribePolarFsAttributeResponse.DBType"));
		describePolarFsAttributeResponse.setPolarFsInstanceDescription(_ctx.stringValue("DescribePolarFsAttributeResponse.PolarFsInstanceDescription"));
		describePolarFsAttributeResponse.setRegionId(_ctx.stringValue("DescribePolarFsAttributeResponse.RegionId"));
		describePolarFsAttributeResponse.setZoneId(_ctx.stringValue("DescribePolarFsAttributeResponse.ZoneId"));
		describePolarFsAttributeResponse.setVPCId(_ctx.stringValue("DescribePolarFsAttributeResponse.VPCId"));
		describePolarFsAttributeResponse.setVSwitchId(_ctx.stringValue("DescribePolarFsAttributeResponse.VSwitchId"));
		describePolarFsAttributeResponse.setSecurityGroupId(_ctx.stringValue("DescribePolarFsAttributeResponse.SecurityGroupId"));
		describePolarFsAttributeResponse.setCreateTime(_ctx.stringValue("DescribePolarFsAttributeResponse.CreateTime"));
		describePolarFsAttributeResponse.setExpireTime(_ctx.stringValue("DescribePolarFsAttributeResponse.ExpireTime"));
		describePolarFsAttributeResponse.setExpired(_ctx.stringValue("DescribePolarFsAttributeResponse.Expired"));
		describePolarFsAttributeResponse.setPolarFsType(_ctx.stringValue("DescribePolarFsAttributeResponse.PolarFsType"));
		describePolarFsAttributeResponse.setStorageSpace(_ctx.doubleValue("DescribePolarFsAttributeResponse.StorageSpace"));
		describePolarFsAttributeResponse.setStorageUsed(_ctx.doubleValue("DescribePolarFsAttributeResponse.StorageUsed"));
		describePolarFsAttributeResponse.setBandwidth(_ctx.doubleValue("DescribePolarFsAttributeResponse.Bandwidth"));
		describePolarFsAttributeResponse.setBandwidthBaseLine(_ctx.doubleValue("DescribePolarFsAttributeResponse.BandwidthBaseLine"));
		describePolarFsAttributeResponse.setCategory(_ctx.stringValue("DescribePolarFsAttributeResponse.Category"));
		describePolarFsAttributeResponse.setLockMode(_ctx.stringValue("DescribePolarFsAttributeResponse.LockMode"));
		describePolarFsAttributeResponse.setStorageType(_ctx.stringValue("DescribePolarFsAttributeResponse.StorageType"));
		describePolarFsAttributeResponse.setAcceleratingEnable(_ctx.stringValue("DescribePolarFsAttributeResponse.AcceleratingEnable"));
		describePolarFsAttributeResponse.setAcceleratedStorageSpace(_ctx.doubleValue("DescribePolarFsAttributeResponse.AcceleratedStorageSpace"));
		describePolarFsAttributeResponse.setMinorVersion(_ctx.stringValue("DescribePolarFsAttributeResponse.MinorVersion"));
		describePolarFsAttributeResponse.setClientDownloadPath(_ctx.stringValue("DescribePolarFsAttributeResponse.ClientDownloadPath"));
		describePolarFsAttributeResponse.setMetaUrl(_ctx.stringValue("DescribePolarFsAttributeResponse.MetaUrl"));
		describePolarFsAttributeResponse.setRelativePfsClusterId(_ctx.stringValue("DescribePolarFsAttributeResponse.RelativePfsClusterId"));
		describePolarFsAttributeResponse.setBucketId(_ctx.stringValue("DescribePolarFsAttributeResponse.BucketId"));
		describePolarFsAttributeResponse.setFileSystemId(_ctx.stringValue("DescribePolarFsAttributeResponse.FileSystemId"));
		describePolarFsAttributeResponse.setCustomBucketPath(_ctx.stringValue("DescribePolarFsAttributeResponse.CustomBucketPath"));

		MountInfo mountInfo = new MountInfo();
		mountInfo.setPolarFsCluster(_ctx.stringValue("DescribePolarFsAttributeResponse.MountInfo.PolarFsCluster"));
		mountInfo.setToken(_ctx.stringValue("DescribePolarFsAttributeResponse.MountInfo.Token"));
		mountInfo.setPolarDbProxy(_ctx.stringValue("DescribePolarFsAttributeResponse.MountInfo.PolarDbProxy"));
		describePolarFsAttributeResponse.setMountInfo(mountInfo);
	 
	 	return describePolarFsAttributeResponse;
	}
}