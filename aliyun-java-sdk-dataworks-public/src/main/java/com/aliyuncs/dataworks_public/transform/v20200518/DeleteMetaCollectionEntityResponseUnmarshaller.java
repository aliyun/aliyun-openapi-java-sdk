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

import com.aliyuncs.dataworks_public.model.v20200518.DeleteMetaCollectionEntityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMetaCollectionEntityResponseUnmarshaller {

	public static DeleteMetaCollectionEntityResponse unmarshall(DeleteMetaCollectionEntityResponse deleteMetaCollectionEntityResponse, UnmarshallerContext _ctx) {
		
		deleteMetaCollectionEntityResponse.setRequestId(_ctx.stringValue("DeleteMetaCollectionEntityResponse.RequestId"));
		deleteMetaCollectionEntityResponse.setStatus(_ctx.booleanValue("DeleteMetaCollectionEntityResponse.Status"));
		deleteMetaCollectionEntityResponse.setHttpStatusCode(_ctx.integerValue("DeleteMetaCollectionEntityResponse.HttpStatusCode"));
		deleteMetaCollectionEntityResponse.setErrorMessage(_ctx.stringValue("DeleteMetaCollectionEntityResponse.ErrorMessage"));
		deleteMetaCollectionEntityResponse.setErrorCode(_ctx.stringValue("DeleteMetaCollectionEntityResponse.ErrorCode"));
		deleteMetaCollectionEntityResponse.setSuccess(_ctx.booleanValue("DeleteMetaCollectionEntityResponse.Success"));
	 
	 	return deleteMetaCollectionEntityResponse;
	}
}