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

import com.aliyuncs.dataworks_public.model.v20200518.DeleteQualityRelativeNodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQualityRelativeNodeResponseUnmarshaller {

	public static DeleteQualityRelativeNodeResponse unmarshall(DeleteQualityRelativeNodeResponse deleteQualityRelativeNodeResponse, UnmarshallerContext _ctx) {
		
		deleteQualityRelativeNodeResponse.setRequestId(_ctx.stringValue("DeleteQualityRelativeNodeResponse.RequestId"));
		deleteQualityRelativeNodeResponse.setHttpStatusCode(_ctx.integerValue("DeleteQualityRelativeNodeResponse.HttpStatusCode"));
		deleteQualityRelativeNodeResponse.setData(_ctx.booleanValue("DeleteQualityRelativeNodeResponse.Data"));
		deleteQualityRelativeNodeResponse.setErrorMessage(_ctx.stringValue("DeleteQualityRelativeNodeResponse.ErrorMessage"));
		deleteQualityRelativeNodeResponse.setSuccess(_ctx.booleanValue("DeleteQualityRelativeNodeResponse.Success"));
		deleteQualityRelativeNodeResponse.setErrorCode(_ctx.stringValue("DeleteQualityRelativeNodeResponse.ErrorCode"));
	 
	 	return deleteQualityRelativeNodeResponse;
	}
}