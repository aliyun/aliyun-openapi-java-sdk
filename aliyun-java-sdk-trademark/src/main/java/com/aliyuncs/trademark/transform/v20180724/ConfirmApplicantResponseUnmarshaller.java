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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.ConfirmApplicantResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmApplicantResponseUnmarshaller {

	public static ConfirmApplicantResponse unmarshall(ConfirmApplicantResponse confirmApplicantResponse, UnmarshallerContext _ctx) {
		
		confirmApplicantResponse.setRequestId(_ctx.stringValue("ConfirmApplicantResponse.RequestId"));
		confirmApplicantResponse.setSuccess(_ctx.booleanValue("ConfirmApplicantResponse.Success"));
		confirmApplicantResponse.setErrorMsg(_ctx.stringValue("ConfirmApplicantResponse.ErrorMsg"));
		confirmApplicantResponse.setErrorCode(_ctx.stringValue("ConfirmApplicantResponse.ErrorCode"));
	 
	 	return confirmApplicantResponse;
	}
}