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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListSaasServiceResponse;
import com.aliyuncs.gpdb.model.v20160503.ListSaasServiceResponse.ItemsItem;
import com.aliyuncs.gpdb.model.v20160503.ListSaasServiceResponse.ItemsItem.ComponentsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSaasServiceResponseUnmarshaller {

	public static ListSaasServiceResponse unmarshall(ListSaasServiceResponse listSaasServiceResponse, UnmarshallerContext _ctx) {
		
		listSaasServiceResponse.setRequestId(_ctx.stringValue("ListSaasServiceResponse.RequestId"));
		listSaasServiceResponse.setTotalRecordCount(_ctx.integerValue("ListSaasServiceResponse.TotalRecordCount"));
		listSaasServiceResponse.setNextToken(_ctx.stringValue("ListSaasServiceResponse.NextToken"));
		listSaasServiceResponse.setMaxResults(_ctx.integerValue("ListSaasServiceResponse.MaxResults"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSaasServiceResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].Status"));
			itemsItem.setCu(_ctx.integerValue("ListSaasServiceResponse.Items["+ i +"].Cu"));
			itemsItem.setServiceName(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].ServiceName"));
			itemsItem.setServiceType(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].ServiceType"));
			itemsItem.setCreateTime(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].CreateTime"));
			itemsItem.setPayType(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].PayType"));
			itemsItem.setDeletionProtection(_ctx.booleanValue("ListSaasServiceResponse.Items["+ i +"].DeletionProtection"));
			itemsItem.setExpireTime(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].ExpireTime"));
			itemsItem.setPlan(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].Plan"));
			itemsItem.setServiceId(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].ServiceId"));

			List<ComponentsItem> components = new ArrayList<ComponentsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSaasServiceResponse.Items["+ i +"].Components.Length"); j++) {
				ComponentsItem componentsItem = new ComponentsItem();
				componentsItem.setStatus(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].Components["+ j +"].Status"));
				componentsItem.setComponentType(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].Components["+ j +"].ComponentType"));
				componentsItem.setCu(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].Components["+ j +"].Cu"));
				componentsItem.setCreateTime(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].Components["+ j +"].CreateTime"));
				componentsItem.setDeletionProtection(_ctx.booleanValue("ListSaasServiceResponse.Items["+ i +"].Components["+ j +"].DeletionProtection"));
				componentsItem.setComponentId(_ctx.stringValue("ListSaasServiceResponse.Items["+ i +"].Components["+ j +"].ComponentId"));

				components.add(componentsItem);
			}
			itemsItem.setComponents(components);

			items.add(itemsItem);
		}
		listSaasServiceResponse.setItems(items);
	 
	 	return listSaasServiceResponse;
	}
}