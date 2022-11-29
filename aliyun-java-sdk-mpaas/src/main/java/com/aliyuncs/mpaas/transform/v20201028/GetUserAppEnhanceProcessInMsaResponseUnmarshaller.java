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
		getUserAppEnhanceProcessInMsaResponse.setResultMessage(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultMessage"));
		getUserAppEnhanceProcessInMsaResponse.setResultCode(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Success"));

		Data data = new Data();
		data.setStatus(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.Status"));
		data.setProgress(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.Progress"));
		data.setAppCode(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AppCode"));
		data.setAfterMd5(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AfterMd5"));
		data.setLabel(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.Label"));
		data.setTaskType(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.TaskType"));
		data.setAfterSize(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AfterSize"));
		data.setAppPackage(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AppPackage"));
		data.setBeforeSize(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.BeforeSize"));
		data.setVersionName(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.VersionName"));
		data.setBeforeMd5(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.BeforeMd5"));
		data.setVersionCode(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.VersionCode"));
		data.setId(_ctx.longValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.Id"));

		List<String> classForest = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.ClassForest.Length"); i++) {
			classForest.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.ClassForest["+ i +"]"));
		}
		data.setClassForest(classForest);

		List<String> enhancedClasses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhancedClasses.Length"); i++) {
			enhancedClasses.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhancedClasses["+ i +"]"));
		}
		data.setEnhancedClasses(enhancedClasses);

		List<String> enhanceRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceRules.Length"); i++) {
			enhanceRules.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceRules["+ i +"]"));
		}
		data.setEnhanceRules(enhanceRules);

		List<String> assetsFileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AssetsFileList.Length"); i++) {
			assetsFileList.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.AssetsFileList["+ i +"]"));
		}
		data.setAssetsFileList(assetsFileList);

		List<String> soFileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.SoFileList.Length"); i++) {
			soFileList.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.SoFileList["+ i +"]"));
		}
		data.setSoFileList(soFileList);

		List<String> enhancedSoFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhancedSoFiles.Length"); i++) {
			enhancedSoFiles.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhancedSoFiles["+ i +"]"));
		}
		data.setEnhancedSoFiles(enhancedSoFiles);

		List<String> enhancedAssetsFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhancedAssetsFiles.Length"); i++) {
			enhancedAssetsFiles.add(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhancedAssetsFiles["+ i +"]"));
		}
		data.setEnhancedAssetsFiles(enhancedAssetsFiles);

		List<EnhanceMappingItem> enhanceMapping = new ArrayList<EnhanceMappingItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMapping.Length"); i++) {
			EnhanceMappingItem enhanceMappingItem = new EnhanceMappingItem();
			enhanceMappingItem.setType(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Type"));
			enhanceMappingItem.setReason(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Reason"));
			enhanceMappingItem.setInfo(_ctx.stringValue("GetUserAppEnhanceProcessInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Info"));

			enhanceMapping.add(enhanceMappingItem);
		}
		data.setEnhanceMapping(enhanceMapping);
		resultContent.setData(data);
		getUserAppEnhanceProcessInMsaResponse.setResultContent(resultContent);
	 
	 	return getUserAppEnhanceProcessInMsaResponse;
	}
}