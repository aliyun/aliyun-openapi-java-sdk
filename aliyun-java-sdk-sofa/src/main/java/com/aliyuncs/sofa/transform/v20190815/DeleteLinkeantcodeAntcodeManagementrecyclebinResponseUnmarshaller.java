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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeManagementrecyclebinResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeManagementrecyclebinResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeManagementrecyclebinResponse unmarshall(DeleteLinkeantcodeAntcodeManagementrecyclebinResponse deleteLinkeantcodeAntcodeManagementrecyclebinResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeManagementrecyclebinResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeManagementrecyclebinResponse.RequestId"));
		deleteLinkeantcodeAntcodeManagementrecyclebinResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeManagementrecyclebinResponse.ResultCode"));
		deleteLinkeantcodeAntcodeManagementrecyclebinResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeManagementrecyclebinResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeManagementrecyclebinResponse.setData(_ctx.booleanValue("DeleteLinkeantcodeAntcodeManagementrecyclebinResponse.Data"));
		deleteLinkeantcodeAntcodeManagementrecyclebinResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeManagementrecyclebinResponse.Message"));
		deleteLinkeantcodeAntcodeManagementrecyclebinResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeManagementrecyclebinResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeManagementrecyclebinResponse.setStatus(_ctx.booleanValue("DeleteLinkeantcodeAntcodeManagementrecyclebinResponse.Status"));
	 
	 	return deleteLinkeantcodeAntcodeManagementrecyclebinResponse;
	}
}