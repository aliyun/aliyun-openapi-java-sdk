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

import com.aliyuncs.umeng_finplus.model.v20220913.CreateDataSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataSetResponseUnmarshaller {

	public static CreateDataSetResponse unmarshall(CreateDataSetResponse createDataSetResponse, UnmarshallerContext _ctx) {
		
		createDataSetResponse.setRequestId(_ctx.stringValue("CreateDataSetResponse.RequestId"));
		createDataSetResponse.setMsg(_ctx.stringValue("CreateDataSetResponse.Msg"));
		createDataSetResponse.setCode(_ctx.stringValue("CreateDataSetResponse.Code"));
		createDataSetResponse.setSuccess(_ctx.booleanValue("CreateDataSetResponse.Success"));
		createDataSetResponse.setData(_ctx.longValue("CreateDataSetResponse.Data"));
	 
	 	return createDataSetResponse;
	}
}