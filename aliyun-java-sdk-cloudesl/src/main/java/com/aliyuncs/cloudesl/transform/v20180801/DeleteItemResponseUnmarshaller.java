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

package com.aliyuncs.cloudesl.transform.v20180801;

import com.aliyuncs.cloudesl.model.v20180801.DeleteItemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteItemResponseUnmarshaller {

	public static DeleteItemResponse unmarshall(DeleteItemResponse deleteItemResponse, UnmarshallerContext _ctx) {
		
		deleteItemResponse.setRequestId(_ctx.stringValue("DeleteItemResponse.RequestId"));
		deleteItemResponse.setSuccess(_ctx.booleanValue("DeleteItemResponse.Success"));
		deleteItemResponse.setMessage(_ctx.stringValue("DeleteItemResponse.Message"));
		deleteItemResponse.setErrorCode(_ctx.stringValue("DeleteItemResponse.ErrorCode"));
	 
	 	return deleteItemResponse;
	}
}