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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListAdviceActionResponse;
import com.aliyuncs.emr.model.v20160408.ListAdviceActionResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAdviceActionResponseUnmarshaller {

	public static ListAdviceActionResponse unmarshall(ListAdviceActionResponse listAdviceActionResponse, UnmarshallerContext _ctx) {
		
		listAdviceActionResponse.setRequestId(_ctx.stringValue("ListAdviceActionResponse.RequestId"));
		listAdviceActionResponse.setPageNumber(_ctx.integerValue("ListAdviceActionResponse.PageNumber"));
		listAdviceActionResponse.setPageSize(_ctx.integerValue("ListAdviceActionResponse.PageSize"));
		listAdviceActionResponse.setTotalCount(_ctx.integerValue("ListAdviceActionResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListAdviceActionResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setConfigName(_ctx.stringValue("ListAdviceActionResponse.Items["+ i +"].ConfigName"));
			item.setConfigItemKey(_ctx.stringValue("ListAdviceActionResponse.Items["+ i +"].ConfigItemKey"));
			item.setCommand(_ctx.stringValue("ListAdviceActionResponse.Items["+ i +"].Command"));
			item.setClusterId(_ctx.stringValue("ListAdviceActionResponse.Items["+ i +"].ClusterId"));
			item.setHostgroupName(_ctx.stringValue("ListAdviceActionResponse.Items["+ i +"].HostgroupName"));
			item.setServiceName(_ctx.stringValue("ListAdviceActionResponse.Items["+ i +"].ServiceName"));
			item.setComponent(_ctx.stringValue("ListAdviceActionResponse.Items["+ i +"].Component"));
			item.setActionType(_ctx.stringValue("ListAdviceActionResponse.Items["+ i +"].ActionType"));
			item.setGmtCreate(_ctx.longValue("ListAdviceActionResponse.Items["+ i +"].GmtCreate"));
			item.setGmtModified(_ctx.longValue("ListAdviceActionResponse.Items["+ i +"].GmtModified"));

			items.add(item);
		}
		listAdviceActionResponse.setItems(items);
	 
	 	return listAdviceActionResponse;
	}
}