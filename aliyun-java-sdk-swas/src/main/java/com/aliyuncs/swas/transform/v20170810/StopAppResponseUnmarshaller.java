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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.StopAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopAppResponseUnmarshaller {

	public static StopAppResponse unmarshall(StopAppResponse stopAppResponse, UnmarshallerContext _ctx) {
		
		stopAppResponse.setRequestId(_ctx.stringValue("StopAppResponse.RequestId"));
		stopAppResponse.setCode(_ctx.stringValue("StopAppResponse.Code"));
		stopAppResponse.setSuccess(_ctx.booleanValue("StopAppResponse.Success"));
		stopAppResponse.setResult(_ctx.booleanValue("StopAppResponse.Result"));
	 
	 	return stopAppResponse;
	}
}