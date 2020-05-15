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

import com.aliyuncs.sofa.model.v20190815.DescribeAppServiceEnvParamWithDiffResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiffItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppServiceEnvParamWithDiffResponseUnmarshaller {

	public static DescribeAppServiceEnvParamWithDiffResponse unmarshall(DescribeAppServiceEnvParamWithDiffResponse describeAppServiceEnvParamWithDiffResponse, UnmarshallerContext _ctx) {
		
		describeAppServiceEnvParamWithDiffResponse.setRequestId(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.RequestId"));
		describeAppServiceEnvParamWithDiffResponse.setResultCode(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.ResultCode"));
		describeAppServiceEnvParamWithDiffResponse.setResultMessage(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.ResultMessage"));

		List<AppServiceEnvParamDiffItem> appServiceEnvParamDiff = new ArrayList<AppServiceEnvParamDiffItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff.Length"); i++) {
			AppServiceEnvParamDiffItem appServiceEnvParamDiffItem = new AppServiceEnvParamDiffItem();
			appServiceEnvParamDiffItem.setAppId(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].AppId"));
			appServiceEnvParamDiffItem.setAppServiceId(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].AppServiceId"));
			appServiceEnvParamDiffItem.setBaselineBuildpackId(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].BaselineBuildpackId"));
			appServiceEnvParamDiffItem.setCreationTime(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].CreationTime"));
			appServiceEnvParamDiffItem.setDefaultValue(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].DefaultValue"));
			appServiceEnvParamDiffItem.setDescription(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].Description"));
			appServiceEnvParamDiffItem.setId(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].Id"));
			appServiceEnvParamDiffItem.setKey(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].Key"));
			appServiceEnvParamDiffItem.setModificationTime(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].ModificationTime"));
			appServiceEnvParamDiffItem.setOriginalDefaultValue(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].OriginalDefaultValue"));
			appServiceEnvParamDiffItem.setOriginalDescription(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].OriginalDescription"));
			appServiceEnvParamDiffItem.setOriginalReadonly(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].OriginalReadonly"));
			appServiceEnvParamDiffItem.setOriginalRequired(_ctx.booleanValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].OriginalRequired"));
			appServiceEnvParamDiffItem.setReadonly(_ctx.booleanValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].Readonly"));
			appServiceEnvParamDiffItem.setRequired(_ctx.booleanValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].Required"));
			appServiceEnvParamDiffItem.setStatus(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].Status"));
			appServiceEnvParamDiffItem.setValue(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].Value"));
			appServiceEnvParamDiffItem.setWorkspaceId(_ctx.stringValue("DescribeAppServiceEnvParamWithDiffResponse.AppServiceEnvParamDiff["+ i +"].WorkspaceId"));

			appServiceEnvParamDiff.add(appServiceEnvParamDiffItem);
		}
		describeAppServiceEnvParamWithDiffResponse.setAppServiceEnvParamDiff(appServiceEnvParamDiff);
	 
	 	return describeAppServiceEnvParamWithDiffResponse;
	}
}