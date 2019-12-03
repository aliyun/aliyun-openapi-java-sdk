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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.StopTestingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopTestingResponseUnmarshaller {

	public static StopTestingResponse unmarshall(StopTestingResponse stopTestingResponse, UnmarshallerContext _ctx) {
		
		stopTestingResponse.setRequestId(_ctx.stringValue("StopTestingResponse.RequestId"));
		stopTestingResponse.setCode(_ctx.stringValue("StopTestingResponse.Code"));
		stopTestingResponse.setMessage(_ctx.stringValue("StopTestingResponse.Message"));
		stopTestingResponse.setHttpStatusCode(_ctx.integerValue("StopTestingResponse.HttpStatusCode"));
		stopTestingResponse.setSuccess(_ctx.booleanValue("StopTestingResponse.Success"));
	 
	 	return stopTestingResponse;
	}
}