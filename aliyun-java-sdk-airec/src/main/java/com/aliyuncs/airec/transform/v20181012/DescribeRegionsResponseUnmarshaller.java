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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.DescribeRegionsResponse;
import com.aliyuncs.airec.model.v20181012.DescribeRegionsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setCode(_ctx.stringValue("DescribeRegionsResponse.Code"));
		describeRegionsResponse.setMessage(_ctx.stringValue("DescribeRegionsResponse.Message"));

		List<Item> result = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Result.Length"); i++) {
			Item item = new Item();
			item.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].RegionId"));
			item.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].LocalName"));
			item.setEndpoint(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].Endpoint"));
			item.setStatus(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].Status"));
			item.setConsoleUrl(_ctx.stringValue("DescribeRegionsResponse.Result["+ i +"].ConsoleUrl"));

			result.add(item);
		}
		describeRegionsResponse.setResult(result);
	 
	 	return describeRegionsResponse;
	}
}