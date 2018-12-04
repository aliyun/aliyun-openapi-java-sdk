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

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationDeletableResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationDeletableResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationDeletableResponseUnmarshaller {

	public static DescribeOrganizationDeletableResponse unmarshall(DescribeOrganizationDeletableResponse describeOrganizationDeletableResponse, UnmarshallerContext context) {
		
		describeOrganizationDeletableResponse.setRequestId(context.stringValue("DescribeOrganizationDeletableResponse.RequestId"));
		describeOrganizationDeletableResponse.setSuccess(context.booleanValue("DescribeOrganizationDeletableResponse.Success"));
		describeOrganizationDeletableResponse.setErrorCode(context.integerValue("DescribeOrganizationDeletableResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(context.stringValue("DescribeOrganizationDeletableResponse.Result.OrganizationId"));
		result.setName(context.stringValue("DescribeOrganizationDeletableResponse.Result.Name"));
		result.setRegionId(context.stringValue("DescribeOrganizationDeletableResponse.Result.RegionId"));
		result.setZoneId(context.stringValue("DescribeOrganizationDeletableResponse.Result.ZoneId"));
		result.setCodeName(context.stringValue("DescribeOrganizationDeletableResponse.Result.CodeName"));
		result.setDomain(context.stringValue("DescribeOrganizationDeletableResponse.Result.Domain"));
		result.setDescription(context.stringValue("DescribeOrganizationDeletableResponse.Result.Description"));
		result.setState(context.stringValue("DescribeOrganizationDeletableResponse.Result.State"));
		result.setDeletable(context.booleanValue("DescribeOrganizationDeletableResponse.Result.Deletable"));
		describeOrganizationDeletableResponse.setResult(result);
	 
	 	return describeOrganizationDeletableResponse;
	}
}