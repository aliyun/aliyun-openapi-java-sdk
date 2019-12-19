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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsResponse.KeyPair;
import com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsResponse.KeyPair.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKeyPairsResponseUnmarshaller {

	public static DescribeKeyPairsResponse unmarshall(DescribeKeyPairsResponse describeKeyPairsResponse, UnmarshallerContext _ctx) {
		
		describeKeyPairsResponse.setRequestId(_ctx.stringValue("DescribeKeyPairsResponse.RequestId"));
		describeKeyPairsResponse.setTotalCount(_ctx.integerValue("DescribeKeyPairsResponse.TotalCount"));
		describeKeyPairsResponse.setPageNumber(_ctx.integerValue("DescribeKeyPairsResponse.PageNumber"));
		describeKeyPairsResponse.setPageSize(_ctx.integerValue("DescribeKeyPairsResponse.PageSize"));

		List<KeyPair> keyPairs = new ArrayList<KeyPair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKeyPairsResponse.KeyPairs.Length"); i++) {
			KeyPair keyPair = new KeyPair();
			keyPair.setKeyPairName(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].KeyPairName"));
			keyPair.setKeyPairFingerPrint(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].KeyPairFingerPrint"));
			keyPair.setCreationTime(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].CreationTime"));
			keyPair.setResourceGroupId(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			keyPair.setTags(tags);

			keyPairs.add(keyPair);
		}
		describeKeyPairsResponse.setKeyPairs(keyPairs);
	 
	 	return describeKeyPairsResponse;
	}
}