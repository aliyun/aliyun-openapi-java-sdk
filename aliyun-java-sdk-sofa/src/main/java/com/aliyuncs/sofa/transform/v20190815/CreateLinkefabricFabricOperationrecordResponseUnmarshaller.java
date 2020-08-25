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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateLinkefabricFabricOperationrecordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkefabricFabricOperationrecordResponseUnmarshaller {

	public static CreateLinkefabricFabricOperationrecordResponse unmarshall(CreateLinkefabricFabricOperationrecordResponse createLinkefabricFabricOperationrecordResponse, UnmarshallerContext _ctx) {
		
		createLinkefabricFabricOperationrecordResponse.setRequestId(_ctx.stringValue("CreateLinkefabricFabricOperationrecordResponse.RequestId"));
		createLinkefabricFabricOperationrecordResponse.setResultCode(_ctx.stringValue("CreateLinkefabricFabricOperationrecordResponse.ResultCode"));
		createLinkefabricFabricOperationrecordResponse.setResultMessage(_ctx.stringValue("CreateLinkefabricFabricOperationrecordResponse.ResultMessage"));
		createLinkefabricFabricOperationrecordResponse.setData(_ctx.booleanValue("CreateLinkefabricFabricOperationrecordResponse.Data"));
		createLinkefabricFabricOperationrecordResponse.setMessage(_ctx.stringValue("CreateLinkefabricFabricOperationrecordResponse.Message"));
		createLinkefabricFabricOperationrecordResponse.setResponseStatusCode(_ctx.longValue("CreateLinkefabricFabricOperationrecordResponse.ResponseStatusCode"));
		createLinkefabricFabricOperationrecordResponse.setSuccess(_ctx.booleanValue("CreateLinkefabricFabricOperationrecordResponse.Success"));
	 
	 	return createLinkefabricFabricOperationrecordResponse;
	}
}