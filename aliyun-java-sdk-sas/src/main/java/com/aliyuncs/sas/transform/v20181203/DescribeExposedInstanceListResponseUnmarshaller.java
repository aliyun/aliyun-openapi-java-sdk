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
		pageInfo.setCount(_ctx.integerValue("DescribeExposedInstanceListResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeExposedInstanceListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeExposedInstanceListResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeExposedInstanceListResponse.PageInfo.CurrentPage"));
		describeExposedInstanceListResponse.setPageInfo(pageInfo);

		List<ExposedInstance> exposedInstances = new ArrayList<ExposedInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExposedInstanceListResponse.ExposedInstances.Length"); i++) {
			ExposedInstance exposedInstance = new ExposedInstance();
			exposedInstance.setUuid(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].Uuid"));
			exposedInstance.setIntranetIp(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].IntranetIp"));
			exposedInstance.setInternetIp(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].InternetIp"));
			exposedInstance.setAsapVulCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].AsapVulCount"));
			exposedInstance.setLaterVulCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].LaterVulCount"));
			exposedInstance.setNntfVulCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].NntfVulCount"));
			exposedInstance.setTotalVulCount(_ctx.integerValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].TotalVulCount"));
			exposedInstance.setExposureComponent(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposureComponent"));
			exposedInstance.setExposureType(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposureType"));
			exposedInstance.setExposureTypeId(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposureTypeId"));
			exposedInstance.setExposurePort(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposurePort"));
			exposedInstance.setExposureIp(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].ExposureIp"));
			exposedInstance.setInstanceId(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].InstanceId"));
			exposedInstance.setInstanceName(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].InstanceName"));
			exposedInstance.setRegionId(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].RegionId"));
			exposedInstance.setGroupId(_ctx.longValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].GroupId"));
			exposedInstance.setGroupName(_ctx.stringValue("DescribeExposedInstanceListResponse.ExposedInstances["+ i +"].GroupName"));

			exposedInstances.add(exposedInstance);
		}
		describeExposedInstanceListResponse.setExposedInstances(exposedInstances);
	 
	 	return describeExposedInstanceListResponse;
	}
}