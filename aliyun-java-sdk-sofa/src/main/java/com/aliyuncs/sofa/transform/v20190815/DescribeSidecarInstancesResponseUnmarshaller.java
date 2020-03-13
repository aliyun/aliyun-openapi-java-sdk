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

import com.aliyuncs.sofa.model.v20190815.DescribeSidecarInstancesResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeSidecarInstancesResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSidecarInstancesResponseUnmarshaller {

	public static DescribeSidecarInstancesResponse unmarshall(DescribeSidecarInstancesResponse describeSidecarInstancesResponse, UnmarshallerContext _ctx) {
		
		describeSidecarInstancesResponse.setRequestId(_ctx.stringValue("DescribeSidecarInstancesResponse.RequestId"));
		describeSidecarInstancesResponse.setResultCode(_ctx.stringValue("DescribeSidecarInstancesResponse.ResultCode"));
		describeSidecarInstancesResponse.setResultMessage(_ctx.stringValue("DescribeSidecarInstancesResponse.ResultMessage"));
		describeSidecarInstancesResponse.setTotalCnt(_ctx.longValue("DescribeSidecarInstancesResponse.TotalCnt"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSidecarInstancesResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setAppServiceName(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].AppServiceName"));
			itemsItem.setClustername(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].Clustername"));
			itemsItem.setCreatedTime(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].CreatedTime"));
			itemsItem.setName(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].Name"));
			itemsItem.setNamespace(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].Namespace"));
			itemsItem.setPodIp(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].PodIp"));
			itemsItem.setPodName(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].PodName"));
			itemsItem.setPodStatus(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].PodStatus"));
			itemsItem.setSidecarStatus(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].SidecarStatus"));
			itemsItem.setSidecarType(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].SidecarType"));
			itemsItem.setSidecarVersion(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].SidecarVersion"));
			itemsItem.setType(_ctx.stringValue("DescribeSidecarInstancesResponse.Items["+ i +"].Type"));

			items.add(itemsItem);
		}
		describeSidecarInstancesResponse.setItems(items);
	 
	 	return describeSidecarInstancesResponse;
	}
}