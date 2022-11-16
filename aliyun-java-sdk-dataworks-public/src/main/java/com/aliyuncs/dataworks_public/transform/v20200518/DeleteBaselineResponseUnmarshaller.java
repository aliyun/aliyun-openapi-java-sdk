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

import com.aliyuncs.dataworks_public.model.v20200518.DeleteBaselineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBaselineResponseUnmarshaller {

	public static DeleteBaselineResponse unmarshall(DeleteBaselineResponse deleteBaselineResponse, UnmarshallerContext _ctx) {
		
		deleteBaselineResponse.setRequestId(_ctx.stringValue("DeleteBaselineResponse.RequestId"));
		deleteBaselineResponse.setSuccess(_ctx.booleanValue("DeleteBaselineResponse.Success"));
		deleteBaselineResponse.setErrorCode(_ctx.stringValue("DeleteBaselineResponse.ErrorCode"));
		deleteBaselineResponse.setErrorMessage(_ctx.stringValue("DeleteBaselineResponse.ErrorMessage"));
		deleteBaselineResponse.setHttpStatusCode(_ctx.integerValue("DeleteBaselineResponse.HttpStatusCode"));
		deleteBaselineResponse.setData(_ctx.booleanValue("DeleteBaselineResponse.Data"));
		deleteBaselineResponse.setDynamicErrorCode(_ctx.stringValue("DeleteBaselineResponse.DynamicErrorCode"));
		deleteBaselineResponse.setDynamicErrorMessage(_ctx.stringValue("DeleteBaselineResponse.DynamicErrorMessage"));
	 
	 	return deleteBaselineResponse;
	}
}