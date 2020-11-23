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

package com.aliyuncs.gts_smart_call.transform.v20201021;

import com.aliyuncs.gts_smart_call.model.v20201021.GetCallInRecordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallInRecordResponseUnmarshaller {

	public static GetCallInRecordResponse unmarshall(GetCallInRecordResponse getCallInRecordResponse, UnmarshallerContext _ctx) {
		
		getCallInRecordResponse.setRequestId(_ctx.stringValue("GetCallInRecordResponse.RequestId"));
		getCallInRecordResponse.setCode(_ctx.integerValue("GetCallInRecordResponse.Code"));
		getCallInRecordResponse.setMessage(_ctx.stringValue("GetCallInRecordResponse.Message"));
		getCallInRecordResponse.setAcid(_ctx.stringValue("GetCallInRecordResponse.Acid"));
		getCallInRecordResponse.setCallId(_ctx.stringValue("GetCallInRecordResponse.CallId"));
		getCallInRecordResponse.setCaller(_ctx.stringValue("GetCallInRecordResponse.Caller"));
		getCallInRecordResponse.setCallee(_ctx.stringValue("GetCallInRecordResponse.Callee"));
		getCallInRecordResponse.setStartTime(_ctx.longValue("GetCallInRecordResponse.StartTime"));
		getCallInRecordResponse.setEndTime(_ctx.longValue("GetCallInRecordResponse.EndTime"));
		getCallInRecordResponse.setMobile(_ctx.stringValue("GetCallInRecordResponse.Mobile"));
	 
	 	return getCallInRecordResponse;
	}
}