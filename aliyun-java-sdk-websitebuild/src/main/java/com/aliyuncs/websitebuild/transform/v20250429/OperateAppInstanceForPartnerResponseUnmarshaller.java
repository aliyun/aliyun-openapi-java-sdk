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

package com.aliyuncs.websitebuild.transform.v20250429;

import com.aliyuncs.websitebuild.model.v20250429.OperateAppInstanceForPartnerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateAppInstanceForPartnerResponseUnmarshaller {

	public static OperateAppInstanceForPartnerResponse unmarshall(OperateAppInstanceForPartnerResponse operateAppInstanceForPartnerResponse, UnmarshallerContext _ctx) {
		
		operateAppInstanceForPartnerResponse.setRequestId(_ctx.stringValue("OperateAppInstanceForPartnerResponse.RequestId"));
		operateAppInstanceForPartnerResponse.setErrorMsg(_ctx.stringValue("OperateAppInstanceForPartnerResponse.ErrorMsg"));
		operateAppInstanceForPartnerResponse.setSuccess(_ctx.stringValue("OperateAppInstanceForPartnerResponse.Success"));
		operateAppInstanceForPartnerResponse.setErrorCode(_ctx.stringValue("OperateAppInstanceForPartnerResponse.ErrorCode"));
	 
	 	return operateAppInstanceForPartnerResponse;
	}
}