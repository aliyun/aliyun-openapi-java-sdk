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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.DeleteProductResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProductResponseUnmarshaller {

	public static DeleteProductResponse unmarshall(DeleteProductResponse deleteProductResponse, UnmarshallerContext context) {
		
		deleteProductResponse.setRequestId(context.stringValue("DeleteProductResponse.RequestId"));
		deleteProductResponse.setSuccess(context.booleanValue("DeleteProductResponse.Success"));
		deleteProductResponse.setCode(context.stringValue("DeleteProductResponse.Code"));
		deleteProductResponse.setErrorMessage(context.stringValue("DeleteProductResponse.ErrorMessage"));
	 
	 	return deleteProductResponse;
	}
}