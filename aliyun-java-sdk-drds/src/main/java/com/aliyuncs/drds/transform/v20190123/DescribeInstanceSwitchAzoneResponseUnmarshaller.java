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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeInstanceSwitchAzoneResponse;
import com.aliyuncs.drds.model.v20190123.DescribeInstanceSwitchAzoneResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSwitchAzoneResponseUnmarshaller {

	public static DescribeInstanceSwitchAzoneResponse unmarshall(DescribeInstanceSwitchAzoneResponse describeInstanceSwitchAzoneResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSwitchAzoneResponse.setRequestId(_ctx.stringValue("DescribeInstanceSwitchAzoneResponse.RequestId"));
		describeInstanceSwitchAzoneResponse.setSuccess(_ctx.booleanValue("DescribeInstanceSwitchAzoneResponse.Success"));

		Result result = new Result();
		result.setOriginAzoneId(_ctx.stringValue("DescribeInstanceSwitchAzoneResponse.Result.OriginAzoneId"));
		result.setRegionId(_ctx.stringValue("DescribeInstanceSwitchAzoneResponse.Result.RegionId"));
		result.setSwitchAble(_ctx.booleanValue("DescribeInstanceSwitchAzoneResponse.Result.SwitchAble"));

		List<String> targetAzones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSwitchAzoneResponse.Result.TargetAzones.Length"); i++) {
			targetAzones.add(_ctx.stringValue("DescribeInstanceSwitchAzoneResponse.Result.TargetAzones["+ i +"]"));
		}
		result.setTargetAzones(targetAzones);
		describeInstanceSwitchAzoneResponse.setResult(result);
	 
	 	return describeInstanceSwitchAzoneResponse;
	}
}