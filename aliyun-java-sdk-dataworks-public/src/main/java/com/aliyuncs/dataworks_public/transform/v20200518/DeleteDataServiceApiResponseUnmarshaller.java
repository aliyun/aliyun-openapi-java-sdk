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

import com.aliyuncs.dataworks_public.model.v20200518.DeleteDataServiceApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDataServiceApiResponseUnmarshaller {

	public static DeleteDataServiceApiResponse unmarshall(DeleteDataServiceApiResponse deleteDataServiceApiResponse, UnmarshallerContext _ctx) {
		
		deleteDataServiceApiResponse.setRequestId(_ctx.stringValue("DeleteDataServiceApiResponse.RequestId"));
		deleteDataServiceApiResponse.setData(_ctx.booleanValue("DeleteDataServiceApiResponse.Data"));
		deleteDataServiceApiResponse.setErrorCode(_ctx.stringValue("DeleteDataServiceApiResponse.ErrorCode"));
		deleteDataServiceApiResponse.setErrorMessage(_ctx.stringValue("DeleteDataServiceApiResponse.ErrorMessage"));
		deleteDataServiceApiResponse.setHttpStatusCode(_ctx.integerValue("DeleteDataServiceApiResponse.HttpStatusCode"));
		deleteDataServiceApiResponse.setSuccess(_ctx.booleanValue("DeleteDataServiceApiResponse.Success"));
	 
	 	return deleteDataServiceApiResponse;
	}
}