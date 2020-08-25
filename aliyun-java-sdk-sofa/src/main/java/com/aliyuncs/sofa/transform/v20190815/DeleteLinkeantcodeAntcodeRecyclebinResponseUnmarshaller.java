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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeRecyclebinResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeRecyclebinResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeRecyclebinResponse unmarshall(DeleteLinkeantcodeAntcodeRecyclebinResponse deleteLinkeantcodeAntcodeRecyclebinResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeRecyclebinResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeRecyclebinResponse.RequestId"));
		deleteLinkeantcodeAntcodeRecyclebinResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeRecyclebinResponse.ResultCode"));
		deleteLinkeantcodeAntcodeRecyclebinResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeRecyclebinResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeRecyclebinResponse.setData(_ctx.booleanValue("DeleteLinkeantcodeAntcodeRecyclebinResponse.Data"));
		deleteLinkeantcodeAntcodeRecyclebinResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeRecyclebinResponse.Message"));
		deleteLinkeantcodeAntcodeRecyclebinResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeRecyclebinResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeRecyclebinResponse.setStatus(_ctx.booleanValue("DeleteLinkeantcodeAntcodeRecyclebinResponse.Status"));
	 
	 	return deleteLinkeantcodeAntcodeRecyclebinResponse;
	}
}