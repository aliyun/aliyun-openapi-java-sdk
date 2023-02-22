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

import com.aliyuncs.sas.model.v20181203.DescribeSuspEventDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventDetailResponse.EventNote;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventDetailResponse.QuaraFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventDetailResponseUnmarshaller {

	public static DescribeSuspEventDetailResponse unmarshall(DescribeSuspEventDetailResponse describeSuspEventDetailResponse, UnmarshallerContext _ctx) {
		
		describeSuspEventDetailResponse.setRequestId(_ctx.stringValue("DescribeSuspEventDetailResponse.RequestId"));
		describeSuspEventDetailResponse.setType(_ctx.stringValue("DescribeSuspEventDetailResponse.Type"));
		describeSuspEventDetailResponse.setDataSource(_ctx.stringValue("DescribeSuspEventDetailResponse.DataSource"));
		describeSuspEventDetailResponse.setEventName(_ctx.stringValue("DescribeSuspEventDetailResponse.EventName"));
		describeSuspEventDetailResponse.setInternetIp(_ctx.stringValue("DescribeSuspEventDetailResponse.InternetIp"));
		describeSuspEventDetailResponse.setAlarmUniqueInfo(_ctx.stringValue("DescribeSuspEventDetailResponse.AlarmUniqueInfo"));
		describeSuspEventDetailResponse.setIntranetIp(_ctx.stringValue("DescribeSuspEventDetailResponse.IntranetIp"));
		describeSuspEventDetailResponse.setLastTime(_ctx.stringValue("DescribeSuspEventDetailResponse.LastTime"));
		describeSuspEventDetailResponse.setOperateMsg(_ctx.stringValue("DescribeSuspEventDetailResponse.OperateMsg"));
		describeSuspEventDetailResponse.setUuid(_ctx.stringValue("DescribeSuspEventDetailResponse.Uuid"));
		describeSuspEventDetailResponse.setCanBeDealOnLine(_ctx.booleanValue("DescribeSuspEventDetailResponse.CanBeDealOnLine"));
		describeSuspEventDetailResponse.setAccessCode(_ctx.stringValue("DescribeSuspEventDetailResponse.AccessCode"));
		describeSuspEventDetailResponse.setEventTypeDesc(_ctx.stringValue("DescribeSuspEventDetailResponse.EventTypeDesc"));
		describeSuspEventDetailResponse.setEventDesc(_ctx.stringValue("DescribeSuspEventDetailResponse.EventDesc"));
		describeSuspEventDetailResponse.setInstanceName(_ctx.stringValue("DescribeSuspEventDetailResponse.InstanceName"));
		describeSuspEventDetailResponse.setEventStatus(_ctx.stringValue("DescribeSuspEventDetailResponse.EventStatus"));
		describeSuspEventDetailResponse.setSaleVersion(_ctx.stringValue("DescribeSuspEventDetailResponse.SaleVersion"));
		describeSuspEventDetailResponse.setOperateErrorCode(_ctx.stringValue("DescribeSuspEventDetailResponse.OperateErrorCode"));
		describeSuspEventDetailResponse.setSasId(_ctx.stringValue("DescribeSuspEventDetailResponse.SasId"));
		describeSuspEventDetailResponse.setLevel(_ctx.stringValue("DescribeSuspEventDetailResponse.Level"));
		describeSuspEventDetailResponse.setId(_ctx.integerValue("DescribeSuspEventDetailResponse.Id"));

		List<QuaraFile> details = new ArrayList<QuaraFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventDetailResponse.Details.Length"); i++) {
			QuaraFile quaraFile = new QuaraFile();
			quaraFile.setType(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Type"));
			quaraFile.setValue(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Value"));
			quaraFile.setValueDisplay(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].ValueDisplay"));
			quaraFile.setInfoType(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].InfoType"));
			quaraFile.setNameDisplay(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].NameDisplay"));
			quaraFile.setName(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Name"));

			details.add(quaraFile);
		}
		describeSuspEventDetailResponse.setDetails(details);

		List<EventNote> eventNotes = new ArrayList<EventNote>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventDetailResponse.EventNotes.Length"); i++) {
			EventNote eventNote = new EventNote();
			eventNote.setNote(_ctx.stringValue("DescribeSuspEventDetailResponse.EventNotes["+ i +"].Note"));
			eventNote.setNoteId(_ctx.longValue("DescribeSuspEventDetailResponse.EventNotes["+ i +"].NoteId"));
			eventNote.setNoteTime(_ctx.stringValue("DescribeSuspEventDetailResponse.EventNotes["+ i +"].NoteTime"));

			eventNotes.add(eventNote);
		}
		describeSuspEventDetailResponse.setEventNotes(eventNotes);
	 
	 	return describeSuspEventDetailResponse;
	}
}