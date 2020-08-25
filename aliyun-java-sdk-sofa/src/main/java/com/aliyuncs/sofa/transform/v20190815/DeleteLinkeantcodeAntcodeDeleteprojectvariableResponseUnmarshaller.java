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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeDeleteprojectvariableResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse unmarshall(DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse deleteLinkeantcodeAntcodeDeleteprojectvariableResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeDeleteprojectvariableResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse.RequestId"));
		deleteLinkeantcodeAntcodeDeleteprojectvariableResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse.ResultCode"));
		deleteLinkeantcodeAntcodeDeleteprojectvariableResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeDeleteprojectvariableResponse.setData(_ctx.booleanValue("DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse.Data"));
		deleteLinkeantcodeAntcodeDeleteprojectvariableResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse.Message"));
		deleteLinkeantcodeAntcodeDeleteprojectvariableResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeDeleteprojectvariableResponse.setStatus(_ctx.booleanValue("DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse.Status"));
	 
	 	return deleteLinkeantcodeAntcodeDeleteprojectvariableResponse;
	}
}