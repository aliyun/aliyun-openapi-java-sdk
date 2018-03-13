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
package com.aliyuncs.rdsdescribe;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeRequest;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.X509TrustAll;
import com.aliyuncs.profile.DefaultProfile;

public class DescribeDBInstancesSample {
	
	public static void main(String args[]) {
		DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",
				FiledCredentialProvider.getICredentialProvider());
		DescribeDBInstanceAttributeRequest request = new DescribeDBInstanceAttributeRequest();
		
		DefaultAcsClient client = new DefaultAcsClient(profile);
		
		try {
			request.setProtocol(ProtocolType.HTTPS);
			X509TrustAll.ignoreSSLCertificate();
			DescribeDBInstanceAttributeResponse response = client.getAcsResponse(request);
			System.out.print(response.getRequestId());
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (ClientException e) {
			e.printStackTrace();
		} finally {
			X509TrustAll.restoreSSLCertificate();
		}
	}
}
