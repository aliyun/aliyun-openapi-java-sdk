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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeGpgkeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeGpgkeyResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeGpgkeyResponse unmarshall(DeleteLinkeantcodeAntcodeGpgkeyResponse deleteLinkeantcodeAntcodeGpgkeyResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeGpgkeyResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeGpgkeyResponse.RequestId"));
		deleteLinkeantcodeAntcodeGpgkeyResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeGpgkeyResponse.ResultCode"));
		deleteLinkeantcodeAntcodeGpgkeyResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeGpgkeyResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeGpgkeyResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeGpgkeyResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeGpgkeyResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeGpgkeyResponse.Id"));
		deleteLinkeantcodeAntcodeGpgkeyResponse.setKey(_ctx.stringValue("DeleteLinkeantcodeAntcodeGpgkeyResponse.Key"));
		deleteLinkeantcodeAntcodeGpgkeyResponse.setPrimaryKeyid(_ctx.stringValue("DeleteLinkeantcodeAntcodeGpgkeyResponse.PrimaryKeyid"));
		deleteLinkeantcodeAntcodeGpgkeyResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeGpgkeyResponse.ResponseStatusCode"));
	 
	 	return deleteLinkeantcodeAntcodeGpgkeyResponse;
	}
}