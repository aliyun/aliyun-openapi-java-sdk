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
		searchTicketListResponse.setSuccess(_ctx.booleanValue("SearchTicketListResponse.Success"));
		searchTicketListResponse.setCode(_ctx.stringValue("SearchTicketListResponse.Code"));
		searchTicketListResponse.setMessage(_ctx.stringValue("SearchTicketListResponse.Message"));
		searchTicketListResponse.setPageNo(_ctx.integerValue("SearchTicketListResponse.PageNo"));
		searchTicketListResponse.setTotalResults(_ctx.integerValue("SearchTicketListResponse.TotalResults"));
		searchTicketListResponse.setOnePageSize(_ctx.integerValue("SearchTicketListResponse.OnePageSize"));
		searchTicketListResponse.setTotalPage(_ctx.integerValue("SearchTicketListResponse.TotalPage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchTicketListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTicketId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].TicketId"));
			dataItem.setTemplateId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].TemplateId"));
			dataItem.setCategoryId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].CategoryId"));
			dataItem.setCreatorId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].CreatorId"));
			dataItem.setCreatorType(_ctx.integerValue("SearchTicketListResponse.Data["+ i +"].CreatorType"));
			dataItem.setCreatorName(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].CreatorName"));
			dataItem.setMemberId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].MemberId"));
			dataItem.setMemberName(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].MemberName"));
			dataItem.setFromInfo(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].FromInfo"));
			dataItem.setPriority(_ctx.integerValue("SearchTicketListResponse.Data["+ i +"].Priority"));
			dataItem.setCarbonCopy(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].CarbonCopy"));
			dataItem.setCreateTime(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].CreateTime"));
			dataItem.setModifiedTime(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].ModifiedTime"));
			dataItem.setFormData(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].FormData"));
			dataItem.setServiceId(_ctx.longValue("SearchTicketListResponse.Data["+ i +"].ServiceId"));
			dataItem.setCaseStatus(_ctx.integerValue("SearchTicketListResponse.Data["+ i +"].CaseStatus"));
			dataItem.setTaskStatus(_ctx.stringValue("SearchTicketListResponse.Data["+ i +"].TaskStatus"));

			data.add(dataItem);
		}
		searchTicketListResponse.setData(data);
	 
	 	return searchTicketListResponse;
	}
}