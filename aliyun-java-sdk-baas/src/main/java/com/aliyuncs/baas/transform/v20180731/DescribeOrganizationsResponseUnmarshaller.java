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

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationsResponseUnmarshaller {

	public static DescribeOrganizationsResponse unmarshall(DescribeOrganizationsResponse describeOrganizationsResponse, UnmarshallerContext context) {
		
		describeOrganizationsResponse.setRequestId(context.stringValue("DescribeOrganizationsResponse.RequestId"));
		describeOrganizationsResponse.setSuccess(context.booleanValue("DescribeOrganizationsResponse.Success"));
		describeOrganizationsResponse.setErrorCode(context.integerValue("DescribeOrganizationsResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeOrganizationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setOrganizationId(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].OrganizationId"));
			resultItem.setName(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].Name"));
			resultItem.setRegionId(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].RegionId"));
			resultItem.setZoneId(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].ZoneId"));
			resultItem.setCodeName(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].CodeName"));
			resultItem.setDomain(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].Domain"));
			resultItem.setDescription(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].Description"));
			resultItem.setOwnerBid(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].OwnerBid"));
			resultItem.setOwnerUid(context.integerValue("DescribeOrganizationsResponse.Result["+ i +"].OwnerUid"));
			resultItem.setOwnerName(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].OwnerName"));
			resultItem.setPeerCount(context.integerValue("DescribeOrganizationsResponse.Result["+ i +"].PeerCount"));
			resultItem.setUserCount(context.integerValue("DescribeOrganizationsResponse.Result["+ i +"].UserCount"));
			resultItem.setConsortiumCount(context.integerValue("DescribeOrganizationsResponse.Result["+ i +"].ConsortiumCount"));
			resultItem.setSpecName(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].SpecName"));
			resultItem.setRequestId(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].RequestId"));
			resultItem.setCreateTime(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].CreateTime"));
			resultItem.setState(context.stringValue("DescribeOrganizationsResponse.Result["+ i +"].State"));

			result.add(resultItem);
		}
		describeOrganizationsResponse.setResult(result);
	 
	 	return describeOrganizationsResponse;
	}
}