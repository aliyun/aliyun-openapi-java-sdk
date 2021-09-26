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

import com.aliyuncs.dataworks_public.model.v20200518.DeleteQualityFollowerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQualityFollowerResponseUnmarshaller {

	public static DeleteQualityFollowerResponse unmarshall(DeleteQualityFollowerResponse deleteQualityFollowerResponse, UnmarshallerContext _ctx) {
		
		deleteQualityFollowerResponse.setRequestId(_ctx.stringValue("DeleteQualityFollowerResponse.RequestId"));
		deleteQualityFollowerResponse.setErrorCode(_ctx.stringValue("DeleteQualityFollowerResponse.ErrorCode"));
		deleteQualityFollowerResponse.setData(_ctx.booleanValue("DeleteQualityFollowerResponse.Data"));
		deleteQualityFollowerResponse.setSuccess(_ctx.booleanValue("DeleteQualityFollowerResponse.Success"));
		deleteQualityFollowerResponse.setErrorMessage(_ctx.stringValue("DeleteQualityFollowerResponse.ErrorMessage"));
		deleteQualityFollowerResponse.setHttpStatusCode(_ctx.integerValue("DeleteQualityFollowerResponse.HttpStatusCode"));
	 
	 	return deleteQualityFollowerResponse;
	}
}