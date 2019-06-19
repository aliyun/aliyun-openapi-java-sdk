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

package com.aliyuncs.hbase.transform.v20170115;

import com.aliyuncs.hbase.model.v20170115.DescribeClusterModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterModelResponseUnmarshaller {

	public static DescribeClusterModelResponse unmarshall(DescribeClusterModelResponse describeClusterModelResponse, UnmarshallerContext context) {
		
		describeClusterModelResponse.setRequestId(context.stringValue("DescribeClusterModelResponse.RequestId"));
		describeClusterModelResponse.setCoreDiskType(context.stringValue("DescribeClusterModelResponse.CoreDiskType"));
		describeClusterModelResponse.setCoreDiskSize(context.stringValue("DescribeClusterModelResponse.CoreDiskSize"));
		describeClusterModelResponse.setClusterId(context.stringValue("DescribeClusterModelResponse.ClusterId"));
		describeClusterModelResponse.setClusterName(context.stringValue("DescribeClusterModelResponse.ClusterName"));
		describeClusterModelResponse.setMainVersion(context.stringValue("DescribeClusterModelResponse.MainVersion"));
		describeClusterModelResponse.setStatus(context.stringValue("DescribeClusterModelResponse.Status"));
		describeClusterModelResponse.setClusterType(context.stringValue("DescribeClusterModelResponse.ClusterType"));
		describeClusterModelResponse.setDbType(context.stringValue("DescribeClusterModelResponse.DbType"));
		describeClusterModelResponse.setIsMultimod(context.stringValue("DescribeClusterModelResponse.IsMultimod"));
		describeClusterModelResponse.setBackupStatus(context.stringValue("DescribeClusterModelResponse.BackupStatus"));
		describeClusterModelResponse.setHasUser(context.stringValue("DescribeClusterModelResponse.HasUser"));
		describeClusterModelResponse.setLockMode(context.stringValue("DescribeClusterModelResponse.LockMode"));
		describeClusterModelResponse.setHaType(context.stringValue("DescribeClusterModelResponse.HaType"));
		describeClusterModelResponse.setMasterInstanceType(context.stringValue("DescribeClusterModelResponse.MasterInstanceType"));
		describeClusterModelResponse.setMasterDiskType(context.stringValue("DescribeClusterModelResponse.MasterDiskType"));
		describeClusterModelResponse.setMasterDiskSize(context.integerValue("DescribeClusterModelResponse.MasterDiskSize"));
		describeClusterModelResponse.setCoreInstanceType(context.stringValue("DescribeClusterModelResponse.CoreInstanceType"));
		describeClusterModelResponse.setCoreInstanceQuantity(context.integerValue("DescribeClusterModelResponse.CoreInstanceQuantity"));
		describeClusterModelResponse.setCoreDiskQuantity(context.integerValue("DescribeClusterModelResponse.CoreDiskQuantity"));
		describeClusterModelResponse.setPayType(context.stringValue("DescribeClusterModelResponse.PayType"));
		describeClusterModelResponse.setAutoRenew(context.stringValue("DescribeClusterModelResponse.AutoRenew"));
		describeClusterModelResponse.setCreateTime(context.stringValue("DescribeClusterModelResponse.CreateTime"));
		describeClusterModelResponse.setExpireTime(context.stringValue("DescribeClusterModelResponse.ExpireTime"));
		describeClusterModelResponse.setRegionId(context.stringValue("DescribeClusterModelResponse.RegionId"));
		describeClusterModelResponse.setZoneId(context.stringValue("DescribeClusterModelResponse.ZoneId"));
		describeClusterModelResponse.setUpdateStatus(context.stringValue("DescribeClusterModelResponse.UpdateStatus"));
		describeClusterModelResponse.setColdStorageStatus(context.stringValue("DescribeClusterModelResponse.ColdStorageStatus"));
		describeClusterModelResponse.setMinorVersion(context.stringValue("DescribeClusterModelResponse.MinorVersion"));
	 
	 	return describeClusterModelResponse;
	}
}