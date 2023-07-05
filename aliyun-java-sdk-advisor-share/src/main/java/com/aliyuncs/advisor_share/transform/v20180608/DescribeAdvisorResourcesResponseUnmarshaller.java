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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvisorResourcesResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvisorResourcesResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvisorResourcesResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdvisorResourcesResponseUnmarshaller {

	public static DescribeAdvisorResourcesResponse unmarshall(DescribeAdvisorResourcesResponse describeAdvisorResourcesResponse, UnmarshallerContext _ctx) {
		
		describeAdvisorResourcesResponse.setRequestId(_ctx.stringValue("DescribeAdvisorResourcesResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("DescribeAdvisorResourcesResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("DescribeAdvisorResourcesResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("DescribeAdvisorResourcesResponse.Data.Total"));

		List<Resource> result = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdvisorResourcesResponse.Data.Result.Length"); i++) {
			Resource resource = new Resource();
			resource.setData(_ctx.stringValue("DescribeAdvisorResourcesResponse.Data.Result["+ i +"].Data"));
			resource.setResourceId(_ctx.stringValue("DescribeAdvisorResourcesResponse.Data.Result["+ i +"].ResourceId"));
			resource.setProduct(_ctx.stringValue("DescribeAdvisorResourcesResponse.Data.Result["+ i +"].Product"));
			resource.setResourceName(_ctx.stringValue("DescribeAdvisorResourcesResponse.Data.Result["+ i +"].ResourceName"));
			resource.setRegionId(_ctx.stringValue("DescribeAdvisorResourcesResponse.Data.Result["+ i +"].RegionId"));

			result.add(resource);
		}
		data.setResult(result);
		describeAdvisorResourcesResponse.setData(data);
	 
	 	return describeAdvisorResourcesResponse;
	}
}