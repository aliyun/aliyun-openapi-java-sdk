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

import com.aliyuncs.mpaas.model.v20201028.GetUserAppUploadProcessInMsaResponse;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppUploadProcessInMsaResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppUploadProcessInMsaResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhanceMappingItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserAppUploadProcessInMsaResponseUnmarshaller {

	public static GetUserAppUploadProcessInMsaResponse unmarshall(GetUserAppUploadProcessInMsaResponse getUserAppUploadProcessInMsaResponse, UnmarshallerContext _ctx) {
		
		getUserAppUploadProcessInMsaResponse.setRequestId(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.RequestId"));
		getUserAppUploadProcessInMsaResponse.setResultMessage(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultMessage"));
		getUserAppUploadProcessInMsaResponse.setResultCode(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Success"));

		Data data = new Data();
		data.setStatus(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.Status"));
		data.setProgress(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.Progress"));
		data.setEnhanceTaskId(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.EnhanceTaskId"));
		data.setId(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.Id"));

		ApkInfo apkInfo = new ApkInfo();
		apkInfo.setStatus(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.Status"));
		apkInfo.setProgress(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.Progress"));
		apkInfo.setAppCode(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.AppCode"));
		apkInfo.setClassForest(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.ClassForest"));
		apkInfo.setAfterMd5(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.AfterMd5"));
		apkInfo.setLabel(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.Label"));
		apkInfo.setTaskType(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.TaskType"));
		apkInfo.setAfterSize(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.AfterSize"));
		apkInfo.setAppPackage(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.AppPackage"));
		apkInfo.setBeforeSize(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.BeforeSize"));
		apkInfo.setVersionName(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.VersionName"));
		apkInfo.setVersionCode(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.VersionCode"));
		apkInfo.setBeforeMd5(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.BeforeMd5"));
		apkInfo.setId(_ctx.longValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.Id"));

		List<String> enhancedClasses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhancedClasses.Length"); i++) {
			enhancedClasses.add(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhancedClasses["+ i +"]"));
		}
		apkInfo.setEnhancedClasses(enhancedClasses);

		List<String> enhanceRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhanceRules.Length"); i++) {
			enhanceRules.add(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhanceRules["+ i +"]"));
		}
		apkInfo.setEnhanceRules(enhanceRules);

		List<String> assetsFileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.AssetsFileList.Length"); i++) {
			assetsFileList.add(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.AssetsFileList["+ i +"]"));
		}
		apkInfo.setAssetsFileList(assetsFileList);

		List<String> soFileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.SoFileList.Length"); i++) {
			soFileList.add(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.SoFileList["+ i +"]"));
		}
		apkInfo.setSoFileList(soFileList);

		List<String> enhancedSoFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhancedSoFiles.Length"); i++) {
			enhancedSoFiles.add(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhancedSoFiles["+ i +"]"));
		}
		apkInfo.setEnhancedSoFiles(enhancedSoFiles);

		List<String> enhancedAssetsFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhancedAssetsFiles.Length"); i++) {
			enhancedAssetsFiles.add(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhancedAssetsFiles["+ i +"]"));
		}
		apkInfo.setEnhancedAssetsFiles(enhancedAssetsFiles);

		List<EnhanceMappingItem> enhanceMapping = new ArrayList<EnhanceMappingItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhanceMapping.Length"); i++) {
			EnhanceMappingItem enhanceMappingItem = new EnhanceMappingItem();
			enhanceMappingItem.setType(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhanceMapping["+ i +"].Type"));
			enhanceMappingItem.setReason(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhanceMapping["+ i +"].Reason"));
			enhanceMappingItem.setInfo(_ctx.stringValue("GetUserAppUploadProcessInMsaResponse.ResultContent.Data.ApkInfo.EnhanceMapping["+ i +"].Info"));

			enhanceMapping.add(enhanceMappingItem);
		}
		apkInfo.setEnhanceMapping(enhanceMapping);
		data.setApkInfo(apkInfo);
		resultContent.setData(data);
		getUserAppUploadProcessInMsaResponse.setResultContent(resultContent);
	 
	 	return getUserAppUploadProcessInMsaResponse;
	}
}