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

package com.aliyuncs.companyreg.transform.v20200306;

import com.aliyuncs.companyreg.model.v20200306.StartBackToBackCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartBackToBackCallResponseUnmarshaller {

	public static StartBackToBackCallResponse unmarshall(StartBackToBackCallResponse startBackToBackCallResponse, UnmarshallerContext _ctx) {
		
		startBackToBackCallResponse.setRequestId(_ctx.stringValue("StartBackToBackCallResponse.RequestId"));
		startBackToBackCallResponse.setErrorMsg(_ctx.stringValue("StartBackToBackCallResponse.ErrorMsg"));
		startBackToBackCallResponse.setErrorCode(_ctx.stringValue("StartBackToBackCallResponse.ErrorCode"));
		startBackToBackCallResponse.setSuccess(_ctx.booleanValue("StartBackToBackCallResponse.Success"));
		startBackToBackCallResponse.setData(_ctx.booleanValue("StartBackToBackCallResponse.Data"));
	 
	 	return startBackToBackCallResponse;
	}
}