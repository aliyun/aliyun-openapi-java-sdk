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

import com.aliyuncs.pairecservice.model.v20221213.ListInstanceResourcesResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListInstanceResourcesResponse.ResourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResourcesResponseUnmarshaller {

	public static ListInstanceResourcesResponse unmarshall(ListInstanceResourcesResponse listInstanceResourcesResponse, UnmarshallerContext _ctx) {
		
		listInstanceResourcesResponse.setRequestId(_ctx.stringValue("ListInstanceResourcesResponse.RequestId"));
		listInstanceResourcesResponse.setTotalCount(_ctx.longValue("ListInstanceResourcesResponse.TotalCount"));

		List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceResourcesResponse.Resources.Length"); i++) {
			ResourcesItem resourcesItem = new ResourcesItem();
			resourcesItem.setResourceId(_ctx.stringValue("ListInstanceResourcesResponse.Resources["+ i +"].ResourceId"));
			resourcesItem.setCategory(_ctx.stringValue("ListInstanceResourcesResponse.Resources["+ i +"].Category"));
			resourcesItem.setGroup(_ctx.stringValue("ListInstanceResourcesResponse.Resources["+ i +"].Group"));
			resourcesItem.setType(_ctx.stringValue("ListInstanceResourcesResponse.Resources["+ i +"].Type"));
			resourcesItem.setUri(_ctx.stringValue("ListInstanceResourcesResponse.Resources["+ i +"].Uri"));
			resourcesItem.setConfig(_ctx.stringValue("ListInstanceResourcesResponse.Resources["+ i +"].Config"));
			resourcesItem.setGmtCreateAt(_ctx.stringValue("ListInstanceResourcesResponse.Resources["+ i +"].GmtCreateAt"));
			resourcesItem.setGmtModifiedAt(_ctx.stringValue("ListInstanceResourcesResponse.Resources["+ i +"].GmtModifiedAt"));

			resources.add(resourcesItem);
		}
		listInstanceResourcesResponse.setResources(resources);
	 
	 	return listInstanceResourcesResponse;
	}
}