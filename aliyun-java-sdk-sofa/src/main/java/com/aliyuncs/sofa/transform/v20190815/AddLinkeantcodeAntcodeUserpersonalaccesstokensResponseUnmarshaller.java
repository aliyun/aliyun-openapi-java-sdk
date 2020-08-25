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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeUserpersonalaccesstokensResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse unmarshall(AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse addLinkeantcodeAntcodeUserpersonalaccesstokensResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeUserpersonalaccesstokensResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse.RequestId"));
		addLinkeantcodeAntcodeUserpersonalaccesstokensResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse.ResultCode"));
		addLinkeantcodeAntcodeUserpersonalaccesstokensResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse.ResultMessage"));
		addLinkeantcodeAntcodeUserpersonalaccesstokensResponse.setData(_ctx.stringValue("AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse.Data"));
		addLinkeantcodeAntcodeUserpersonalaccesstokensResponse.setMessage(_ctx.stringValue("AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse.Message"));
		addLinkeantcodeAntcodeUserpersonalaccesstokensResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeUserpersonalaccesstokensResponse.setStatus(_ctx.booleanValue("AddLinkeantcodeAntcodeUserpersonalaccesstokensResponse.Status"));
	 
	 	return addLinkeantcodeAntcodeUserpersonalaccesstokensResponse;
	}
}