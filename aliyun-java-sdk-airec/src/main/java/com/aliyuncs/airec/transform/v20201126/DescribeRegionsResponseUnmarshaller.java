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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.DescribeRegionsResponse;
import com.aliyuncs.airec.model.v20201126.DescribeRegionsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setCode(_ctx.stringValue("DescribeRegionsResponse.code"));
		describeRegionsResponse.setMessage(_ctx.stringValue("DescribeRegionsResponse.message"));
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setConsoleUrl(_ctx.stringValue("DescribeRegionsResponse.result["+ i +"].consoleUrl"));
			resultItem.setEndpoint(_ctx.stringValue("DescribeRegionsResponse.result["+ i +"].endpoint"));
			resultItem.setLocalName(_ctx.stringValue("DescribeRegionsResponse.result["+ i +"].localName"));
			resultItem.setRegionId(_ctx.stringValue("DescribeRegionsResponse.result["+ i +"].regionId"));
			resultItem.setStatus(_ctx.stringValue("DescribeRegionsResponse.result["+ i +"].status"));

			result.add(resultItem);
		}
		describeRegionsResponse.setResult(result);
	 
	 	return describeRegionsResponse;
	}
}