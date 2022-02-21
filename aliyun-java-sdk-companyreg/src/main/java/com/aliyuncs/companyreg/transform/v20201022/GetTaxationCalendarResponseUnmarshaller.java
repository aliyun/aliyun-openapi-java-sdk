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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.GetTaxationCalendarResponse;
import com.aliyuncs.companyreg.model.v20201022.GetTaxationCalendarResponse.CalendarListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaxationCalendarResponseUnmarshaller {

	public static GetTaxationCalendarResponse unmarshall(GetTaxationCalendarResponse getTaxationCalendarResponse, UnmarshallerContext _ctx) {
		
		getTaxationCalendarResponse.setRequestId(_ctx.stringValue("GetTaxationCalendarResponse.RequestId"));

		List<CalendarListItem> calendarList = new ArrayList<CalendarListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaxationCalendarResponse.CalendarList.Length"); i++) {
			CalendarListItem calendarListItem = new CalendarListItem();
			calendarListItem.setDeclareEndDate(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].DeclareEndDate"));
			calendarListItem.setIsCanBookkeeping(_ctx.booleanValue("GetTaxationCalendarResponse.CalendarList["+ i +"].IsCanBookkeeping"));
			calendarListItem.setBookkeepingStartDate(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].BookkeepingStartDate"));
			calendarListItem.setDeclareProgress(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].DeclareProgress"));
			calendarListItem.setBookkeepingEndDate(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].BookkeepingEndDate"));
			calendarListItem.setUserTaxStartDate(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].UserTaxStartDate"));
			calendarListItem.setDeclareStartDate(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].DeclareStartDate"));
			calendarListItem.setUserTaxEndDate(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].UserTaxEndDate"));
			calendarListItem.setPeriod(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].Period"));
			calendarListItem.setErrorMessage(_ctx.stringValue("GetTaxationCalendarResponse.CalendarList["+ i +"].ErrorMessage"));

			calendarList.add(calendarListItem);
		}
		getTaxationCalendarResponse.setCalendarList(calendarList);
	 
	 	return getTaxationCalendarResponse;
	}
}