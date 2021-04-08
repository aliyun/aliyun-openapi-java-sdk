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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.DeleteQualityProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQualityProjectResponseUnmarshaller {

	public static DeleteQualityProjectResponse unmarshall(DeleteQualityProjectResponse deleteQualityProjectResponse, UnmarshallerContext _ctx) {
		
		deleteQualityProjectResponse.setRequestId(_ctx.stringValue("DeleteQualityProjectResponse.RequestId"));
		deleteQualityProjectResponse.setMessage(_ctx.stringValue("DeleteQualityProjectResponse.Message"));
		deleteQualityProjectResponse.setData(_ctx.stringValue("DeleteQualityProjectResponse.Data"));
		deleteQualityProjectResponse.setCode(_ctx.stringValue("DeleteQualityProjectResponse.Code"));
		deleteQualityProjectResponse.setSuccess(_ctx.booleanValue("DeleteQualityProjectResponse.Success"));
	 
	 	return deleteQualityProjectResponse;
	}
}