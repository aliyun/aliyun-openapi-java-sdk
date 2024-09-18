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

package com.aliyuncs.quickbi_public.transform.v20220101;

import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetSwitchInfoResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDatasetSwitchInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDatasetSwitchInfoResponseUnmarshaller {

	public static QueryDatasetSwitchInfoResponse unmarshall(QueryDatasetSwitchInfoResponse queryDatasetSwitchInfoResponse, UnmarshallerContext _ctx) {
		
		queryDatasetSwitchInfoResponse.setRequestId(_ctx.stringValue("QueryDatasetSwitchInfoResponse.RequestId"));
		queryDatasetSwitchInfoResponse.setSuccess(_ctx.booleanValue("QueryDatasetSwitchInfoResponse.Success"));

		Result result = new Result();
		result.setCubeId(_ctx.stringValue("QueryDatasetSwitchInfoResponse.Result.CubeId"));
		result.setIsOpenColumnLevelPermission(_ctx.integerValue("QueryDatasetSwitchInfoResponse.Result.IsOpenColumnLevelPermission"));
		result.setIsOpenRowLevelPermission(_ctx.integerValue("QueryDatasetSwitchInfoResponse.Result.IsOpenRowLevelPermission"));
		queryDatasetSwitchInfoResponse.setResult(result);
	 
	 	return queryDatasetSwitchInfoResponse;
	}
}