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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeFlowCategoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowCategoryResponseUnmarshaller {

	public static DescribeFlowCategoryResponse unmarshall(DescribeFlowCategoryResponse describeFlowCategoryResponse, UnmarshallerContext context) {
		
		describeFlowCategoryResponse.setRequestId(context.stringValue("DescribeFlowCategoryResponse.RequestId"));
		describeFlowCategoryResponse.setId(context.stringValue("DescribeFlowCategoryResponse.Id"));
		describeFlowCategoryResponse.setGmtCreate(context.longValue("DescribeFlowCategoryResponse.GmtCreate"));
		describeFlowCategoryResponse.setGmtModified(context.longValue("DescribeFlowCategoryResponse.GmtModified"));
		describeFlowCategoryResponse.setName(context.stringValue("DescribeFlowCategoryResponse.Name"));
		describeFlowCategoryResponse.setParentId(context.stringValue("DescribeFlowCategoryResponse.ParentId"));
		describeFlowCategoryResponse.setType(context.stringValue("DescribeFlowCategoryResponse.Type"));
		describeFlowCategoryResponse.setCategoryType(context.stringValue("DescribeFlowCategoryResponse.CategoryType"));
		describeFlowCategoryResponse.setObjectType(context.stringValue("DescribeFlowCategoryResponse.ObjectType"));
		describeFlowCategoryResponse.setObjectId(context.stringValue("DescribeFlowCategoryResponse.ObjectId"));
		describeFlowCategoryResponse.setProjectId(context.stringValue("DescribeFlowCategoryResponse.ProjectId"));
	 
	 	return describeFlowCategoryResponse;
	}
}