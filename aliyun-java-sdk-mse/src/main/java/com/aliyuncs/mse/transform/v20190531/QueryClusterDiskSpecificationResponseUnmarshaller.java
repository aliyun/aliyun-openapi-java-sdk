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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.QueryClusterDiskSpecificationResponse;
import com.aliyuncs.mse.model.v20190531.QueryClusterDiskSpecificationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClusterDiskSpecificationResponseUnmarshaller {

	public static QueryClusterDiskSpecificationResponse unmarshall(QueryClusterDiskSpecificationResponse queryClusterDiskSpecificationResponse, UnmarshallerContext _ctx) {
		
		queryClusterDiskSpecificationResponse.setRequestId(_ctx.stringValue("QueryClusterDiskSpecificationResponse.RequestId"));
		queryClusterDiskSpecificationResponse.setHttpStatusCode(_ctx.integerValue("QueryClusterDiskSpecificationResponse.HttpStatusCode"));
		queryClusterDiskSpecificationResponse.setSuccess(_ctx.booleanValue("QueryClusterDiskSpecificationResponse.Success"));
		queryClusterDiskSpecificationResponse.setErrorCode(_ctx.stringValue("QueryClusterDiskSpecificationResponse.ErrorCode"));
		queryClusterDiskSpecificationResponse.setCode(_ctx.integerValue("QueryClusterDiskSpecificationResponse.Code"));
		queryClusterDiskSpecificationResponse.setMessage(_ctx.stringValue("QueryClusterDiskSpecificationResponse.Message"));
		queryClusterDiskSpecificationResponse.setDynamicMessage(_ctx.stringValue("QueryClusterDiskSpecificationResponse.DynamicMessage"));

		Data data = new Data();
		data.setStep(_ctx.integerValue("QueryClusterDiskSpecificationResponse.Data.Step"));
		data.setMax(_ctx.integerValue("QueryClusterDiskSpecificationResponse.Data.Max"));
		data.setMin(_ctx.integerValue("QueryClusterDiskSpecificationResponse.Data.Min"));
		queryClusterDiskSpecificationResponse.setData(data);
	 
	 	return queryClusterDiskSpecificationResponse;
	}
}