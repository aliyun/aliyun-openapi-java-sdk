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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.CheckNumberAvaliableResponse;
import com.aliyuncs.ccc.model.v20170705.CheckNumberAvaliableResponse.CalleeAvaliable;
import com.aliyuncs.ccc.model.v20170705.CheckNumberAvaliableResponse.CallerAvaliable;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckNumberAvaliableResponseUnmarshaller {

	public static CheckNumberAvaliableResponse unmarshall(CheckNumberAvaliableResponse checkNumberAvaliableResponse, UnmarshallerContext _ctx) {
		
		checkNumberAvaliableResponse.setRequestId(_ctx.stringValue("CheckNumberAvaliableResponse.RequestId"));
		checkNumberAvaliableResponse.setSuccess(_ctx.booleanValue("CheckNumberAvaliableResponse.Success"));
		checkNumberAvaliableResponse.setCode(_ctx.stringValue("CheckNumberAvaliableResponse.Code"));
		checkNumberAvaliableResponse.setMessage(_ctx.stringValue("CheckNumberAvaliableResponse.Message"));
		checkNumberAvaliableResponse.setHttpStatusCode(_ctx.integerValue("CheckNumberAvaliableResponse.HttpStatusCode"));

		CallerAvaliable callerAvaliable = new CallerAvaliable();
		callerAvaliable.setAvaliable(_ctx.booleanValue("CheckNumberAvaliableResponse.CallerAvaliable.Avaliable"));
		callerAvaliable.setReason(_ctx.stringValue("CheckNumberAvaliableResponse.CallerAvaliable.Reason"));
		checkNumberAvaliableResponse.setCallerAvaliable(callerAvaliable);

		CalleeAvaliable calleeAvaliable = new CalleeAvaliable();
		calleeAvaliable.setAvaliable(_ctx.booleanValue("CheckNumberAvaliableResponse.CalleeAvaliable.Avaliable"));
		calleeAvaliable.setReason(_ctx.stringValue("CheckNumberAvaliableResponse.CalleeAvaliable.Reason"));
		checkNumberAvaliableResponse.setCalleeAvaliable(calleeAvaliable);
	 
	 	return checkNumberAvaliableResponse;
	}
}