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
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventsResponse.WarningSummary.QuaraFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventsResponseUnmarshaller {

	public static DescribeSuspEventsResponse unmarshall(DescribeSuspEventsResponse describeSuspEventsResponse, UnmarshallerContext _ctx) {
		
		describeSuspEventsResponse.setRequestId(_ctx.stringValue("DescribeSuspEventsResponse.RequestId"));
		describeSuspEventsResponse.setCount(_ctx.integerValue("DescribeSuspEventsResponse.Count"));
		describeSuspEventsResponse.setPageSize(_ctx.integerValue("DescribeSuspEventsResponse.PageSize"));
		describeSuspEventsResponse.setTotalCount(_ctx.integerValue("DescribeSuspEventsResponse.TotalCount"));
		describeSuspEventsResponse.setCurrentPage(_ctx.integerValue("DescribeSuspEventsResponse.CurrentPage"));

		List<WarningSummary> suspEvents = new ArrayList<WarningSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents.Length"); i++) {
			WarningSummary warningSummary = new WarningSummary();
			warningSummary.setLastTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].LastTime"));
			warningSummary.setLastTimeStamp(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].LastTimeStamp"));
			warningSummary.setOccurrenceTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OccurrenceTime"));
			warningSummary.setOccurrenceTimeStamp(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OccurrenceTimeStamp"));
			warningSummary.setId(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Id"));
			warningSummary.setSecurityEventIds(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].SecurityEventIds"));
			warningSummary.setUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].UniqueInfo"));
			warningSummary.setInstanceName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InstanceName"));
			warningSummary.setInternetIp(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InternetIp"));
			warningSummary.setIntranetIp(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].IntranetIp"));
			warningSummary.setUuid(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Uuid"));
			warningSummary.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Name"));
			warningSummary.setEventSubType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventSubType"));
			warningSummary.setLevel(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Level"));
			warningSummary.setEventStatus(_ctx.integerValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventStatus"));
			warningSummary.setDesc(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Desc"));
			warningSummary.setOperateMsg(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateMsg"));
			warningSummary.setOperateErrorCode(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateErrorCode"));
			warningSummary.setOperateTime(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateTime"));
			warningSummary.setDataSource(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DataSource"));
			warningSummary.setCanBeDealOnLine(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			warningSummary.setSaleVersion(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].SaleVersion"));
			warningSummary.setAlarmEventType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventType"));
			warningSummary.setAlarmEventName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventName"));
			warningSummary.setAlarmUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));
			warningSummary.setAdvanced(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Advanced"));
			warningSummary.setMarkMisRules(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].MarkMisRules"));
			warningSummary.setStages(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Stages"));
			warningSummary.setAlarmEventTypeDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventTypeDisplay"));
			warningSummary.setAlarmEventNameDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventNameDisplay"));
			warningSummary.setCanCancelFault(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanCancelFault"));
			warningSummary.setHasTraceInfo(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].HasTraceInfo"));
			warningSummary.setAutoBreaking(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AutoBreaking"));
			warningSummary.setContainHwMode(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].ContainHwMode"));
			warningSummary.setContainerImageId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].ContainerImageId"));
			warningSummary.setContainerImageName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].ContainerImageName"));
			warningSummary.setContainerId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].ContainerId"));
			warningSummary.setK8sNamespace(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sNamespace"));
			warningSummary.setK8sClusterId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sClusterId"));
			warningSummary.setK8sClusterName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sClusterName"));
			warningSummary.setK8sNodeId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sNodeId"));
			warningSummary.setK8sPodName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sPodName"));
			warningSummary.setK8sNodeName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].K8sNodeName"));
			warningSummary.setAppName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AppName"));

			List<QuaraFile> details = new ArrayList<QuaraFile>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details.Length"); j++) {
				QuaraFile quaraFile = new QuaraFile();
				quaraFile.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Name"));
				quaraFile.setNameDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].NameDisplay"));
				quaraFile.setType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Type"));
				quaraFile.setInfoType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].InfoType"));
				quaraFile.setValue(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Value"));
				quaraFile.setValueDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].ValueDisplay"));

				details.add(quaraFile);
			}
			warningSummary.setDetails(details);

			suspEvents.add(warningSummary);
		}
		describeSuspEventsResponse.setSuspEvents(suspEvents);
	 
	 	return describeSuspEventsResponse;
	}
}