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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinktModuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinktModuleResponseUnmarshaller {

	public static DeleteLinkeLinktModuleResponse unmarshall(DeleteLinkeLinktModuleResponse deleteLinkeLinktModuleResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinktModuleResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinktModuleResponse.RequestId"));
		deleteLinkeLinktModuleResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinktModuleResponse.ResultCode"));
		deleteLinkeLinktModuleResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinktModuleResponse.ResultMessage"));
		deleteLinkeLinktModuleResponse.setData(_ctx.booleanValue("DeleteLinkeLinktModuleResponse.Data"));
		deleteLinkeLinktModuleResponse.setErrorCode(_ctx.longValue("DeleteLinkeLinktModuleResponse.ErrorCode"));
		deleteLinkeLinktModuleResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeLinktModuleResponse.ErrorMessage"));
		deleteLinkeLinktModuleResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinktModuleResponse.Success"));
	 
	 	return deleteLinkeLinktModuleResponse;
	}
}