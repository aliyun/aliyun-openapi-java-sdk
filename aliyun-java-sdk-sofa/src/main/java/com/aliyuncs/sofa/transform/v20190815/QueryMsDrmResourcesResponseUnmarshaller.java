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

import com.aliyuncs.sofa.model.v20190815.QueryMsDrmResourcesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsDrmResourcesResponse.DrmResourcesItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsDrmResourcesResponse.DrmResourcesItem.AttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsDrmResourcesResponseUnmarshaller {

	public static QueryMsDrmResourcesResponse unmarshall(QueryMsDrmResourcesResponse queryMsDrmResourcesResponse, UnmarshallerContext _ctx) {
		
		queryMsDrmResourcesResponse.setRequestId(_ctx.stringValue("QueryMsDrmResourcesResponse.RequestId"));
		queryMsDrmResourcesResponse.setResultCode(_ctx.stringValue("QueryMsDrmResourcesResponse.ResultCode"));
		queryMsDrmResourcesResponse.setResultMessage(_ctx.stringValue("QueryMsDrmResourcesResponse.ResultMessage"));
		queryMsDrmResourcesResponse.setCurrentPage(_ctx.longValue("QueryMsDrmResourcesResponse.CurrentPage"));
		queryMsDrmResourcesResponse.setPageSize(_ctx.longValue("QueryMsDrmResourcesResponse.PageSize"));
		queryMsDrmResourcesResponse.setStartIndex(_ctx.longValue("QueryMsDrmResourcesResponse.StartIndex"));
		queryMsDrmResourcesResponse.setTotalSize(_ctx.longValue("QueryMsDrmResourcesResponse.TotalSize"));

		List<DrmResourcesItem> drmResources = new ArrayList<DrmResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsDrmResourcesResponse.DrmResources.Length"); i++) {
			DrmResourcesItem drmResourcesItem = new DrmResourcesItem();
			drmResourcesItem.setAppName(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].AppName"));
			drmResourcesItem.setId(_ctx.longValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Id"));
			drmResourcesItem.setInstanceId(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].InstanceId"));
			drmResourcesItem.setName(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Name"));
			drmResourcesItem.setRegion(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Region"));
			drmResourcesItem.setResourceDomain(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].ResourceDomain"));
			drmResourcesItem.setResourceId(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].ResourceId"));
			drmResourcesItem.setResourceVersion(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].ResourceVersion"));
			drmResourcesItem.setType(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Type"));

			List<AttributesItem> attributes = new ArrayList<AttributesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Attributes.Length"); j++) {
				AttributesItem attributesItem = new AttributesItem();
				attributesItem.setAttributeName(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Attributes["+ j +"].AttributeName"));
				attributesItem.setDataId(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Attributes["+ j +"].DataId"));
				attributesItem.setId(_ctx.longValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Attributes["+ j +"].Id"));
				attributesItem.setInstanceId(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Attributes["+ j +"].InstanceId"));
				attributesItem.setName(_ctx.stringValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Attributes["+ j +"].Name"));
				attributesItem.setParentId(_ctx.longValue("QueryMsDrmResourcesResponse.DrmResources["+ i +"].Attributes["+ j +"].ParentId"));

				attributes.add(attributesItem);
			}
			drmResourcesItem.setAttributes(attributes);

			drmResources.add(drmResourcesItem);
		}
		queryMsDrmResourcesResponse.setDrmResources(drmResources);
	 
	 	return queryMsDrmResourcesResponse;
	}
}