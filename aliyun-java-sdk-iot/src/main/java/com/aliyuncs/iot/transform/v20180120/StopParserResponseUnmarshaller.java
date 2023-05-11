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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.StopParserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopParserResponseUnmarshaller {

	public static StopParserResponse unmarshall(StopParserResponse stopParserResponse, UnmarshallerContext _ctx) {
		
		stopParserResponse.setRequestId(_ctx.stringValue("StopParserResponse.RequestId"));
		stopParserResponse.setSuccess(_ctx.booleanValue("StopParserResponse.Success"));
		stopParserResponse.setCode(_ctx.stringValue("StopParserResponse.Code"));
		stopParserResponse.setErrorMessage(_ctx.stringValue("StopParserResponse.ErrorMessage"));
	 
	 	return stopParserResponse;
	}
}