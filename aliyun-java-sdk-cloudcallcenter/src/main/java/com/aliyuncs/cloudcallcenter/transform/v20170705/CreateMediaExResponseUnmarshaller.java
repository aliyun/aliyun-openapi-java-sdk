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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateMediaExResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateMediaExResponse.MediaUploadParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMediaExResponseUnmarshaller {

	public static CreateMediaExResponse unmarshall(CreateMediaExResponse createMediaExResponse, UnmarshallerContext context) {
		
		createMediaExResponse.setRequestId(context.stringValue("CreateMediaExResponse.RequestId"));
		createMediaExResponse.setSuccess(context.booleanValue("CreateMediaExResponse.Success"));
		createMediaExResponse.setCode(context.stringValue("CreateMediaExResponse.Code"));
		createMediaExResponse.setMessage(context.stringValue("CreateMediaExResponse.Message"));
		createMediaExResponse.setHttpStatusCode(context.integerValue("CreateMediaExResponse.HttpStatusCode"));

		MediaUploadParam mediaUploadParam = new MediaUploadParam();
		mediaUploadParam.setId(context.stringValue("CreateMediaExResponse.MediaUploadParam.Id"));
		mediaUploadParam.setInstance(context.stringValue("CreateMediaExResponse.MediaUploadParam.Instance"));
		mediaUploadParam.setName(context.stringValue("CreateMediaExResponse.MediaUploadParam.Name"));
		mediaUploadParam.setFileName(context.stringValue("CreateMediaExResponse.MediaUploadParam.FileName"));
		mediaUploadParam.setOssFileName(context.stringValue("CreateMediaExResponse.MediaUploadParam.OssFileName"));
		mediaUploadParam.setOssFilePath(context.stringValue("CreateMediaExResponse.MediaUploadParam.OssFilePath"));
		createMediaExResponse.setMediaUploadParam(mediaUploadParam);
	 
	 	return createMediaExResponse;
	}
}