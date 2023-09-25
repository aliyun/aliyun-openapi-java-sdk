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

import com.aliyuncs.dataworks_public.model.v20200518.AddMetaCollectionEntityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMetaCollectionEntityResponseUnmarshaller {

	public static AddMetaCollectionEntityResponse unmarshall(AddMetaCollectionEntityResponse addMetaCollectionEntityResponse, UnmarshallerContext _ctx) {
		
		addMetaCollectionEntityResponse.setRequestId(_ctx.stringValue("AddMetaCollectionEntityResponse.RequestId"));
		addMetaCollectionEntityResponse.setStatus(_ctx.booleanValue("AddMetaCollectionEntityResponse.Status"));
		addMetaCollectionEntityResponse.setHttpStatusCode(_ctx.integerValue("AddMetaCollectionEntityResponse.HttpStatusCode"));
		addMetaCollectionEntityResponse.setErrorMessage(_ctx.stringValue("AddMetaCollectionEntityResponse.ErrorMessage"));
		addMetaCollectionEntityResponse.setErrorCode(_ctx.stringValue("AddMetaCollectionEntityResponse.ErrorCode"));
		addMetaCollectionEntityResponse.setSuccess(_ctx.booleanValue("AddMetaCollectionEntityResponse.Success"));
	 
	 	return addMetaCollectionEntityResponse;
	}
}