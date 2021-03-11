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

	public static CreateMediaResponse unmarshall(CreateMediaResponse createMediaResponse, UnmarshallerContext _ctx) {
		
		createMediaResponse.setRequestId(_ctx.stringValue("CreateMediaResponse.RequestId"));
		createMediaResponse.setSuccess(_ctx.booleanValue("CreateMediaResponse.Success"));
		createMediaResponse.setCode(_ctx.stringValue("CreateMediaResponse.Code"));
		createMediaResponse.setMessage(_ctx.stringValue("CreateMediaResponse.Message"));
		createMediaResponse.setHttpStatusCode(_ctx.integerValue("CreateMediaResponse.HttpStatusCode"));

		MediaUploadParam mediaUploadParam = new MediaUploadParam();
		mediaUploadParam.setId(_ctx.stringValue("CreateMediaResponse.MediaUploadParam.Id"));
		mediaUploadParam.setInstance(_ctx.stringValue("CreateMediaResponse.MediaUploadParam.Instance"));
		mediaUploadParam.setName(_ctx.stringValue("CreateMediaResponse.MediaUploadParam.Name"));
		mediaUploadParam.setFileName(_ctx.stringValue("CreateMediaResponse.MediaUploadParam.FileName"));
		mediaUploadParam.setOssFileName(_ctx.stringValue("CreateMediaResponse.MediaUploadParam.OssFileName"));
		mediaUploadParam.setOssFilePath(_ctx.stringValue("CreateMediaResponse.MediaUploadParam.OssFilePath"));
		createMediaResponse.setMediaUploadParam(mediaUploadParam);
	 
	 	return createMediaResponse;
	}
}