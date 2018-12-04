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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationUsersResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationUsersResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationUsersResponseUnmarshaller {

	public static DescribeOrganizationUsersResponse unmarshall(DescribeOrganizationUsersResponse describeOrganizationUsersResponse, UnmarshallerContext context) {
		
		describeOrganizationUsersResponse.setRequestId(context.stringValue("DescribeOrganizationUsersResponse.RequestId"));
		describeOrganizationUsersResponse.setSuccess(context.booleanValue("DescribeOrganizationUsersResponse.Success"));
		describeOrganizationUsersResponse.setErrorCode(context.integerValue("DescribeOrganizationUsersResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeOrganizationUsersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCallerBid(context.stringValue("DescribeOrganizationUsersResponse.Result["+ i +"].CallerBid"));
			resultItem.setCallerUid(context.longValue("DescribeOrganizationUsersResponse.Result["+ i +"].CallerUid"));
			resultItem.setRegionId(context.stringValue("DescribeOrganizationUsersResponse.Result["+ i +"].RegionId"));
			resultItem.setOrganizationId(context.stringValue("DescribeOrganizationUsersResponse.Result["+ i +"].OrganizationId"));
			resultItem.setUsername(context.stringValue("DescribeOrganizationUsersResponse.Result["+ i +"].Username"));
			resultItem.setFullName(context.stringValue("DescribeOrganizationUsersResponse.Result["+ i +"].FullName"));
			resultItem.setCreateTime(context.stringValue("DescribeOrganizationUsersResponse.Result["+ i +"].CreateTime"));
			resultItem.setExpireTime(context.stringValue("DescribeOrganizationUsersResponse.Result["+ i +"].ExpireTime"));

			result.add(resultItem);
		}
		describeOrganizationUsersResponse.setResult(result);
	 
	 	return describeOrganizationUsersResponse;
	}
}