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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.UpdateAIPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAIPlanResponseUnmarshaller {

	public static UpdateAIPlanResponse unmarshall(UpdateAIPlanResponse updateAIPlanResponse, UnmarshallerContext _ctx) {
		
		updateAIPlanResponse.setRequestId(_ctx.stringValue("UpdateAIPlanResponse.RequestId"));
		updateAIPlanResponse.setSuccess(_ctx.booleanValue("UpdateAIPlanResponse.Success"));
		updateAIPlanResponse.setErrorMessage(_ctx.stringValue("UpdateAIPlanResponse.ErrorMessage"));
		updateAIPlanResponse.setCode(_ctx.stringValue("UpdateAIPlanResponse.Code"));
	 
	 	return updateAIPlanResponse;
	}
}