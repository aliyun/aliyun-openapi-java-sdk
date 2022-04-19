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

import com.aliyuncs.sas.model.v20181203.DescribeCloudCenterInstancesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCloudCenterInstancesResponse.Instance;
import com.aliyuncs.sas.model.v20181203.DescribeCloudCenterInstancesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudCenterInstancesResponseUnmarshaller {

	public static DescribeCloudCenterInstancesResponse unmarshall(DescribeCloudCenterInstancesResponse describeCloudCenterInstancesResponse, UnmarshallerContext _ctx) {
		
		describeCloudCenterInstancesResponse.setRequestId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.RequestId"));
		describeCloudCenterInstancesResponse.setSuccess(_ctx.booleanValue("DescribeCloudCenterInstancesResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeCloudCenterInstancesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeCloudCenterInstancesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.PageInfo.Count"));
		describeCloudCenterInstancesResponse.setPageInfo(pageInfo);

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudCenterInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Status"));
			instance.setCpuInfo(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].CpuInfo"));
			instance.setInternetIp(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].InternetIp"));
			instance.setKernel(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Kernel"));
			instance.setBind(_ctx.booleanValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Bind"));
			instance.setOsName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].OsName"));
			instance.setTag(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Tag"));
			instance.setClientStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ClientStatus"));
			instance.setMem(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Mem"));
			instance.setVpcInstanceId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].VpcInstanceId"));
			instance.setTagId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].TagId"));
			instance.setFlag(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Flag"));
			instance.setLastLoginTimestamp(_ctx.longValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].LastLoginTimestamp"));
			instance.setAuthVersion(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].AuthVersion"));
			instance.setRegion(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Region"));
			instance.setInstanceName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setPodCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].PodCount"));
			instance.setVulCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].VulCount"));
			instance.setHcStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].HcStatus"));
			instance.setCreatedTime(_ctx.longValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].CreatedTime"));
			instance.setGroupTrace(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].GroupTrace"));
			instance.setClusterId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ClusterId"));
			instance.setRiskStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].RiskStatus"));
			instance.setCores(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Cores"));
			instance.setVulStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].VulStatus"));
			instance.setAlarmStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].AlarmStatus"));
			instance.setMacListString(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].MacListString"));
			instance.setImportance(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Importance"));
			instance.setHealthCheckCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].HealthCheckCount"));
			instance.setIp(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Ip"));
			instance.setOs(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Os"));
			instance.setAuthModifyTime(_ctx.longValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].AuthModifyTime"));
			instance.setSafeEventCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].SafeEventCount"));
			instance.setInstanceId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setAssetType(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].AssetType"));
			instance.setIntranetIp(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].IntranetIp"));
			instance.setVendor(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Vendor"));
			instance.setRegionId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setUuid(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Uuid"));
			instance.setGroupId(_ctx.longValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].GroupId"));
			instance.setRegionName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].RegionName"));
			instance.setVendorName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].VendorName"));
			instance.setAuthVersionName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].AuthVersionName"));
			instance.setClusterName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ClusterName"));
			instance.setExposedStatus(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ExposedStatus"));
			instance.setRiskCount(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].RiskCount"));
			instance.setIpListString(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].IpListString"));

			instances.add(instance);
		}
		describeCloudCenterInstancesResponse.setInstances(instances);
	 
	 	return describeCloudCenterInstancesResponse;
	}
}