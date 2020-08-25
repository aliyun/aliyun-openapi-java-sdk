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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUserpasswordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUserpasswordResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUserpasswordResponse unmarshall(UpdateLinkeantcodeAntcodeUserpasswordResponse updateLinkeantcodeAntcodeUserpasswordResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUserpasswordResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUserpasswordResponse.RequestId"));
		updateLinkeantcodeAntcodeUserpasswordResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUserpasswordResponse.ResultCode"));
		updateLinkeantcodeAntcodeUserpasswordResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUserpasswordResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUserpasswordResponse.setData(_ctx.stringValue("UpdateLinkeantcodeAntcodeUserpasswordResponse.Data"));
		updateLinkeantcodeAntcodeUserpasswordResponse.setMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUserpasswordResponse.Message"));
		updateLinkeantcodeAntcodeUserpasswordResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUserpasswordResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUserpasswordResponse.setStatus(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUserpasswordResponse.Status"));
	 
	 	return updateLinkeantcodeAntcodeUserpasswordResponse;
	}
}