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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryNotificationHistoryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryNotificationHistoryResponse.NotifyHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryNotificationHistoryResponseUnmarshaller {

	public static OpsQueryNotificationHistoryResponse unmarshall(OpsQueryNotificationHistoryResponse opsQueryNotificationHistoryResponse, UnmarshallerContext _ctx) {
		
		opsQueryNotificationHistoryResponse.setRequestId(_ctx.stringValue("OpsQueryNotificationHistoryResponse.RequestId"));
		opsQueryNotificationHistoryResponse.setTotalCnt(_ctx.integerValue("OpsQueryNotificationHistoryResponse.TotalCnt"));
		opsQueryNotificationHistoryResponse.setPageNumber(_ctx.integerValue("OpsQueryNotificationHistoryResponse.PageNumber"));
		opsQueryNotificationHistoryResponse.setPageSize(_ctx.integerValue("OpsQueryNotificationHistoryResponse.PageSize"));

		List<NotifyHistory> notifyHistoryList = new ArrayList<NotifyHistory>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList.Length"); i++) {
			NotifyHistory notifyHistory = new NotifyHistory();
			notifyHistory.setAlertParameter(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].AlertParameter"));
			notifyHistory.setNotifyResultInfo(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].NotifyResultInfo"));
			notifyHistory.setDedupUk(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].DedupUk"));
			notifyHistory.setCompleteTime(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].CompleteTime"));
			notifyHistory.setGmtModified(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].GmtModified"));
			notifyHistory.setAlertStaffId(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].AlertStaffId"));
			notifyHistory.setNotifySuccess(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].NotifySuccess"));
			notifyHistory.setMachineId(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].MachineId"));
			notifyHistory.setTag(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].Tag"));
			notifyHistory.setCallTime(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].CallTime"));
			notifyHistory.setAlertChannel(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].AlertChannel"));
			notifyHistory.setGmtCreate(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].GmtCreate"));
			notifyHistory.setToken(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].Token"));
			notifyHistory.setAlertEventId(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].AlertEventId"));
			notifyHistory.setAlertContent(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].AlertContent"));
			notifyHistory.setMatchedRouteKey(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].MatchedRouteKey"));
			notifyHistory.setAlertConfigId(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].AlertConfigId"));
			notifyHistory.setAlertConfigName(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].AlertConfigName"));
			notifyHistory.setMatchedCondition(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].MatchedCondition"));
			notifyHistory.setId(_ctx.longValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].Id"));
			notifyHistory.setAlertSource(_ctx.stringValue("OpsQueryNotificationHistoryResponse.NotifyHistoryList["+ i +"].AlertSource"));

			notifyHistoryList.add(notifyHistory);
		}
		opsQueryNotificationHistoryResponse.setNotifyHistoryList(notifyHistoryList);
	 
	 	return opsQueryNotificationHistoryResponse;
	}
}