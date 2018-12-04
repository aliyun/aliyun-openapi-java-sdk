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

import com.aliyuncs.baas.model.v20180731.QueryOrganizationDeletableResponse;
import com.aliyuncs.baas.model.v20180731.QueryOrganizationDeletableResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrganizationDeletableResponseUnmarshaller {

	public static QueryOrganizationDeletableResponse unmarshall(QueryOrganizationDeletableResponse queryOrganizationDeletableResponse, UnmarshallerContext context) {
		
		queryOrganizationDeletableResponse.setRequestId(context.stringValue("QueryOrganizationDeletableResponse.RequestId"));
		queryOrganizationDeletableResponse.setSuccess(context.booleanValue("QueryOrganizationDeletableResponse.Success"));
		queryOrganizationDeletableResponse.setErrorCode(context.integerValue("QueryOrganizationDeletableResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(context.stringValue("QueryOrganizationDeletableResponse.Result.OrganizationId"));
		result.setName(context.stringValue("QueryOrganizationDeletableResponse.Result.Name"));
		result.setRegionId(context.stringValue("QueryOrganizationDeletableResponse.Result.RegionId"));
		result.setZoneId(context.stringValue("QueryOrganizationDeletableResponse.Result.ZoneId"));
		result.setCodeName(context.stringValue("QueryOrganizationDeletableResponse.Result.CodeName"));
		result.setDomain(context.stringValue("QueryOrganizationDeletableResponse.Result.Domain"));
		result.setDescription(context.stringValue("QueryOrganizationDeletableResponse.Result.Description"));
		result.setState(context.stringValue("QueryOrganizationDeletableResponse.Result.State"));
		result.setDeletable(context.booleanValue("QueryOrganizationDeletableResponse.Result.Deletable"));
		queryOrganizationDeletableResponse.setResult(result);
	 
	 	return queryOrganizationDeletableResponse;
	}
}