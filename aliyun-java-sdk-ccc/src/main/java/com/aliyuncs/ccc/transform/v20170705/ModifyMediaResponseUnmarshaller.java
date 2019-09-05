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

	public static ModifyMediaResponse unmarshall(ModifyMediaResponse modifyMediaResponse, UnmarshallerContext _ctx) {
		
		modifyMediaResponse.setRequestId(_ctx.stringValue("ModifyMediaResponse.RequestId"));
		modifyMediaResponse.setSuccess(_ctx.booleanValue("ModifyMediaResponse.Success"));
		modifyMediaResponse.setCode(_ctx.stringValue("ModifyMediaResponse.Code"));
		modifyMediaResponse.setMessage(_ctx.stringValue("ModifyMediaResponse.Message"));
		modifyMediaResponse.setHttpStatusCode(_ctx.integerValue("ModifyMediaResponse.HttpStatusCode"));

		MediaUploadParam mediaUploadParam = new MediaUploadParam();
		mediaUploadParam.setInstance(_ctx.stringValue("ModifyMediaResponse.MediaUploadParam.Instance"));
		mediaUploadParam.setName(_ctx.stringValue("ModifyMediaResponse.MediaUploadParam.Name"));
		mediaUploadParam.setFileName(_ctx.stringValue("ModifyMediaResponse.MediaUploadParam.FileName"));
		mediaUploadParam.setOssFileName(_ctx.stringValue("ModifyMediaResponse.MediaUploadParam.OssFileName"));
		mediaUploadParam.setOssFilePath(_ctx.stringValue("ModifyMediaResponse.MediaUploadParam.OssFilePath"));
		modifyMediaResponse.setMediaUploadParam(mediaUploadParam);
	 
	 	return modifyMediaResponse;
	}
}