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
import com.aliyuncs.scsp.model.v20200702.SearchTicketByIdResponse.Data.ActivityRecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTicketByIdResponseUnmarshaller {

	public static SearchTicketByIdResponse unmarshall(SearchTicketByIdResponse searchTicketByIdResponse, UnmarshallerContext _ctx) {
		
		searchTicketByIdResponse.setRequestId(_ctx.stringValue("SearchTicketByIdResponse.RequestId"));
		searchTicketByIdResponse.setMessage(_ctx.stringValue("SearchTicketByIdResponse.Message"));
		searchTicketByIdResponse.setCode(_ctx.stringValue("SearchTicketByIdResponse.Code"));
		searchTicketByIdResponse.setSuccess(_ctx.booleanValue("SearchTicketByIdResponse.Success"));

		Data data = new Data();
		data.setCategoryId(_ctx.longValue("SearchTicketByIdResponse.Data.CategoryId"));
		data.setFormData(_ctx.stringValue("SearchTicketByIdResponse.Data.FormData"));
		data.setCarbonCopy(_ctx.stringValue("SearchTicketByIdResponse.Data.CarbonCopy"));
		data.setCreatorId(_ctx.longValue("SearchTicketByIdResponse.Data.CreatorId"));
		data.setPriority(_ctx.integerValue("SearchTicketByIdResponse.Data.Priority"));
		data.setCreateTime(_ctx.longValue("SearchTicketByIdResponse.Data.CreateTime"));
		data.setCreatorType(_ctx.integerValue("SearchTicketByIdResponse.Data.CreatorType"));
		data.setTicketName(_ctx.stringValue("SearchTicketByIdResponse.Data.TicketName"));
		data.setServiceId(_ctx.longValue("SearchTicketByIdResponse.Data.ServiceId"));
		data.setMemberId(_ctx.longValue("SearchTicketByIdResponse.Data.MemberId"));
		data.setTicketId(_ctx.longValue("SearchTicketByIdResponse.Data.TicketId"));
		data.setModifiedTime(_ctx.longValue("SearchTicketByIdResponse.Data.ModifiedTime"));
		data.setCaseStatus(_ctx.integerValue("SearchTicketByIdResponse.Data.CaseStatus"));
		data.setMemberName(_ctx.stringValue("SearchTicketByIdResponse.Data.MemberName"));
		data.setFromInfo(_ctx.stringValue("SearchTicketByIdResponse.Data.FromInfo"));
		data.setTemplateId(_ctx.longValue("SearchTicketByIdResponse.Data.TemplateId"));
		data.setCreatorName(_ctx.stringValue("SearchTicketByIdResponse.Data.CreatorName"));

		List<ActivitiesItem> activities = new ArrayList<ActivitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchTicketByIdResponse.Data.Activities.Length"); i++) {
			ActivitiesItem activitiesItem = new ActivitiesItem();
			activitiesItem.setActivityFormData(_ctx.stringValue("SearchTicketByIdResponse.Data.Activities["+ i +"].ActivityFormData"));
			activitiesItem.setActivityCode(_ctx.stringValue("SearchTicketByIdResponse.Data.Activities["+ i +"].ActivityCode"));

			activities.add(activitiesItem);
		}
		data.setActivities(activities);

		List<ActivityRecordsItem> activityRecords = new ArrayList<ActivityRecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchTicketByIdResponse.Data.ActivityRecords.Length"); i++) {
			ActivityRecordsItem activityRecordsItem = new ActivityRecordsItem();
			activityRecordsItem.setGmtCreate(_ctx.longValue("SearchTicketByIdResponse.Data.ActivityRecords["+ i +"].GmtCreate"));
			activityRecordsItem.setOperatorName(_ctx.stringValue("SearchTicketByIdResponse.Data.ActivityRecords["+ i +"].OperatorName"));
			activityRecordsItem.setActionCode(_ctx.stringValue("SearchTicketByIdResponse.Data.ActivityRecords["+ i +"].ActionCode"));
			activityRecordsItem.setActionCodeDesc(_ctx.stringValue("SearchTicketByIdResponse.Data.ActivityRecords["+ i +"].ActionCodeDesc"));
			activityRecordsItem.setMemo(_ctx.stringValue("SearchTicketByIdResponse.Data.ActivityRecords["+ i +"].Memo"));

			activityRecords.add(activityRecordsItem);
		}
		data.setActivityRecords(activityRecords);
		searchTicketByIdResponse.setData(data);
	 
	 	return searchTicketByIdResponse;
	}
}