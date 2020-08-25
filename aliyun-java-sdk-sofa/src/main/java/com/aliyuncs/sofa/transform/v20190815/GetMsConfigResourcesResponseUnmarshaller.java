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

import com.aliyuncs.sofa.model.v20190815.GetMsConfigResourcesResponse;
import com.aliyuncs.sofa.model.v20190815.GetMsConfigResourcesResponse.Resource;
import com.aliyuncs.sofa.model.v20190815.GetMsConfigResourcesResponse.Resource.AttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsConfigResourcesResponseUnmarshaller {

	public static GetMsConfigResourcesResponse unmarshall(GetMsConfigResourcesResponse getMsConfigResourcesResponse, UnmarshallerContext _ctx) {
		
		getMsConfigResourcesResponse.setRequestId(_ctx.stringValue("GetMsConfigResourcesResponse.RequestId"));
		getMsConfigResourcesResponse.setResultCode(_ctx.stringValue("GetMsConfigResourcesResponse.ResultCode"));
		getMsConfigResourcesResponse.setResultMessage(_ctx.stringValue("GetMsConfigResourcesResponse.ResultMessage"));

		Resource resource = new Resource();
		resource.setAppName(_ctx.stringValue("GetMsConfigResourcesResponse.Resource.AppName"));
		resource.setDesc(_ctx.stringValue("GetMsConfigResourcesResponse.Resource.Desc"));
		resource.setId(_ctx.longValue("GetMsConfigResourcesResponse.Resource.Id"));
		resource.setInstanceId(_ctx.stringValue("GetMsConfigResourcesResponse.Resource.InstanceId"));
		resource.setRegion(_ctx.stringValue("GetMsConfigResourcesResponse.Resource.Region"));
		resource.setResourceId(_ctx.stringValue("GetMsConfigResourcesResponse.Resource.ResourceId"));

		List<AttributesItem> attributes = new ArrayList<AttributesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMsConfigResourcesResponse.Resource.Attributes.Length"); i++) {
			AttributesItem attributesItem = new AttributesItem();
			attributesItem.setAttributeName(_ctx.stringValue("GetMsConfigResourcesResponse.Resource.Attributes["+ i +"].AttributeName"));
			attributesItem.setDesc(_ctx.stringValue("GetMsConfigResourcesResponse.Resource.Attributes["+ i +"].Desc"));
			attributesItem.setId(_ctx.longValue("GetMsConfigResourcesResponse.Resource.Attributes["+ i +"].Id"));
			attributesItem.setInstanceId(_ctx.stringValue("GetMsConfigResourcesResponse.Resource.Attributes["+ i +"].InstanceId"));

			attributes.add(attributesItem);
		}
		resource.setAttributes(attributes);
		getMsConfigResourcesResponse.setResource(resource);
	 
	 	return getMsConfigResourcesResponse;
	}
}