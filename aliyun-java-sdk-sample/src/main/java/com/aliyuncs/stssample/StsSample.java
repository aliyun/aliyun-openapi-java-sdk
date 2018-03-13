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
package com.aliyuncs.stssample;

import org.junit.Assert;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.simple.FiledCredentialProvider;
import com.aliyuncs.sts.model.v20150401.GetFederationTokenRequest;
import com.aliyuncs.sts.model.v20150401.GetFederationTokenResponse;

public class StsSample {

	public static void main(String args[]) throws ServerException, ClientException{
		DefaultProfile profile = DefaultProfile.getProfile("cn-beijing",
				FiledCredentialProvider.getICredentialProvider());
		
		DefaultAcsClient client = new DefaultAcsClient(profile);

        final String policy = "{\n" +
                "    \"Version\": \"1\",\n" +
                "    \"Statement\": [\n" +
                "      {\n" +
                "        \"Effect\": \"Allow\",\n" +
                "        \"Action\": \"odps:Create*\",\n" +
                "        \"Resource\": \"acs:odps:hz:*:projects/*\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }";

        final GetFederationTokenRequest request = new GetFederationTokenRequest();
        request.setStsVersion("2015-04-01");
        request.setGrantee("oldratlee");
        request.setPolicy(policy);
        request.setDurationSeconds(24 * 3600L);

        try {
            GetFederationTokenResponse getFederationTokenResponse = client.getAcsResponse(request);
            Assert.assertTrue(true);
		} catch (Exception e) {
			Assert.assertTrue(false);
		}

    

	}
}
