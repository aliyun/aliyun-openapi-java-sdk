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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse unmarshall(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.setData(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.Data"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.setMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.Message"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.setStatus(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse.Status"));
	 
	 	return updateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse;
	}
}