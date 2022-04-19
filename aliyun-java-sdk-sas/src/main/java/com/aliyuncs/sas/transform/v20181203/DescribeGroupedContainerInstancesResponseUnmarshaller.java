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

import com.aliyuncs.sas.model.v20181203.DescribeGroupedContainerInstancesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeGroupedContainerInstancesResponse.GroupedContainerInstance;
import com.aliyuncs.sas.model.v20181203.DescribeGroupedContainerInstancesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupedContainerInstancesResponseUnmarshaller {

	public static DescribeGroupedContainerInstancesResponse unmarshall(DescribeGroupedContainerInstancesResponse describeGroupedContainerInstancesResponse, UnmarshallerContext _ctx) {
		
		describeGroupedContainerInstancesResponse.setRequestId(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.PageInfo.Count"));
		describeGroupedContainerInstancesResponse.setPageInfo(pageInfo);

		List<GroupedContainerInstance> groupedContainerInstanceList = new ArrayList<GroupedContainerInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList.Length"); i++) {
			GroupedContainerInstance groupedContainerInstance = new GroupedContainerInstance();
			groupedContainerInstance.setRiskLevel(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].RiskLevel"));
			groupedContainerInstance.setHostIp(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].HostIp"));
			groupedContainerInstance.setPod(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].Pod"));
			groupedContainerInstance.setRiskStatus(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].RiskStatus"));
			groupedContainerInstance.setCreateTime(_ctx.longValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].CreateTime"));
			groupedContainerInstance.setNamespace(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].Namespace"));
			groupedContainerInstance.setCusterState(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].CusterState"));
			groupedContainerInstance.setInstanceId(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].InstanceId"));
			groupedContainerInstance.setRegionId(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].RegionId"));
			groupedContainerInstance.setAppName(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].AppName"));
			groupedContainerInstance.setInstanceCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].InstanceCount"));
			groupedContainerInstance.setClusterType(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ClusterType"));
			groupedContainerInstance.setClusterName(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ClusterName"));
			groupedContainerInstance.setPodIp(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].PodIp"));
			groupedContainerInstance.setVulCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].VulCount"));
			groupedContainerInstance.setAlarmCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].AlarmCount"));
			groupedContainerInstance.setRiskInstanceCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].RiskInstanceCount"));
			groupedContainerInstance.setClusterId(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ClusterId"));
			groupedContainerInstance.setImage(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].Image"));
			groupedContainerInstance.setImageRepoNamespace(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ImageRepoNamespace"));
			groupedContainerInstance.setImageRepoName(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ImageRepoName"));
			groupedContainerInstance.setImageRepoTag(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ImageRepoTag"));
			groupedContainerInstance.setImageDigest(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ImageDigest"));
			groupedContainerInstance.setImageUuid(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ImageUuid"));
			groupedContainerInstance.setHcCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].HcCount"));

			groupedContainerInstanceList.add(groupedContainerInstance);
		}
		describeGroupedContainerInstancesResponse.setGroupedContainerInstanceList(groupedContainerInstanceList);
	 
	 	return describeGroupedContainerInstancesResponse;
	}
}