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

import com.aliyuncs.sofa.model.v20190815.ModifyAppServiceEnvParamsResponse;
import com.aliyuncs.sofa.model.v20190815.ModifyAppServiceEnvParamsResponse.AppServiceEnvParamItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAppServiceEnvParamsResponseUnmarshaller {

	public static ModifyAppServiceEnvParamsResponse unmarshall(ModifyAppServiceEnvParamsResponse modifyAppServiceEnvParamsResponse, UnmarshallerContext _ctx) {
		
		modifyAppServiceEnvParamsResponse.setRequestId(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.RequestId"));
		modifyAppServiceEnvParamsResponse.setResultCode(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.ResultCode"));
		modifyAppServiceEnvParamsResponse.setResultMessage(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.ResultMessage"));

		List<AppServiceEnvParamItem> appServiceEnvParam = new ArrayList<AppServiceEnvParamItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam.Length"); i++) {
			AppServiceEnvParamItem appServiceEnvParamItem = new AppServiceEnvParamItem();
			appServiceEnvParamItem.setAppId(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].AppId"));
			appServiceEnvParamItem.setAppServiceId(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].AppServiceId"));
			appServiceEnvParamItem.setBaselineBuildpackId(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].BaselineBuildpackId"));
			appServiceEnvParamItem.setCreationTime(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].CreationTime"));
			appServiceEnvParamItem.setDefaultValue(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].DefaultValue"));
			appServiceEnvParamItem.setDescription(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].Description"));
			appServiceEnvParamItem.setId(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].Id"));
			appServiceEnvParamItem.setKey(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].Key"));
			appServiceEnvParamItem.setModificationTime(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].ModificationTime"));
			appServiceEnvParamItem.setOriginalDefaultValue(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].OriginalDefaultValue"));
			appServiceEnvParamItem.setOriginalDescription(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].OriginalDescription"));
			appServiceEnvParamItem.setOriginalReadonly(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].OriginalReadonly"));
			appServiceEnvParamItem.setOriginalRequired(_ctx.booleanValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].OriginalRequired"));
			appServiceEnvParamItem.setReadonly(_ctx.booleanValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].Readonly"));
			appServiceEnvParamItem.setRequired(_ctx.booleanValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].Required"));
			appServiceEnvParamItem.setStatus(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].Status"));
			appServiceEnvParamItem.setValue(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].Value"));
			appServiceEnvParamItem.setWorkspaceId(_ctx.stringValue("ModifyAppServiceEnvParamsResponse.AppServiceEnvParam["+ i +"].WorkspaceId"));

			appServiceEnvParam.add(appServiceEnvParamItem);
		}
		modifyAppServiceEnvParamsResponse.setAppServiceEnvParam(appServiceEnvParam);
	 
	 	return modifyAppServiceEnvParamsResponse;
	}
}