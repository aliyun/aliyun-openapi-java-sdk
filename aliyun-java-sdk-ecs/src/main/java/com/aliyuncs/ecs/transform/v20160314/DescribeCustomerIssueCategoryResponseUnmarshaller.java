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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeCustomerIssueCategoryResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeCustomerIssueCategoryResponse.IssueCategoryModelListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomerIssueCategoryResponseUnmarshaller {

	public static DescribeCustomerIssueCategoryResponse unmarshall(DescribeCustomerIssueCategoryResponse describeCustomerIssueCategoryResponse, UnmarshallerContext _ctx) {
		
		describeCustomerIssueCategoryResponse.setRequestId(_ctx.stringValue("DescribeCustomerIssueCategoryResponse.RequestId"));

		List<IssueCategoryModelListItem> issueCategoryModelList = new ArrayList<IssueCategoryModelListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomerIssueCategoryResponse.IssueCategoryModelList.Length"); i++) {
			IssueCategoryModelListItem issueCategoryModelListItem = new IssueCategoryModelListItem();
			issueCategoryModelListItem.setIssueCategoryId(_ctx.longValue("DescribeCustomerIssueCategoryResponse.IssueCategoryModelList["+ i +"].IssueCategoryId"));
			issueCategoryModelListItem.setIssueCategoryParentId(_ctx.longValue("DescribeCustomerIssueCategoryResponse.IssueCategoryModelList["+ i +"].IssueCategoryParentId"));
			issueCategoryModelListItem.setIssueCategoryName(_ctx.stringValue("DescribeCustomerIssueCategoryResponse.IssueCategoryModelList["+ i +"].IssueCategoryName"));
			issueCategoryModelListItem.setMappingTools(_ctx.stringValue("DescribeCustomerIssueCategoryResponse.IssueCategoryModelList["+ i +"].MappingTools"));
			issueCategoryModelListItem.setLayer(_ctx.longValue("DescribeCustomerIssueCategoryResponse.IssueCategoryModelList["+ i +"].Layer"));
			issueCategoryModelListItem.setResourceType(_ctx.stringValue("DescribeCustomerIssueCategoryResponse.IssueCategoryModelList["+ i +"].ResourceType"));
			issueCategoryModelListItem.setMetricSetId(_ctx.stringValue("DescribeCustomerIssueCategoryResponse.IssueCategoryModelList["+ i +"].MetricSetId"));

			issueCategoryModelList.add(issueCategoryModelListItem);
		}
		describeCustomerIssueCategoryResponse.setIssueCategoryModelList(issueCategoryModelList);
	 
	 	return describeCustomerIssueCategoryResponse;
	}
}