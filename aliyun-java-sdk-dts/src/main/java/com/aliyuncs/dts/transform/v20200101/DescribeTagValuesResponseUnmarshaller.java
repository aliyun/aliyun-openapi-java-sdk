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

import com.aliyuncs.dts.model.v20200101.DescribeTagValuesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagValuesResponseUnmarshaller {

	public static DescribeTagValuesResponse unmarshall(DescribeTagValuesResponse describeTagValuesResponse, UnmarshallerContext _ctx) {
		
		describeTagValuesResponse.setRequestId(_ctx.stringValue("DescribeTagValuesResponse.RequestId"));
		describeTagValuesResponse.setCategory(_ctx.stringValue("DescribeTagValuesResponse.Category"));
		describeTagValuesResponse.setPageSize(_ctx.integerValue("DescribeTagValuesResponse.PageSize"));
		describeTagValuesResponse.setPageNumber(_ctx.integerValue("DescribeTagValuesResponse.PageNumber"));
		describeTagValuesResponse.setTotalCount(_ctx.integerValue("DescribeTagValuesResponse.TotalCount"));

		List<String> tagValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagValuesResponse.TagValues.Length"); i++) {
			tagValues.add(_ctx.stringValue("DescribeTagValuesResponse.TagValues["+ i +"]"));
		}
		describeTagValuesResponse.setTagValues(tagValues);
	 
	 	return describeTagValuesResponse;
	}
}