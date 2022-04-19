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

import com.aliyuncs.sas.model.v20181203.DescribeSuspEventsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventsResponse.WarningSummary;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventsResponse.WarningSummary.EventNote;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventsResponse.WarningSummary.QuaraFile;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventsResponse.WarningSummary.TacticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventsResponseUnmarshaller {

	public static DescribeSuspEventsResponse unmarshall(DescribeSuspEventsResponse describeSuspEventsResponse, UnmarshallerContext _ctx) {
		
		describeSuspEventsResponse.setRequestId(_ctx.stringValue("DescribeSuspEventsResponse.RequestId"));
		describeSuspEventsResponse.setCurrentPage(_ctx.integerValue("DescribeSuspEventsResponse.CurrentPage"));
		describeSuspEventsResponse.setPageSize(_ctx.integerValue("DescribeSuspEventsResponse.PageSize"));
		describeSuspEventsResponse.setTotalCount(_ctx.integerValue("DescribeSuspEventsResponse.TotalCount"));
		describeSuspEventsResponse.setCount(_ctx.integerValue("DescribeSuspEventsResponse.Count"));

		List<WarningSummary> suspEvents = new ArrayList<WarningSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents.Length"); i++) {
			WarningSummary warningSummary = new WarningSummary();
			warningSummary.setStages(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Stages"));
			warningSummary.setInternetIp(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InternetIp"));
			warningSummary.setK8sClusterName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sClusterName"));
			warningSummary.setContainerImageId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].ContainerImageId"));
			warningSummary.setLastTimeStamp(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].LastTimeStamp"));
			warningSummary.setOccurrenceTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OccurrenceTime"));
			warningSummary.setAlarmUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));
			warningSummary.setDesc(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Desc"));
			warningSummary.setCanCancelFault(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanCancelFault"));
			warningSummary.setAlarmEventNameDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventNameDisplay"));
			warningSummary.setAppName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AppName"));
			warningSummary.setSecurityEventIds(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].SecurityEventIds"));
			warningSummary.setK8sClusterId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sClusterId"));
			warningSummary.setContainerImageName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].ContainerImageName"));
			warningSummary.setMarkMisRules(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].MarkMisRules"));
			warningSummary.setCanBeDealOnLine(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			warningSummary.setContainHwMode(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].ContainHwMode"));
			warningSummary.setK8sNodeId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sNodeId"));
			warningSummary.setInstanceName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InstanceName"));
			warningSummary.setEventStatus(_ctx.integerValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventStatus"));
			warningSummary.setSaleVersion(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].SaleVersion"));
			warningSummary.setOperateErrorCode(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateErrorCode"));
			warningSummary.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Name"));
			warningSummary.setHasTraceInfo(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].HasTraceInfo"));
			warningSummary.setDataSource(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DataSource"));
			warningSummary.setOperateTime(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateTime"));
			warningSummary.setEventSubType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventSubType"));
			warningSummary.setAdvanced(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Advanced"));
			warningSummary.setOccurrenceTimeStamp(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OccurrenceTimeStamp"));
			warningSummary.setInstanceId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InstanceId"));
			warningSummary.setAlarmEventTypeDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventTypeDisplay"));
			warningSummary.setIntranetIp(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].IntranetIp"));
			warningSummary.setLastTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].LastTime"));
			warningSummary.setOperateMsg(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateMsg"));
			warningSummary.setUuid(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Uuid"));
			warningSummary.setK8sPodName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sPodName"));
			warningSummary.setContainerId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].ContainerId"));
			warningSummary.setAlarmEventType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventType"));
			warningSummary.setK8sNamespace(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sNamespace"));
			warningSummary.setAutoBreaking(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AutoBreaking"));
			warningSummary.setK8sNodeName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sNodeName"));
			warningSummary.setAlarmEventName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventName"));
			warningSummary.setUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].UniqueInfo"));
			warningSummary.setMaliciousRuleStatus(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].MaliciousRuleStatus"));
			warningSummary.setLevel(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Level"));
			warningSummary.setId(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Id"));

			List<TacticItem> tacticItems = new ArrayList<TacticItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].TacticItems.Length"); j++) {
				TacticItem tacticItem = new TacticItem();
				tacticItem.setTacticId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].TacticItems["+ j +"].TacticId"));
				tacticItem.setTacticDisplayName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].TacticItems["+ j +"].TacticDisplayName"));

				tacticItems.add(tacticItem);
			}
			warningSummary.setTacticItems(tacticItems);

			List<QuaraFile> details = new ArrayList<QuaraFile>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details.Length"); j++) {
				QuaraFile quaraFile = new QuaraFile();
				quaraFile.setType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Type"));
				quaraFile.setValue(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Value"));
				quaraFile.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Name"));
				quaraFile.setNameDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].NameDisplay"));
				quaraFile.setInfoType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].InfoType"));
				quaraFile.setValueDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].ValueDisplay"));

				details.add(quaraFile);
			}
			warningSummary.setDetails(details);

			List<EventNote> eventNotes = new ArrayList<EventNote>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventNotes.Length"); j++) {
				EventNote eventNote = new EventNote();
				eventNote.setNote(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventNotes["+ j +"].Note"));
				eventNote.setNoteId(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventNotes["+ j +"].NoteId"));
				eventNote.setNoteTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventNotes["+ j +"].NoteTime"));

				eventNotes.add(eventNote);
			}
			warningSummary.setEventNotes(eventNotes);

			suspEvents.add(warningSummary);
		}
		describeSuspEventsResponse.setSuspEvents(suspEvents);
	 
	 	return describeSuspEventsResponse;
	}
}