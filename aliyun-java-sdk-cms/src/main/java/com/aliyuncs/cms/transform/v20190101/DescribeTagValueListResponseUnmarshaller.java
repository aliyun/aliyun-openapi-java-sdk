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

import com.aliyuncs.cms.model.v20190101.DescribeTagValueListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagValueListResponseUnmarshaller {

	public static DescribeTagValueListResponse unmarshall(DescribeTagValueListResponse describeTagValueListResponse, UnmarshallerContext _ctx) {
		
		describeTagValueListResponse.setRequestId(_ctx.stringValue("DescribeTagValueListResponse.RequestId"));
		describeTagValueListResponse.setCode(_ctx.stringValue("DescribeTagValueListResponse.Code"));
		describeTagValueListResponse.setMessage(_ctx.stringValue("DescribeTagValueListResponse.Message"));
		describeTagValueListResponse.setSuccess(_ctx.booleanValue("DescribeTagValueListResponse.Success"));

		List<String> tagValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagValueListResponse.TagValues.Length"); i++) {
			tagValues.add(_ctx.stringValue("DescribeTagValueListResponse.TagValues["+ i +"]"));
		}
		describeTagValueListResponse.setTagValues(tagValues);
	 
	 	return describeTagValueListResponse;
	}
}