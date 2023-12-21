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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.CheckInstanceResourcesResponse;
import com.aliyuncs.pairecservice.model.v20221213.CheckInstanceResourcesResponse.ResourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckInstanceResourcesResponseUnmarshaller {

	public static CheckInstanceResourcesResponse unmarshall(CheckInstanceResourcesResponse checkInstanceResourcesResponse, UnmarshallerContext _ctx) {
		
		checkInstanceResourcesResponse.setRequestId(_ctx.stringValue("CheckInstanceResourcesResponse.RequestId"));

		List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckInstanceResourcesResponse.Resources.Length"); i++) {
			ResourcesItem resourcesItem = new ResourcesItem();
			resourcesItem.setType(_ctx.stringValue("CheckInstanceResourcesResponse.Resources["+ i +"].Type"));
			resourcesItem.setUri(_ctx.stringValue("CheckInstanceResourcesResponse.Resources["+ i +"].Uri"));
			resourcesItem.setStatus(_ctx.stringValue("CheckInstanceResourcesResponse.Resources["+ i +"].Status"));

			resources.add(resourcesItem);
		}
		checkInstanceResourcesResponse.setResources(resources);
	 
	 	return checkInstanceResourcesResponse;
	}
}