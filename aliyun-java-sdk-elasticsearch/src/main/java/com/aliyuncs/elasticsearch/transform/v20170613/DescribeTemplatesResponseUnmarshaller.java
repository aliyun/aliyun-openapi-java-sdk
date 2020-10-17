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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeTemplatesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeTemplatesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplatesResponseUnmarshaller {

	public static DescribeTemplatesResponse unmarshall(DescribeTemplatesResponse describeTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeTemplatesResponse.setRequestId(_ctx.stringValue("DescribeTemplatesResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTemplatesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setContent(_ctx.stringValue("DescribeTemplatesResponse.Result["+ i +"].content"));
			resultItem.setTemplateName(_ctx.stringValue("DescribeTemplatesResponse.Result["+ i +"].templateName"));

			result.add(resultItem);
		}
		describeTemplatesResponse.setResult(result);
	 
	 	return describeTemplatesResponse;
	}
}