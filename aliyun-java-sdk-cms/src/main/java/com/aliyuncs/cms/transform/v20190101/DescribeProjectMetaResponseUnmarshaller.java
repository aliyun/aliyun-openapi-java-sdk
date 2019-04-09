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

	public static DescribeProjectMetaResponse unmarshall(DescribeProjectMetaResponse describeProjectMetaResponse, UnmarshallerContext context) {
		
		describeProjectMetaResponse.setRequestId(context.stringValue("DescribeProjectMetaResponse.RequestId"));
		describeProjectMetaResponse.setSuccess(context.booleanValue("DescribeProjectMetaResponse.Success"));
		describeProjectMetaResponse.setCode(context.stringValue("DescribeProjectMetaResponse.Code"));
		describeProjectMetaResponse.setMessage(context.stringValue("DescribeProjectMetaResponse.Message"));
		describeProjectMetaResponse.setTotal(context.stringValue("DescribeProjectMetaResponse.Total"));
		describeProjectMetaResponse.setPageNumber(context.stringValue("DescribeProjectMetaResponse.PageNumber"));
		describeProjectMetaResponse.setPageSize(context.stringValue("DescribeProjectMetaResponse.PageSize"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("DescribeProjectMetaResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setNamespace(context.stringValue("DescribeProjectMetaResponse.Resources["+ i +"].Namespace"));
			resource.setDescription(context.stringValue("DescribeProjectMetaResponse.Resources["+ i +"].Description"));
			resource.setLabels(context.stringValue("DescribeProjectMetaResponse.Resources["+ i +"].Labels"));

			resources.add(resource);
		}
		describeProjectMetaResponse.setResources(resources);
	 
	 	return describeProjectMetaResponse;
	}
}