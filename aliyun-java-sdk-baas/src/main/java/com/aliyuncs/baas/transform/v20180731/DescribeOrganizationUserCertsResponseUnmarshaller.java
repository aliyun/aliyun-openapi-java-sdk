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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationUserCertsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationUserCertsResponse.Result;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationUserCertsResponse.Result.Certificate;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationUserCertsResponse.Result.KeyPair;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationUserCertsResponseUnmarshaller {

	public static DescribeOrganizationUserCertsResponse unmarshall(DescribeOrganizationUserCertsResponse describeOrganizationUserCertsResponse, UnmarshallerContext context) {
		
		describeOrganizationUserCertsResponse.setRequestId(context.stringValue("DescribeOrganizationUserCertsResponse.RequestId"));
		describeOrganizationUserCertsResponse.setSuccess(context.booleanValue("DescribeOrganizationUserCertsResponse.Success"));
		describeOrganizationUserCertsResponse.setErrorCode(context.integerValue("DescribeOrganizationUserCertsResponse.ErrorCode"));
		describeOrganizationUserCertsResponse.setDynamicCode(context.stringValue("DescribeOrganizationUserCertsResponse.DynamicCode"));
		describeOrganizationUserCertsResponse.setDynamicMessage(context.stringValue("DescribeOrganizationUserCertsResponse.DynamicMessage"));

		Result result = new Result();

		KeyPair keyPair = new KeyPair();
		keyPair.setPrivateKey(context.stringValue("DescribeOrganizationUserCertsResponse.Result.KeyPair.PrivateKey"));
		keyPair.setPublicKey(context.stringValue("DescribeOrganizationUserCertsResponse.Result.KeyPair.PublicKey"));
		result.setKeyPair(keyPair);

		List<Certificate> certificates = new ArrayList<Certificate>();
		for (int i = 0; i < context.lengthValue("DescribeOrganizationUserCertsResponse.Result.Certificates.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setScope(context.stringValue("DescribeOrganizationUserCertsResponse.Result.Certificates["+ i +"].Scope"));
			certificate.setName(context.stringValue("DescribeOrganizationUserCertsResponse.Result.Certificates["+ i +"].Name"));
			certificate.setSubject(context.stringValue("DescribeOrganizationUserCertsResponse.Result.Certificates["+ i +"].Subject"));
			certificate.setIssuer(context.stringValue("DescribeOrganizationUserCertsResponse.Result.Certificates["+ i +"].Issuer"));
			certificate.setValidFrom(context.stringValue("DescribeOrganizationUserCertsResponse.Result.Certificates["+ i +"].ValidFrom"));
			certificate.setValidTo(context.stringValue("DescribeOrganizationUserCertsResponse.Result.Certificates["+ i +"].ValidTo"));
			certificate.setCertData(context.stringValue("DescribeOrganizationUserCertsResponse.Result.Certificates["+ i +"].CertData"));

			certificates.add(certificate);
		}
		result.setCertificates(certificates);
		describeOrganizationUserCertsResponse.setResult(result);
	 
	 	return describeOrganizationUserCertsResponse;
	}
}