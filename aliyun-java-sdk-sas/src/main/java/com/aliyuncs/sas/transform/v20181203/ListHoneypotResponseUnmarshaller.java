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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListHoneypotResponse;
import com.aliyuncs.sas.model.v20181203.ListHoneypotResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.ListHoneypotResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHoneypotResponseUnmarshaller {

	public static ListHoneypotResponse unmarshall(ListHoneypotResponse listHoneypotResponse, UnmarshallerContext _ctx) {
		
		listHoneypotResponse.setRequestId(_ctx.stringValue("ListHoneypotResponse.RequestId"));
		listHoneypotResponse.setSuccess(_ctx.booleanValue("ListHoneypotResponse.Success"));
		listHoneypotResponse.setCode(_ctx.stringValue("ListHoneypotResponse.Code"));
		listHoneypotResponse.setMessage(_ctx.stringValue("ListHoneypotResponse.Message"));
		listHoneypotResponse.setHttpStatusCode(_ctx.integerValue("ListHoneypotResponse.HttpStatusCode"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListHoneypotResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListHoneypotResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListHoneypotResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListHoneypotResponse.PageInfo.Count"));
		pageInfo.setLastRowKey(_ctx.stringValue("ListHoneypotResponse.PageInfo.LastRowKey"));
		listHoneypotResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHoneypotResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setHoneypotId(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].HoneypotId"));
			listItem.setHoneypotName(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].HoneypotName"));
			listItem.setControlNodeName(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].ControlNodeName"));
			listItem.setHoneypotImageName(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].HoneypotImageName"));
			listItem.setPresetId(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].PresetId"));
			listItem.setHoneypotImageDisplayName(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].HoneypotImageDisplayName"));
			listItem.setNodeId(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].NodeId"));
			listItem.setHoneypotImageId(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].HoneypotImageId"));

			List<String> state = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListHoneypotResponse.List["+ i +"].State.Length"); j++) {
				state.add(_ctx.stringValue("ListHoneypotResponse.List["+ i +"].State["+ j +"]"));
			}
			listItem.setState(state);

			list.add(listItem);
		}
		listHoneypotResponse.setList(list);
	 
	 	return listHoneypotResponse;
	}
}