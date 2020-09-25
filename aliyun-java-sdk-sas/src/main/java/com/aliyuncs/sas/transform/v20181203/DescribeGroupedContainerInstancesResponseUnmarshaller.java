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
		pageInfo.setCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.PageInfo.CurrentPage"));
		describeGroupedContainerInstancesResponse.setPageInfo(pageInfo);

		List<GroupedContainerInstance> groupedContainerInstanceList = new ArrayList<GroupedContainerInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList.Length"); i++) {
			GroupedContainerInstance groupedContainerInstance = new GroupedContainerInstance();
			groupedContainerInstance.setInstanceCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].InstanceCount"));
			groupedContainerInstance.setRiskInstanceCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].RiskInstanceCount"));
			groupedContainerInstance.setClusterId(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ClusterId"));
			groupedContainerInstance.setRiskStatus(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].RiskStatus"));
			groupedContainerInstance.setVulCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].VulCount"));
			groupedContainerInstance.setAlarmCount(_ctx.integerValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].AlarmCount"));
			groupedContainerInstance.setPod(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].Pod"));
			groupedContainerInstance.setPodIp(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].PodIp"));
			groupedContainerInstance.setInstanceId(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].InstanceId"));
			groupedContainerInstance.setHostIp(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].HostIp"));
			groupedContainerInstance.setClusterName(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ClusterName"));
			groupedContainerInstance.setCreateTime(_ctx.longValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].CreateTime"));
			groupedContainerInstance.setAppName(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].AppName"));
			groupedContainerInstance.setClusterType(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].ClusterType"));
			groupedContainerInstance.setCusterState(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].CusterState"));
			groupedContainerInstance.setRegionId(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].RegionId"));
			groupedContainerInstance.setNamespace(_ctx.stringValue("DescribeGroupedContainerInstancesResponse.GroupedContainerInstanceList["+ i +"].Namespace"));

			groupedContainerInstanceList.add(groupedContainerInstance);
		}
		describeGroupedContainerInstancesResponse.setGroupedContainerInstanceList(groupedContainerInstanceList);
	 
	 	return describeGroupedContainerInstancesResponse;
	}
}