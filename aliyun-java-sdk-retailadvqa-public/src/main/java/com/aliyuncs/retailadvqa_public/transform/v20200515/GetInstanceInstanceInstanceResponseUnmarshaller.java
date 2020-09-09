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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.GetInstanceInstanceInstanceResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetInstanceInstanceInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceInstanceInstanceResponseUnmarshaller {

	public static GetInstanceInstanceInstanceResponse unmarshall(GetInstanceInstanceInstanceResponse getInstanceInstanceInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceInstanceInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceInstanceInstanceResponse.RequestId"));
		getInstanceInstanceInstanceResponse.setErrorCode(_ctx.stringValue("GetInstanceInstanceInstanceResponse.ErrorCode"));
		getInstanceInstanceInstanceResponse.setSuccess(_ctx.booleanValue("GetInstanceInstanceInstanceResponse.Success"));

		Data data = new Data();
		data.setRetInstanceInfo(_ctx.stringValue("GetInstanceInstanceInstanceResponse.Data.RetInstanceInfo"));
		getInstanceInstanceInstanceResponse.setData(data);
	 
	 	return getInstanceInstanceInstanceResponse;
	}
}