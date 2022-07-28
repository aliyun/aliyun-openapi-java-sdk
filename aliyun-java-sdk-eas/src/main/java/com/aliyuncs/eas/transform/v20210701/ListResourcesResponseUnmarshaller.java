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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListResourcesResponse;
import com.aliyuncs.eas.model.v20210701.ListResourcesResponse.ResourcesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcesResponseUnmarshaller {

	public static ListResourcesResponse unmarshall(ListResourcesResponse listResourcesResponse, UnmarshallerContext _ctx) {
		
		listResourcesResponse.setRequestId(_ctx.stringValue("ListResourcesResponse.RequestId"));
		listResourcesResponse.setPageNumber(_ctx.integerValue("ListResourcesResponse.PageNumber"));
		listResourcesResponse.setPageSize(_ctx.integerValue("ListResourcesResponse.PageSize"));
		listResourcesResponse.setTotalCount(_ctx.integerValue("ListResourcesResponse.TotalCount"));

		List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourcesResponse.Resources.Length"); i++) {
			ResourcesItem resourcesItem = new ResourcesItem();
			resourcesItem.setResourceId(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].ResourceId"));
			resourcesItem.setResourceName(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].ResourceName"));
			resourcesItem.setClusterId(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].ClusterId"));
			resourcesItem.setCreateTime(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].CreateTime"));
			resourcesItem.setUpdateTime(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].UpdateTime"));
			resourcesItem.setInstanceCount(_ctx.integerValue("ListResourcesResponse.Resources["+ i +"].InstanceCount"));
			resourcesItem.setPrePaidInstanceCount(_ctx.integerValue("ListResourcesResponse.Resources["+ i +"].PrePaidInstanceCount"));
			resourcesItem.setPostPaidInstanceCount(_ctx.integerValue("ListResourcesResponse.Resources["+ i +"].PostPaidInstanceCount"));
			resourcesItem.setCpuCount(_ctx.integerValue("ListResourcesResponse.Resources["+ i +"].CpuCount"));
			resourcesItem.setGpuCount(_ctx.integerValue("ListResourcesResponse.Resources["+ i +"].GpuCount"));
			resourcesItem.setStatus(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].Status"));
			resourcesItem.setMessage(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].Message"));
			resourcesItem.setExtraData(_ctx.mapValue("ListResourcesResponse.Resources["+ i +"].ExtraData"));

			resources.add(resourcesItem);
		}
		listResourcesResponse.setResources(resources);
	 
	 	return listResourcesResponse;
	}
}