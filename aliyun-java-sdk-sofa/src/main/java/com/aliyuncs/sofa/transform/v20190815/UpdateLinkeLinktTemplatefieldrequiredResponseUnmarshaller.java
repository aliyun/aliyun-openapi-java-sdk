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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTemplatefieldrequiredResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktTemplatefieldrequiredResponseUnmarshaller {

	public static UpdateLinkeLinktTemplatefieldrequiredResponse unmarshall(UpdateLinkeLinktTemplatefieldrequiredResponse updateLinkeLinktTemplatefieldrequiredResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktTemplatefieldrequiredResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktTemplatefieldrequiredResponse.RequestId"));
		updateLinkeLinktTemplatefieldrequiredResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktTemplatefieldrequiredResponse.ResultCode"));
		updateLinkeLinktTemplatefieldrequiredResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktTemplatefieldrequiredResponse.ResultMessage"));
		updateLinkeLinktTemplatefieldrequiredResponse.setData(_ctx.booleanValue("UpdateLinkeLinktTemplatefieldrequiredResponse.Data"));
		updateLinkeLinktTemplatefieldrequiredResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktTemplatefieldrequiredResponse.ErrorCode"));
		updateLinkeLinktTemplatefieldrequiredResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktTemplatefieldrequiredResponse.ErrorMessage"));
		updateLinkeLinktTemplatefieldrequiredResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktTemplatefieldrequiredResponse.Success"));
	 
	 	return updateLinkeLinktTemplatefieldrequiredResponse;
	}
}