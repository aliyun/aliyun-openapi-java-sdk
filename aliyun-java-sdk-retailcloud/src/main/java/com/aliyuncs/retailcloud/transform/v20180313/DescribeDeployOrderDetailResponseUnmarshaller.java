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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.DescribeDeployOrderDetailResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeDeployOrderDetailResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeployOrderDetailResponseUnmarshaller {

	public static DescribeDeployOrderDetailResponse unmarshall(DescribeDeployOrderDetailResponse describeDeployOrderDetailResponse, UnmarshallerContext _ctx) {
		
		describeDeployOrderDetailResponse.setRequestId(_ctx.stringValue("DescribeDeployOrderDetailResponse.RequestId"));
		describeDeployOrderDetailResponse.setCode(_ctx.integerValue("DescribeDeployOrderDetailResponse.Code"));
		describeDeployOrderDetailResponse.setErrMsg(_ctx.stringValue("DescribeDeployOrderDetailResponse.ErrMsg"));
		describeDeployOrderDetailResponse.setSuccess(_ctx.booleanValue("DescribeDeployOrderDetailResponse.Success"));

		Result result = new Result();
		result.setAppInstanceType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.AppInstanceType"));
		result.setCurrentPartitionNum(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.CurrentPartitionNum"));
		result.setDeployOrderId(_ctx.longValue("DescribeDeployOrderDetailResponse.Result.DeployOrderId"));
		result.setDeployPauseType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.DeployPauseType"));
		result.setDeployPauseTypeName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.DeployPauseTypeName"));
		result.setDeployType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.DeployType"));
		result.setDeployTypeName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.DeployTypeName"));
		result.setDescription(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.Description"));
		result.setElapsedTime(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.ElapsedTime"));
		result.setEndTime(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.EndTime"));
		result.setEnvId(_ctx.longValue("DescribeDeployOrderDetailResponse.Result.EnvId"));
		result.setEnvType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.EnvType"));
		result.setFailureRate(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.FailureRate"));
		result.setFinishAppInstanceCt(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.FinishAppInstanceCt"));
		result.setName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.Name"));
		result.setPartitionType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.PartitionType"));
		result.setPartitionTypeName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.PartitionTypeName"));
		result.setResult(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.Result"));
		result.setResultName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.ResultName"));
		result.setSchemaId(_ctx.longValue("DescribeDeployOrderDetailResponse.Result.SchemaId"));
		result.setStartTime(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.StartTime"));
		result.setStatus(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.Status"));
		result.setStatusName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.StatusName"));
		result.setTotalAppInstanceCt(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.TotalAppInstanceCt"));
		result.setTotalPartitions(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.TotalPartitions"));
		result.setUserId(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.UserId"));
		result.setUserNick(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.UserNick"));
		describeDeployOrderDetailResponse.setResult(result);
	 
	 	return describeDeployOrderDetailResponse;
	}
}