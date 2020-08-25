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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse unmarshall(DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.RequestId"));
		deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.ResultCode"));
		deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.setData(_ctx.booleanValue("DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.Data"));
		deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.Message"));
		deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.setStatus(_ctx.booleanValue("DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse.Status"));
	 
	 	return deleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse;
	}
}