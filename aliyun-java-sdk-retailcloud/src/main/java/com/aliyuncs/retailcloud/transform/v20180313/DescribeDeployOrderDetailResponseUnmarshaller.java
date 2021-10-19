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
		result.setStatus(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.Status"));
		result.setAppInstanceType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.AppInstanceType"));
		result.setDeployType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.DeployType"));
		result.setUserId(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.UserId"));
		result.setPartitionTypeName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.PartitionTypeName"));
		result.setStatusName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.StatusName"));
		result.setEnvType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.EnvType"));
		result.setTotalAppInstanceCt(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.TotalAppInstanceCt"));
		result.setElapsedTime(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.ElapsedTime"));
		result.setDescription(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.Description"));
		result.setName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.Name"));
		result.setDeployTypeName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.DeployTypeName"));
		result.setFinishAppInstanceCt(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.FinishAppInstanceCt"));
		result.setSchemaId(_ctx.longValue("DescribeDeployOrderDetailResponse.Result.SchemaId"));
		result.setDeployPauseType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.DeployPauseType"));
		result.setResult(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.Result"));
		result.setFailureRate(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.FailureRate"));
		result.setTotalPartitions(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.TotalPartitions"));
		result.setUserNick(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.UserNick"));
		result.setEndTime(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.EndTime"));
		result.setStartTime(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.StartTime"));
		result.setDeployOrderId(_ctx.longValue("DescribeDeployOrderDetailResponse.Result.DeployOrderId"));
		result.setDeployPauseTypeName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.DeployPauseTypeName"));
		result.setResultName(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.ResultName"));
		result.setCurrentPartitionNum(_ctx.integerValue("DescribeDeployOrderDetailResponse.Result.CurrentPartitionNum"));
		result.setPartitionType(_ctx.stringValue("DescribeDeployOrderDetailResponse.Result.PartitionType"));
		result.setEnvId(_ctx.longValue("DescribeDeployOrderDetailResponse.Result.EnvId"));
		describeDeployOrderDetailResponse.setResult(result);
	 
	 	return describeDeployOrderDetailResponse;
	}
}