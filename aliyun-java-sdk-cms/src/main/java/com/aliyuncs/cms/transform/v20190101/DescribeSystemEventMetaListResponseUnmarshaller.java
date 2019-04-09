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

import com.aliyuncs.cms.model.v20190101.DescribeSystemEventMetaListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSystemEventMetaListResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSystemEventMetaListResponseUnmarshaller {

	public static DescribeSystemEventMetaListResponse unmarshall(DescribeSystemEventMetaListResponse describeSystemEventMetaListResponse, UnmarshallerContext context) {
		
		describeSystemEventMetaListResponse.setRequestId(context.stringValue("DescribeSystemEventMetaListResponse.RequestId"));
		describeSystemEventMetaListResponse.setSuccess(context.booleanValue("DescribeSystemEventMetaListResponse.Success"));
		describeSystemEventMetaListResponse.setCode(context.integerValue("DescribeSystemEventMetaListResponse.Code"));
		describeSystemEventMetaListResponse.setMessage(context.stringValue("DescribeSystemEventMetaListResponse.Message"));

		List<Resource> data = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("DescribeSystemEventMetaListResponse.Data.Length"); i++) {
			Resource resource = new Resource();
			resource.setProduct(context.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].Product"));
			resource.setName(context.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].Name"));
			resource.setNameDesc(context.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].NameDesc"));
			resource.setLevel(context.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].Level"));
			resource.setStatus(context.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].Status"));
			resource.setStatusDesc(context.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].StatusDesc"));
			resource.setEventType(context.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].EventType"));

			data.add(resource);
		}
		describeSystemEventMetaListResponse.setData(data);
	 
	 	return describeSystemEventMetaListResponse;
	}
}