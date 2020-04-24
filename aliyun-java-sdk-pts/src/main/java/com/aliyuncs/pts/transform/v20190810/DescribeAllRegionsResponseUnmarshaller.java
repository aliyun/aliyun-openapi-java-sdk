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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeAllRegionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllRegionsResponseUnmarshaller {

	public static DescribeAllRegionsResponse unmarshall(DescribeAllRegionsResponse describeAllRegionsResponse, UnmarshallerContext _ctx) {
		
		describeAllRegionsResponse.setRequestId(_ctx.stringValue("DescribeAllRegionsResponse.RequestId"));
		describeAllRegionsResponse.setMessage(_ctx.stringValue("DescribeAllRegionsResponse.Message"));
		describeAllRegionsResponse.setCode(_ctx.stringValue("DescribeAllRegionsResponse.Code"));
		describeAllRegionsResponse.setSuccess(_ctx.booleanValue("DescribeAllRegionsResponse.Success"));
		describeAllRegionsResponse.setHttpStatusCode(_ctx.integerValue("DescribeAllRegionsResponse.HttpStatusCode"));

		List<String> allRegions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllRegionsResponse.AllRegions.Length"); i++) {
			allRegions.add(_ctx.stringValue("DescribeAllRegionsResponse.AllRegions["+ i +"]"));
		}
		describeAllRegionsResponse.setAllRegions(allRegions);
	 
	 	return describeAllRegionsResponse;
	}
}