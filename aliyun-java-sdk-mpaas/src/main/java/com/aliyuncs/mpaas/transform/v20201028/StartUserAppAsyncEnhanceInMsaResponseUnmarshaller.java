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

import com.aliyuncs.mpaas.model.v20201028.StartUserAppAsyncEnhanceInMsaResponse;
import com.aliyuncs.mpaas.model.v20201028.StartUserAppAsyncEnhanceInMsaResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhanceMappingItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartUserAppAsyncEnhanceInMsaResponseUnmarshaller {

	public static StartUserAppAsyncEnhanceInMsaResponse unmarshall(StartUserAppAsyncEnhanceInMsaResponse startUserAppAsyncEnhanceInMsaResponse, UnmarshallerContext _ctx) {
		
		startUserAppAsyncEnhanceInMsaResponse.setRequestId(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.RequestId"));
		startUserAppAsyncEnhanceInMsaResponse.setResultMessage(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultMessage"));
		startUserAppAsyncEnhanceInMsaResponse.setResultCode(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Success"));

		Data data = new Data();
		data.setStatus(_ctx.longValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.Status"));
		data.setProgress(_ctx.longValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.Progress"));
		data.setAppCode(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.AppCode"));
		data.setClassForest(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.ClassForest"));
		data.setAfterMd5(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.AfterMd5"));
		data.setLabel(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.Label"));
		data.setTaskType(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.TaskType"));
		data.setAfterSize(_ctx.longValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.AfterSize"));
		data.setAppPackage(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.AppPackage"));
		data.setBeforeSize(_ctx.longValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.BeforeSize"));
		data.setVersionName(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.VersionName"));
		data.setVersionCode(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.VersionCode"));
		data.setBeforeMd5(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.BeforeMd5"));
		data.setId(_ctx.longValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.Id"));

		List<String> enhancedClasses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhancedClasses.Length"); i++) {
			enhancedClasses.add(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhancedClasses["+ i +"]"));
		}
		data.setEnhancedClasses(enhancedClasses);

		List<String> enhanceRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhanceRules.Length"); i++) {
			enhanceRules.add(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhanceRules["+ i +"]"));
		}
		data.setEnhanceRules(enhanceRules);

		List<String> assetsFileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.AssetsFileList.Length"); i++) {
			assetsFileList.add(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.AssetsFileList["+ i +"]"));
		}
		data.setAssetsFileList(assetsFileList);

		List<String> soFileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.SoFileList.Length"); i++) {
			soFileList.add(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.SoFileList["+ i +"]"));
		}
		data.setSoFileList(soFileList);

		List<String> enhancedAssetsFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhancedAssetsFiles.Length"); i++) {
			enhancedAssetsFiles.add(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhancedAssetsFiles["+ i +"]"));
		}
		data.setEnhancedAssetsFiles(enhancedAssetsFiles);

		List<String> enhancedSoFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhancedSoFiles.Length"); i++) {
			enhancedSoFiles.add(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhancedSoFiles["+ i +"]"));
		}
		data.setEnhancedSoFiles(enhancedSoFiles);

		List<EnhanceMappingItem> enhanceMapping = new ArrayList<EnhanceMappingItem>();
		for (int i = 0; i < _ctx.lengthValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhanceMapping.Length"); i++) {
			EnhanceMappingItem enhanceMappingItem = new EnhanceMappingItem();
			enhanceMappingItem.setType(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Type"));
			enhanceMappingItem.setReason(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Reason"));
			enhanceMappingItem.setInfo(_ctx.stringValue("StartUserAppAsyncEnhanceInMsaResponse.ResultContent.Data.EnhanceMapping["+ i +"].Info"));

			enhanceMapping.add(enhanceMappingItem);
		}
		data.setEnhanceMapping(enhanceMapping);
		resultContent.setData(data);
		startUserAppAsyncEnhanceInMsaResponse.setResultContent(resultContent);
	 
	 	return startUserAppAsyncEnhanceInMsaResponse;
	}
}