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

package com.aliyuncs.cd.transform.v2021127;

import com.aliyuncs.cd.model.v2021127.DeleteProductImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProductImageResponseUnmarshaller {

	public static DeleteProductImageResponse unmarshall(DeleteProductImageResponse deleteProductImageResponse, UnmarshallerContext _ctx) {
		
		deleteProductImageResponse.setRequestId(_ctx.stringValue("DeleteProductImageResponse.RequestId"));
		deleteProductImageResponse.setSuccess(_ctx.booleanValue("DeleteProductImageResponse.Success"));
		deleteProductImageResponse.setMessage(_ctx.stringValue("DeleteProductImageResponse.Message"));
		deleteProductImageResponse.setCode(_ctx.stringValue("DeleteProductImageResponse.Code"));
		deleteProductImageResponse.setHttpStatusCode(_ctx.integerValue("DeleteProductImageResponse.HttpStatusCode"));
		deleteProductImageResponse.setData(_ctx.stringValue("DeleteProductImageResponse.Data"));
	 
	 	return deleteProductImageResponse;
	}
}