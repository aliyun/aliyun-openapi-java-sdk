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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeDeletecommitnoteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeDeletecommitnoteResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeDeletecommitnoteResponse unmarshall(DeleteLinkeantcodeAntcodeDeletecommitnoteResponse deleteLinkeantcodeAntcodeDeletecommitnoteResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeDeletecommitnoteResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletecommitnoteResponse.RequestId"));
		deleteLinkeantcodeAntcodeDeletecommitnoteResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletecommitnoteResponse.ResultCode"));
		deleteLinkeantcodeAntcodeDeletecommitnoteResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletecommitnoteResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeDeletecommitnoteResponse.setData(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletecommitnoteResponse.Data"));
		deleteLinkeantcodeAntcodeDeletecommitnoteResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletecommitnoteResponse.Message"));
		deleteLinkeantcodeAntcodeDeletecommitnoteResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeDeletecommitnoteResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeDeletecommitnoteResponse.setStatus(_ctx.booleanValue("DeleteLinkeantcodeAntcodeDeletecommitnoteResponse.Status"));
	 
	 	return deleteLinkeantcodeAntcodeDeletecommitnoteResponse;
	}
}