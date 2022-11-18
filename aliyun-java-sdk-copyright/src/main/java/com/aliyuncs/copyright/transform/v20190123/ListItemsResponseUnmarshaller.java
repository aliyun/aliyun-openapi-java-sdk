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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.ListItemsResponse;
import com.aliyuncs.copyright.model.v20190123.ListItemsResponse.Module;
import com.aliyuncs.copyright.model.v20190123.ListItemsResponse.Module.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListItemsResponseUnmarshaller {

	public static ListItemsResponse unmarshall(ListItemsResponse listItemsResponse, UnmarshallerContext _ctx) {
		
		listItemsResponse.setRequestId(_ctx.stringValue("ListItemsResponse.RequestId"));
		listItemsResponse.setHttpStatusCode(_ctx.integerValue("ListItemsResponse.HttpStatusCode"));
		listItemsResponse.setDynamicCode(_ctx.stringValue("ListItemsResponse.DynamicCode"));
		listItemsResponse.setDynamicMessage(_ctx.stringValue("ListItemsResponse.DynamicMessage"));
		listItemsResponse.setErrorMsg(_ctx.stringValue("ListItemsResponse.ErrorMsg"));
		listItemsResponse.setErrorCode(_ctx.stringValue("ListItemsResponse.ErrorCode"));
		listItemsResponse.setSuccess(_ctx.booleanValue("ListItemsResponse.Success"));
		listItemsResponse.setAllowRetry(_ctx.booleanValue("ListItemsResponse.AllowRetry"));
		listItemsResponse.setAppName(_ctx.stringValue("ListItemsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListItemsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListItemsResponse.ErrorArgs["+ i +"]"));
		}
		listItemsResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalNum(_ctx.integerValue("ListItemsResponse.Module.TotalNum"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListItemsResponse.Module.Items.Length"); i++) {
			Item item = new Item();
			item.setItemId(_ctx.integerValue("ListItemsResponse.Module.Items["+ i +"].ItemId"));
			item.setTitle(_ctx.stringValue("ListItemsResponse.Module.Items["+ i +"].Title"));
			item.setPicUrl(_ctx.stringValue("ListItemsResponse.Module.Items["+ i +"].PicUrl"));
			item.setDescription(_ctx.stringValue("ListItemsResponse.Module.Items["+ i +"].Description"));
			item.setLeftNum(_ctx.integerValue("ListItemsResponse.Module.Items["+ i +"].LeftNum"));
			item.setTotalNum(_ctx.integerValue("ListItemsResponse.Module.Items["+ i +"].TotalNum"));

			items.add(item);
		}
		module.setItems(items);
		listItemsResponse.setModule(module);
	 
	 	return listItemsResponse;
	}
}