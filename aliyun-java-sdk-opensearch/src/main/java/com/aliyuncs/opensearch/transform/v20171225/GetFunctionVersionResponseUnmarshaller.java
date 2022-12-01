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

import com.aliyuncs.opensearch.model.v20171225.GetFunctionVersionResponse;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionVersionResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionVersionResponse.Result.VersionConfig;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionVersionResponse.Result.VersionConfig.CreateParametersItem;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionVersionResponse.Result.VersionConfig.DependsItem;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionVersionResponse.Result.VersionConfig.UsageParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFunctionVersionResponseUnmarshaller {

	public static GetFunctionVersionResponse unmarshall(GetFunctionVersionResponse getFunctionVersionResponse, UnmarshallerContext _ctx) {
		
		getFunctionVersionResponse.setRequestId(_ctx.stringValue("GetFunctionVersionResponse.RequestId"));
		getFunctionVersionResponse.setStatus(_ctx.stringValue("GetFunctionVersionResponse.Status"));
		getFunctionVersionResponse.setHttpCode(_ctx.longValue("GetFunctionVersionResponse.HttpCode"));
		getFunctionVersionResponse.setMessage(_ctx.stringValue("GetFunctionVersionResponse.Message"));
		getFunctionVersionResponse.setCode(_ctx.stringValue("GetFunctionVersionResponse.Code"));
		getFunctionVersionResponse.setLatency(_ctx.longValue("GetFunctionVersionResponse.Latency"));

		Result result = new Result();
		result.setFunctionName(_ctx.stringValue("GetFunctionVersionResponse.Result.FunctionName"));
		result.setFunctionType(_ctx.stringValue("GetFunctionVersionResponse.Result.FunctionType"));
		result.setModelType(_ctx.stringValue("GetFunctionVersionResponse.Result.ModelType"));
		result.setVersionId(_ctx.longValue("GetFunctionVersionResponse.Result.VersionId"));
		result.setVersionName(_ctx.stringValue("GetFunctionVersionResponse.Result.VersionName"));

		VersionConfig versionConfig = new VersionConfig();

		List<CreateParametersItem> createParameters = new ArrayList<CreateParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFunctionVersionResponse.Result.VersionConfig.CreateParameters.Length"); i++) {
			CreateParametersItem createParametersItem = new CreateParametersItem();
			createParametersItem.setName(_ctx.stringValue("GetFunctionVersionResponse.Result.VersionConfig.CreateParameters["+ i +"].Name"));
			createParametersItem.setRequired(_ctx.stringValue("GetFunctionVersionResponse.Result.VersionConfig.CreateParameters["+ i +"].Required"));

			createParameters.add(createParametersItem);
		}
		versionConfig.setCreateParameters(createParameters);

		List<DependsItem> depends = new ArrayList<DependsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFunctionVersionResponse.Result.VersionConfig.Depends.Length"); i++) {
			DependsItem dependsItem = new DependsItem();
			dependsItem.setCondition(_ctx.stringValue("GetFunctionVersionResponse.Result.VersionConfig.Depends["+ i +"].Condition"));
			dependsItem.setDependency(_ctx.stringValue("GetFunctionVersionResponse.Result.VersionConfig.Depends["+ i +"].Dependency"));
			dependsItem.setDescription(_ctx.stringValue("GetFunctionVersionResponse.Result.VersionConfig.Depends["+ i +"].Description"));

			depends.add(dependsItem);
		}
		versionConfig.setDepends(depends);

		List<UsageParametersItem> usageParameters = new ArrayList<UsageParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFunctionVersionResponse.Result.VersionConfig.UsageParameters.Length"); i++) {
			UsageParametersItem usageParametersItem = new UsageParametersItem();
			usageParametersItem.setName(_ctx.stringValue("GetFunctionVersionResponse.Result.VersionConfig.UsageParameters["+ i +"].Name"));
			usageParametersItem.setRequired(_ctx.stringValue("GetFunctionVersionResponse.Result.VersionConfig.UsageParameters["+ i +"].Required"));

			usageParameters.add(usageParametersItem);
		}
		versionConfig.setUsageParameters(usageParameters);
		result.setVersionConfig(versionConfig);
		getFunctionVersionResponse.setResult(result);
	 
	 	return getFunctionVersionResponse;
	}
}