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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeHealthCheckListResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeHealthCheckListResponse.HealthCheckItem;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeHealthCheckListResponse.HealthCheckItem.HealthCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHealthCheckListResponseUnmarshaller {

	public static DescribeHealthCheckListResponse unmarshall(DescribeHealthCheckListResponse describeHealthCheckListResponse, UnmarshallerContext _ctx) {
		
		describeHealthCheckListResponse.setRequestId(_ctx.stringValue("DescribeHealthCheckListResponse.RequestId"));

		List<HealthCheckItem> healthCheckList = new ArrayList<HealthCheckItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHealthCheckListResponse.HealthCheckList.Length"); i++) {
			HealthCheckItem healthCheckItem = new HealthCheckItem();
			healthCheckItem.setInstanceId(_ctx.stringValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].InstanceId"));
			healthCheckItem.setBizProtocol(_ctx.stringValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].Protocol"));
			healthCheckItem.setFrontendPort(_ctx.integerValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].FrontendPort"));

			HealthCheck healthCheck = new HealthCheck();
			healthCheck.setType(_ctx.stringValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].HealthCheck.Type"));
			healthCheck.setDomain(_ctx.stringValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].HealthCheck.Domain"));
			healthCheck.setUri(_ctx.stringValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].HealthCheck.Uri"));
			healthCheck.setDown(_ctx.integerValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].HealthCheck.Down"));
			healthCheck.setInterval(_ctx.integerValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].HealthCheck.Interval"));
			healthCheck.setPort(_ctx.integerValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].HealthCheck.Port"));
			healthCheck.setTimeout(_ctx.integerValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].HealthCheck.Timeout"));
			healthCheck.setUp(_ctx.integerValue("DescribeHealthCheckListResponse.HealthCheckList["+ i +"].HealthCheck.Up"));
			healthCheckItem.setHealthCheck(healthCheck);

			healthCheckList.add(healthCheckItem);
		}
		describeHealthCheckListResponse.setHealthCheckList(healthCheckList);
	 
	 	return describeHealthCheckListResponse;
	}
}