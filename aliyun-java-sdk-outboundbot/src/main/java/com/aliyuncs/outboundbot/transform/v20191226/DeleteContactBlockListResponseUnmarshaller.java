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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DeleteContactBlockListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteContactBlockListResponseUnmarshaller {

	public static DeleteContactBlockListResponse unmarshall(DeleteContactBlockListResponse deleteContactBlockListResponse, UnmarshallerContext _ctx) {
		
		deleteContactBlockListResponse.setRequestId(_ctx.stringValue("DeleteContactBlockListResponse.RequestId"));
		deleteContactBlockListResponse.setSuccess(_ctx.booleanValue("DeleteContactBlockListResponse.Success"));
		deleteContactBlockListResponse.setCode(_ctx.stringValue("DeleteContactBlockListResponse.Code"));
		deleteContactBlockListResponse.setMessage(_ctx.stringValue("DeleteContactBlockListResponse.Message"));
		deleteContactBlockListResponse.setHttpStatusCode(_ctx.integerValue("DeleteContactBlockListResponse.HttpStatusCode"));
		deleteContactBlockListResponse.setAffectedRows(_ctx.integerValue("DeleteContactBlockListResponse.AffectedRows"));
	 
	 	return deleteContactBlockListResponse;
	}
}