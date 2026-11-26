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

import com.aliyuncs.gpdb.model.v20160503.ListWorkspacesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListWorkspacesResponse.ItemsItem;
import com.aliyuncs.gpdb.model.v20160503.ListWorkspacesResponse.ItemsItem.ApiKeysItem;
import com.aliyuncs.gpdb.model.v20160503.ListWorkspacesResponse.ItemsItem.ApiKeysItem.AuthServicesItem;
import com.aliyuncs.gpdb.model.v20160503.ListWorkspacesResponse.ItemsItem.ServicesItem;
import com.aliyuncs.gpdb.model.v20160503.ListWorkspacesResponse.ItemsItem.ServicesItem.ComponentsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkspacesResponseUnmarshaller {

	public static ListWorkspacesResponse unmarshall(ListWorkspacesResponse listWorkspacesResponse, UnmarshallerContext _ctx) {
		
		listWorkspacesResponse.setRequestId(_ctx.stringValue("ListWorkspacesResponse.RequestId"));
		listWorkspacesResponse.setTotalRecordCount(_ctx.integerValue("ListWorkspacesResponse.TotalRecordCount"));
		listWorkspacesResponse.setPageRecordCount(_ctx.integerValue("ListWorkspacesResponse.PageRecordCount"));
		listWorkspacesResponse.setNextToken(_ctx.stringValue("ListWorkspacesResponse.NextToken"));
		listWorkspacesResponse.setPageNumber(_ctx.integerValue("ListWorkspacesResponse.PageNumber"));
		listWorkspacesResponse.setMaxResults(_ctx.integerValue("ListWorkspacesResponse.MaxResults"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkspacesResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCreateTime(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].CreateTime"));
			itemsItem.setWorkspaceId(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].WorkspaceId"));
			itemsItem.setWorkspaceName(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].WorkspaceName"));

			List<ServicesItem> services = new ArrayList<ServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListWorkspacesResponse.Items["+ i +"].Services.Length"); j++) {
				ServicesItem servicesItem = new ServicesItem();
				servicesItem.setStatus(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Status"));
				servicesItem.setCu(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Cu"));
				servicesItem.setServiceName(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].ServiceName"));
				servicesItem.setServiceType(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].ServiceType"));
				servicesItem.setCreateTime(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].CreateTime"));
				servicesItem.setPayType(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].PayType"));
				servicesItem.setDeletionProtection(_ctx.booleanValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].DeletionProtection"));
				servicesItem.setExpireTime(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].ExpireTime"));
				servicesItem.setPlan(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Plan"));
				servicesItem.setServiceId(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].ServiceId"));

				List<ComponentsItem> components = new ArrayList<ComponentsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Components.Length"); k++) {
					ComponentsItem componentsItem = new ComponentsItem();
					componentsItem.setStatus(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Components["+ k +"].Status"));
					componentsItem.setComponentType(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Components["+ k +"].componentType"));
					componentsItem.setCu(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Components["+ k +"].Cu"));
					componentsItem.setComponentId(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Components["+ k +"].componentId"));
					componentsItem.setCreateTime(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Components["+ k +"].CreateTime"));
					componentsItem.setDeletionProtection(_ctx.booleanValue("ListWorkspacesResponse.Items["+ i +"].Services["+ j +"].Components["+ k +"].DeletionProtection"));

					components.add(componentsItem);
				}
				servicesItem.setComponents(components);

				services.add(servicesItem);
			}
			itemsItem.setServices(services);

			List<ApiKeysItem> apikeys = new ArrayList<ApiKeysItem>();
			for (int j = 0; j < _ctx.lengthValue("ListWorkspacesResponse.Items["+ i +"].Apikeys.Length"); j++) {
				ApiKeysItem apiKeysItem = new ApiKeysItem();
				apiKeysItem.setKeyName(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Apikeys["+ j +"].KeyName"));
				apiKeysItem.setDescription(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Apikeys["+ j +"].Description"));
				apiKeysItem.setCreateTime(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Apikeys["+ j +"].CreateTime"));
				apiKeysItem.setKeyId(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Apikeys["+ j +"].KeyId"));
				apiKeysItem.setKeyPrefix(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Apikeys["+ j +"].KeyPrefix"));

				List<AuthServicesItem> authServices = new ArrayList<AuthServicesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListWorkspacesResponse.Items["+ i +"].Apikeys["+ j +"].AuthServices.Length"); k++) {
					AuthServicesItem authServicesItem = new AuthServicesItem();
					authServicesItem.setServiceType(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Apikeys["+ j +"].AuthServices["+ k +"].ServiceType"));
					authServicesItem.setServiceId(_ctx.stringValue("ListWorkspacesResponse.Items["+ i +"].Apikeys["+ j +"].AuthServices["+ k +"].ServiceId"));

					authServices.add(authServicesItem);
				}
				apiKeysItem.setAuthServices(authServices);

				apikeys.add(apiKeysItem);
			}
			itemsItem.setApikeys(apikeys);

			items.add(itemsItem);
		}
		listWorkspacesResponse.setItems(items);
	 
	 	return listWorkspacesResponse;
	}
}