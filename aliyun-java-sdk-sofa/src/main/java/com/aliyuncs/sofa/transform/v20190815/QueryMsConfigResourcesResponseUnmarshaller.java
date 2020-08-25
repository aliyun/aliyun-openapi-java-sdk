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

import com.aliyuncs.sofa.model.v20190815.QueryMsConfigResourcesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsConfigResourcesResponse.ResourcesItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsConfigResourcesResponse.ResourcesItem.AttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsConfigResourcesResponseUnmarshaller {

	public static QueryMsConfigResourcesResponse unmarshall(QueryMsConfigResourcesResponse queryMsConfigResourcesResponse, UnmarshallerContext _ctx) {
		
		queryMsConfigResourcesResponse.setRequestId(_ctx.stringValue("QueryMsConfigResourcesResponse.RequestId"));
		queryMsConfigResourcesResponse.setResultCode(_ctx.stringValue("QueryMsConfigResourcesResponse.ResultCode"));
		queryMsConfigResourcesResponse.setResultMessage(_ctx.stringValue("QueryMsConfigResourcesResponse.ResultMessage"));
		queryMsConfigResourcesResponse.setPageNum(_ctx.longValue("QueryMsConfigResourcesResponse.PageNum"));
		queryMsConfigResourcesResponse.setPageSize(_ctx.longValue("QueryMsConfigResourcesResponse.PageSize"));
		queryMsConfigResourcesResponse.setTotalCount(_ctx.longValue("QueryMsConfigResourcesResponse.TotalCount"));

		List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsConfigResourcesResponse.Resources.Length"); i++) {
			ResourcesItem resourcesItem = new ResourcesItem();
			resourcesItem.setAppName(_ctx.stringValue("QueryMsConfigResourcesResponse.Resources["+ i +"].AppName"));
			resourcesItem.setDesc(_ctx.stringValue("QueryMsConfigResourcesResponse.Resources["+ i +"].Desc"));
			resourcesItem.setId(_ctx.longValue("QueryMsConfigResourcesResponse.Resources["+ i +"].Id"));
			resourcesItem.setInstanceId(_ctx.stringValue("QueryMsConfigResourcesResponse.Resources["+ i +"].InstanceId"));
			resourcesItem.setRegion(_ctx.stringValue("QueryMsConfigResourcesResponse.Resources["+ i +"].Region"));
			resourcesItem.setResourceId(_ctx.stringValue("QueryMsConfigResourcesResponse.Resources["+ i +"].ResourceId"));

			List<AttributesItem> attributes = new ArrayList<AttributesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsConfigResourcesResponse.Resources["+ i +"].Attributes.Length"); j++) {
				AttributesItem attributesItem = new AttributesItem();
				attributesItem.setAttributeName(_ctx.stringValue("QueryMsConfigResourcesResponse.Resources["+ i +"].Attributes["+ j +"].AttributeName"));
				attributesItem.setDesc(_ctx.stringValue("QueryMsConfigResourcesResponse.Resources["+ i +"].Attributes["+ j +"].Desc"));
				attributesItem.setId(_ctx.longValue("QueryMsConfigResourcesResponse.Resources["+ i +"].Attributes["+ j +"].Id"));
				attributesItem.setInstanceId(_ctx.stringValue("QueryMsConfigResourcesResponse.Resources["+ i +"].Attributes["+ j +"].InstanceId"));

				attributes.add(attributesItem);
			}
			resourcesItem.setAttributes(attributes);

			resources.add(resourcesItem);
		}
		queryMsConfigResourcesResponse.setResources(resources);
	 
	 	return queryMsConfigResourcesResponse;
	}
}