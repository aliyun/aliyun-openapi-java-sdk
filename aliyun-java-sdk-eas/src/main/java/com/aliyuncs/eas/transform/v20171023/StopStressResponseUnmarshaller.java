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

package com.aliyuncs.eas.transform.v20171023;

import com.aliyuncs.eas.model.v20171023.StopStressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopStressResponseUnmarshaller {

	public static StopStressResponse unmarshall(StopStressResponse stopStressResponse, UnmarshallerContext _ctx) {
		
		stopStressResponse.setRequestId(_ctx.stringValue("StopStressResponse.RequestId"));
		stopStressResponse.setCode(_ctx.longValue("StopStressResponse.Code"));
		stopStressResponse.setMessage(_ctx.stringValue("StopStressResponse.Message"));
	 
	 	return stopStressResponse;
	}
}