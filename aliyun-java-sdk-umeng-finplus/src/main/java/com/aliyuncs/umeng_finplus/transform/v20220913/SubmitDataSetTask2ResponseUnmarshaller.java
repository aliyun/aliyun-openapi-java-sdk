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

import com.aliyuncs.umeng_finplus.model.v20220913.SubmitDataSetTask2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitDataSetTask2ResponseUnmarshaller {

	public static SubmitDataSetTask2Response unmarshall(SubmitDataSetTask2Response submitDataSetTask2Response, UnmarshallerContext _ctx) {
		
		submitDataSetTask2Response.setRequestId(_ctx.stringValue("SubmitDataSetTask2Response.RequestId"));
		submitDataSetTask2Response.setMsg(_ctx.stringValue("SubmitDataSetTask2Response.Msg"));
		submitDataSetTask2Response.setCode(_ctx.stringValue("SubmitDataSetTask2Response.Code"));
		submitDataSetTask2Response.setSuccess(_ctx.booleanValue("SubmitDataSetTask2Response.Success"));
		submitDataSetTask2Response.setData(_ctx.booleanValue("SubmitDataSetTask2Response.Data"));
	 
	 	return submitDataSetTask2Response;
	}
}