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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.UpdateBaselineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateBaselineResponseUnmarshaller {

	public static UpdateBaselineResponse unmarshall(UpdateBaselineResponse updateBaselineResponse, UnmarshallerContext _ctx) {
		
		updateBaselineResponse.setRequestId(_ctx.stringValue("UpdateBaselineResponse.RequestId"));
		updateBaselineResponse.setSuccess(_ctx.booleanValue("UpdateBaselineResponse.Success"));
		updateBaselineResponse.setErrorCode(_ctx.stringValue("UpdateBaselineResponse.ErrorCode"));
		updateBaselineResponse.setErrorMessage(_ctx.stringValue("UpdateBaselineResponse.ErrorMessage"));
		updateBaselineResponse.setHttpStatusCode(_ctx.integerValue("UpdateBaselineResponse.HttpStatusCode"));
		updateBaselineResponse.setData(_ctx.booleanValue("UpdateBaselineResponse.Data"));
	 
	 	return updateBaselineResponse;
	}
}