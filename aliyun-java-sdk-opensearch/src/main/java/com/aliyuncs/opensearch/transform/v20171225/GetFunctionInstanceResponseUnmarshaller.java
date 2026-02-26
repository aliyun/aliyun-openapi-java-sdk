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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.GetFunctionInstanceResponse;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionInstanceResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionInstanceResponse.Result.Belongs;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionInstanceResponse.Result.CreateParametersItem;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionInstanceResponse.Result.Task;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionInstanceResponse.Result.UsageParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFunctionInstanceResponseUnmarshaller {

	public static GetFunctionInstanceResponse unmarshall(GetFunctionInstanceResponse getFunctionInstanceResponse, UnmarshallerContext _ctx) {
		
		getFunctionInstanceResponse.setRequestId(_ctx.stringValue("GetFunctionInstanceResponse.RequestId"));
		getFunctionInstanceResponse.setStatus(_ctx.stringValue("GetFunctionInstanceResponse.Status"));
		getFunctionInstanceResponse.setHttpCode(_ctx.longValue("GetFunctionInstanceResponse.HttpCode"));
		getFunctionInstanceResponse.setMessage(_ctx.stringValue("GetFunctionInstanceResponse.Message"));
		getFunctionInstanceResponse.setCode(_ctx.stringValue("GetFunctionInstanceResponse.Code"));
		getFunctionInstanceResponse.setLatency(_ctx.longValue("GetFunctionInstanceResponse.Latency"));

		Result result = new Result();
		result.setCreateTime(_ctx.longValue("GetFunctionInstanceResponse.Result.CreateTime"));
		result.setCron(_ctx.stringValue("GetFunctionInstanceResponse.Result.Cron"));
		result.setDescription(_ctx.stringValue("GetFunctionInstanceResponse.Result.Description"));
		result.setExtendInfo(_ctx.stringValue("GetFunctionInstanceResponse.Result.ExtendInfo"));
		result.setFunctionName(_ctx.stringValue("GetFunctionInstanceResponse.Result.FunctionName"));
		result.setFunctionType(_ctx.stringValue("GetFunctionInstanceResponse.Result.FunctionType"));
		result.setInstanceName(_ctx.stringValue("GetFunctionInstanceResponse.Result.InstanceName"));
		result.setModelType(_ctx.stringValue("GetFunctionInstanceResponse.Result.ModelType"));
		result.setSource(_ctx.stringValue("GetFunctionInstanceResponse.Result.Source"));
		result.setStatus(_ctx.stringValue("GetFunctionInstanceResponse.Result.Status"));
		result.setVersionId(_ctx.longValue("GetFunctionInstanceResponse.Result.VersionId"));

		Belongs belongs = new Belongs();
		belongs.setCategory(_ctx.stringValue("GetFunctionInstanceResponse.Result.Belongs.Category"));
		belongs.setDomain(_ctx.stringValue("GetFunctionInstanceResponse.Result.Belongs.Domain"));
		belongs.setLanguage(_ctx.stringValue("GetFunctionInstanceResponse.Result.Belongs.Language"));
		result.setBelongs(belongs);

		Task task = new Task();
		task.setDagStatus(_ctx.stringValue("GetFunctionInstanceResponse.Result.Task.DagStatus"));
		task.setLastRunTime(_ctx.longValue("GetFunctionInstanceResponse.Result.Task.LastRunTime"));
		result.setTask(task);

		List<CreateParametersItem> createParameters = new ArrayList<CreateParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFunctionInstanceResponse.Result.CreateParameters.Length"); i++) {
			CreateParametersItem createParametersItem = new CreateParametersItem();
			createParametersItem.setName(_ctx.stringValue("GetFunctionInstanceResponse.Result.CreateParameters["+ i +"].Name"));
			createParametersItem.setValue(_ctx.stringValue("GetFunctionInstanceResponse.Result.CreateParameters["+ i +"].Value"));

			createParameters.add(createParametersItem);
		}
		result.setCreateParameters(createParameters);

		List<UsageParametersItem> usageParameters = new ArrayList<UsageParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFunctionInstanceResponse.Result.UsageParameters.Length"); i++) {
			UsageParametersItem usageParametersItem = new UsageParametersItem();
			usageParametersItem.setName(_ctx.stringValue("GetFunctionInstanceResponse.Result.UsageParameters["+ i +"].Name"));
			usageParametersItem.setValue(_ctx.stringValue("GetFunctionInstanceResponse.Result.UsageParameters["+ i +"].Value"));

			usageParameters.add(usageParametersItem);
		}
		result.setUsageParameters(usageParameters);
		getFunctionInstanceResponse.setResult(result);
	 
	 	return getFunctionInstanceResponse;
	}
}