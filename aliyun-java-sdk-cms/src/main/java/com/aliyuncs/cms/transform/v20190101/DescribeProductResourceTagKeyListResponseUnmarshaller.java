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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeProductResourceTagKeyListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductResourceTagKeyListResponseUnmarshaller {

	public static DescribeProductResourceTagKeyListResponse unmarshall(DescribeProductResourceTagKeyListResponse describeProductResourceTagKeyListResponse, UnmarshallerContext _ctx) {
		
		describeProductResourceTagKeyListResponse.setRequestId(_ctx.stringValue("DescribeProductResourceTagKeyListResponse.RequestId"));
		describeProductResourceTagKeyListResponse.setCode(_ctx.stringValue("DescribeProductResourceTagKeyListResponse.Code"));
		describeProductResourceTagKeyListResponse.setMessage(_ctx.stringValue("DescribeProductResourceTagKeyListResponse.Message"));
		describeProductResourceTagKeyListResponse.setSuccess(_ctx.booleanValue("DescribeProductResourceTagKeyListResponse.Success"));
		describeProductResourceTagKeyListResponse.setNextToken(_ctx.stringValue("DescribeProductResourceTagKeyListResponse.NextToken"));

		List<String> tagKeys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductResourceTagKeyListResponse.TagKeys.Length"); i++) {
			tagKeys.add(_ctx.stringValue("DescribeProductResourceTagKeyListResponse.TagKeys["+ i +"]"));
		}
		describeProductResourceTagKeyListResponse.setTagKeys(tagKeys);
	 
	 	return describeProductResourceTagKeyListResponse;
	}
}