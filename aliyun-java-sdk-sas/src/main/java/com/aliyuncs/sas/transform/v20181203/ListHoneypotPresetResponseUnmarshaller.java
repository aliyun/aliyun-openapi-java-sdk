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

import com.aliyuncs.sas.model.v20181203.ListHoneypotPresetResponse;
import com.aliyuncs.sas.model.v20181203.ListHoneypotPresetResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.ListHoneypotPresetResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHoneypotPresetResponseUnmarshaller {

	public static ListHoneypotPresetResponse unmarshall(ListHoneypotPresetResponse listHoneypotPresetResponse, UnmarshallerContext _ctx) {
		
		listHoneypotPresetResponse.setRequestId(_ctx.stringValue("ListHoneypotPresetResponse.RequestId"));
		listHoneypotPresetResponse.setSuccess(_ctx.booleanValue("ListHoneypotPresetResponse.Success"));
		listHoneypotPresetResponse.setCode(_ctx.stringValue("ListHoneypotPresetResponse.Code"));
		listHoneypotPresetResponse.setMessage(_ctx.stringValue("ListHoneypotPresetResponse.Message"));
		listHoneypotPresetResponse.setHttpStatusCode(_ctx.integerValue("ListHoneypotPresetResponse.HttpStatusCode"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListHoneypotPresetResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListHoneypotPresetResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListHoneypotPresetResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListHoneypotPresetResponse.PageInfo.Count"));
		listHoneypotPresetResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHoneypotPresetResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setHoneypotImageName(_ctx.stringValue("ListHoneypotPresetResponse.List["+ i +"].HoneypotImageName"));
			listItem.setPresetName(_ctx.stringValue("ListHoneypotPresetResponse.List["+ i +"].PresetName"));
			listItem.setHoneypotPresetId(_ctx.stringValue("ListHoneypotPresetResponse.List["+ i +"].HoneypotPresetId"));
			listItem.setNodeId(_ctx.stringValue("ListHoneypotPresetResponse.List["+ i +"].NodeId"));
			listItem.setControlNodeName(_ctx.stringValue("ListHoneypotPresetResponse.List["+ i +"].ControlNodeName"));
			listItem.setHoneypotImageDisplayName(_ctx.stringValue("ListHoneypotPresetResponse.List["+ i +"].HoneypotImageDisplayName"));
			listItem.setPresetType(_ctx.stringValue("ListHoneypotPresetResponse.List["+ i +"].PresetType"));

			list.add(listItem);
		}
		listHoneypotPresetResponse.setList(list);
	 
	 	return listHoneypotPresetResponse;
	}
}