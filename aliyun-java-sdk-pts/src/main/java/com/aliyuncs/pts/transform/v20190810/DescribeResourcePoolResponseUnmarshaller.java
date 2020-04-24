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

import com.aliyuncs.pts.model.v20190810.DescribeResourcePoolResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourcePoolResponseUnmarshaller {

	public static DescribeResourcePoolResponse unmarshall(DescribeResourcePoolResponse describeResourcePoolResponse, UnmarshallerContext _ctx) {
		
		describeResourcePoolResponse.setRequestId(_ctx.stringValue("DescribeResourcePoolResponse.RequestId"));
		describeResourcePoolResponse.setCode(_ctx.stringValue("DescribeResourcePoolResponse.Code"));
		describeResourcePoolResponse.setMessage(_ctx.stringValue("DescribeResourcePoolResponse.Message"));
		describeResourcePoolResponse.setHttpStatusCode(_ctx.integerValue("DescribeResourcePoolResponse.HttpStatusCode"));
		describeResourcePoolResponse.setSuccess(_ctx.booleanValue("DescribeResourcePoolResponse.Success"));

		List<String> regions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourcePoolResponse.Regions.Length"); i++) {
			regions.add(_ctx.stringValue("DescribeResourcePoolResponse.Regions["+ i +"]"));
		}
		describeResourcePoolResponse.setRegions(regions);

		List<String> isps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourcePoolResponse.Isps.Length"); i++) {
			isps.add(_ctx.stringValue("DescribeResourcePoolResponse.Isps["+ i +"]"));
		}
		describeResourcePoolResponse.setIsps(isps);
	 
	 	return describeResourcePoolResponse;
	}
}