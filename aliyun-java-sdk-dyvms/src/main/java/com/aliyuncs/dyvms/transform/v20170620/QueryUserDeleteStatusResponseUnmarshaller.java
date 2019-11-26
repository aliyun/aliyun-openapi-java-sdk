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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.QueryUserDeleteStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserDeleteStatusResponseUnmarshaller {

	public static QueryUserDeleteStatusResponse unmarshall(QueryUserDeleteStatusResponse queryUserDeleteStatusResponse, UnmarshallerContext _ctx) {
		
		queryUserDeleteStatusResponse.setInterrupt(_ctx.booleanValue("QueryUserDeleteStatusResponse.Interrupt"));
		queryUserDeleteStatusResponse.setInvoker(_ctx.stringValue("QueryUserDeleteStatusResponse.Invoker"));
		queryUserDeleteStatusResponse.setPk(_ctx.stringValue("QueryUserDeleteStatusResponse.Pk"));
		queryUserDeleteStatusResponse.setBid(_ctx.stringValue("QueryUserDeleteStatusResponse.Bid"));
		queryUserDeleteStatusResponse.setHid(_ctx.longValue("QueryUserDeleteStatusResponse.Hid"));
		queryUserDeleteStatusResponse.setCountry(_ctx.stringValue("QueryUserDeleteStatusResponse.Country"));
		queryUserDeleteStatusResponse.setTaskIdentifier(_ctx.stringValue("QueryUserDeleteStatusResponse.TaskIdentifier"));
		queryUserDeleteStatusResponse.setTaskExtraData(_ctx.stringValue("QueryUserDeleteStatusResponse.TaskExtraData"));
		queryUserDeleteStatusResponse.setGmtWakeup(_ctx.stringValue("QueryUserDeleteStatusResponse.GmtWakeup"));
		queryUserDeleteStatusResponse.setSuccess(_ctx.booleanValue("QueryUserDeleteStatusResponse.Success"));
		queryUserDeleteStatusResponse.setMessage(_ctx.stringValue("QueryUserDeleteStatusResponse.Message"));
		queryUserDeleteStatusResponse.setLevel(_ctx.longValue("QueryUserDeleteStatusResponse.Level"));
		queryUserDeleteStatusResponse.setUrl(_ctx.stringValue("QueryUserDeleteStatusResponse.Url"));
		queryUserDeleteStatusResponse.setPrompt(_ctx.stringValue("QueryUserDeleteStatusResponse.Prompt"));
	 
	 	return queryUserDeleteStatusResponse;
	}
}