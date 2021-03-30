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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.QuerySkillGroupsResponse;
import com.aliyuncs.scsp.model.v20200702.QuerySkillGroupsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySkillGroupsResponseUnmarshaller {

	public static QuerySkillGroupsResponse unmarshall(QuerySkillGroupsResponse querySkillGroupsResponse, UnmarshallerContext _ctx) {
		
		querySkillGroupsResponse.setRequestId(_ctx.stringValue("QuerySkillGroupsResponse.RequestId"));
		querySkillGroupsResponse.setOnePageSize(_ctx.integerValue("QuerySkillGroupsResponse.OnePageSize"));
		querySkillGroupsResponse.setTotalPage(_ctx.integerValue("QuerySkillGroupsResponse.TotalPage"));
		querySkillGroupsResponse.setCurrentPage(_ctx.integerValue("QuerySkillGroupsResponse.CurrentPage"));
		querySkillGroupsResponse.setHttpStatusCode(_ctx.longValue("QuerySkillGroupsResponse.HttpStatusCode"));
		querySkillGroupsResponse.setTotalResults(_ctx.integerValue("QuerySkillGroupsResponse.TotalResults"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySkillGroupsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSkillGroupName(_ctx.stringValue("QuerySkillGroupsResponse.Data["+ i +"].SkillGroupName"));
			dataItem.setDescription(_ctx.stringValue("QuerySkillGroupsResponse.Data["+ i +"].Description"));
			dataItem.setDisplayName(_ctx.stringValue("QuerySkillGroupsResponse.Data["+ i +"].DisplayName"));
			dataItem.setSkillGroupId(_ctx.longValue("QuerySkillGroupsResponse.Data["+ i +"].SkillGroupId"));
			dataItem.setChannelType(_ctx.integerValue("QuerySkillGroupsResponse.Data["+ i +"].ChannelType"));

			data.add(dataItem);
		}
		querySkillGroupsResponse.setData(data);
	 
	 	return querySkillGroupsResponse;
	}
}