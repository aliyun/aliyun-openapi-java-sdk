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

package com.aliyuncs.sls.transform.v20191023;

import com.aliyuncs.sls.model.v20191023.DeleteImportIngestionJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteImportIngestionJobResponseUnmarshaller {

	public static DeleteImportIngestionJobResponse unmarshall(DeleteImportIngestionJobResponse deleteImportIngestionJobResponse, UnmarshallerContext _ctx) {
		
		deleteImportIngestionJobResponse.setRequestId(_ctx.stringValue("DeleteImportIngestionJobResponse.RequestId"));
		deleteImportIngestionJobResponse.setSuccess(_ctx.booleanValue("DeleteImportIngestionJobResponse.Success"));
		deleteImportIngestionJobResponse.setCode(_ctx.stringValue("DeleteImportIngestionJobResponse.Code"));
		deleteImportIngestionJobResponse.setMessage(_ctx.stringValue("DeleteImportIngestionJobResponse.Message"));
	 
	 	return deleteImportIngestionJobResponse;
	}
}