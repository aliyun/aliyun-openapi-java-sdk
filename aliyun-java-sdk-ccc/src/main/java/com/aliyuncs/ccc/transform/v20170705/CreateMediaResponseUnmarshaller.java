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

import com.aliyuncs.ccc.model.v20170705.CreateMediaResponse;
import com.aliyuncs.ccc.model.v20170705.CreateMediaResponse.MediaUploadParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMediaResponseUnmarshaller {

	public static CreateMediaResponse unmarshall(CreateMediaResponse createMediaResponse, UnmarshallerContext context) {
		
		createMediaResponse.setRequestId(context.stringValue("CreateMediaResponse.RequestId"));
		createMediaResponse.setSuccess(context.booleanValue("CreateMediaResponse.Success"));
		createMediaResponse.setCode(context.stringValue("CreateMediaResponse.Code"));
		createMediaResponse.setMessage(context.stringValue("CreateMediaResponse.Message"));
		createMediaResponse.setHttpStatusCode(context.integerValue("CreateMediaResponse.HttpStatusCode"));

		MediaUploadParam mediaUploadParam = new MediaUploadParam();
		mediaUploadParam.setId(context.stringValue("CreateMediaResponse.MediaUploadParam.Id"));
		mediaUploadParam.setInstance(context.stringValue("CreateMediaResponse.MediaUploadParam.Instance"));
		mediaUploadParam.setName(context.stringValue("CreateMediaResponse.MediaUploadParam.Name"));
		mediaUploadParam.setFileName(context.stringValue("CreateMediaResponse.MediaUploadParam.FileName"));
		mediaUploadParam.setOssFileName(context.stringValue("CreateMediaResponse.MediaUploadParam.OssFileName"));
		mediaUploadParam.setOssFilePath(context.stringValue("CreateMediaResponse.MediaUploadParam.OssFilePath"));
		createMediaResponse.setMediaUploadParam(mediaUploadParam);
	 
	 	return createMediaResponse;
	}
}