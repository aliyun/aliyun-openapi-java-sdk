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

import com.aliyuncs.umeng_finplus.model.v20220913.RemoveDataSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveDataSetResponseUnmarshaller {

	public static RemoveDataSetResponse unmarshall(RemoveDataSetResponse removeDataSetResponse, UnmarshallerContext _ctx) {
		
		removeDataSetResponse.setRequestId(_ctx.stringValue("RemoveDataSetResponse.RequestId"));
		removeDataSetResponse.setMsg(_ctx.stringValue("RemoveDataSetResponse.Msg"));
		removeDataSetResponse.setCode(_ctx.stringValue("RemoveDataSetResponse.Code"));
		removeDataSetResponse.setSuccess(_ctx.booleanValue("RemoveDataSetResponse.Success"));
		removeDataSetResponse.setData(_ctx.booleanValue("RemoveDataSetResponse.Data"));
	 
	 	return removeDataSetResponse;
	}
}