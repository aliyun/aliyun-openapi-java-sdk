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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.UpdateDegradeControlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDegradeControlResponseUnmarshaller {

	public static UpdateDegradeControlResponse unmarshall(UpdateDegradeControlResponse updateDegradeControlResponse, UnmarshallerContext _ctx) {
		
		updateDegradeControlResponse.setRequestId(_ctx.stringValue("UpdateDegradeControlResponse.RequestId"));
		updateDegradeControlResponse.setCode(_ctx.integerValue("UpdateDegradeControlResponse.Code"));
		updateDegradeControlResponse.setMessage(_ctx.stringValue("UpdateDegradeControlResponse.Message"));
	 
	 	return updateDegradeControlResponse;
	}
}