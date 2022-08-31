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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListHoneypotAlarmEventsResponse;
import com.aliyuncs.sas.model.v20181203.ListHoneypotAlarmEventsResponse.HoneypotAlarmEvent;
import com.aliyuncs.sas.model.v20181203.ListHoneypotAlarmEventsResponse.HoneypotAlarmEvent.MergeFieldListItem;
import com.aliyuncs.sas.model.v20181203.ListHoneypotAlarmEventsResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHoneypotAlarmEventsResponseUnmarshaller {

	public static ListHoneypotAlarmEventsResponse unmarshall(ListHoneypotAlarmEventsResponse listHoneypotAlarmEventsResponse, UnmarshallerContext _ctx) {
		
		listHoneypotAlarmEventsResponse.setRequestId(_ctx.stringValue("ListHoneypotAlarmEventsResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListHoneypotAlarmEventsResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListHoneypotAlarmEventsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListHoneypotAlarmEventsResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListHoneypotAlarmEventsResponse.PageInfo.Count"));
		pageInfo.setLastRowKey(_ctx.stringValue("ListHoneypotAlarmEventsResponse.PageInfo.LastRowKey"));
		pageInfo.setNextToken(_ctx.stringValue("ListHoneypotAlarmEventsResponse.PageInfo.NextToken"));
		listHoneypotAlarmEventsResponse.setPageInfo(pageInfo);

		List<HoneypotAlarmEvent> honeypotAlarmEvents = new ArrayList<HoneypotAlarmEvent>();
		for (int i = 0; i < _ctx.lengthValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents.Length"); i++) {
			HoneypotAlarmEvent honeypotAlarmEvent = new HoneypotAlarmEvent();
			honeypotAlarmEvent.setAlarmEventId(_ctx.longValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].AlarmEventId"));
			honeypotAlarmEvent.setAlarmEventType(_ctx.stringValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].AlarmEventType"));
			honeypotAlarmEvent.setAlarmEventName(_ctx.stringValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].AlarmEventName"));
			honeypotAlarmEvent.setAlarmUniqueInfo(_ctx.stringValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].AlarmUniqueInfo"));
			honeypotAlarmEvent.setFirstTime(_ctx.longValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].FirstTime"));
			honeypotAlarmEvent.setLastTime(_ctx.longValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].LastTime"));
			honeypotAlarmEvent.setRiskLevel(_ctx.stringValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].RiskLevel"));
			honeypotAlarmEvent.setEventCount(_ctx.integerValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].EventCount"));
			honeypotAlarmEvent.setOperateStatus(_ctx.integerValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].OperateStatus"));

			List<MergeFieldListItem> mergeFieldList = new ArrayList<MergeFieldListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].MergeFieldList.Length"); j++) {
				MergeFieldListItem mergeFieldListItem = new MergeFieldListItem();
				mergeFieldListItem.setFieldType(_ctx.stringValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].MergeFieldList["+ j +"].FieldType"));
				mergeFieldListItem.setFieldKey(_ctx.stringValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].MergeFieldList["+ j +"].FieldKey"));
				mergeFieldListItem.setFieldValue(_ctx.stringValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].MergeFieldList["+ j +"].FieldValue"));
				mergeFieldListItem.setFieldExtInfo(_ctx.stringValue("ListHoneypotAlarmEventsResponse.HoneypotAlarmEvents["+ i +"].MergeFieldList["+ j +"].FieldExtInfo"));

				mergeFieldList.add(mergeFieldListItem);
			}
			honeypotAlarmEvent.setMergeFieldList(mergeFieldList);

			honeypotAlarmEvents.add(honeypotAlarmEvent);
		}
		listHoneypotAlarmEventsResponse.setHoneypotAlarmEvents(honeypotAlarmEvents);
	 
	 	return listHoneypotAlarmEventsResponse;
	}
}