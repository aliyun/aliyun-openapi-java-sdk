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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListAllTenantBindNumberBindingResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListAllTenantBindNumberBindingResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.ListAllTenantBindNumberBindingResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllTenantBindNumberBindingResponseUnmarshaller {

	public static ListAllTenantBindNumberBindingResponse unmarshall(ListAllTenantBindNumberBindingResponse listAllTenantBindNumberBindingResponse, UnmarshallerContext _ctx) {
		
		listAllTenantBindNumberBindingResponse.setRequestId(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.RequestId"));
		listAllTenantBindNumberBindingResponse.setSuccess(_ctx.booleanValue("ListAllTenantBindNumberBindingResponse.Success"));
		listAllTenantBindNumberBindingResponse.setCode(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.Code"));
		listAllTenantBindNumberBindingResponse.setMessage(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.Message"));
		listAllTenantBindNumberBindingResponse.setHttpStatusCode(_ctx.integerValue("ListAllTenantBindNumberBindingResponse.HttpStatusCode"));

		Data data = new Data();

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAllTenantBindNumberBindingResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setBindingId(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.Data.List["+ i +"].BindingId"));
			listItem.setNumber(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.Data.List["+ i +"].Number"));
			listItem.setTrunkName(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.Data.List["+ i +"].TrunkName"));
			listItem.setSerializedParams(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.Data.List["+ i +"].SerializedParams"));
			listItem.setBillingType(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.Data.List["+ i +"].BillingType"));

			List<String> instanceNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAllTenantBindNumberBindingResponse.Data.List["+ i +"].InstanceNameList.Length"); j++) {
				instanceNameList.add(_ctx.stringValue("ListAllTenantBindNumberBindingResponse.Data.List["+ i +"].InstanceNameList["+ j +"]"));
			}
			listItem.setInstanceNameList(instanceNameList);

			list.add(listItem);
		}
		data.setList(list);
		listAllTenantBindNumberBindingResponse.setData(data);
	 
	 	return listAllTenantBindNumberBindingResponse;
	}
}