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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskListResponse;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskListResponse.PageInfo;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskListResponse.PageInfo.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSyntheticTaskListResponseUnmarshaller {

	public static GetSyntheticTaskListResponse unmarshall(GetSyntheticTaskListResponse getSyntheticTaskListResponse, UnmarshallerContext _ctx) {
		
		getSyntheticTaskListResponse.setRequestId(_ctx.stringValue("GetSyntheticTaskListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(_ctx.longValue("GetSyntheticTaskListResponse.PageInfo.Total"));
		pageInfo.setSize(_ctx.longValue("GetSyntheticTaskListResponse.PageInfo.Size"));
		pageInfo.setPages(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.Pages"));
		pageInfo.setPrepage(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.Prepage"));
		pageInfo.setNextPage(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.NextPage"));
		pageInfo.setIsFirstPage(_ctx.booleanValue("GetSyntheticTaskListResponse.PageInfo.IsFirstPage"));
		pageInfo.setIsLastPage(_ctx.booleanValue("GetSyntheticTaskListResponse.PageInfo.IsLastPage"));
		pageInfo.setHasPreviousPage(_ctx.booleanValue("GetSyntheticTaskListResponse.PageInfo.HasPreviousPage"));
		pageInfo.setHasNextPage(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.HasNextPage"));
		pageInfo.setNavigatePageNums(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.NavigatePageNums"));
		pageInfo.setNavigateFirstPage(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.NavigateFirstPage"));
		pageInfo.setNavigateLastPage(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.NavigateLastPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSyntheticTaskListResponse.PageInfo.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTaskId(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].TaskId"));
			listItem.setTaskName(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].TaskName"));
			listItem.setUrl(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].Url"));
			listItem.setTaskType(_ctx.longValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].TaskType"));
			listItem.setTaskTypeName(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].TaskTypeName"));
			listItem.setMonitorNumber(_ctx.longValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].MonitorNumber"));
			listItem.setTaskStatus(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].TaskStatus"));
			listItem.setUsable(_ctx.floatValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].Usable"));
			listItem.setCreateTime(_ctx.stringValue("GetSyntheticTaskListResponse.PageInfo.List["+ i +"].CreateTime"));

			list.add(listItem);
		}
		pageInfo.setList(list);
		getSyntheticTaskListResponse.setPageInfo(pageInfo);
	 
	 	return getSyntheticTaskListResponse;
	}
}