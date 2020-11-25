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

import com.aliyuncs.gts_smart_call.model.v20201021.GetCallOutRecordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallOutRecordResponseUnmarshaller {

	public static GetCallOutRecordResponse unmarshall(GetCallOutRecordResponse getCallOutRecordResponse, UnmarshallerContext _ctx) {
		
		getCallOutRecordResponse.setRequestId(_ctx.stringValue("GetCallOutRecordResponse.RequestId"));
		getCallOutRecordResponse.setCode(_ctx.integerValue("GetCallOutRecordResponse.Code"));
		getCallOutRecordResponse.setMessage(_ctx.stringValue("GetCallOutRecordResponse.Message"));
		getCallOutRecordResponse.setAcid(_ctx.stringValue("GetCallOutRecordResponse.Acid"));
		getCallOutRecordResponse.setCaller(_ctx.stringValue("GetCallOutRecordResponse.Caller"));
		getCallOutRecordResponse.setCallee(_ctx.stringValue("GetCallOutRecordResponse.Callee"));
		getCallOutRecordResponse.setStartTime(_ctx.longValue("GetCallOutRecordResponse.StartTime"));
		getCallOutRecordResponse.setEndTime(_ctx.longValue("GetCallOutRecordResponse.EndTime"));
	 
	 	return getCallOutRecordResponse;
	}
}