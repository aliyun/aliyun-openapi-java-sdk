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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.StopApplicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopApplicationResponseUnmarshaller {

	public static StopApplicationResponse unmarshall(StopApplicationResponse stopApplicationResponse, UnmarshallerContext _ctx) {
		
		stopApplicationResponse.setRequestId(_ctx.stringValue("StopApplicationResponse.RequestId"));
		stopApplicationResponse.setChangeOrderId(_ctx.stringValue("StopApplicationResponse.ChangeOrderId"));
		stopApplicationResponse.setCode(_ctx.integerValue("StopApplicationResponse.Code"));
		stopApplicationResponse.setMessage(_ctx.stringValue("StopApplicationResponse.Message"));
	 
	 	return stopApplicationResponse;
	}
}