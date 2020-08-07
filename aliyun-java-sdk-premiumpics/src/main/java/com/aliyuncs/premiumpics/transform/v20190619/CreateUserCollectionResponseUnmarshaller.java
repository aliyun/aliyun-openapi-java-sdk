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

package com.aliyuncs.premiumpics.transform.v20190619;

import com.aliyuncs.premiumpics.model.v20190619.CreateUserCollectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserCollectionResponseUnmarshaller {

	public static CreateUserCollectionResponse unmarshall(CreateUserCollectionResponse createUserCollectionResponse, UnmarshallerContext _ctx) {
		
		createUserCollectionResponse.setRequestId(_ctx.stringValue("CreateUserCollectionResponse.RequestId"));
		createUserCollectionResponse.setErrorCode(_ctx.stringValue("CreateUserCollectionResponse.ErrorCode"));
		createUserCollectionResponse.setErrorMsg(_ctx.stringValue("CreateUserCollectionResponse.ErrorMsg"));
		createUserCollectionResponse.setStatus(_ctx.booleanValue("CreateUserCollectionResponse.Status"));
		createUserCollectionResponse.setSuccess(_ctx.booleanValue("CreateUserCollectionResponse.Success"));
	 
	 	return createUserCollectionResponse;
	}
}