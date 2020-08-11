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

import com.aliyuncs.oam.model.v20170101.ListGroupsForUserResponse;
import com.aliyuncs.oam.model.v20170101.ListGroupsForUserResponse.OamGroup;
import com.aliyuncs.oam.model.v20170101.ListGroupsForUserResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsForUserResponseUnmarshaller {

	public static ListGroupsForUserResponse unmarshall(ListGroupsForUserResponse listGroupsForUserResponse, UnmarshallerContext _ctx) {
		
		listGroupsForUserResponse.setCode(_ctx.stringValue("ListGroupsForUserResponse.Code"));
		listGroupsForUserResponse.setMessage(_ctx.stringValue("ListGroupsForUserResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListGroupsForUserResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListGroupsForUserResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListGroupsForUserResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListGroupsForUserResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListGroupsForUserResponse.PageInfo.NextPageToken"));
		listGroupsForUserResponse.setPageInfo(pageInfo);

		List<OamGroup> data = new ArrayList<OamGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsForUserResponse.Data.Length"); i++) {
			OamGroup oamGroup = new OamGroup();
			oamGroup.setGroupName(_ctx.stringValue("ListGroupsForUserResponse.Data["+ i +"].GroupName"));
			oamGroup.setDescription(_ctx.stringValue("ListGroupsForUserResponse.Data["+ i +"].Description"));
			oamGroup.setOwnerName(_ctx.stringValue("ListGroupsForUserResponse.Data["+ i +"].OwnerName"));
			oamGroup.setGmtCreated(_ctx.stringValue("ListGroupsForUserResponse.Data["+ i +"].GmtCreated"));
			oamGroup.setGmtModified(_ctx.stringValue("ListGroupsForUserResponse.Data["+ i +"].GmtModified"));

			data.add(oamGroup);
		}
		listGroupsForUserResponse.setData(data);
	 
	 	return listGroupsForUserResponse;
	}
}