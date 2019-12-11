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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeProjectMetaResponse;
import com.aliyuncs.cms.model.v20190101.DescribeProjectMetaResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectMetaResponseUnmarshaller {

	public static DescribeProjectMetaResponse unmarshall(DescribeProjectMetaResponse describeProjectMetaResponse, UnmarshallerContext _ctx) {
		
		describeProjectMetaResponse.setRequestId(_ctx.stringValue("DescribeProjectMetaResponse.RequestId"));
		describeProjectMetaResponse.setSuccess(_ctx.booleanValue("DescribeProjectMetaResponse.Success"));
		describeProjectMetaResponse.setCode(_ctx.stringValue("DescribeProjectMetaResponse.Code"));
		describeProjectMetaResponse.setMessage(_ctx.stringValue("DescribeProjectMetaResponse.Message"));
		describeProjectMetaResponse.setTotal(_ctx.stringValue("DescribeProjectMetaResponse.Total"));
		describeProjectMetaResponse.setPageNumber(_ctx.stringValue("DescribeProjectMetaResponse.PageNumber"));
		describeProjectMetaResponse.setPageSize(_ctx.stringValue("DescribeProjectMetaResponse.PageSize"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProjectMetaResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setNamespace(_ctx.stringValue("DescribeProjectMetaResponse.Resources["+ i +"].Namespace"));
			resource.setDescription(_ctx.stringValue("DescribeProjectMetaResponse.Resources["+ i +"].Description"));
			resource.setLabels(_ctx.stringValue("DescribeProjectMetaResponse.Resources["+ i +"].Labels"));

			resources.add(resource);
		}
		describeProjectMetaResponse.setResources(resources);
	 
	 	return describeProjectMetaResponse;
	}
}