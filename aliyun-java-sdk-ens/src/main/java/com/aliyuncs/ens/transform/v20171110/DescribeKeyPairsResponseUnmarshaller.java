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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeKeyPairsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeKeyPairsResponse.KeyPair;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKeyPairsResponseUnmarshaller {

	public static DescribeKeyPairsResponse unmarshall(DescribeKeyPairsResponse describeKeyPairsResponse, UnmarshallerContext _ctx) {
		
		describeKeyPairsResponse.setRequestId(_ctx.stringValue("DescribeKeyPairsResponse.RequestId"));
		describeKeyPairsResponse.setPageNumber(_ctx.integerValue("DescribeKeyPairsResponse.PageNumber"));
		describeKeyPairsResponse.setPageSize(_ctx.integerValue("DescribeKeyPairsResponse.PageSize"));
		describeKeyPairsResponse.setTotalCount(_ctx.integerValue("DescribeKeyPairsResponse.TotalCount"));

		List<KeyPair> keyPairs = new ArrayList<KeyPair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKeyPairsResponse.KeyPairs.Length"); i++) {
			KeyPair keyPair = new KeyPair();
			keyPair.setCreationTime(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].CreationTime"));
			keyPair.setKeyPairFingerPrint(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].KeyPairFingerPrint"));
			keyPair.setKeyPairName(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].KeyPairName"));

			keyPairs.add(keyPair);
		}
		describeKeyPairsResponse.setKeyPairs(keyPairs);
	 
	 	return describeKeyPairsResponse;
	}
}