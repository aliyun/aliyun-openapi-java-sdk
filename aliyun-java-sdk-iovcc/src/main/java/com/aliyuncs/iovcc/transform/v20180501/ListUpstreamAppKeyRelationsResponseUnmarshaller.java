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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListUpstreamAppKeyRelationsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListUpstreamAppKeyRelationsResponse.RelationList;
import com.aliyuncs.iovcc.model.v20180501.ListUpstreamAppKeyRelationsResponse.RelationList.ListItem;
import com.aliyuncs.iovcc.model.v20180501.ListUpstreamAppKeyRelationsResponse.RelationList.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUpstreamAppKeyRelationsResponseUnmarshaller {

	public static ListUpstreamAppKeyRelationsResponse unmarshall(ListUpstreamAppKeyRelationsResponse listUpstreamAppKeyRelationsResponse, UnmarshallerContext _ctx) {
		
		listUpstreamAppKeyRelationsResponse.setRequestId(_ctx.stringValue("ListUpstreamAppKeyRelationsResponse.RequestId"));

		RelationList relationList = new RelationList();

		Pagination pagination = new Pagination();
		pagination.setTotalCount(_ctx.integerValue("ListUpstreamAppKeyRelationsResponse.RelationList.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListUpstreamAppKeyRelationsResponse.RelationList.Pagination.TotalPageCount"));
		pagination.setPageIndex(_ctx.integerValue("ListUpstreamAppKeyRelationsResponse.RelationList.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListUpstreamAppKeyRelationsResponse.RelationList.Pagination.PageSize"));
		relationList.setPagination(pagination);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUpstreamAppKeyRelationsResponse.RelationList.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("ListUpstreamAppKeyRelationsResponse.RelationList.List["+ i +"].Id"));
			listItem.setAppKey(_ctx.stringValue("ListUpstreamAppKeyRelationsResponse.RelationList.List["+ i +"].AppKey"));
			listItem.setPAppKey(_ctx.stringValue("ListUpstreamAppKeyRelationsResponse.RelationList.List["+ i +"].PAppKey"));
			listItem.setProjectId(_ctx.stringValue("ListUpstreamAppKeyRelationsResponse.RelationList.List["+ i +"].ProjectId"));
			listItem.setGmtCreate(_ctx.longValue("ListUpstreamAppKeyRelationsResponse.RelationList.List["+ i +"].GmtCreate"));
			listItem.setAppName(_ctx.stringValue("ListUpstreamAppKeyRelationsResponse.RelationList.List["+ i +"].AppName"));
			listItem.setAppPackage(_ctx.stringValue("ListUpstreamAppKeyRelationsResponse.RelationList.List["+ i +"].AppPackage"));

			list.add(listItem);
		}
		relationList.setList(list);
		listUpstreamAppKeyRelationsResponse.setRelationList(relationList);
	 
	 	return listUpstreamAppKeyRelationsResponse;
	}
}