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

import com.aliyuncs.scsp.model.v20200702.SearchTicketByPhoneResponse;
import com.aliyuncs.scsp.model.v20200702.SearchTicketByPhoneResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTicketByPhoneResponseUnmarshaller {

	public static SearchTicketByPhoneResponse unmarshall(SearchTicketByPhoneResponse searchTicketByPhoneResponse, UnmarshallerContext _ctx) {
		
		searchTicketByPhoneResponse.setRequestId(_ctx.stringValue("SearchTicketByPhoneResponse.RequestId"));
		searchTicketByPhoneResponse.setOnePageSize(_ctx.integerValue("SearchTicketByPhoneResponse.OnePageSize"));
		searchTicketByPhoneResponse.setMessage(_ctx.stringValue("SearchTicketByPhoneResponse.Message"));
		searchTicketByPhoneResponse.setTotalPage(_ctx.integerValue("SearchTicketByPhoneResponse.TotalPage"));
		searchTicketByPhoneResponse.setTotalResults(_ctx.integerValue("SearchTicketByPhoneResponse.TotalResults"));
		searchTicketByPhoneResponse.setPageNo(_ctx.integerValue("SearchTicketByPhoneResponse.PageNo"));
		searchTicketByPhoneResponse.setCode(_ctx.stringValue("SearchTicketByPhoneResponse.Code"));
		searchTicketByPhoneResponse.setSuccess(_ctx.booleanValue("SearchTicketByPhoneResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchTicketByPhoneResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMemberName(_ctx.stringValue("SearchTicketByPhoneResponse.Data["+ i +"].MemberName"));
			dataItem.setCarbonCopy(_ctx.stringValue("SearchTicketByPhoneResponse.Data["+ i +"].CarbonCopy"));
			dataItem.setCreateTime(_ctx.longValue("SearchTicketByPhoneResponse.Data["+ i +"].CreateTime"));
			dataItem.setServiceId(_ctx.longValue("SearchTicketByPhoneResponse.Data["+ i +"].ServiceId"));
			dataItem.setTicketId(_ctx.longValue("SearchTicketByPhoneResponse.Data["+ i +"].TicketId"));
			dataItem.setPriority(_ctx.integerValue("SearchTicketByPhoneResponse.Data["+ i +"].Priority"));
			dataItem.setCreatorId(_ctx.longValue("SearchTicketByPhoneResponse.Data["+ i +"].CreatorId"));
			dataItem.setFormData(_ctx.stringValue("SearchTicketByPhoneResponse.Data["+ i +"].FormData"));
			dataItem.setFromInfo(_ctx.stringValue("SearchTicketByPhoneResponse.Data["+ i +"].FromInfo"));
			dataItem.setModifiedTime(_ctx.longValue("SearchTicketByPhoneResponse.Data["+ i +"].ModifiedTime"));
			dataItem.setTaskStatus(_ctx.stringValue("SearchTicketByPhoneResponse.Data["+ i +"].TaskStatus"));
			dataItem.setCreatorName(_ctx.stringValue("SearchTicketByPhoneResponse.Data["+ i +"].CreatorName"));
			dataItem.setCategoryId(_ctx.longValue("SearchTicketByPhoneResponse.Data["+ i +"].CategoryId"));
			dataItem.setCreatorType(_ctx.integerValue("SearchTicketByPhoneResponse.Data["+ i +"].CreatorType"));
			dataItem.setMemberId(_ctx.longValue("SearchTicketByPhoneResponse.Data["+ i +"].MemberId"));
			dataItem.setCaseStatus(_ctx.integerValue("SearchTicketByPhoneResponse.Data["+ i +"].CaseStatus"));
			dataItem.setTemplateId(_ctx.longValue("SearchTicketByPhoneResponse.Data["+ i +"].TemplateId"));

			data.add(dataItem);
		}
		searchTicketByPhoneResponse.setData(data);
	 
	 	return searchTicketByPhoneResponse;
	}
}