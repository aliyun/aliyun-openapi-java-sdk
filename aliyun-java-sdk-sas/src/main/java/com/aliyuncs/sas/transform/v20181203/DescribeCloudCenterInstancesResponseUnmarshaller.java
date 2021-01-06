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
		pageInfo.setCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeCloudCenterInstancesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeCloudCenterInstancesResponse.PageInfo.CurrentPage"));
		describeCloudCenterInstancesResponse.setPageInfo(pageInfo);

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudCenterInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInternetIp(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].InternetIp"));
			instance.setOs(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Os"));
			instance.setInstanceId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setRegionName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].RegionName"));
			instance.setIp(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Ip"));
			instance.setClientStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ClientStatus"));
			instance.setRegion(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Region"));
			instance.setUuid(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Uuid"));
			instance.setIntranetIp(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].IntranetIp"));
			instance.setAssetType(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].AssetType"));
			instance.setStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Status"));
			instance.setTag(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Tag"));
			instance.setVpcInstanceId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].VpcInstanceId"));
			instance.setOsName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].OsName"));
			instance.setFlag(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Flag"));
			instance.setHcStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].HcStatus"));
			instance.setVulStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].VulStatus"));
			instance.setAlarmStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].AlarmStatus"));
			instance.setRiskStatus(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].RiskStatus"));
			instance.setHealthCheckCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].HealthCheckCount"));
			instance.setVulCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].VulCount"));
			instance.setSafeEventCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].SafeEventCount"));
			instance.setRegionId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setGroupId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].GroupId"));
			instance.setImportance(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].Importance"));
			instance.setClientVersion(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ClientVersion"));
			instance.setRiskCount(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].RiskCount"));
			instance.setClusterId(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ClusterId"));
			instance.setClusterName(_ctx.stringValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ClusterName"));
			instance.setCreatedTime(_ctx.longValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].CreatedTime"));
			instance.setPodCount(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].PodCount"));
			instance.setExposedStatus(_ctx.integerValue("DescribeCloudCenterInstancesResponse.Instances["+ i +"].ExposedStatus"));

			instances.add(instance);
		}
		describeCloudCenterInstancesResponse.setInstances(instances);
	 
	 	return describeCloudCenterInstancesResponse;
	}
}