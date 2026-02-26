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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeTagKeysForExpressConnectResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeTagKeysForExpressConnectResponse.TagKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagKeysForExpressConnectResponseUnmarshaller {

	public static DescribeTagKeysForExpressConnectResponse unmarshall(DescribeTagKeysForExpressConnectResponse describeTagKeysForExpressConnectResponse, UnmarshallerContext _ctx) {
		
		describeTagKeysForExpressConnectResponse.setRequestId(_ctx.stringValue("DescribeTagKeysForExpressConnectResponse.RequestId"));
		describeTagKeysForExpressConnectResponse.setNextToken(_ctx.stringValue("DescribeTagKeysForExpressConnectResponse.NextToken"));

		List<TagKey> tagKeys = new ArrayList<TagKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagKeysForExpressConnectResponse.TagKeys.Length"); i++) {
			TagKey tagKey = new TagKey();
			tagKey.setType(_ctx.stringValue("DescribeTagKeysForExpressConnectResponse.TagKeys["+ i +"].Type"));
			tagKey.setTagKey(_ctx.stringValue("DescribeTagKeysForExpressConnectResponse.TagKeys["+ i +"].TagKey"));

			tagKeys.add(tagKey);
		}
		describeTagKeysForExpressConnectResponse.setTagKeys(tagKeys);
	 
	 	return describeTagKeysForExpressConnectResponse;
	}
}