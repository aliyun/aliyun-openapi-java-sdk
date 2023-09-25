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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.DeleteMetaCollectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMetaCollectionResponseUnmarshaller {

	public static DeleteMetaCollectionResponse unmarshall(DeleteMetaCollectionResponse deleteMetaCollectionResponse, UnmarshallerContext _ctx) {
		
		deleteMetaCollectionResponse.setRequestId(_ctx.stringValue("DeleteMetaCollectionResponse.RequestId"));
		deleteMetaCollectionResponse.setStatus(_ctx.booleanValue("DeleteMetaCollectionResponse.Status"));
		deleteMetaCollectionResponse.setHttpStatusCode(_ctx.integerValue("DeleteMetaCollectionResponse.HttpStatusCode"));
		deleteMetaCollectionResponse.setErrorMessage(_ctx.stringValue("DeleteMetaCollectionResponse.ErrorMessage"));
		deleteMetaCollectionResponse.setErrorCode(_ctx.stringValue("DeleteMetaCollectionResponse.ErrorCode"));
		deleteMetaCollectionResponse.setSuccess(_ctx.booleanValue("DeleteMetaCollectionResponse.Success"));
	 
	 	return deleteMetaCollectionResponse;
	}
}