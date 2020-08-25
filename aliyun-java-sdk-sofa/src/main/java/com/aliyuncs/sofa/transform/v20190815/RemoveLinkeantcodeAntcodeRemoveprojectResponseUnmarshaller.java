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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeantcodeAntcodeRemoveprojectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeantcodeAntcodeRemoveprojectResponseUnmarshaller {

	public static RemoveLinkeantcodeAntcodeRemoveprojectResponse unmarshall(RemoveLinkeantcodeAntcodeRemoveprojectResponse removeLinkeantcodeAntcodeRemoveprojectResponse, UnmarshallerContext _ctx) {
		
		removeLinkeantcodeAntcodeRemoveprojectResponse.setRequestId(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemoveprojectResponse.RequestId"));
		removeLinkeantcodeAntcodeRemoveprojectResponse.setResultCode(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemoveprojectResponse.ResultCode"));
		removeLinkeantcodeAntcodeRemoveprojectResponse.setResultMessage(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemoveprojectResponse.ResultMessage"));
		removeLinkeantcodeAntcodeRemoveprojectResponse.setData(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemoveprojectResponse.Data"));
		removeLinkeantcodeAntcodeRemoveprojectResponse.setMessage(_ctx.stringValue("RemoveLinkeantcodeAntcodeRemoveprojectResponse.Message"));
		removeLinkeantcodeAntcodeRemoveprojectResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeantcodeAntcodeRemoveprojectResponse.ResponseStatusCode"));
		removeLinkeantcodeAntcodeRemoveprojectResponse.setStatus(_ctx.booleanValue("RemoveLinkeantcodeAntcodeRemoveprojectResponse.Status"));
	 
	 	return removeLinkeantcodeAntcodeRemoveprojectResponse;
	}
}