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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.DescribePodLogResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribePodLogResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.DescribePodLogResponse.Result.DeployLogStepRC;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePodLogResponseUnmarshaller {

	public static DescribePodLogResponse unmarshall(DescribePodLogResponse describePodLogResponse, UnmarshallerContext _ctx) {
		
		describePodLogResponse.setRequestId(_ctx.stringValue("DescribePodLogResponse.RequestId"));
		describePodLogResponse.setCode(_ctx.integerValue("DescribePodLogResponse.Code"));
		describePodLogResponse.setErrMsg(_ctx.stringValue("DescribePodLogResponse.ErrMsg"));
		describePodLogResponse.setSuccess(_ctx.booleanValue("DescribePodLogResponse.Success"));

		Result result = new Result();
		result.setDeployOrderName(_ctx.stringValue("DescribePodLogResponse.Result.DeployOrderName"));
		result.setEnvTypeName(_ctx.stringValue("DescribePodLogResponse.Result.EnvTypeName"));

		List<DeployLogStepRC> deployStepList = new ArrayList<DeployLogStepRC>();
		for (int i = 0; i < _ctx.lengthValue("DescribePodLogResponse.Result.DeployStepList.Length"); i++) {
			DeployLogStepRC deployLogStepRC = new DeployLogStepRC();
			deployLogStepRC.setStepName(_ctx.stringValue("DescribePodLogResponse.Result.DeployStepList["+ i +"].StepName"));
			deployLogStepRC.setStepCode(_ctx.stringValue("DescribePodLogResponse.Result.DeployStepList["+ i +"].StepCode"));
			deployLogStepRC.setStepLog(_ctx.stringValue("DescribePodLogResponse.Result.DeployStepList["+ i +"].StepLog"));
			deployLogStepRC.setStatus(_ctx.stringValue("DescribePodLogResponse.Result.DeployStepList["+ i +"].Status"));

			deployStepList.add(deployLogStepRC);
		}
		result.setDeployStepList(deployStepList);
		describePodLogResponse.setResult(result);
	 
	 	return describePodLogResponse;
	}
}