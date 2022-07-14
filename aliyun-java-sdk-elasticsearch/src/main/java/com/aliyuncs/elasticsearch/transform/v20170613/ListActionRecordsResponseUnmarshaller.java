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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListActionRecordsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListActionRecordsResponse.ActionRecord;
import com.aliyuncs.elasticsearch.model.v20170613.ListActionRecordsResponse.ActionRecord.StatusInfoItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListActionRecordsResponse.ActionRecord.StatusInfoItem.SubStatusInfoItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActionRecordsResponseUnmarshaller {

	public static ListActionRecordsResponse unmarshall(ListActionRecordsResponse listActionRecordsResponse, UnmarshallerContext _ctx) {
		
		listActionRecordsResponse.setRequestId(_ctx.stringValue("ListActionRecordsResponse.RequestId"));

		List<ActionRecord> result = new ArrayList<ActionRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListActionRecordsResponse.Result.Length"); i++) {
			ActionRecord actionRecord = new ActionRecord();
			actionRecord.setActionName(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].ActionName"));
			actionRecord.setActionParams(_ctx.mapValue("ListActionRecordsResponse.Result["+ i +"].ActionParams"));
			actionRecord.setEndTime(_ctx.longValue("ListActionRecordsResponse.Result["+ i +"].EndTime"));
			actionRecord.setInstanceId(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].InstanceId"));
			actionRecord.setProcess(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].Process"));
			actionRecord.setRecordDiff(_ctx.mapValue("ListActionRecordsResponse.Result["+ i +"].RecordDiff"));
			actionRecord.setRequestId(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].RequestId"));
			actionRecord.setStartTime(_ctx.longValue("ListActionRecordsResponse.Result["+ i +"].StartTime"));
			actionRecord.setStateType(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StateType"));
			actionRecord.setUserId(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].UserId"));
			actionRecord.setUserType(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].UserType"));
			actionRecord.setOwnerId(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].OwnerId"));
			actionRecord.setUserInfo(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].UserInfo"));
			actionRecord.setMetaNow(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].MetaNow"));
			actionRecord.setMetaOld(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].MetaOld"));

			List<String> actionResultAccessList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListActionRecordsResponse.Result["+ i +"].ActionResultAccessList.Length"); j++) {
				actionResultAccessList.add(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].ActionResultAccessList["+ j +"]"));
			}
			actionRecord.setActionResultAccessList(actionResultAccessList);

			List<String> recordIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListActionRecordsResponse.Result["+ i +"].RecordIds.Length"); j++) {
				recordIds.add(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].RecordIds["+ j +"]"));
			}
			actionRecord.setRecordIds(recordIds);

			List<StatusInfoItem> statusInfo = new ArrayList<StatusInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo.Length"); j++) {
				StatusInfoItem statusInfoItem = new StatusInfoItem();
				statusInfoItem.setSubState(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subState"));
				statusInfoItem.setNodeCount(_ctx.integerValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].nodeCount"));
				statusInfoItem.setCompleteNodeCount(_ctx.integerValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].completeNodeCount"));
				statusInfoItem.setException(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].exception"));
				statusInfoItem.setLatencyMills(_ctx.longValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].latencyMills"));
				statusInfoItem.setProcess(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].process"));
				statusInfoItem.setStartTime(_ctx.longValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].startTime"));
				statusInfoItem.setEndTime(_ctx.longValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].endTime"));
				statusInfoItem.setStateType(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].stateType"));

				List<SubStatusInfoItem> subStatusInfo = new ArrayList<SubStatusInfoItem>();
				for (int k = 0; k < _ctx.lengthValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo.Length"); k++) {
					SubStatusInfoItem subStatusInfoItem = new SubStatusInfoItem();
					subStatusInfoItem.setSubState(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].subState"));
					subStatusInfoItem.setNodeCount(_ctx.integerValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].nodeCount"));
					subStatusInfoItem.setCompleteNodeCount(_ctx.integerValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].completeNodeCount"));
					subStatusInfoItem.setException(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].exception"));
					subStatusInfoItem.setLatencyMills(_ctx.longValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].latencyMills"));
					subStatusInfoItem.setProcess(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].process"));
					subStatusInfoItem.setStartTime(_ctx.longValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].startTime"));
					subStatusInfoItem.setEndTime(_ctx.longValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].endTime"));
					subStatusInfoItem.setStateType(_ctx.stringValue("ListActionRecordsResponse.Result["+ i +"].StatusInfo["+ j +"].subStatusInfo["+ k +"].stateType"));

					subStatusInfo.add(subStatusInfoItem);
				}
				statusInfoItem.setSubStatusInfo(subStatusInfo);

				statusInfo.add(statusInfoItem);
			}
			actionRecord.setStatusInfo(statusInfo);

			result.add(actionRecord);
		}
		listActionRecordsResponse.setResult(result);
	 
	 	return listActionRecordsResponse;
	}
}