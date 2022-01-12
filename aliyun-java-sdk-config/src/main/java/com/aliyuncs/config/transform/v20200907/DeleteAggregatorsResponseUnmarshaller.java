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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.DeleteAggregatorsResponse;
import com.aliyuncs.config.model.v20200907.DeleteAggregatorsResponse.OperateAggregatorsResult;
import com.aliyuncs.config.model.v20200907.DeleteAggregatorsResponse.OperateAggregatorsResult.OperateAggregatorList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAggregatorsResponseUnmarshaller {

	public static DeleteAggregatorsResponse unmarshall(DeleteAggregatorsResponse deleteAggregatorsResponse, UnmarshallerContext _ctx) {
		
		deleteAggregatorsResponse.setRequestId(_ctx.stringValue("DeleteAggregatorsResponse.RequestId"));

		OperateAggregatorsResult operateAggregatorsResult = new OperateAggregatorsResult();

		List<OperateAggregatorList> operateAggregators = new ArrayList<OperateAggregatorList>();
		for (int i = 0; i < _ctx.lengthValue("DeleteAggregatorsResponse.OperateAggregatorsResult.OperateAggregators.Length"); i++) {
			OperateAggregatorList operateAggregatorList = new OperateAggregatorList();
			operateAggregatorList.setErrorCode(_ctx.stringValue("DeleteAggregatorsResponse.OperateAggregatorsResult.OperateAggregators["+ i +"].ErrorCode"));
			operateAggregatorList.setSuccess(_ctx.booleanValue("DeleteAggregatorsResponse.OperateAggregatorsResult.OperateAggregators["+ i +"].Success"));
			operateAggregatorList.setAggregatorId(_ctx.stringValue("DeleteAggregatorsResponse.OperateAggregatorsResult.OperateAggregators["+ i +"].AggregatorId"));

			operateAggregators.add(operateAggregatorList);
		}
		operateAggregatorsResult.setOperateAggregators(operateAggregators);
		deleteAggregatorsResponse.setOperateAggregatorsResult(operateAggregatorsResult);
	 
	 	return deleteAggregatorsResponse;
	}
}