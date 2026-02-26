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

import com.aliyuncs.umeng_finplus.model.v20220913.RemoveDataSet2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveDataSet2ResponseUnmarshaller {

	public static RemoveDataSet2Response unmarshall(RemoveDataSet2Response removeDataSet2Response, UnmarshallerContext _ctx) {
		
		removeDataSet2Response.setRequestId(_ctx.stringValue("RemoveDataSet2Response.RequestId"));
		removeDataSet2Response.setMsg(_ctx.stringValue("RemoveDataSet2Response.Msg"));
		removeDataSet2Response.setCode(_ctx.stringValue("RemoveDataSet2Response.Code"));
		removeDataSet2Response.setSuccess(_ctx.booleanValue("RemoveDataSet2Response.Success"));
		removeDataSet2Response.setData(_ctx.booleanValue("RemoveDataSet2Response.Data"));
	 
	 	return removeDataSet2Response;
	}
}