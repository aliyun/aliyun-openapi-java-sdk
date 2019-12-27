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

package com.aliyuncs.actiontrail.transform.v20171204;

import com.aliyuncs.actiontrail.model.v20171204.StartLoggingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartLoggingResponseUnmarshaller {

	public static StartLoggingResponse unmarshall(StartLoggingResponse startLoggingResponse, UnmarshallerContext _ctx) {
		
		startLoggingResponse.setRequestId(_ctx.stringValue("StartLoggingResponse.RequestId"));
		startLoggingResponse.setParam(_ctx.stringValue("StartLoggingResponse.Param"));
		startLoggingResponse.setResult(_ctx.stringValue("StartLoggingResponse.Result"));
	 
	 	return startLoggingResponse;
	}
}