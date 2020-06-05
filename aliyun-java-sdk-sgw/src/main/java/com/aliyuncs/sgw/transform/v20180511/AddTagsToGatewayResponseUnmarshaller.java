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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.AddTagsToGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTagsToGatewayResponseUnmarshaller {

	public static AddTagsToGatewayResponse unmarshall(AddTagsToGatewayResponse addTagsToGatewayResponse, UnmarshallerContext _ctx) {
		
		addTagsToGatewayResponse.setRequestId(_ctx.stringValue("AddTagsToGatewayResponse.RequestId"));
		addTagsToGatewayResponse.setSuccess(_ctx.booleanValue("AddTagsToGatewayResponse.Success"));
		addTagsToGatewayResponse.setCode(_ctx.stringValue("AddTagsToGatewayResponse.Code"));
		addTagsToGatewayResponse.setMessage(_ctx.stringValue("AddTagsToGatewayResponse.Message"));
	 
	 	return addTagsToGatewayResponse;
	}
}