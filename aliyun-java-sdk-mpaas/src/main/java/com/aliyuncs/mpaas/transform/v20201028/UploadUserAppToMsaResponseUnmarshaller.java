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

import com.aliyuncs.mpaas.model.v20201028.UploadUserAppToMsaResponse;
import com.aliyuncs.mpaas.model.v20201028.UploadUserAppToMsaResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.UploadUserAppToMsaResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo;
import com.aliyuncs.mpaas.model.v20201028.UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.EnhanceMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadUserAppToMsaResponseUnmarshaller {

	public static UploadUserAppToMsaResponse unmarshall(UploadUserAppToMsaResponse uploadUserAppToMsaResponse, UnmarshallerContext _ctx) {
		
		uploadUserAppToMsaResponse.setRequestId(_ctx.stringValue("UploadUserAppToMsaResponse.RequestId"));
		uploadUserAppToMsaResponse.setResultCode(_ctx.stringValue("UploadUserAppToMsaResponse.ResultCode"));
		uploadUserAppToMsaResponse.setResultMessage(_ctx.stringValue("UploadUserAppToMsaResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("UploadUserAppToMsaResponse.ResultContent.Success"));
		resultContent.setExtra(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Extra"));

		Data data = new Data();
		data.setEnhanceTaskId(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.EnhanceTaskId"));
		data.setId(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.Id"));
		data.setProgress(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.Progress"));
		data.setStatus(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.Status"));

		ApkInfo apkInfo = new ApkInfo();
		apkInfo.setAfterMd5(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.AfterMd5"));
		apkInfo.setAfterSize(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.AfterSize"));
		apkInfo.setAppCode(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.AppCode"));
		apkInfo.setAppPackage(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.AppPackage"));
		apkInfo.setBeforeMd5(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.BeforeMd5"));
		apkInfo.setBeforeSize(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.BeforeSize"));
		apkInfo.setClassForest(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.ClassForest"));
		apkInfo.setId(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.Id"));
		apkInfo.setLabel(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.Label"));
		apkInfo.setProgress(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.Progress"));
		apkInfo.setStatus(_ctx.longValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.Status"));
		apkInfo.setTaskType(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.TaskType"));
		apkInfo.setVersionCode(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.VersionCode"));
		apkInfo.setVersionName(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.VersionName"));

		List<String> enhancedClasses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.EnhancedClasses.Length"); i++) {
			enhancedClasses.add(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.EnhancedClasses["+ i +"]"));
		}
		apkInfo.setEnhancedClasses(enhancedClasses);

		List<String> enhanceRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.EnhanceRules.Length"); i++) {
			enhanceRules.add(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.EnhanceRules["+ i +"]"));
		}
		apkInfo.setEnhanceRules(enhanceRules);

		EnhanceMapping enhanceMapping = new EnhanceMapping();
		enhanceMapping.setInfo(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.EnhanceMapping.Info"));
		enhanceMapping.setReason(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.EnhanceMapping.Reason"));
		enhanceMapping.setType(_ctx.stringValue("UploadUserAppToMsaResponse.ResultContent.Data.ApkInfo.EnhanceMapping.Type"));
		apkInfo.setEnhanceMapping(enhanceMapping);
		data.setApkInfo(apkInfo);
		resultContent.setData(data);
		uploadUserAppToMsaResponse.setResultContent(resultContent);
	 
	 	return uploadUserAppToMsaResponse;
	}
}