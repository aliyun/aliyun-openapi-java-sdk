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

package com.aliyuncs.aimath.transform.v20241114;

import com.aliyuncs.aimath.model.v20241114.UpdateStepResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateStepResponseUnmarshaller {

	public static UpdateStepResponse unmarshall(UpdateStepResponse updateStepResponse, UnmarshallerContext _ctx) {
		
		updateStepResponse.setRequestId(_ctx.stringValue("UpdateStepResponse.RequestId"));
		updateStepResponse.setSuccess(_ctx.booleanValue("UpdateStepResponse.Success"));
		updateStepResponse.setErrCode(_ctx.stringValue("UpdateStepResponse.ErrCode"));
		updateStepResponse.setErrMsg(_ctx.stringValue("UpdateStepResponse.ErrMsg"));
	 
	 	return updateStepResponse;
	}
}