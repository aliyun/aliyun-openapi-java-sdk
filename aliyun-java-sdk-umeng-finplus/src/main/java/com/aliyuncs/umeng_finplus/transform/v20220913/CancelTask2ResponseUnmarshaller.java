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

package com.aliyuncs.umeng_finplus.transform.v20220913;

import com.aliyuncs.umeng_finplus.model.v20220913.CancelTask2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelTask2ResponseUnmarshaller {

	public static CancelTask2Response unmarshall(CancelTask2Response cancelTask2Response, UnmarshallerContext _ctx) {
		
		cancelTask2Response.setRequestId(_ctx.stringValue("CancelTask2Response.RequestId"));
		cancelTask2Response.setMsg(_ctx.stringValue("CancelTask2Response.Msg"));
		cancelTask2Response.setCode(_ctx.stringValue("CancelTask2Response.Code"));
		cancelTask2Response.setSuccess(_ctx.booleanValue("CancelTask2Response.Success"));
		cancelTask2Response.setData(_ctx.booleanValue("CancelTask2Response.Data"));
	 
	 	return cancelTask2Response;
	}
}