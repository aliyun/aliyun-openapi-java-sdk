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

import com.aliyuncs.opensearch.model.v20171225.GetFunctionCurrentVersionResponse;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionCurrentVersionResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionCurrentVersionResponse.Result.VersionConfig;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionCurrentVersionResponse.Result.VersionConfig.CreateParametersItem;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionCurrentVersionResponse.Result.VersionConfig.DependsItem;
import com.aliyuncs.opensearch.model.v20171225.GetFunctionCurrentVersionResponse.Result.VersionConfig.UsageParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFunctionCurrentVersionResponseUnmarshaller {

	public static GetFunctionCurrentVersionResponse unmarshall(GetFunctionCurrentVersionResponse getFunctionCurrentVersionResponse, UnmarshallerContext _ctx) {
		
		getFunctionCurrentVersionResponse.setRequestId(_ctx.stringValue("GetFunctionCurrentVersionResponse.RequestId"));
		getFunctionCurrentVersionResponse.setStatus(_ctx.stringValue("GetFunctionCurrentVersionResponse.Status"));
		getFunctionCurrentVersionResponse.setHttpCode(_ctx.longValue("GetFunctionCurrentVersionResponse.HttpCode"));
		getFunctionCurrentVersionResponse.setMessage(_ctx.stringValue("GetFunctionCurrentVersionResponse.Message"));
		getFunctionCurrentVersionResponse.setCode(_ctx.stringValue("GetFunctionCurrentVersionResponse.Code"));
		getFunctionCurrentVersionResponse.setLatency(_ctx.longValue("GetFunctionCurrentVersionResponse.Latency"));

		Result result = new Result();
		result.setFunctionName(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.FunctionName"));
		result.setFunctionType(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.FunctionType"));
		result.setModelType(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.ModelType"));
		result.setVersionId(_ctx.longValue("GetFunctionCurrentVersionResponse.Result.VersionId"));
		result.setVersionName(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.VersionName"));

		VersionConfig versionConfig = new VersionConfig();

		List<CreateParametersItem> createParameters = new ArrayList<CreateParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.CreateParameters.Length"); i++) {
			CreateParametersItem createParametersItem = new CreateParametersItem();
			createParametersItem.setName(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.CreateParameters["+ i +"].Name"));
			createParametersItem.setRequired(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.CreateParameters["+ i +"].Required"));

			createParameters.add(createParametersItem);
		}
		versionConfig.setCreateParameters(createParameters);

		List<DependsItem> depends = new ArrayList<DependsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.Depends.Length"); i++) {
			DependsItem dependsItem = new DependsItem();
			dependsItem.setCondition(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.Depends["+ i +"].Condition"));
			dependsItem.setDependency(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.Depends["+ i +"].Dependency"));
			dependsItem.setDescription(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.Depends["+ i +"].Description"));

			depends.add(dependsItem);
		}
		versionConfig.setDepends(depends);

		List<UsageParametersItem> usageParameters = new ArrayList<UsageParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.UsageParameters.Length"); i++) {
			UsageParametersItem usageParametersItem = new UsageParametersItem();
			usageParametersItem.setName(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.UsageParameters["+ i +"].Name"));
			usageParametersItem.setRequired(_ctx.stringValue("GetFunctionCurrentVersionResponse.Result.VersionConfig.UsageParameters["+ i +"].Required"));

			usageParameters.add(usageParametersItem);
		}
		versionConfig.setUsageParameters(usageParameters);
		result.setVersionConfig(versionConfig);
		getFunctionCurrentVersionResponse.setResult(result);
	 
	 	return getFunctionCurrentVersionResponse;
	}
}