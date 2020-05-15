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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktHandoverworkitemreviewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktHandoverworkitemreviewResponseUnmarshaller {

	public static ExecLinkeLinktHandoverworkitemreviewResponse unmarshall(ExecLinkeLinktHandoverworkitemreviewResponse execLinkeLinktHandoverworkitemreviewResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktHandoverworkitemreviewResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktHandoverworkitemreviewResponse.RequestId"));
		execLinkeLinktHandoverworkitemreviewResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktHandoverworkitemreviewResponse.ResultCode"));
		execLinkeLinktHandoverworkitemreviewResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktHandoverworkitemreviewResponse.ResultMessage"));
		execLinkeLinktHandoverworkitemreviewResponse.setData(_ctx.booleanValue("ExecLinkeLinktHandoverworkitemreviewResponse.Data"));
		execLinkeLinktHandoverworkitemreviewResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktHandoverworkitemreviewResponse.ErrorCode"));
		execLinkeLinktHandoverworkitemreviewResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktHandoverworkitemreviewResponse.ErrorMessage"));
		execLinkeLinktHandoverworkitemreviewResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktHandoverworkitemreviewResponse.Success"));
	 
	 	return execLinkeLinktHandoverworkitemreviewResponse;
	}
}