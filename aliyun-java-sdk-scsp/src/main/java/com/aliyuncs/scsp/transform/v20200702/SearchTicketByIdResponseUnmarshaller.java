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

import com.aliyuncs.scsp.model.v20200702.SearchTicketByIdResponse;
import com.aliyuncs.scsp.model.v20200702.SearchTicketByIdResponse.Data;
import com.aliyuncs.scsp.model.v20200702.SearchTicketByIdResponse.Data.ActivitiesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTicketByIdResponseUnmarshaller {

	public static SearchTicketByIdResponse unmarshall(SearchTicketByIdResponse searchTicketByIdResponse, UnmarshallerContext _ctx) {
		
		searchTicketByIdResponse.setRequestId(_ctx.stringValue("SearchTicketByIdResponse.RequestId"));
		searchTicketByIdResponse.setSuccess(_ctx.booleanValue("SearchTicketByIdResponse.Success"));
		searchTicketByIdResponse.setCode(_ctx.stringValue("SearchTicketByIdResponse.Code"));
		searchTicketByIdResponse.setMessage(_ctx.stringValue("SearchTicketByIdResponse.Message"));

		Data data = new Data();
		data.setTicketId(_ctx.longValue("SearchTicketByIdResponse.Data.TicketId"));
		data.setTemplateId(_ctx.longValue("SearchTicketByIdResponse.Data.TemplateId"));
		data.setCategoryId(_ctx.longValue("SearchTicketByIdResponse.Data.CategoryId"));
		data.setCreatorId(_ctx.longValue("SearchTicketByIdResponse.Data.CreatorId"));
		data.setCreatorType(_ctx.integerValue("SearchTicketByIdResponse.Data.CreatorType"));
		data.setCreatorName(_ctx.stringValue("SearchTicketByIdResponse.Data.CreatorName"));
		data.setMemberId(_ctx.longValue("SearchTicketByIdResponse.Data.MemberId"));
		data.setMemberName(_ctx.stringValue("SearchTicketByIdResponse.Data.MemberName"));
		data.setFromInfo(_ctx.stringValue("SearchTicketByIdResponse.Data.FromInfo"));
		data.setPriority(_ctx.integerValue("SearchTicketByIdResponse.Data.Priority"));
		data.setCarbonCopy(_ctx.stringValue("SearchTicketByIdResponse.Data.CarbonCopy"));
		data.setCreateTime(_ctx.longValue("SearchTicketByIdResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.longValue("SearchTicketByIdResponse.Data.ModifiedTime"));
		data.setFormData(_ctx.stringValue("SearchTicketByIdResponse.Data.FormData"));
		data.setCaseStatus(_ctx.integerValue("SearchTicketByIdResponse.Data.CaseStatus"));
		data.setServiceId(_ctx.longValue("SearchTicketByIdResponse.Data.ServiceId"));

		List<ActivitiesItem> activities = new ArrayList<ActivitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchTicketByIdResponse.Data.Activities.Length"); i++) {
			ActivitiesItem activitiesItem = new ActivitiesItem();
			activitiesItem.setActivityCode(_ctx.stringValue("SearchTicketByIdResponse.Data.Activities["+ i +"].ActivityCode"));
			activitiesItem.setActivityFormData(_ctx.stringValue("SearchTicketByIdResponse.Data.Activities["+ i +"].ActivityFormData"));

			activities.add(activitiesItem);
		}
		data.setActivities(activities);
		searchTicketByIdResponse.setData(data);
	 
	 	return searchTicketByIdResponse;
	}
}