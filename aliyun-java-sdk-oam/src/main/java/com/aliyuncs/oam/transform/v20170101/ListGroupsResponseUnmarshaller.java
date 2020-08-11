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

package com.aliyuncs.oam.transform.v20170101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oam.model.v20170101.ListGroupsResponse;
import com.aliyuncs.oam.model.v20170101.ListGroupsResponse.OamGroup;
import com.aliyuncs.oam.model.v20170101.ListGroupsResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsResponseUnmarshaller {

	public static ListGroupsResponse unmarshall(ListGroupsResponse listGroupsResponse, UnmarshallerContext _ctx) {
		
		listGroupsResponse.setCode(_ctx.stringValue("ListGroupsResponse.Code"));
		listGroupsResponse.setMessage(_ctx.stringValue("ListGroupsResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListGroupsResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListGroupsResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListGroupsResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListGroupsResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListGroupsResponse.PageInfo.NextPageToken"));
		listGroupsResponse.setPageInfo(pageInfo);

		List<OamGroup> data = new ArrayList<OamGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsResponse.Data.Length"); i++) {
			OamGroup oamGroup = new OamGroup();
			oamGroup.setGroupName(_ctx.stringValue("ListGroupsResponse.Data["+ i +"].GroupName"));
			oamGroup.setDescription(_ctx.stringValue("ListGroupsResponse.Data["+ i +"].Description"));
			oamGroup.setOwnerName(_ctx.stringValue("ListGroupsResponse.Data["+ i +"].OwnerName"));
			oamGroup.setGmtCreated(_ctx.stringValue("ListGroupsResponse.Data["+ i +"].GmtCreated"));
			oamGroup.setGmtModified(_ctx.stringValue("ListGroupsResponse.Data["+ i +"].GmtModified"));

			data.add(oamGroup);
		}
		listGroupsResponse.setData(data);
	 
	 	return listGroupsResponse;
	}
}