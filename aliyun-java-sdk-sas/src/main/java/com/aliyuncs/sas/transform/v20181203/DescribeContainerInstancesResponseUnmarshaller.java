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

import com.aliyuncs.sas.model.v20181203.DescribeContainerInstancesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeContainerInstancesResponse.ContainerInstance;
import com.aliyuncs.sas.model.v20181203.DescribeContainerInstancesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerInstancesResponseUnmarshaller {

	public static DescribeContainerInstancesResponse unmarshall(DescribeContainerInstancesResponse describeContainerInstancesResponse, UnmarshallerContext _ctx) {
		
		describeContainerInstancesResponse.setRequestId(_ctx.stringValue("DescribeContainerInstancesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeContainerInstancesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeContainerInstancesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeContainerInstancesResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeContainerInstancesResponse.PageInfo.Count"));
		describeContainerInstancesResponse.setPageInfo(pageInfo);

		List<ContainerInstance> containerInstanceList = new ArrayList<ContainerInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContainerInstancesResponse.ContainerInstanceList.Length"); i++) {
			ContainerInstance containerInstance = new ContainerInstance();
			containerInstance.setImageRepoTag(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ImageRepoTag"));
			containerInstance.setAppName(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].AppName"));
			containerInstance.setPodIp(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].PodIp"));
			containerInstance.setVulCount(_ctx.integerValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].VulCount"));
			containerInstance.setHcStatus(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].HcStatus"));
			containerInstance.setImageId(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ImageId"));
			containerInstance.setClusterId(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ClusterId"));
			containerInstance.setImageRepoName(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ImageRepoName"));
			containerInstance.setHostIp(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].HostIp"));
			containerInstance.setPod(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].Pod"));
			containerInstance.setRiskStatus(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].RiskStatus"));
			containerInstance.setVulStatus(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].VulStatus"));
			containerInstance.setAlarmStatus(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].AlarmStatus"));
			containerInstance.setImage(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].Image"));
			containerInstance.setImageRepoNamespace(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ImageRepoNamespace"));
			containerInstance.setImageDigest(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ImageDigest"));
			containerInstance.setNamespace(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].Namespace"));
			containerInstance.setInstanceId(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].InstanceId"));
			containerInstance.setNodeInfo(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].NodeInfo"));
			containerInstance.setImageUuid(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ImageUuid"));
			containerInstance.setRegionId(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].RegionId"));
			containerInstance.setUpdateMark(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].UpdateMark"));
			containerInstance.setContainerId(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ContainerId"));
			containerInstance.setNodeName(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].NodeName"));
			containerInstance.setHcCount(_ctx.integerValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].HcCount"));
			containerInstance.setClusterName(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].ClusterName"));
			containerInstance.setRiskCount(_ctx.stringValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].RiskCount"));
			containerInstance.setAlarmCount(_ctx.integerValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].AlarmCount"));
			containerInstance.setCreateTimestamp(_ctx.longValue("DescribeContainerInstancesResponse.ContainerInstanceList["+ i +"].CreateTimestamp"));

			containerInstanceList.add(containerInstance);
		}
		describeContainerInstancesResponse.setContainerInstanceList(containerInstanceList);
	 
	 	return describeContainerInstancesResponse;
	}
}