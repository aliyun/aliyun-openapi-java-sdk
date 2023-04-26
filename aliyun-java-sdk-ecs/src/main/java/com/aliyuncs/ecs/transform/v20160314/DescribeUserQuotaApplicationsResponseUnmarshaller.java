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

import com.aliyuncs.ecs.model.v20160314.DescribeUserQuotaApplicationsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeUserQuotaApplicationsResponse.UserQuotaApplication;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserQuotaApplicationsResponseUnmarshaller {

	public static DescribeUserQuotaApplicationsResponse unmarshall(DescribeUserQuotaApplicationsResponse describeUserQuotaApplicationsResponse, UnmarshallerContext _ctx) {
		
		describeUserQuotaApplicationsResponse.setRequestId(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.RequestId"));
		describeUserQuotaApplicationsResponse.setNextToken(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.NextToken"));
		describeUserQuotaApplicationsResponse.setPageSize(_ctx.longValue("DescribeUserQuotaApplicationsResponse.PageSize"));
		describeUserQuotaApplicationsResponse.setTotalCount(_ctx.integerValue("DescribeUserQuotaApplicationsResponse.TotalCount"));

		List<UserQuotaApplication> userQuotaApplications = new ArrayList<UserQuotaApplication>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications.Length"); i++) {
			UserQuotaApplication userQuotaApplication = new UserQuotaApplication();
			userQuotaApplication.setStatus(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].Status"));
			userQuotaApplication.setCreationTime(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].CreationTime"));
			userQuotaApplication.setComment(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].Comment"));
			userQuotaApplication.setExpireTime(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].ExpireTime"));
			userQuotaApplication.setChargeType(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].ChargeType"));
			userQuotaApplication.setResultCode(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].ResultCode"));
			userQuotaApplication.setInstanceType(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].InstanceType"));
			userQuotaApplication.setQuotaType(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].QuotaType"));
			userQuotaApplication.setStartTime(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].StartTime"));
			userQuotaApplication.setDescription(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].Description"));
			userQuotaApplication.setQuotaValue(_ctx.longValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].QuotaValue"));
			userQuotaApplication.setZoneId(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].ZoneId"));
			userQuotaApplication.setApplicationId(_ctx.stringValue("DescribeUserQuotaApplicationsResponse.UserQuotaApplications["+ i +"].ApplicationId"));

			userQuotaApplications.add(userQuotaApplication);
		}
		describeUserQuotaApplicationsResponse.setUserQuotaApplications(userQuotaApplications);
	 
	 	return describeUserQuotaApplicationsResponse;
	}
}