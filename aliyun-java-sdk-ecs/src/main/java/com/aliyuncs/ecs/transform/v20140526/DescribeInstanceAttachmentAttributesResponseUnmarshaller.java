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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttachmentAttributesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttachmentAttributesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAttachmentAttributesResponseUnmarshaller {

	public static DescribeInstanceAttachmentAttributesResponse unmarshall(DescribeInstanceAttachmentAttributesResponse describeInstanceAttachmentAttributesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAttachmentAttributesResponse.setRequestId(_ctx.stringValue("DescribeInstanceAttachmentAttributesResponse.RequestId"));
		describeInstanceAttachmentAttributesResponse.setPageSize(_ctx.integerValue("DescribeInstanceAttachmentAttributesResponse.PageSize"));
		describeInstanceAttachmentAttributesResponse.setPageNumber(_ctx.integerValue("DescribeInstanceAttachmentAttributesResponse.PageNumber"));
		describeInstanceAttachmentAttributesResponse.setTotalCount(_ctx.integerValue("DescribeInstanceAttachmentAttributesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAttachmentAttributesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeInstanceAttachmentAttributesResponse.Instances["+ i +"].InstanceId"));
			instance.setPrivatePoolOptionsMatchCriteria(_ctx.stringValue("DescribeInstanceAttachmentAttributesResponse.Instances["+ i +"].PrivatePoolOptionsMatchCriteria"));
			instance.setPrivatePoolOptionsId(_ctx.stringValue("DescribeInstanceAttachmentAttributesResponse.Instances["+ i +"].PrivatePoolOptionsId"));

			instances.add(instance);
		}
		describeInstanceAttachmentAttributesResponse.setInstances(instances);
	 
	 	return describeInstanceAttachmentAttributesResponse;
	}
}