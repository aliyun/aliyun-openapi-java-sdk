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

package com.aliyuncs.cas.transform.v20200407;

import com.aliyuncs.cas.model.v20200407.DescribeCertificateStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateStateResponseUnmarshaller {

	public static DescribeCertificateStateResponse unmarshall(DescribeCertificateStateResponse describeCertificateStateResponse, UnmarshallerContext _ctx) {
		
		describeCertificateStateResponse.setRequestId(_ctx.stringValue("DescribeCertificateStateResponse.RequestId"));
		describeCertificateStateResponse.setType(_ctx.stringValue("DescribeCertificateStateResponse.Type"));
		describeCertificateStateResponse.setCertificate(_ctx.stringValue("DescribeCertificateStateResponse.Certificate"));
		describeCertificateStateResponse.setPrivateKey(_ctx.stringValue("DescribeCertificateStateResponse.PrivateKey"));
		describeCertificateStateResponse.setValidateType(_ctx.stringValue("DescribeCertificateStateResponse.ValidateType"));
		describeCertificateStateResponse.setDomain(_ctx.stringValue("DescribeCertificateStateResponse.Domain"));
		describeCertificateStateResponse.setUri(_ctx.stringValue("DescribeCertificateStateResponse.Uri"));
		describeCertificateStateResponse.setContent(_ctx.stringValue("DescribeCertificateStateResponse.Content"));
		describeCertificateStateResponse.setRecordValue(_ctx.stringValue("DescribeCertificateStateResponse.RecordValue"));
		describeCertificateStateResponse.setRecordType(_ctx.stringValue("DescribeCertificateStateResponse.RecordType"));
		describeCertificateStateResponse.setRecordDomain(_ctx.stringValue("DescribeCertificateStateResponse.RecordDomain"));
	 
	 	return describeCertificateStateResponse;
	}
}