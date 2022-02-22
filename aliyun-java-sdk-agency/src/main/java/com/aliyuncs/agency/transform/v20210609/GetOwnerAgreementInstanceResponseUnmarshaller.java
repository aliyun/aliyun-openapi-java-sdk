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

package com.aliyuncs.agency.transform.v20210609;

import com.aliyuncs.agency.model.v20210609.GetOwnerAgreementInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOwnerAgreementInstanceResponseUnmarshaller {

	public static GetOwnerAgreementInstanceResponse unmarshall(GetOwnerAgreementInstanceResponse getOwnerAgreementInstanceResponse, UnmarshallerContext _ctx) {
		
		getOwnerAgreementInstanceResponse.setRequestId(_ctx.stringValue("GetOwnerAgreementInstanceResponse.RequestId"));
		getOwnerAgreementInstanceResponse.setErrMsg(_ctx.stringValue("GetOwnerAgreementInstanceResponse.ErrMsg"));
		getOwnerAgreementInstanceResponse.setData(_ctx.stringValue("GetOwnerAgreementInstanceResponse.Data"));
		getOwnerAgreementInstanceResponse.setSuccess(_ctx.booleanValue("GetOwnerAgreementInstanceResponse.Success"));
		getOwnerAgreementInstanceResponse.setErrCode(_ctx.stringValue("GetOwnerAgreementInstanceResponse.ErrCode"));
	 
	 	return getOwnerAgreementInstanceResponse;
	}
}