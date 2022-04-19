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

import com.aliyuncs.sas.model.v20181203.DescribeExposedInstanceListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeExposedInstanceListResponse.ExposedInstance;
import com.aliyuncs.sas.model.v20181203.DescribeExposedInstanceListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExposedInstanceListResponseUnmarshaller {

	public static DescribeExposedInstanceListResponse unmarshall(DescribeExposedInstanceListResponse describeExposedInstanceListResponse, UnmarshallerContext _ctx) {
		
		describeExposedInstanceListResponse.setRequestId(_ctx.stringValue("DescribeExposedInstanceListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeExposedInstanceListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeExposedInstanceListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeExposedInstanceListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeExposedInstanceListResponse.PageInfo.Count"));
		describeExposedInstanceListResponse.setPageInfo(pageInfo);

		List<ExposedInstance> exposedInstances = new ArrayList<ExposedInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExposedInstanceListResponse.ExposedInstances.Length"); i++) {
			ExposedInstance exposedInstance = new ExposedInstance();
			exposedInstance.setExposureIp(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposureIp"));
			exposedInstance.setTotalVulCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].TotalVulCount"));
			exposedInstance.setInternetIp(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].InternetIp"));
			exposedInstance.setNntfVulCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].NntfVulCount"));
			exposedInstance.setInstanceId(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].InstanceId"));
			exposedInstance.setExposureType(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposureType"));
			exposedInstance.setIntranetIp(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].IntranetIp"));
			exposedInstance.setRegionId(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].RegionId"));
			exposedInstance.setExposureTypeId(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposureTypeId"));
			exposedInstance.setAsapVulCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].AsapVulCount"));
			exposedInstance.setExposurePort(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposurePort"));
			exposedInstance.setUuid(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].Uuid"));
			exposedInstance.setGroupName(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].GroupName"));
			exposedInstance.setGroupId(_ctx.longValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].GroupId"));
			exposedInstance.setExploitHealthCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExploitHealthCount"));
			exposedInstance.setInstanceName(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].InstanceName"));
			exposedInstance.setExposureComponent(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposureComponent"));
			exposedInstance.setLaterVulCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].LaterVulCount"));

			exposedInstances.add(exposedInstance);
		}
		describeExposedInstanceListResponse.setExposedInstances(exposedInstances);
	 
	 	return describeExposedInstanceListResponse;
	}
}