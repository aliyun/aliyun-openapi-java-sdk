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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.GetUserAppEnhanceProcessInMsaResponse;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppEnhanceProcessInMsaResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMappingItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserAppEnhanceProcessInMsaResponseUnmarshaller {

	public static GetUserAppEnhanceProcessInMsaResponse unmarshall(GetUserAppEnhanceProcessInMsaResponse getUserAppEnhanceProcessInMsaResponse, UnmarshallerContext _ctx) {
		
		getUserAppEnhanceProcessInMsaResponse.setRequestId(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.RequestId"));
		getUserAppEnhanceProcessInMsaResponse.setResultCode(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultCode"));
		getUserAppEnhanceProcessInMsaResponse.setResultMessage(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Success"));

		Data data = new Data();
		data.setAfterMd5(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AfterMd5"));
		data.setAfterSize(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AfterSize"));
		data.setAppCode(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AppCode"));
		data.setAppPackage(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AppPackage"));
		data.setBeforeMd5(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.BeforeMd5"));
		data.setBeforeSize(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.BeforeSize"));
		data.setId(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.Id"));
		data.setLabel(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.Label"));
		data.setProgress(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.Progress"));
		data.setStatus(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.Status"));
		data.setTaskType(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.TaskType"));
		data.setVersionCode(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.VersionCode"));
		data.setVersionName(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.VersionName"));

		List<String> enhancedClasses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhancedClasses.Length"); i++) {
			enhancedClasses.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhancedClasses["+ i +"]"));
		}
		data.setEnhancedClasses(enhancedClasses);

		List<String> classForest = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.ClassForest.Length"); i++) {
			classForest.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.ClassForest["+ i +"]"));
		}
		data.setClassForest(classForest);

		List<String> enhanceRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceRules.Length"); i++) {
			enhanceRules.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceRules["+ i +"]"));
		}
		data.setEnhanceRules(enhanceRules);

		List<EnhanceMappingItem> enhanceMapping = new ArrayList<EnhanceMappingItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMapping.Length"); i++) {
			EnhanceMappingItem enhanceMappingItem = new EnhanceMappingItem();
			enhanceMappingItem.setInfo(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Info"));
			enhanceMappingItem.setReason(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Reason"));
			enhanceMappingItem.setType(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Type"));

			enhanceMapping.add(enhanceMappingItem);
		}
		data.setEnhanceMapping(enhanceMapping);
		resultContent.setData(data);
		getUserAppEnhanceProcessInMsaResponse.setResultContent(resultContent);
	 
	 	return getUserAppEnhanceProcessInMsaResponse;
	}
}