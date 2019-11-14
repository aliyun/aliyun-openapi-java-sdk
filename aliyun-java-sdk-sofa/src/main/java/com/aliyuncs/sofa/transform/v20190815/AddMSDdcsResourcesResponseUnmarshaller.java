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

import com.aliyuncs.sofa.model.v20190815.AddMSDdcsResourcesResponse;
import com.aliyuncs.sofa.model.v20190815.AddMSDdcsResourcesResponse.Resource;
import com.aliyuncs.sofa.model.v20190815.AddMSDdcsResourcesResponse.Resource.AttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMSDdcsResourcesResponseUnmarshaller {

	public static AddMSDdcsResourcesResponse unmarshall(AddMSDdcsResourcesResponse addMSDdcsResourcesResponse, UnmarshallerContext _ctx) {
		
		addMSDdcsResourcesResponse.setRequestId(_ctx.stringValue("AddMSDdcsResourcesResponse.RequestId"));

		Resource resource = new Resource();
		resource.setAppName(_ctx.stringValue("AddMSDdcsResourcesResponse.Resource.AppName"));
		resource.setDesc(_ctx.stringValue("AddMSDdcsResourcesResponse.Resource.Desc"));
		resource.setId(_ctx.integerValue("AddMSDdcsResourcesResponse.Resource.Id"));
		resource.setInstanceId(_ctx.stringValue("AddMSDdcsResourcesResponse.Resource.InstanceId"));
		resource.setRegion(_ctx.stringValue("AddMSDdcsResourcesResponse.Resource.Region"));
		resource.setResourceId(_ctx.stringValue("AddMSDdcsResourcesResponse.Resource.ResourceId"));

		List<AttributesItem> attributes = new ArrayList<AttributesItem>();
		for (int i = 0; i < _ctx.lengthValue("AddMSDdcsResourcesResponse.Resource.Attributes.Length"); i++) {
			AttributesItem attributesItem = new AttributesItem();
			attributesItem.setAttributeName(_ctx.stringValue("AddMSDdcsResourcesResponse.Resource.Attributes["+ i +"].AttributeName"));
			attributesItem.setDesc(_ctx.stringValue("AddMSDdcsResourcesResponse.Resource.Attributes["+ i +"].Desc"));
			attributesItem.setId(_ctx.integerValue("AddMSDdcsResourcesResponse.Resource.Attributes["+ i +"].Id"));
			attributesItem.setInstanceId(_ctx.stringValue("AddMSDdcsResourcesResponse.Resource.Attributes["+ i +"].InstanceId"));

			attributes.add(attributesItem);
		}
		resource.setAttributes(attributes);
		addMSDdcsResourcesResponse.setResource(resource);
	 
	 	return addMSDdcsResourcesResponse;
	}
}