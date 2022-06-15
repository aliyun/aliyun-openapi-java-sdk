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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListSipCallRecordsResponse;
import com.aliyuncs.ccc.model.v20200701.ListSipCallRecordsResponse.SipCallRecords;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSipCallRecordsResponseUnmarshaller {

	public static ListSipCallRecordsResponse unmarshall(ListSipCallRecordsResponse listSipCallRecordsResponse, UnmarshallerContext _ctx) {
		
		listSipCallRecordsResponse.setRequestId(_ctx.stringValue("ListSipCallRecordsResponse.RequestId"));
		listSipCallRecordsResponse.setCode(_ctx.stringValue("ListSipCallRecordsResponse.Code"));
		listSipCallRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListSipCallRecordsResponse.HttpStatusCode"));
		listSipCallRecordsResponse.setMessage(_ctx.stringValue("ListSipCallRecordsResponse.Message"));

		List<SipCallRecords> data = new ArrayList<SipCallRecords>();
		for (int i = 0; i < _ctx.lengthValue("ListSipCallRecordsResponse.Data.Length"); i++) {
			SipCallRecords sipCallRecords = new SipCallRecords();
			sipCallRecords.setInstanceId(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].InstanceId"));
			sipCallRecords.setCallId(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].CallId"));
			sipCallRecords.setContactId(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].ContactId"));
			sipCallRecords.setCaller(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].Caller"));
			sipCallRecords.setCallee(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].Callee"));
			sipCallRecords.setCallerClusterId(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].CallerClusterId"));
			sipCallRecords.setCalleeClusterId(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].CalleeClusterId"));
			sipCallRecords.setLastResponseCode(_ctx.integerValue("ListSipCallRecordsResponse.Data["+ i +"].LastResponseCode"));
			sipCallRecords.setLastResponseText(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].LastResponseText"));
			sipCallRecords.setInviteTime(_ctx.longValue("ListSipCallRecordsResponse.Data["+ i +"].InviteTime"));
			sipCallRecords.setRingTime(_ctx.longValue("ListSipCallRecordsResponse.Data["+ i +"].RingTime"));
			sipCallRecords.setEstablishedTime(_ctx.longValue("ListSipCallRecordsResponse.Data["+ i +"].EstablishedTime"));
			sipCallRecords.setReleasedTime(_ctx.longValue("ListSipCallRecordsResponse.Data["+ i +"].ReleasedTime"));
			sipCallRecords.setReleaseReasonCode(_ctx.integerValue("ListSipCallRecordsResponse.Data["+ i +"].ReleaseReasonCode"));
			sipCallRecords.setEarlyMediaUrl(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].EarlyMediaUrl"));
			sipCallRecords.setEarlyMediaText(_ctx.stringValue("ListSipCallRecordsResponse.Data["+ i +"].EarlyMediaText"));

			data.add(sipCallRecords);
		}
		listSipCallRecordsResponse.setData(data);
	 
	 	return listSipCallRecordsResponse;
	}
}