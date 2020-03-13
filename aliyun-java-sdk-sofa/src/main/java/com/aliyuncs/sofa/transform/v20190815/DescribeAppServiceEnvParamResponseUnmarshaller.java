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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeAppServiceEnvParamResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeAppServiceEnvParamResponse.AppServiceEnvParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppServiceEnvParamResponseUnmarshaller {

	public static DescribeAppServiceEnvParamResponse unmarshall(DescribeAppServiceEnvParamResponse describeAppServiceEnvParamResponse, UnmarshallerContext _ctx) {
		
		describeAppServiceEnvParamResponse.setRequestId(_ctx.stringValue("DescribeAppServiceEnvParamResponse.RequestId"));
		describeAppServiceEnvParamResponse.setResultCode(_ctx.stringValue("DescribeAppServiceEnvParamResponse.ResultCode"));
		describeAppServiceEnvParamResponse.setResultMessage(_ctx.stringValue("DescribeAppServiceEnvParamResponse.ResultMessage"));
		describeAppServiceEnvParamResponse.setCurrentPage(_ctx.longValue("DescribeAppServiceEnvParamResponse.CurrentPage"));
		describeAppServiceEnvParamResponse.setPageSize(_ctx.longValue("DescribeAppServiceEnvParamResponse.PageSize"));
		describeAppServiceEnvParamResponse.setTotalCount(_ctx.longValue("DescribeAppServiceEnvParamResponse.TotalCount"));

		List<AppServiceEnvParamsItem> appServiceEnvParams = new ArrayList<AppServiceEnvParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams.Length"); i++) {
			AppServiceEnvParamsItem appServiceEnvParamsItem = new AppServiceEnvParamsItem();
			appServiceEnvParamsItem.setAppId(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].AppId"));
			appServiceEnvParamsItem.setAppServiceId(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].AppServiceId"));
			appServiceEnvParamsItem.setBaselineBuildpackId(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].BaselineBuildpackId"));
			appServiceEnvParamsItem.setCreationTime(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].CreationTime"));
			appServiceEnvParamsItem.setDefaultValue(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].DefaultValue"));
			appServiceEnvParamsItem.setDescription(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].Description"));
			appServiceEnvParamsItem.setId(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].Id"));
			appServiceEnvParamsItem.setKey(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].Key"));
			appServiceEnvParamsItem.setModificationTime(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].ModificationTime"));
			appServiceEnvParamsItem.setOriginalDefaultValue(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].OriginalDefaultValue"));
			appServiceEnvParamsItem.setOriginalDescription(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].OriginalDescription"));
			appServiceEnvParamsItem.setOriginalReadonly(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].OriginalReadonly"));
			appServiceEnvParamsItem.setOriginalRequired(_ctx.booleanValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].OriginalRequired"));
			appServiceEnvParamsItem.setReadonly(_ctx.booleanValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].Readonly"));
			appServiceEnvParamsItem.setRequired(_ctx.booleanValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].Required"));
			appServiceEnvParamsItem.setStatus(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].Status"));
			appServiceEnvParamsItem.setValue(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].Value"));
			appServiceEnvParamsItem.setWorkspaceId(_ctx.stringValue("DescribeAppServiceEnvParamResponse.AppServiceEnvParams["+ i +"].WorkspaceId"));

			appServiceEnvParams.add(appServiceEnvParamsItem);
		}
		describeAppServiceEnvParamResponse.setAppServiceEnvParams(appServiceEnvParams);
	 
	 	return describeAppServiceEnvParamResponse;
	}
}