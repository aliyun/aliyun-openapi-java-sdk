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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeBlobssearchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeBlobssearchResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeBlobssearchResponse unmarshall(ExecLinkeantcodeAntcodeBlobssearchResponse execLinkeantcodeAntcodeBlobssearchResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeBlobssearchResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeBlobssearchResponse.RequestId"));
		execLinkeantcodeAntcodeBlobssearchResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeBlobssearchResponse.ResultCode"));
		execLinkeantcodeAntcodeBlobssearchResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeBlobssearchResponse.ResultMessage"));
		execLinkeantcodeAntcodeBlobssearchResponse.setResponseContent(_ctx.stringValue("ExecLinkeantcodeAntcodeBlobssearchResponse.ResponseContent"));
		execLinkeantcodeAntcodeBlobssearchResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeBlobssearchResponse.ResponseStatusCode"));
	 
	 	return execLinkeantcodeAntcodeBlobssearchResponse;
	}
}