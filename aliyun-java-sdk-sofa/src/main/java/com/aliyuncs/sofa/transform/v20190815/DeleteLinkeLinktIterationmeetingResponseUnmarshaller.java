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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinktIterationmeetingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinktIterationmeetingResponseUnmarshaller {

	public static DeleteLinkeLinktIterationmeetingResponse unmarshall(DeleteLinkeLinktIterationmeetingResponse deleteLinkeLinktIterationmeetingResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinktIterationmeetingResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinktIterationmeetingResponse.RequestId"));
		deleteLinkeLinktIterationmeetingResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinktIterationmeetingResponse.ResultCode"));
		deleteLinkeLinktIterationmeetingResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinktIterationmeetingResponse.ResultMessage"));
		deleteLinkeLinktIterationmeetingResponse.setData(_ctx.booleanValue("DeleteLinkeLinktIterationmeetingResponse.Data"));
		deleteLinkeLinktIterationmeetingResponse.setErrorCode(_ctx.longValue("DeleteLinkeLinktIterationmeetingResponse.ErrorCode"));
		deleteLinkeLinktIterationmeetingResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeLinktIterationmeetingResponse.ErrorMessage"));
		deleteLinkeLinktIterationmeetingResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinktIterationmeetingResponse.Success"));
	 
	 	return deleteLinkeLinktIterationmeetingResponse;
	}
}