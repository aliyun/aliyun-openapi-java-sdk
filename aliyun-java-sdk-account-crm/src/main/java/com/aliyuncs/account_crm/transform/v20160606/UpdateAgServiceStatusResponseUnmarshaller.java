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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.UpdateAgServiceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAgServiceStatusResponseUnmarshaller {

	public static UpdateAgServiceStatusResponse unmarshall(UpdateAgServiceStatusResponse updateAgServiceStatusResponse, UnmarshallerContext _ctx) {
		
		updateAgServiceStatusResponse.setRequestId(_ctx.stringValue("UpdateAgServiceStatusResponse.RequestId"));
		updateAgServiceStatusResponse.setCode(_ctx.stringValue("UpdateAgServiceStatusResponse.Code"));
		updateAgServiceStatusResponse.setMessage(_ctx.stringValue("UpdateAgServiceStatusResponse.Message"));
		updateAgServiceStatusResponse.setSuccess(_ctx.booleanValue("UpdateAgServiceStatusResponse.Success"));
	 
	 	return updateAgServiceStatusResponse;
	}
}