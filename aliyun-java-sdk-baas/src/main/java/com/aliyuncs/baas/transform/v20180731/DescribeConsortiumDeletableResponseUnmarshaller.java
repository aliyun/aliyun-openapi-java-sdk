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

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumDeletableResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumDeletableResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumDeletableResponseUnmarshaller {

	public static DescribeConsortiumDeletableResponse unmarshall(DescribeConsortiumDeletableResponse describeConsortiumDeletableResponse, UnmarshallerContext context) {
		
		describeConsortiumDeletableResponse.setRequestId(context.stringValue("DescribeConsortiumDeletableResponse.RequestId"));
		describeConsortiumDeletableResponse.setSuccess(context.booleanValue("DescribeConsortiumDeletableResponse.Success"));
		describeConsortiumDeletableResponse.setErrorCode(context.integerValue("DescribeConsortiumDeletableResponse.ErrorCode"));

		Result result = new Result();
		result.setConsortiumId(context.stringValue("DescribeConsortiumDeletableResponse.Result.ConsortiumId"));
		result.setName(context.stringValue("DescribeConsortiumDeletableResponse.Result.Name"));
		result.setRegionId(context.stringValue("DescribeConsortiumDeletableResponse.Result.RegionId"));
		result.setZoneId(context.stringValue("DescribeConsortiumDeletableResponse.Result.ZoneId"));
		result.setCodeName(context.stringValue("DescribeConsortiumDeletableResponse.Result.CodeName"));
		result.setDomain(context.stringValue("DescribeConsortiumDeletableResponse.Result.Domain"));
		result.setDescription(context.stringValue("DescribeConsortiumDeletableResponse.Result.Description"));
		result.setState(context.stringValue("DescribeConsortiumDeletableResponse.Result.State"));
		result.setDeletable(context.booleanValue("DescribeConsortiumDeletableResponse.Result.Deletable"));
		describeConsortiumDeletableResponse.setResult(result);
	 
	 	return describeConsortiumDeletableResponse;
	}
}