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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeOpenApiUsageResponse;
import com.aliyuncs.green.model.v20170823.DescribeOpenApiUsageResponse.OpenApiUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOpenApiUsageResponseUnmarshaller {

	public static DescribeOpenApiUsageResponse unmarshall(DescribeOpenApiUsageResponse describeOpenApiUsageResponse, UnmarshallerContext context) {
		
		describeOpenApiUsageResponse.setRequestId(context.stringValue("DescribeOpenApiUsageResponse.RequestId"));
		describeOpenApiUsageResponse.setTotalCount(context.integerValue("DescribeOpenApiUsageResponse.TotalCount"));

		List<OpenApiUsage> openApiUsageList = new ArrayList<OpenApiUsage>();
		for (int i = 0; i < context.lengthValue("DescribeOpenApiUsageResponse.OpenApiUsageList.Length"); i++) {
			OpenApiUsage openApiUsage = new OpenApiUsage();
			openApiUsage.setDate(context.stringValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].Date"));
			openApiUsage.setResourceType(context.stringValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].ResourceType"));
			openApiUsage.setScene(context.stringValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].Scene"));
			openApiUsage.setTotalCount(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].TotalCount"));
			openApiUsage.setPassCount(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].PassCount"));
			openApiUsage.setReviewCount(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].ReviewCount"));
			openApiUsage.setBlockCount(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].BlockCount"));
			openApiUsage.setInnerTotalCount(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].InnerTotalCount"));
			openApiUsage.setOuterTotalCount(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].OuterTotalCount"));
			openApiUsage.setTotalDuration(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].TotalDuration"));
			openApiUsage.setPassDuration(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].PassDuration"));
			openApiUsage.setReviewDuration(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].ReviewDuration"));
			openApiUsage.setBlockDuration(context.integerValue("DescribeOpenApiUsageResponse.OpenApiUsageList["+ i +"].BlockDuration"));

			openApiUsageList.add(openApiUsage);
		}
		describeOpenApiUsageResponse.setOpenApiUsageList(openApiUsageList);
	 
	 	return describeOpenApiUsageResponse;
	}
}