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

package com.aliyuncs.computenest.transform.v20210601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenest.model.v20210601.ListServiceInstanceResourcesResponse;
import com.aliyuncs.computenest.model.v20210601.ListServiceInstanceResourcesResponse.ResourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceInstanceResourcesResponseUnmarshaller {

	public static ListServiceInstanceResourcesResponse unmarshall(ListServiceInstanceResourcesResponse listServiceInstanceResourcesResponse, UnmarshallerContext _ctx) {
		
		listServiceInstanceResourcesResponse.setRequestId(_ctx.stringValue("ListServiceInstanceResourcesResponse.RequestId"));
		listServiceInstanceResourcesResponse.setNextToken(_ctx.stringValue("ListServiceInstanceResourcesResponse.NextToken"));
		listServiceInstanceResourcesResponse.setMaxResults(_ctx.stringValue("ListServiceInstanceResourcesResponse.MaxResults"));

		List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceInstanceResourcesResponse.Resources.Length"); i++) {
			ResourcesItem resourcesItem = new ResourcesItem();
			resourcesItem.setResourceARN(_ctx.stringValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].ResourceARN"));
			resourcesItem.setPayType(_ctx.stringValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].PayType"));
			resourcesItem.setRenewStatus(_ctx.stringValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].RenewStatus"));
			resourcesItem.setCreateTime(_ctx.stringValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].CreateTime"));
			resourcesItem.setExpireTime(_ctx.stringValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].ExpireTime"));
			resourcesItem.setRenewalPeriod(_ctx.integerValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].RenewalPeriod"));
			resourcesItem.setRenewalPeriodUnit(_ctx.stringValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].RenewalPeriodUnit"));
			resourcesItem.setProductType(_ctx.stringValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].ProductType"));
			resourcesItem.setProductCode(_ctx.stringValue("ListServiceInstanceResourcesResponse.Resources["+ i +"].ProductCode"));

			resources.add(resourcesItem);
		}
		listServiceInstanceResourcesResponse.setResources(resources);
	 
	 	return listServiceInstanceResourcesResponse;
	}
}