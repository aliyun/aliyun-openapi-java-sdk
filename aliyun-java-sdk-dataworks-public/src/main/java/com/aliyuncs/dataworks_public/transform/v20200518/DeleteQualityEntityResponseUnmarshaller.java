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

import com.aliyuncs.dataworks_public.model.v20200518.DeleteQualityEntityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQualityEntityResponseUnmarshaller {

	public static DeleteQualityEntityResponse unmarshall(DeleteQualityEntityResponse deleteQualityEntityResponse, UnmarshallerContext _ctx) {
		
		deleteQualityEntityResponse.setRequestId(_ctx.stringValue("DeleteQualityEntityResponse.RequestId"));
		deleteQualityEntityResponse.setSuccess(_ctx.booleanValue("DeleteQualityEntityResponse.Success"));
		deleteQualityEntityResponse.setErrorCode(_ctx.stringValue("DeleteQualityEntityResponse.ErrorCode"));
		deleteQualityEntityResponse.setErrorMessage(_ctx.stringValue("DeleteQualityEntityResponse.ErrorMessage"));
		deleteQualityEntityResponse.setHttpStatusCode(_ctx.integerValue("DeleteQualityEntityResponse.HttpStatusCode"));
		deleteQualityEntityResponse.setData(_ctx.booleanValue("DeleteQualityEntityResponse.Data"));
	 
	 	return deleteQualityEntityResponse;
	}
}