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

import com.aliyuncs.cccxspaceinner.model.v20191227.GetPageGroupsByChannelTypeResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetPageGroupsByChannelTypeResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetPageGroupsByChannelTypeResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPageGroupsByChannelTypeResponseUnmarshaller {

	public static GetPageGroupsByChannelTypeResponse unmarshall(GetPageGroupsByChannelTypeResponse getPageGroupsByChannelTypeResponse, UnmarshallerContext _ctx) {
		
		getPageGroupsByChannelTypeResponse.setSuccess(_ctx.booleanValue("GetPageGroupsByChannelTypeResponse.Success"));
		getPageGroupsByChannelTypeResponse.setCode(_ctx.stringValue("GetPageGroupsByChannelTypeResponse.Code"));
		getPageGroupsByChannelTypeResponse.setMessage(_ctx.stringValue("GetPageGroupsByChannelTypeResponse.Message"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("GetPageGroupsByChannelTypeResponse.Data.PageSize"));
		data.setLastSortKey(_ctx.longValue("GetPageGroupsByChannelTypeResponse.Data.LastSortKey"));
		data.setHasNextPage(_ctx.booleanValue("GetPageGroupsByChannelTypeResponse.Data.HasNextPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPageGroupsByChannelTypeResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setBuId(_ctx.longValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].BuId"));
			listItem.setDepartmentId(_ctx.longValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].DepartmentId"));
			listItem.setGroupId(_ctx.longValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].GroupId"));
			listItem.setGroupName(_ctx.stringValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].GroupName"));
			listItem.setShowName(_ctx.stringValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].ShowName"));
			listItem.setIsPublic(_ctx.booleanValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].IsPublic"));
			listItem.setStatus(_ctx.integerValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].Status"));
			listItem.setDescription(_ctx.stringValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].Description"));
			listItem.setChannelType(_ctx.integerValue("GetPageGroupsByChannelTypeResponse.Data.List["+ i +"].ChannelType"));

			list.add(listItem);
		}
		data.setList(list);
		getPageGroupsByChannelTypeResponse.setData(data);
	 
	 	return getPageGroupsByChannelTypeResponse;
	}
}