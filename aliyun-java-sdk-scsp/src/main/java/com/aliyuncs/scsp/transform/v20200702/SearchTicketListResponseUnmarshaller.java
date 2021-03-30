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

import com.aliyuncs.scsp.model.v20200702.SearchTicketListResponse;
import com.aliyuncs.scsp.model.v20200702.SearchTicketListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTicketListResponseUnmarshaller {

	public static SearchTicketListResponse unmarshall(SearchTicketListResponse searchTicketListResponse, UnmarshallerContext _ctx) {
		
		searchTicketListResponse.setRequestId(_ctx.stringValue("SearchTicketListResponse.RequestId"));
		searchTicketListResponse.setOnePageSize(_ctx.integerValue("SearchTicketListResponse.OnePageSize"));
		searchTicketListResponse.setTotalPage(_ctx.integerValue("SearchTicketListResponse.TotalPage"));
		searchTicketListResponse.setMessage(_ctx.stringValue("SearchTicketListResponse.Message"));
		searchTicketListResponse.setTotalResults(_ctx.integerValue("SearchTicketListResponse.TotalResults"));
		searchTicketListResponse.setPageNo(_ctx.integerValue("SearchTicketListResponse.PageNo"));
		searchTicketListResponse.setCode(_ctx.stringValue("SearchTicketListResponse.Code"));
		searchTicketListResponse.setSuccess(_ctx.booleanValue("SearchTicketListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchTicketListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCategoryId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].CategoryId"));
			dataItem.setFormData(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].FormData"));
			dataItem.setCarbonCopy(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].CarbonCopy"));
			dataItem.setCreatorId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].CreatorId"));
			dataItem.setPriority(_ctx.integerValue("SearchTicketListResponse.Data["+ i +"].Priority"));
			dataItem.setCreateTime(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].CreateTime"));
			dataItem.setCreatorType(_ctx.integerValue("SearchTicketListResponse.Data["+ i +"].CreatorType"));
			dataItem.setTaskStatus(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].TaskStatus"));
			dataItem.setServiceId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].ServiceId"));
			dataItem.setMemberId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].MemberId"));
			dataItem.setTicketId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].TicketId"));
			dataItem.setModifiedTime(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].ModifiedTime"));
			dataItem.setCaseStatus(_ctx.integerValue("SearchTicketListResponse.Data["+ i +"].CaseStatus"));
			dataItem.setMemberName(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].MemberName"));
			dataItem.setFromInfo(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].FromInfo"));
			dataItem.setTemplateId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].TemplateId"));
			dataItem.setCreatorName(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].CreatorName"));

			data.add(dataItem);
		}
		searchTicketListResponse.setData(data);
	 
	 	return searchTicketListResponse;
	}
}