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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.DeleteEmapResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteEmapResponseUnmarshaller {

	public static DeleteEmapResponse unmarshall(DeleteEmapResponse deleteEmapResponse, UnmarshallerContext _ctx) {
		
		deleteEmapResponse.setRequestId(_ctx.stringValue("DeleteEmapResponse.RequestId"));
		deleteEmapResponse.setMessage(_ctx.stringValue("DeleteEmapResponse.Message"));
		deleteEmapResponse.setErrorCode(_ctx.stringValue("DeleteEmapResponse.ErrorCode"));
		deleteEmapResponse.setErrorMessage(_ctx.stringValue("DeleteEmapResponse.ErrorMessage"));
		deleteEmapResponse.setDynamicMessage(_ctx.stringValue("DeleteEmapResponse.DynamicMessage"));
		deleteEmapResponse.setSuccess(_ctx.booleanValue("DeleteEmapResponse.Success"));
		deleteEmapResponse.setDynamicCode(_ctx.stringValue("DeleteEmapResponse.DynamicCode"));
		deleteEmapResponse.setCode(_ctx.stringValue("DeleteEmapResponse.Code"));
	 
	 	return deleteEmapResponse;
	}
}