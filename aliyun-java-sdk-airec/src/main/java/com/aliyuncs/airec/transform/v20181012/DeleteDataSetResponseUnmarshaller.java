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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.DeleteDataSetResponse;
import com.aliyuncs.airec.model.v20181012.DeleteDataSetResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDataSetResponseUnmarshaller {

	public static DeleteDataSetResponse unmarshall(DeleteDataSetResponse deleteDataSetResponse, UnmarshallerContext context) {
		
		deleteDataSetResponse.setRequestId(context.stringValue("DeleteDataSetResponse.RequestId"));
		deleteDataSetResponse.setCode(context.stringValue("DeleteDataSetResponse.Code"));
		deleteDataSetResponse.setMessage(context.stringValue("DeleteDataSetResponse.Message"));

		Result result = new Result();
		result.setInstanceId(context.stringValue("DeleteDataSetResponse.Result.InstanceId"));
		result.setVersionId(context.stringValue("DeleteDataSetResponse.Result.VersionId"));
		result.setState(context.stringValue("DeleteDataSetResponse.Result.State"));
		result.setGmtCreate(context.longValue("DeleteDataSetResponse.Result.GmtCreate"));
		result.setGmtModified(context.longValue("DeleteDataSetResponse.Result.GmtModified"));
		deleteDataSetResponse.setResult(result);
	 
	 	return deleteDataSetResponse;
	}
}