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

package com.aliyuncs.ubsms.transform.v20150623;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ubsms.model.v20150623.DescribeBusinessStatusResponse;
import com.aliyuncs.ubsms.model.v20150623.DescribeBusinessStatusResponse.UserBusinessStatus;
import com.aliyuncs.ubsms.model.v20150623.DescribeBusinessStatusResponse.UserBusinessStatus.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBusinessStatusResponseUnmarshaller {

	public static DescribeBusinessStatusResponse unmarshall(DescribeBusinessStatusResponse describeBusinessStatusResponse, UnmarshallerContext context) {
		
		describeBusinessStatusResponse.setRequestId(context.stringValue("DescribeBusinessStatusResponse.RequestId"));
		describeBusinessStatusResponse.setSuccess(context.booleanValue("DescribeBusinessStatusResponse.Success"));

		List<UserBusinessStatus> userBusinessStatusList = new ArrayList<UserBusinessStatus>();
		for (int i = 0; i < context.lengthValue("DescribeBusinessStatusResponse.UserBusinessStatusList.Length"); i++) {
			UserBusinessStatus userBusinessStatus = new UserBusinessStatus();
			userBusinessStatus.setUid(context.stringValue("DescribeBusinessStatusResponse.UserBusinessStatusList["+ i +"].Uid"));
			userBusinessStatus.setServiceCode(context.stringValue("DescribeBusinessStatusResponse.UserBusinessStatusList["+ i +"].ServiceCode"));

			List<Status> statuses = new ArrayList<Status>();
			for (int j = 0; j < context.lengthValue("DescribeBusinessStatusResponse.UserBusinessStatusList["+ i +"].Statuses.Length"); j++) {
				Status status = new Status();
				status.setStatusKey(context.stringValue("DescribeBusinessStatusResponse.UserBusinessStatusList["+ i +"].Statuses["+ j +"].StatusKey"));
				status.setStatusValue(context.stringValue("DescribeBusinessStatusResponse.UserBusinessStatusList["+ i +"].Statuses["+ j +"].StatusValue"));

				statuses.add(status);
			}
			userBusinessStatus.setStatuses(statuses);

			userBusinessStatusList.add(userBusinessStatus);
		}
		describeBusinessStatusResponse.setUserBusinessStatusList(userBusinessStatusList);
	 
	 	return describeBusinessStatusResponse;
	}
}