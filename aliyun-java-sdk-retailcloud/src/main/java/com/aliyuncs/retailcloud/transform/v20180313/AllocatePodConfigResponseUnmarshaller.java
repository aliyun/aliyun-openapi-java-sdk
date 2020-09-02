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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.AllocatePodConfigResponse;
import com.aliyuncs.retailcloud.model.v20180313.AllocatePodConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllocatePodConfigResponseUnmarshaller {

	public static AllocatePodConfigResponse unmarshall(AllocatePodConfigResponse allocatePodConfigResponse, UnmarshallerContext _ctx) {
		
		allocatePodConfigResponse.setRequestId(_ctx.stringValue("AllocatePodConfigResponse.RequestId"));
		allocatePodConfigResponse.setCode(_ctx.integerValue("AllocatePodConfigResponse.Code"));
		allocatePodConfigResponse.setErrMsg(_ctx.stringValue("AllocatePodConfigResponse.ErrMsg"));
		allocatePodConfigResponse.setSuccess(_ctx.booleanValue("AllocatePodConfigResponse.Success"));

		Result result = new Result();
		result.setConfigData(_ctx.stringValue("AllocatePodConfigResponse.Result.ConfigData"));
		allocatePodConfigResponse.setResult(result);
	 
	 	return allocatePodConfigResponse;
	}
}