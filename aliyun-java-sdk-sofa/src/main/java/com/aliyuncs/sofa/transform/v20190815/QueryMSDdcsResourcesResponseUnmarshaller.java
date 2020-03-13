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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsResourcesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsResourcesResponse.ResourcesItem;
import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsResourcesResponse.ResourcesItem.AttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMSDdcsResourcesResponseUnmarshaller {

	public static QueryMSDdcsResourcesResponse unmarshall(QueryMSDdcsResourcesResponse queryMSDdcsResourcesResponse, UnmarshallerContext _ctx) {
		
		queryMSDdcsResourcesResponse.setRequestId(_ctx.stringValue("QueryMSDdcsResourcesResponse.RequestId"));
		queryMSDdcsResourcesResponse.setPageNum(_ctx.integerValue("QueryMSDdcsResourcesResponse.PageNum"));
		queryMSDdcsResourcesResponse.setPageSize(_ctx.integerValue("QueryMSDdcsResourcesResponse.PageSize"));
		queryMSDdcsResourcesResponse.setTotalCount(_ctx.integerValue("QueryMSDdcsResourcesResponse.TotalCount"));

		List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMSDdcsResourcesResponse.Resources.Length"); i++) {
			ResourcesItem resourcesItem = new ResourcesItem();
			resourcesItem.setAppName(_ctx.stringValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].AppName"));
			resourcesItem.setDesc(_ctx.stringValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].Desc"));
			resourcesItem.setId(_ctx.integerValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].Id"));
			resourcesItem.setInstanceId(_ctx.stringValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].InstanceId"));
			resourcesItem.setRegion(_ctx.stringValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].Region"));
			resourcesItem.setResourceId(_ctx.stringValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].ResourceId"));

			List<AttributesItem> attributes = new ArrayList<AttributesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].Attributes.Length"); j++) {
				AttributesItem attributesItem = new AttributesItem();
				attributesItem.setAttributeName(_ctx.stringValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].Attributes["+ j +"].AttributeName"));
				attributesItem.setDesc(_ctx.stringValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].Attributes["+ j +"].Desc"));
				attributesItem.setId(_ctx.integerValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].Attributes["+ j +"].Id"));
				attributesItem.setInstanceId(_ctx.stringValue("QueryMSDdcsResourcesResponse.Resources["+ i +"].Attributes["+ j +"].InstanceId"));

				attributes.add(attributesItem);
			}
			resourcesItem.setAttributes(attributes);

			resources.add(resourcesItem);
		}
		queryMSDdcsResourcesResponse.setResources(resources);
	 
	 	return queryMSDdcsResourcesResponse;
	}
}