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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.ListGroupDynamicRuleResponse;
import com.aliyuncs.cms.model.v20180308.ListGroupDynamicRuleResponse.ResourceItem;
import com.aliyuncs.cms.model.v20180308.ListGroupDynamicRuleResponse.ResourceItem.Filter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupDynamicRuleResponseUnmarshaller {

	public static ListGroupDynamicRuleResponse unmarshall(ListGroupDynamicRuleResponse listGroupDynamicRuleResponse, UnmarshallerContext context) {
		
		listGroupDynamicRuleResponse.setRequestId(context.stringValue("ListGroupDynamicRuleResponse.RequestId"));
		listGroupDynamicRuleResponse.setSuccess(context.booleanValue("ListGroupDynamicRuleResponse.Success"));
		listGroupDynamicRuleResponse.setErrorCode(context.integerValue("ListGroupDynamicRuleResponse.ErrorCode"));
		listGroupDynamicRuleResponse.setErrorMessage(context.stringValue("ListGroupDynamicRuleResponse.ErrorMessage"));
		listGroupDynamicRuleResponse.setPageNumber(context.integerValue("ListGroupDynamicRuleResponse.PageNumber"));
		listGroupDynamicRuleResponse.setPageSize(context.integerValue("ListGroupDynamicRuleResponse.PageSize"));
		listGroupDynamicRuleResponse.setTotal(context.integerValue("ListGroupDynamicRuleResponse.Total"));

		List<ResourceItem> resource = new ArrayList<ResourceItem>();
		for (int i = 0; i < context.lengthValue("ListGroupDynamicRuleResponse.Resource.Length"); i++) {
			ResourceItem resourceItem = new ResourceItem();
			resourceItem.setGroupId(context.longValue("ListGroupDynamicRuleResponse.Resource["+ i +"].GroupId"));
			resourceItem.setCategory(context.stringValue("ListGroupDynamicRuleResponse.Resource["+ i +"].Category"));
			resourceItem.setFilterRelation(context.stringValue("ListGroupDynamicRuleResponse.Resource["+ i +"].FilterRelation"));

			List<Filter> filters = new ArrayList<Filter>();
			for (int j = 0; j < context.lengthValue("ListGroupDynamicRuleResponse.Resource["+ i +"].Filters.Length"); j++) {
				Filter filter = new Filter();
				filter.setFunction(context.stringValue("ListGroupDynamicRuleResponse.Resource["+ i +"].Filters["+ j +"].Function"));
				filter.setName(context.stringValue("ListGroupDynamicRuleResponse.Resource["+ i +"].Filters["+ j +"].Name"));
				filter.setValue(context.stringValue("ListGroupDynamicRuleResponse.Resource["+ i +"].Filters["+ j +"].Value"));

				filters.add(filter);
			}
			resourceItem.setFilters(filters);

			resource.add(resourceItem);
		}
		listGroupDynamicRuleResponse.setResource(resource);
	 
	 	return listGroupDynamicRuleResponse;
	}
}