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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DeleteSuspEventNodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSuspEventNodeResponseUnmarshaller {

	public static DeleteSuspEventNodeResponse unmarshall(DeleteSuspEventNodeResponse deleteSuspEventNodeResponse, UnmarshallerContext _ctx) {
		
		deleteSuspEventNodeResponse.setRequestId(_ctx.stringValue("DeleteSuspEventNodeResponse.RequestId"));
		deleteSuspEventNodeResponse.setSuccess(_ctx.booleanValue("DeleteSuspEventNodeResponse.Success"));
		deleteSuspEventNodeResponse.setCode(_ctx.stringValue("DeleteSuspEventNodeResponse.Code"));
		deleteSuspEventNodeResponse.setMessage(_ctx.stringValue("DeleteSuspEventNodeResponse.Message"));
	 
	 	return deleteSuspEventNodeResponse;
	}
}