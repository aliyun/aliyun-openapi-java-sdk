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

import com.aliyuncs.baas.model.v20180731.QueryConsortiumDeletableResponse;
import com.aliyuncs.baas.model.v20180731.QueryConsortiumDeletableResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryConsortiumDeletableResponseUnmarshaller {

	public static QueryConsortiumDeletableResponse unmarshall(QueryConsortiumDeletableResponse queryConsortiumDeletableResponse, UnmarshallerContext context) {
		
		queryConsortiumDeletableResponse.setRequestId(context.stringValue("QueryConsortiumDeletableResponse.RequestId"));
		queryConsortiumDeletableResponse.setSuccess(context.booleanValue("QueryConsortiumDeletableResponse.Success"));
		queryConsortiumDeletableResponse.setErrorCode(context.integerValue("QueryConsortiumDeletableResponse.ErrorCode"));

		Result result = new Result();
		result.setConsortiumId(context.stringValue("QueryConsortiumDeletableResponse.Result.ConsortiumId"));
		result.setName(context.stringValue("QueryConsortiumDeletableResponse.Result.Name"));
		result.setRegionId(context.stringValue("QueryConsortiumDeletableResponse.Result.RegionId"));
		result.setZoneId(context.stringValue("QueryConsortiumDeletableResponse.Result.ZoneId"));
		result.setCodeName(context.stringValue("QueryConsortiumDeletableResponse.Result.CodeName"));
		result.setDomain(context.stringValue("QueryConsortiumDeletableResponse.Result.Domain"));
		result.setDescription(context.stringValue("QueryConsortiumDeletableResponse.Result.Description"));
		result.setState(context.stringValue("QueryConsortiumDeletableResponse.Result.State"));
		result.setDeletable(context.booleanValue("QueryConsortiumDeletableResponse.Result.Deletable"));
		queryConsortiumDeletableResponse.setResult(result);
	 
	 	return queryConsortiumDeletableResponse;
	}
}