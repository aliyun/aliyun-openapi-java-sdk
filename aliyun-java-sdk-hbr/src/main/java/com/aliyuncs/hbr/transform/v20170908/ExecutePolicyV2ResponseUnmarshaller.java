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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.ExecutePolicyV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecutePolicyV2ResponseUnmarshaller {

	public static ExecutePolicyV2Response unmarshall(ExecutePolicyV2Response executePolicyV2Response, UnmarshallerContext _ctx) {
		
		executePolicyV2Response.setRequestId(_ctx.stringValue("ExecutePolicyV2Response.RequestId"));
		executePolicyV2Response.setSuccess(_ctx.booleanValue("ExecutePolicyV2Response.Success"));
		executePolicyV2Response.setCode(_ctx.stringValue("ExecutePolicyV2Response.Code"));
		executePolicyV2Response.setMessage(_ctx.stringValue("ExecutePolicyV2Response.Message"));
		executePolicyV2Response.setJobId(_ctx.stringValue("ExecutePolicyV2Response.JobId"));
	 
	 	return executePolicyV2Response;
	}
}