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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.DescribeAppInstanceListResponse;
import com.aliyuncs.edas.model.v20170801.DescribeAppInstanceListResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppInstanceListResponseUnmarshaller {

	public static DescribeAppInstanceListResponse unmarshall(DescribeAppInstanceListResponse describeAppInstanceListResponse, UnmarshallerContext _ctx) {
		
		describeAppInstanceListResponse.setRequestId(_ctx.stringValue("DescribeAppInstanceListResponse.RequestId"));
		describeAppInstanceListResponse.setCode(_ctx.integerValue("DescribeAppInstanceListResponse.Code"));
		describeAppInstanceListResponse.setMessage(_ctx.stringValue("DescribeAppInstanceListResponse.Message"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppInstanceListResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setAppId(_ctx.stringValue("DescribeAppInstanceListResponse.InstanceList["+ i +"].AppId"));
			instance.setGroupId(_ctx.stringValue("DescribeAppInstanceListResponse.InstanceList["+ i +"].GroupId"));
			instance.setPodRaw(_ctx.stringValue("DescribeAppInstanceListResponse.InstanceList["+ i +"].PodRaw"));
			instance.setGroupName(_ctx.stringValue("DescribeAppInstanceListResponse.InstanceList["+ i +"].GroupName"));
			instance.setCanary(_ctx.booleanValue("DescribeAppInstanceListResponse.InstanceList["+ i +"].Canary"));
			instance.setVersion(_ctx.stringValue("DescribeAppInstanceListResponse.InstanceList["+ i +"].Version"));
			instance.setNodeName(_ctx.stringValue("DescribeAppInstanceListResponse.InstanceList["+ i +"].NodeName"));
			instance.setNodeLabels(_ctx.stringValue("DescribeAppInstanceListResponse.InstanceList["+ i +"].NodeLabels"));

			instanceList.add(instance);
		}
		describeAppInstanceListResponse.setInstanceList(instanceList);
	 
	 	return describeAppInstanceListResponse;
	}
}