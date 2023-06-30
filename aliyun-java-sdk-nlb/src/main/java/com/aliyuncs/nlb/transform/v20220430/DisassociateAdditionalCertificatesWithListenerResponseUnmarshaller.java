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

package com.aliyuncs.nlb.transform.v20220430;

import com.aliyuncs.nlb.model.v20220430.DisassociateAdditionalCertificatesWithListenerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisassociateAdditionalCertificatesWithListenerResponseUnmarshaller {

	public static DisassociateAdditionalCertificatesWithListenerResponse unmarshall(DisassociateAdditionalCertificatesWithListenerResponse disassociateAdditionalCertificatesWithListenerResponse, UnmarshallerContext _ctx) {
		
		disassociateAdditionalCertificatesWithListenerResponse.setRequestId(_ctx.stringValue("DisassociateAdditionalCertificatesWithListenerResponse.RequestId"));
		disassociateAdditionalCertificatesWithListenerResponse.setSuccess(_ctx.booleanValue("DisassociateAdditionalCertificatesWithListenerResponse.Success"));
		disassociateAdditionalCertificatesWithListenerResponse.setCode(_ctx.stringValue("DisassociateAdditionalCertificatesWithListenerResponse.Code"));
		disassociateAdditionalCertificatesWithListenerResponse.setMessage(_ctx.stringValue("DisassociateAdditionalCertificatesWithListenerResponse.Message"));
		disassociateAdditionalCertificatesWithListenerResponse.setHttpStatusCode(_ctx.integerValue("DisassociateAdditionalCertificatesWithListenerResponse.HttpStatusCode"));
		disassociateAdditionalCertificatesWithListenerResponse.setDynamicCode(_ctx.stringValue("DisassociateAdditionalCertificatesWithListenerResponse.DynamicCode"));
		disassociateAdditionalCertificatesWithListenerResponse.setDynamicMessage(_ctx.stringValue("DisassociateAdditionalCertificatesWithListenerResponse.DynamicMessage"));
		disassociateAdditionalCertificatesWithListenerResponse.setJobId(_ctx.stringValue("DisassociateAdditionalCertificatesWithListenerResponse.JobId"));
	 
	 	return disassociateAdditionalCertificatesWithListenerResponse;
	}
}