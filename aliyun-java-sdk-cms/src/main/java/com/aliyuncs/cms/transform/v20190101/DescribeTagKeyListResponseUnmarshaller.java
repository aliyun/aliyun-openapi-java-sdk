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

import com.aliyuncs.cms.model.v20190101.DescribeTagKeyListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagKeyListResponseUnmarshaller {

	public static DescribeTagKeyListResponse unmarshall(DescribeTagKeyListResponse describeTagKeyListResponse, UnmarshallerContext _ctx) {
		
		describeTagKeyListResponse.setRequestId(_ctx.stringValue("DescribeTagKeyListResponse.RequestId"));
		describeTagKeyListResponse.setCode(_ctx.stringValue("DescribeTagKeyListResponse.Code"));
		describeTagKeyListResponse.setMessage(_ctx.stringValue("DescribeTagKeyListResponse.Message"));
		describeTagKeyListResponse.setSuccess(_ctx.booleanValue("DescribeTagKeyListResponse.Success"));

		List<String> tagKeys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagKeyListResponse.TagKeys.Length"); i++) {
			tagKeys.add(_ctx.stringValue("DescribeTagKeyListResponse.TagKeys["+ i +"]"));
		}
		describeTagKeyListResponse.setTagKeys(tagKeys);
	 
	 	return describeTagKeyListResponse;
	}
}