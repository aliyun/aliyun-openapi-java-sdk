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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.StartCallV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartCallV2ResponseUnmarshaller {

	public static StartCallV2Response unmarshall(StartCallV2Response startCallV2Response, UnmarshallerContext _ctx) {
		
		startCallV2Response.setRequestId(_ctx.stringValue("StartCallV2Response.RequestId"));
		startCallV2Response.setCode(_ctx.stringValue("StartCallV2Response.Code"));
		startCallV2Response.setMessage(_ctx.stringValue("StartCallV2Response.Message"));
		startCallV2Response.setSuccess(_ctx.booleanValue("StartCallV2Response.Success"));
	 
	 	return startCallV2Response;
	}
}