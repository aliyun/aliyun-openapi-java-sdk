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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeCommonTargetResultListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCommonTargetResultListResponse.TargetConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommonTargetResultListResponseUnmarshaller {

	public static DescribeCommonTargetResultListResponse unmarshall(DescribeCommonTargetResultListResponse describeCommonTargetResultListResponse, UnmarshallerContext _ctx) {
		
		describeCommonTargetResultListResponse.setRequestId(_ctx.stringValue("DescribeCommonTargetResultListResponse.RequestId"));

		TargetConfig targetConfig = new TargetConfig();
		targetConfig.setType(_ctx.stringValue("DescribeCommonTargetResultListResponse.TargetConfig.Type"));
		targetConfig.setFlag(_ctx.stringValue("DescribeCommonTargetResultListResponse.TargetConfig.Flag"));
		targetConfig.setTotalCount(_ctx.stringValue("DescribeCommonTargetResultListResponse.TargetConfig.TotalCount"));
		targetConfig.setTargetDefault(_ctx.stringValue("DescribeCommonTargetResultListResponse.TargetConfig.TargetDefault"));
		targetConfig.setTargetType(_ctx.stringValue("DescribeCommonTargetResultListResponse.TargetConfig.TargetType"));

		List<String> targetList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommonTargetResultListResponse.TargetConfig.TargetList.Length"); i++) {
			targetList.add(_ctx.stringValue("DescribeCommonTargetResultListResponse.TargetConfig.TargetList["+ i +"]"));
		}
		targetConfig.setTargetList(targetList);
		describeCommonTargetResultListResponse.setTargetConfig(targetConfig);
	 
	 	return describeCommonTargetResultListResponse;
	}
}