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

import com.aliyuncs.sofa.model.v20190815.AddMsConfigResourcesResponse;
import com.aliyuncs.sofa.model.v20190815.AddMsConfigResourcesResponse.Resource;
import com.aliyuncs.sofa.model.v20190815.AddMsConfigResourcesResponse.Resource.AttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMsConfigResourcesResponseUnmarshaller {

	public static AddMsConfigResourcesResponse unmarshall(AddMsConfigResourcesResponse addMsConfigResourcesResponse, UnmarshallerContext _ctx) {
		
		addMsConfigResourcesResponse.setRequestId(_ctx.stringValue("AddMsConfigResourcesResponse.RequestId"));
		addMsConfigResourcesResponse.setResultCode(_ctx.stringValue("AddMsConfigResourcesResponse.ResultCode"));
		addMsConfigResourcesResponse.setResultMessage(_ctx.stringValue("AddMsConfigResourcesResponse.ResultMessage"));

		Resource resource = new Resource();
		resource.setAppName(_ctx.stringValue("AddMsConfigResourcesResponse.Resource.AppName"));
		resource.setDesc(_ctx.stringValue("AddMsConfigResourcesResponse.Resource.Desc"));
		resource.setId(_ctx.longValue("AddMsConfigResourcesResponse.Resource.Id"));
		resource.setInstanceId(_ctx.stringValue("AddMsConfigResourcesResponse.Resource.InstanceId"));
		resource.setRegion(_ctx.stringValue("AddMsConfigResourcesResponse.Resource.Region"));
		resource.setResourceId(_ctx.stringValue("AddMsConfigResourcesResponse.Resource.ResourceId"));

		List<AttributesItem> attributes = new ArrayList<AttributesItem>();
		for (int i = 0; i < _ctx.lengthValue("AddMsConfigResourcesResponse.Resource.Attributes.Length"); i++) {
			AttributesItem attributesItem = new AttributesItem();
			attributesItem.setAttributeName(_ctx.stringValue("AddMsConfigResourcesResponse.Resource.Attributes["+ i +"].AttributeName"));
			attributesItem.setDesc(_ctx.stringValue("AddMsConfigResourcesResponse.Resource.Attributes["+ i +"].Desc"));
			attributesItem.setId(_ctx.longValue("AddMsConfigResourcesResponse.Resource.Attributes["+ i +"].Id"));
			attributesItem.setInstanceId(_ctx.stringValue("AddMsConfigResourcesResponse.Resource.Attributes["+ i +"].InstanceId"));

			attributes.add(attributesItem);
		}
		resource.setAttributes(attributes);
		addMsConfigResourcesResponse.setResource(resource);
	 
	 	return addMsConfigResourcesResponse;
	}
}