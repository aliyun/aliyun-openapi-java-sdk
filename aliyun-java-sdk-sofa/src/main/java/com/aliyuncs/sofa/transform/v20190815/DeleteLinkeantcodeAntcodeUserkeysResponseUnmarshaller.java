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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeUserkeysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeUserkeysResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeUserkeysResponse unmarshall(DeleteLinkeantcodeAntcodeUserkeysResponse deleteLinkeantcodeAntcodeUserkeysResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeUserkeysResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserkeysResponse.RequestId"));
		deleteLinkeantcodeAntcodeUserkeysResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserkeysResponse.ResultCode"));
		deleteLinkeantcodeAntcodeUserkeysResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserkeysResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeUserkeysResponse.setResponseContent(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserkeysResponse.ResponseContent"));
		deleteLinkeantcodeAntcodeUserkeysResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeUserkeysResponse.ResponseStatusCode"));
	 
	 	return deleteLinkeantcodeAntcodeUserkeysResponse;
	}
}