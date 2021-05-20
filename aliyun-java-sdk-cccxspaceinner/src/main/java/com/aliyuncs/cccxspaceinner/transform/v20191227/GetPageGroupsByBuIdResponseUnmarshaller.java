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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.GetPageGroupsByBuIdResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetPageGroupsByBuIdResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetPageGroupsByBuIdResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPageGroupsByBuIdResponseUnmarshaller {

	public static GetPageGroupsByBuIdResponse unmarshall(GetPageGroupsByBuIdResponse getPageGroupsByBuIdResponse, UnmarshallerContext _ctx) {
		
		getPageGroupsByBuIdResponse.setMessage(_ctx.stringValue("GetPageGroupsByBuIdResponse.Message"));
		getPageGroupsByBuIdResponse.setCode(_ctx.stringValue("GetPageGroupsByBuIdResponse.Code"));
		getPageGroupsByBuIdResponse.setSuccess(_ctx.booleanValue("GetPageGroupsByBuIdResponse.Success"));

		Data data = new Data();
		data.setLastSortKey(_ctx.longValue("GetPageGroupsByBuIdResponse.Data.LastSortKey"));
		data.setPageSize(_ctx.integerValue("GetPageGroupsByBuIdResponse.Data.PageSize"));
		data.setHasNextPage(_ctx.booleanValue("GetPageGroupsByBuIdResponse.Data.HasNextPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPageGroupsByBuIdResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setStatus(_ctx.integerValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].Status"));
			listItem.setBuId(_ctx.longValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].BuId"));
			listItem.setShowName(_ctx.stringValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].ShowName"));
			listItem.setDescription(_ctx.stringValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].Description"));
			listItem.setGroupName(_ctx.stringValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].GroupName"));
			listItem.setGroupId(_ctx.longValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].GroupId"));
			listItem.setChannelType(_ctx.integerValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].ChannelType"));
			listItem.setDepartmentId(_ctx.longValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].DepartmentId"));
			listItem.setIsPublic(_ctx.booleanValue("GetPageGroupsByBuIdResponse.Data.List["+ i +"].IsPublic"));

			list.add(listItem);
		}
		data.setList(list);
		getPageGroupsByBuIdResponse.setData(data);
	 
	 	return getPageGroupsByBuIdResponse;
	}
}