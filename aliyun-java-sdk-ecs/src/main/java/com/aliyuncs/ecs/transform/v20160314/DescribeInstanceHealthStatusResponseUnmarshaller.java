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

import com.aliyuncs.ecs.model.v20160314.DescribeInstanceHealthStatusResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeInstanceHealthStatusResponse.HealthStatusModelItem;
import com.aliyuncs.ecs.model.v20160314.DescribeInstanceHealthStatusResponse.HealthStatusModelItem.HealthStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceHealthStatusResponseUnmarshaller {

	public static DescribeInstanceHealthStatusResponse unmarshall(DescribeInstanceHealthStatusResponse describeInstanceHealthStatusResponse, UnmarshallerContext _ctx) {
		
		describeInstanceHealthStatusResponse.setRequestId(_ctx.stringValue("DescribeInstanceHealthStatusResponse.RequestId"));

		List<HealthStatusModelItem> healthStatusModel = new ArrayList<HealthStatusModelItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceHealthStatusResponse.HealthStatusModel.Length"); i++) {
			HealthStatusModelItem healthStatusModelItem = new HealthStatusModelItem();
			healthStatusModelItem.setInstanceId(_ctx.stringValue("DescribeInstanceHealthStatusResponse.HealthStatusModel["+ i +"].InstanceId"));

			HealthStatus healthStatus = new HealthStatus();
			healthStatus.setCode(_ctx.stringValue("DescribeInstanceHealthStatusResponse.HealthStatusModel["+ i +"].HealthStatus.Code"));
			healthStatus.setName(_ctx.stringValue("DescribeInstanceHealthStatusResponse.HealthStatusModel["+ i +"].HealthStatus.Name"));
			healthStatusModelItem.setHealthStatus(healthStatus);

			healthStatusModel.add(healthStatusModelItem);
		}
		describeInstanceHealthStatusResponse.setHealthStatusModel(healthStatusModel);
	 
	 	return describeInstanceHealthStatusResponse;
	}
}