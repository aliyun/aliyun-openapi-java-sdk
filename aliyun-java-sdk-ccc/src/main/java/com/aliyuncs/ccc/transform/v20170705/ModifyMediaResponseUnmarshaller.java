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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.ModifyMediaResponse;
import com.aliyuncs.ccc.model.v20170705.ModifyMediaResponse.MediaUploadParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMediaResponseUnmarshaller {

	public static ModifyMediaResponse unmarshall(ModifyMediaResponse modifyMediaResponse, UnmarshallerContext context) {
		
		modifyMediaResponse.setRequestId(context.stringValue("ModifyMediaResponse.RequestId"));
		modifyMediaResponse.setSuccess(context.booleanValue("ModifyMediaResponse.Success"));
		modifyMediaResponse.setCode(context.stringValue("ModifyMediaResponse.Code"));
		modifyMediaResponse.setMessage(context.stringValue("ModifyMediaResponse.Message"));
		modifyMediaResponse.setHttpStatusCode(context.integerValue("ModifyMediaResponse.HttpStatusCode"));

		MediaUploadParam mediaUploadParam = new MediaUploadParam();
		mediaUploadParam.setInstance(context.stringValue("ModifyMediaResponse.MediaUploadParam.Instance"));
		mediaUploadParam.setName(context.stringValue("ModifyMediaResponse.MediaUploadParam.Name"));
		mediaUploadParam.setFileName(context.stringValue("ModifyMediaResponse.MediaUploadParam.FileName"));
		mediaUploadParam.setOssFileName(context.stringValue("ModifyMediaResponse.MediaUploadParam.OssFileName"));
		mediaUploadParam.setOssFilePath(context.stringValue("ModifyMediaResponse.MediaUploadParam.OssFilePath"));
		modifyMediaResponse.setMediaUploadParam(mediaUploadParam);
	 
	 	return modifyMediaResponse;
	}
}