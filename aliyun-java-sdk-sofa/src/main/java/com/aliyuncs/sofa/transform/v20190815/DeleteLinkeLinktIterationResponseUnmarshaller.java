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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinktIterationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinktIterationResponseUnmarshaller {

	public static DeleteLinkeLinktIterationResponse unmarshall(DeleteLinkeLinktIterationResponse deleteLinkeLinktIterationResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinktIterationResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinktIterationResponse.RequestId"));
		deleteLinkeLinktIterationResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinktIterationResponse.ResultCode"));
		deleteLinkeLinktIterationResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinktIterationResponse.ResultMessage"));
		deleteLinkeLinktIterationResponse.setData(_ctx.booleanValue("DeleteLinkeLinktIterationResponse.Data"));
		deleteLinkeLinktIterationResponse.setErrorCode(_ctx.longValue("DeleteLinkeLinktIterationResponse.ErrorCode"));
		deleteLinkeLinktIterationResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeLinktIterationResponse.ErrorMessage"));
		deleteLinkeLinktIterationResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinktIterationResponse.Success"));
	 
	 	return deleteLinkeLinktIterationResponse;
	}
}