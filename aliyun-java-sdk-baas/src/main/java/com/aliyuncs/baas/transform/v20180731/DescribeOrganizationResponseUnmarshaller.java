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

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationResponseUnmarshaller {

	public static DescribeOrganizationResponse unmarshall(DescribeOrganizationResponse describeOrganizationResponse, UnmarshallerContext context) {
		
		describeOrganizationResponse.setRequestId(context.stringValue("DescribeOrganizationResponse.RequestId"));
		describeOrganizationResponse.setSuccess(context.booleanValue("DescribeOrganizationResponse.Success"));
		describeOrganizationResponse.setErrorCode(context.integerValue("DescribeOrganizationResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(context.stringValue("DescribeOrganizationResponse.Result.OrganizationId"));
		result.setName(context.stringValue("DescribeOrganizationResponse.Result.Name"));
		result.setRegionId(context.stringValue("DescribeOrganizationResponse.Result.RegionId"));
		result.setZoneId(context.stringValue("DescribeOrganizationResponse.Result.ZoneId"));
		result.setCodeName(context.stringValue("DescribeOrganizationResponse.Result.CodeName"));
		result.setDomain(context.stringValue("DescribeOrganizationResponse.Result.Domain"));
		result.setDescription(context.stringValue("DescribeOrganizationResponse.Result.Description"));
		result.setOwnerBid(context.stringValue("DescribeOrganizationResponse.Result.OwnerBid"));
		result.setOwnerUid(context.longValue("DescribeOrganizationResponse.Result.OwnerUid"));
		result.setOwnerName(context.stringValue("DescribeOrganizationResponse.Result.OwnerName"));
		result.setPeerCount(context.integerValue("DescribeOrganizationResponse.Result.PeerCount"));
		result.setUserCount(context.integerValue("DescribeOrganizationResponse.Result.UserCount"));
		result.setConsortiumCount(context.integerValue("DescribeOrganizationResponse.Result.ConsortiumCount"));
		result.setSpecName(context.stringValue("DescribeOrganizationResponse.Result.SpecName"));
		result.setRequestId(context.stringValue("DescribeOrganizationResponse.Result.RequestId"));
		result.setCreateTime(context.stringValue("DescribeOrganizationResponse.Result.CreateTime"));
		result.setState(context.stringValue("DescribeOrganizationResponse.Result.State"));
		describeOrganizationResponse.setResult(result);
	 
	 	return describeOrganizationResponse;
	}
}