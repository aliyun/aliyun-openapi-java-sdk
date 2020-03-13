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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktInviteworkitemreviewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktInviteworkitemreviewResponseUnmarshaller {

	public static ExecLinkeLinktInviteworkitemreviewResponse unmarshall(ExecLinkeLinktInviteworkitemreviewResponse execLinkeLinktInviteworkitemreviewResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktInviteworkitemreviewResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktInviteworkitemreviewResponse.RequestId"));
		execLinkeLinktInviteworkitemreviewResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktInviteworkitemreviewResponse.ResultCode"));
		execLinkeLinktInviteworkitemreviewResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktInviteworkitemreviewResponse.ResultMessage"));
		execLinkeLinktInviteworkitemreviewResponse.setData(_ctx.booleanValue("ExecLinkeLinktInviteworkitemreviewResponse.Data"));
		execLinkeLinktInviteworkitemreviewResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktInviteworkitemreviewResponse.ErrorCode"));
		execLinkeLinktInviteworkitemreviewResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktInviteworkitemreviewResponse.ErrorMessage"));
		execLinkeLinktInviteworkitemreviewResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktInviteworkitemreviewResponse.Success"));
	 
	 	return execLinkeLinktInviteworkitemreviewResponse;
	}
}