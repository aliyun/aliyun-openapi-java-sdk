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

import com.aliyuncs.sofa.model.v20190815.CancelLinkeantcodeAntcodeCancelpipelineexecResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelLinkeantcodeAntcodeCancelpipelineexecResponseUnmarshaller {

	public static CancelLinkeantcodeAntcodeCancelpipelineexecResponse unmarshall(CancelLinkeantcodeAntcodeCancelpipelineexecResponse cancelLinkeantcodeAntcodeCancelpipelineexecResponse, UnmarshallerContext _ctx) {
		
		cancelLinkeantcodeAntcodeCancelpipelineexecResponse.setRequestId(_ctx.stringValue("CancelLinkeantcodeAntcodeCancelpipelineexecResponse.RequestId"));
		cancelLinkeantcodeAntcodeCancelpipelineexecResponse.setResultCode(_ctx.stringValue("CancelLinkeantcodeAntcodeCancelpipelineexecResponse.ResultCode"));
		cancelLinkeantcodeAntcodeCancelpipelineexecResponse.setResultMessage(_ctx.stringValue("CancelLinkeantcodeAntcodeCancelpipelineexecResponse.ResultMessage"));
		cancelLinkeantcodeAntcodeCancelpipelineexecResponse.setData(_ctx.booleanValue("CancelLinkeantcodeAntcodeCancelpipelineexecResponse.Data"));
		cancelLinkeantcodeAntcodeCancelpipelineexecResponse.setMessage(_ctx.stringValue("CancelLinkeantcodeAntcodeCancelpipelineexecResponse.Message"));
		cancelLinkeantcodeAntcodeCancelpipelineexecResponse.setResponseStatusCode(_ctx.longValue("CancelLinkeantcodeAntcodeCancelpipelineexecResponse.ResponseStatusCode"));
		cancelLinkeantcodeAntcodeCancelpipelineexecResponse.setStatus(_ctx.booleanValue("CancelLinkeantcodeAntcodeCancelpipelineexecResponse.Status"));
	 
	 	return cancelLinkeantcodeAntcodeCancelpipelineexecResponse;
	}
}