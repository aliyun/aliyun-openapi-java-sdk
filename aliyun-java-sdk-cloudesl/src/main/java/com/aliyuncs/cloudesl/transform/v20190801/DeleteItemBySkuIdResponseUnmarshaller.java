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

package com.aliyuncs.cloudesl.transform.v20190801;

import com.aliyuncs.cloudesl.model.v20190801.DeleteItemBySkuIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteItemBySkuIdResponseUnmarshaller {

	public static DeleteItemBySkuIdResponse unmarshall(DeleteItemBySkuIdResponse deleteItemBySkuIdResponse, UnmarshallerContext _ctx) {
		
		deleteItemBySkuIdResponse.setRequestId(_ctx.stringValue("DeleteItemBySkuIdResponse.RequestId"));
		deleteItemBySkuIdResponse.setErrorMessage(_ctx.stringValue("DeleteItemBySkuIdResponse.ErrorMessage"));
		deleteItemBySkuIdResponse.setErrorCode(_ctx.stringValue("DeleteItemBySkuIdResponse.ErrorCode"));
		deleteItemBySkuIdResponse.setMessage(_ctx.stringValue("DeleteItemBySkuIdResponse.Message"));
		deleteItemBySkuIdResponse.setDynamicCode(_ctx.stringValue("DeleteItemBySkuIdResponse.DynamicCode"));
		deleteItemBySkuIdResponse.setCode(_ctx.stringValue("DeleteItemBySkuIdResponse.Code"));
		deleteItemBySkuIdResponse.setDynamicMessage(_ctx.stringValue("DeleteItemBySkuIdResponse.DynamicMessage"));
		deleteItemBySkuIdResponse.setSuccess(_ctx.booleanValue("DeleteItemBySkuIdResponse.Success"));
	 
	 	return deleteItemBySkuIdResponse;
	}
}