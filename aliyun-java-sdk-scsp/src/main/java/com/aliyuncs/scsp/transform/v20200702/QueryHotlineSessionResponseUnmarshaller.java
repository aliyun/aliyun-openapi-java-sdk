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

import com.aliyuncs.scsp.model.v20200702.QueryHotlineSessionResponse;
import com.aliyuncs.scsp.model.v20200702.QueryHotlineSessionResponse.Data;
import com.aliyuncs.scsp.model.v20200702.QueryHotlineSessionResponse.Data.CallDetailRecordItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryHotlineSessionResponseUnmarshaller {

	public static QueryHotlineSessionResponse unmarshall(QueryHotlineSessionResponse queryHotlineSessionResponse, UnmarshallerContext _ctx) {
		
		queryHotlineSessionResponse.setRequestId(_ctx.stringValue("QueryHotlineSessionResponse.RequestId"));
		queryHotlineSessionResponse.setMessage(_ctx.stringValue("QueryHotlineSessionResponse.Message"));
		queryHotlineSessionResponse.setCode(_ctx.stringValue("QueryHotlineSessionResponse.Code"));
		queryHotlineSessionResponse.setSuccess(_ctx.booleanValue("QueryHotlineSessionResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("QueryHotlineSessionResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("QueryHotlineSessionResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("QueryHotlineSessionResponse.Data.PageNumber"));

		List<CallDetailRecordItem> callDetailRecord = new ArrayList<CallDetailRecordItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryHotlineSessionResponse.Data.CallDetailRecord.Length"); i++) {
			CallDetailRecordItem callDetailRecordItem = new CallDetailRecordItem();
			callDetailRecordItem.setGroupName(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].GroupName"));
			callDetailRecordItem.setEvaluationScore(_ctx.integerValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].EvaluationScore"));
			callDetailRecordItem.setAcid(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].Acid"));
			callDetailRecordItem.setCalledNumber(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].CalledNumber"));
			callDetailRecordItem.setCallResult(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].CallResult"));
			callDetailRecordItem.setCreateTime(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].CreateTime"));
			callDetailRecordItem.setCallType(_ctx.integerValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].CallType"));
			callDetailRecordItem.setQueueUpContinueTime(_ctx.integerValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].QueueUpContinueTime"));
			callDetailRecordItem.setHangUpTime(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].HangUpTime"));
			callDetailRecordItem.setCallingNumber(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].CallingNumber"));
			callDetailRecordItem.setGroupId(_ctx.longValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].GroupId"));
			callDetailRecordItem.setInQueueTime(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].InQueueTime"));
			callDetailRecordItem.setMemberId(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].MemberId"));
			callDetailRecordItem.setRingStartTime(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].RingStartTime"));
			callDetailRecordItem.setOutQueueTime(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].OutQueueTime"));
			callDetailRecordItem.setServicerName(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].ServicerName"));
			callDetailRecordItem.setRingEndTime(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].RingEndTime"));
			callDetailRecordItem.setHangUpRole(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].HangUpRole"));
			callDetailRecordItem.setCallContinueTime(_ctx.integerValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].CallContinueTime"));
			callDetailRecordItem.setPickUpTime(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].PickUpTime"));
			callDetailRecordItem.setMemberName(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].MemberName"));
			callDetailRecordItem.setEvaluationLevel(_ctx.integerValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].EvaluationLevel"));
			callDetailRecordItem.setServicerId(_ctx.stringValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].ServicerId"));
			callDetailRecordItem.setRingContinueTime(_ctx.integerValue("QueryHotlineSessionResponse.Data.CallDetailRecord["+ i +"].RingContinueTime"));

			callDetailRecord.add(callDetailRecordItem);
		}
		data.setCallDetailRecord(callDetailRecord);
		queryHotlineSessionResponse.setData(data);
	 
	 	return queryHotlineSessionResponse;
	}
}