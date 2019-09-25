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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.DeleteDataSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDataSetResponseUnmarshaller {

	public static DeleteDataSetResponse unmarshall(DeleteDataSetResponse deleteDataSetResponse, UnmarshallerContext _ctx) {
		
		deleteDataSetResponse.setRequestId(_ctx.stringValue("DeleteDataSetResponse.RequestId"));
		deleteDataSetResponse.setSuccess(_ctx.booleanValue("DeleteDataSetResponse.Success"));
		deleteDataSetResponse.setCode(_ctx.stringValue("DeleteDataSetResponse.Code"));
		deleteDataSetResponse.setMessage(_ctx.stringValue("DeleteDataSetResponse.Message"));
	 
	 	return deleteDataSetResponse;
	}
}