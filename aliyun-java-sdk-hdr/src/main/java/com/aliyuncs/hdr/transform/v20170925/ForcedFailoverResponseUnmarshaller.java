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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.ForcedFailoverResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ForcedFailoverResponseUnmarshaller {

	public static ForcedFailoverResponse unmarshall(ForcedFailoverResponse forcedFailoverResponse, UnmarshallerContext _ctx) {
		
		forcedFailoverResponse.setRequestId(_ctx.stringValue("ForcedFailoverResponse.RequestId"));
		forcedFailoverResponse.setSuccess(_ctx.booleanValue("ForcedFailoverResponse.Success"));
		forcedFailoverResponse.setCode(_ctx.stringValue("ForcedFailoverResponse.Code"));
		forcedFailoverResponse.setMessage(_ctx.stringValue("ForcedFailoverResponse.Message"));
		forcedFailoverResponse.setTaskId(_ctx.stringValue("ForcedFailoverResponse.TaskId"));
	 
	 	return forcedFailoverResponse;
	}
}