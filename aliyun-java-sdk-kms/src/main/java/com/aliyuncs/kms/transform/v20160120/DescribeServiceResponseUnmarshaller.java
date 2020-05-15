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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.DescribeServiceResponse;
import com.aliyuncs.kms.model.v20160120.DescribeServiceResponse.KeySpec;
import com.aliyuncs.kms.model.v20160120.DescribeServiceResponse.ProtectionLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceResponseUnmarshaller {

	public static DescribeServiceResponse unmarshall(DescribeServiceResponse describeServiceResponse, UnmarshallerContext _ctx) {
		
		describeServiceResponse.setRequestId(_ctx.stringValue("DescribeServiceResponse.RequestId"));

		List<ProtectionLevel> protectionLevels = new ArrayList<ProtectionLevel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceResponse.ProtectionLevels.Length"); i++) {
			ProtectionLevel protectionLevel = new ProtectionLevel();
			protectionLevel.setType(_ctx.stringValue("DescribeServiceResponse.ProtectionLevels["+ i +"].Type"));

			protectionLevels.add(protectionLevel);
		}
		describeServiceResponse.setProtectionLevels(protectionLevels);

		List<KeySpec> keySpecs = new ArrayList<KeySpec>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceResponse.KeySpecs.Length"); i++) {
			KeySpec keySpec = new KeySpec();
			keySpec.setName(_ctx.stringValue("DescribeServiceResponse.KeySpecs["+ i +"].Name"));

			List<String> supportedProtectionLevels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServiceResponse.KeySpecs["+ i +"].SupportedProtectionLevels.Length"); j++) {
				supportedProtectionLevels.add(_ctx.stringValue("DescribeServiceResponse.KeySpecs["+ i +"].SupportedProtectionLevels["+ j +"]"));
			}
			keySpec.setSupportedProtectionLevels(supportedProtectionLevels);

			List<String> usages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServiceResponse.KeySpecs["+ i +"].Usages.Length"); j++) {
				usages.add(_ctx.stringValue("DescribeServiceResponse.KeySpecs["+ i +"].Usages["+ j +"]"));
			}
			keySpec.setUsages(usages);

			keySpecs.add(keySpec);
		}
		describeServiceResponse.setKeySpecs(keySpecs);
	 
	 	return describeServiceResponse;
	}
}