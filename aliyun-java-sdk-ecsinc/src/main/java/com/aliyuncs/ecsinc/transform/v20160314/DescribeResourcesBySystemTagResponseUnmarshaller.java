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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.DescribeResourcesBySystemTagResponse;
import com.aliyuncs.ecsinc.model.v20160314.DescribeResourcesBySystemTagResponse.ResourceCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourcesBySystemTagResponseUnmarshaller {

	public static DescribeResourcesBySystemTagResponse unmarshall(DescribeResourcesBySystemTagResponse describeResourcesBySystemTagResponse, UnmarshallerContext context) {
		
		describeResourcesBySystemTagResponse.setRequestId(context.stringValue("DescribeResourcesBySystemTagResponse.RequestId"));
		describeResourcesBySystemTagResponse.setTotalCount(context.integerValue("DescribeResourcesBySystemTagResponse.TotalCount"));

		List<ResourceCount> resourceCounts = new ArrayList<ResourceCount>();
		for (int i = 0; i < context.lengthValue("DescribeResourcesBySystemTagResponse.resourceCounts.Length"); i++) {
			ResourceCount resourceCount = new ResourceCount();
			resourceCount.setRelatedResourceService(context.stringValue("DescribeResourcesBySystemTagResponse.resourceCounts["+ i +"].RelatedResourceService"));
			resourceCount.setResourceType(context.stringValue("DescribeResourcesBySystemTagResponse.resourceCounts["+ i +"].ResourceType"));
			resourceCount.setCount(context.integerValue("DescribeResourcesBySystemTagResponse.resourceCounts["+ i +"].Count"));

			resourceCounts.add(resourceCount);
		}
		describeResourcesBySystemTagResponse.setResourceCounts(resourceCounts);
	 
	 	return describeResourcesBySystemTagResponse;
	}
}