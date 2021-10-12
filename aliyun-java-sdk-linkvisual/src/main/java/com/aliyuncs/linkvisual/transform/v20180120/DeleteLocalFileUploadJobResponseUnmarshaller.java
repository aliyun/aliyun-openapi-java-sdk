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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.DeleteLocalFileUploadJobResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLocalFileUploadJobResponseUnmarshaller {

	public static DeleteLocalFileUploadJobResponse unmarshall(DeleteLocalFileUploadJobResponse deleteLocalFileUploadJobResponse, UnmarshallerContext _ctx) {
		
		deleteLocalFileUploadJobResponse.setRequestId(_ctx.stringValue("DeleteLocalFileUploadJobResponse.RequestId"));
		deleteLocalFileUploadJobResponse.setSuccess(_ctx.booleanValue("DeleteLocalFileUploadJobResponse.Success"));
		deleteLocalFileUploadJobResponse.setCode(_ctx.stringValue("DeleteLocalFileUploadJobResponse.Code"));
		deleteLocalFileUploadJobResponse.setErrorMessage(_ctx.stringValue("DeleteLocalFileUploadJobResponse.ErrorMessage"));
		deleteLocalFileUploadJobResponse.setData(_ctx.mapValue("DeleteLocalFileUploadJobResponse.Data"));
	 
	 	return deleteLocalFileUploadJobResponse;
	}
}