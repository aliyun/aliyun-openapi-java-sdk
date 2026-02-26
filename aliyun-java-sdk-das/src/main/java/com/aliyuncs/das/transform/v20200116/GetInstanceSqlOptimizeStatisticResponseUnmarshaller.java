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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetInstanceSqlOptimizeStatisticResponse;
import com.aliyuncs.das.model.v20200116.GetInstanceSqlOptimizeStatisticResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceSqlOptimizeStatisticResponseUnmarshaller {

	public static GetInstanceSqlOptimizeStatisticResponse unmarshall(GetInstanceSqlOptimizeStatisticResponse getInstanceSqlOptimizeStatisticResponse, UnmarshallerContext _ctx) {
		
		getInstanceSqlOptimizeStatisticResponse.setRequestId(_ctx.stringValue("GetInstanceSqlOptimizeStatisticResponse.RequestId"));
		getInstanceSqlOptimizeStatisticResponse.setCode(_ctx.stringValue("GetInstanceSqlOptimizeStatisticResponse.Code"));
		getInstanceSqlOptimizeStatisticResponse.setMessage(_ctx.stringValue("GetInstanceSqlOptimizeStatisticResponse.Message"));
		getInstanceSqlOptimizeStatisticResponse.setSuccess(_ctx.stringValue("GetInstanceSqlOptimizeStatisticResponse.Success"));

		Data data = new Data();
		data.setCount(_ctx.integerValue("GetInstanceSqlOptimizeStatisticResponse.Data.count"));
		data.setImprovement(_ctx.doubleValue("GetInstanceSqlOptimizeStatisticResponse.Data.improvement"));
		getInstanceSqlOptimizeStatisticResponse.setData(data);
	 
	 	return getInstanceSqlOptimizeStatisticResponse;
	}
}