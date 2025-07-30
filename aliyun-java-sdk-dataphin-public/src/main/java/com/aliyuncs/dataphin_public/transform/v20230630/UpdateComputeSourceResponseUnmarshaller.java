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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.UpdateComputeSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateComputeSourceResponseUnmarshaller {

	public static UpdateComputeSourceResponse unmarshall(UpdateComputeSourceResponse updateComputeSourceResponse, UnmarshallerContext _ctx) {
		
		updateComputeSourceResponse.setRequestId(_ctx.stringValue("UpdateComputeSourceResponse.RequestId"));
		updateComputeSourceResponse.setSuccess(_ctx.booleanValue("UpdateComputeSourceResponse.Success"));
		updateComputeSourceResponse.setHttpStatusCode(_ctx.integerValue("UpdateComputeSourceResponse.HttpStatusCode"));
		updateComputeSourceResponse.setCode(_ctx.stringValue("UpdateComputeSourceResponse.Code"));
		updateComputeSourceResponse.setMessage(_ctx.stringValue("UpdateComputeSourceResponse.Message"));
	 
	 	return updateComputeSourceResponse;
	}
}