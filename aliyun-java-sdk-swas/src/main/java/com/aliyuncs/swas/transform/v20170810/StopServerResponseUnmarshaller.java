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

import com.aliyuncs.swas.model.v20170810.StopServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopServerResponseUnmarshaller {

	public static StopServerResponse unmarshall(StopServerResponse stopServerResponse, UnmarshallerContext _ctx) {
		
		stopServerResponse.setRequestId(_ctx.stringValue("StopServerResponse.RequestId"));
		stopServerResponse.setCode(_ctx.stringValue("StopServerResponse.Code"));
		stopServerResponse.setSuccess(_ctx.booleanValue("StopServerResponse.Success"));
		stopServerResponse.setResult(_ctx.booleanValue("StopServerResponse.Result"));
	 
	 	return stopServerResponse;
	}
}