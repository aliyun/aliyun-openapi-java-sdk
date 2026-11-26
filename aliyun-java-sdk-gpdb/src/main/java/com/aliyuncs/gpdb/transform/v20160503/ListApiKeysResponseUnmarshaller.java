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

import com.aliyuncs.gpdb.model.v20160503.ListApiKeysResponse;
import com.aliyuncs.gpdb.model.v20160503.ListApiKeysResponse.ItemsItem;
import com.aliyuncs.gpdb.model.v20160503.ListApiKeysResponse.ItemsItem.AuthServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApiKeysResponseUnmarshaller {

	public static ListApiKeysResponse unmarshall(ListApiKeysResponse listApiKeysResponse, UnmarshallerContext _ctx) {
		
		listApiKeysResponse.setRequestId(_ctx.stringValue("ListApiKeysResponse.RequestId"));
		listApiKeysResponse.setTotalRecordCount(_ctx.integerValue("ListApiKeysResponse.TotalRecordCount"));
		listApiKeysResponse.setNextToken(_ctx.stringValue("ListApiKeysResponse.NextToken"));
		listApiKeysResponse.setMaxResults(_ctx.integerValue("ListApiKeysResponse.MaxResults"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListApiKeysResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setKeyName(_ctx.stringValue("ListApiKeysResponse.Items["+ i +"].KeyName"));
			itemsItem.setDescription(_ctx.stringValue("ListApiKeysResponse.Items["+ i +"].Description"));
			itemsItem.setCreateTime(_ctx.stringValue("ListApiKeysResponse.Items["+ i +"].CreateTime"));
			itemsItem.setKeyId(_ctx.stringValue("ListApiKeysResponse.Items["+ i +"].KeyId"));
			itemsItem.setKeyPrefix(_ctx.stringValue("ListApiKeysResponse.Items["+ i +"].KeyPrefix"));

			List<AuthServicesItem> authServices = new ArrayList<AuthServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApiKeysResponse.Items["+ i +"].AuthServices.Length"); j++) {
				AuthServicesItem authServicesItem = new AuthServicesItem();
				authServicesItem.setServiceType(_ctx.stringValue("ListApiKeysResponse.Items["+ i +"].AuthServices["+ j +"].ServiceType"));
				authServicesItem.setServiceId(_ctx.stringValue("ListApiKeysResponse.Items["+ i +"].AuthServices["+ j +"].ServiceId"));

				authServices.add(authServicesItem);
			}
			itemsItem.setAuthServices(authServices);

			items.add(itemsItem);
		}
		listApiKeysResponse.setItems(items);
	 
	 	return listApiKeysResponse;
	}
}