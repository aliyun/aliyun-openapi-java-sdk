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

	public static DeleteDataSetResponse unmarshall(DeleteDataSetResponse deleteDataSetResponse, UnmarshallerContext _ctx) {
		
		deleteDataSetResponse.setRequestId(_ctx.stringValue("DeleteDataSetResponse.RequestId"));
		deleteDataSetResponse.setCode(_ctx.stringValue("DeleteDataSetResponse.Code"));
		deleteDataSetResponse.setMessage(_ctx.stringValue("DeleteDataSetResponse.Message"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("DeleteDataSetResponse.Result.InstanceId"));
		result.setVersionId(_ctx.stringValue("DeleteDataSetResponse.Result.VersionId"));
		result.setState(_ctx.stringValue("DeleteDataSetResponse.Result.State"));
		result.setGmtCreate(_ctx.longValue("DeleteDataSetResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("DeleteDataSetResponse.Result.GmtModified"));
		deleteDataSetResponse.setResult(result);
	 
	 	return deleteDataSetResponse;
	}
}