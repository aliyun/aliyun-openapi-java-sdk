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

import com.aliyuncs.nlb.model.v20220430.AssociateAdditionalCertificatesWithListenerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssociateAdditionalCertificatesWithListenerResponseUnmarshaller {

	public static AssociateAdditionalCertificatesWithListenerResponse unmarshall(AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListenerResponse, UnmarshallerContext _ctx) {
		
		associateAdditionalCertificatesWithListenerResponse.setRequestId(_ctx.stringValue("AssociateAdditionalCertificatesWithListenerResponse.RequestId"));
		associateAdditionalCertificatesWithListenerResponse.setSuccess(_ctx.booleanValue("AssociateAdditionalCertificatesWithListenerResponse.Success"));
		associateAdditionalCertificatesWithListenerResponse.setCode(_ctx.stringValue("AssociateAdditionalCertificatesWithListenerResponse.Code"));
		associateAdditionalCertificatesWithListenerResponse.setMessage(_ctx.stringValue("AssociateAdditionalCertificatesWithListenerResponse.Message"));
		associateAdditionalCertificatesWithListenerResponse.setHttpStatusCode(_ctx.integerValue("AssociateAdditionalCertificatesWithListenerResponse.HttpStatusCode"));
		associateAdditionalCertificatesWithListenerResponse.setDynamicCode(_ctx.stringValue("AssociateAdditionalCertificatesWithListenerResponse.DynamicCode"));
		associateAdditionalCertificatesWithListenerResponse.setDynamicMessage(_ctx.stringValue("AssociateAdditionalCertificatesWithListenerResponse.DynamicMessage"));
		associateAdditionalCertificatesWithListenerResponse.setJobId(_ctx.stringValue("AssociateAdditionalCertificatesWithListenerResponse.JobId"));
	 
	 	return associateAdditionalCertificatesWithListenerResponse;
	}
}