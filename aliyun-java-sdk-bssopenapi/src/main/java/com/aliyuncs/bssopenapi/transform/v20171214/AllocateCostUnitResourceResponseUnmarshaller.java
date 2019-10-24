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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.AllocateCostUnitResourceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.AllocateCostUnitResourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllocateCostUnitResourceResponseUnmarshaller {

	public static AllocateCostUnitResourceResponse unmarshall(AllocateCostUnitResourceResponse allocateCostUnitResourceResponse, UnmarshallerContext _ctx) {
		
		allocateCostUnitResourceResponse.setRequestId(_ctx.stringValue("AllocateCostUnitResourceResponse.RequestId"));
		allocateCostUnitResourceResponse.setSuccess(_ctx.booleanValue("AllocateCostUnitResourceResponse.Success"));
		allocateCostUnitResourceResponse.setCode(_ctx.stringValue("AllocateCostUnitResourceResponse.Code"));
		allocateCostUnitResourceResponse.setMessage(_ctx.stringValue("AllocateCostUnitResourceResponse.Message"));

		Data data = new Data();
		data.setToUnitUserId(_ctx.longValue("AllocateCostUnitResourceResponse.Data.ToUnitUserId"));
		data.setToUnitId(_ctx.longValue("AllocateCostUnitResourceResponse.Data.ToUnitId"));
		data.setIsSuccess(_ctx.booleanValue("AllocateCostUnitResourceResponse.Data.IsSuccess"));
		allocateCostUnitResourceResponse.setData(data);
	 
	 	return allocateCostUnitResourceResponse;
	}
}