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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeTagKeysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagKeysResponseUnmarshaller {

	public static DescribeTagKeysResponse unmarshall(DescribeTagKeysResponse describeTagKeysResponse, UnmarshallerContext _ctx) {
		
		describeTagKeysResponse.setRequestId(_ctx.stringValue("DescribeTagKeysResponse.RequestId"));
		describeTagKeysResponse.setCategory(_ctx.stringValue("DescribeTagKeysResponse.Category"));
		describeTagKeysResponse.setPageSize(_ctx.integerValue("DescribeTagKeysResponse.PageSize"));
		describeTagKeysResponse.setPageNumber(_ctx.integerValue("DescribeTagKeysResponse.PageNumber"));
		describeTagKeysResponse.setTotalCount(_ctx.integerValue("DescribeTagKeysResponse.TotalCount"));

		List<String> tagKeys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagKeysResponse.TagKeys.Length"); i++) {
			tagKeys.add(_ctx.stringValue("DescribeTagKeysResponse.TagKeys["+ i +"]"));
		}
		describeTagKeysResponse.setTagKeys(tagKeys);
	 
	 	return describeTagKeysResponse;
	}
}