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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeInstanceAutoRebootTimeResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeInstanceAutoRebootTimeResponse.AutoRebootInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAutoRebootTimeResponseUnmarshaller {

	public static DescribeInstanceAutoRebootTimeResponse unmarshall(DescribeInstanceAutoRebootTimeResponse describeInstanceAutoRebootTimeResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAutoRebootTimeResponse.setRequestId(_ctx.stringValue("DescribeInstanceAutoRebootTimeResponse.RequestId"));

		List<AutoRebootInfo> autoRebootInfos = new ArrayList<AutoRebootInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAutoRebootTimeResponse.AutoRebootInfos.Length"); i++) {
			AutoRebootInfo autoRebootInfo = new AutoRebootInfo();
			autoRebootInfo.setLimitRebootTime(_ctx.stringValue("DescribeInstanceAutoRebootTimeResponse.AutoRebootInfos["+ i +"].LimitRebootTime"));
			autoRebootInfo.setInstanceId(_ctx.stringValue("DescribeInstanceAutoRebootTimeResponse.AutoRebootInfos["+ i +"].InstanceId"));
			autoRebootInfo.setOrderType(_ctx.stringValue("DescribeInstanceAutoRebootTimeResponse.AutoRebootInfos["+ i +"].OrderType"));
			autoRebootInfo.setRebootTime(_ctx.stringValue("DescribeInstanceAutoRebootTimeResponse.AutoRebootInfos["+ i +"].RebootTime"));

			autoRebootInfos.add(autoRebootInfo);
		}
		describeInstanceAutoRebootTimeResponse.setAutoRebootInfos(autoRebootInfos);
	 
	 	return describeInstanceAutoRebootTimeResponse;
	}
}