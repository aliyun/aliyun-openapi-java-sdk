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

import com.aliyuncs.cloudcallcenter.model.v20170705.UploadMediaResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.UploadMediaResponse.UploadParams;
import com.aliyuncs.cloudcallcenter.model.v20170705.UploadMediaResponse.UploadParams.Media;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadMediaResponseUnmarshaller {

	public static UploadMediaResponse unmarshall(UploadMediaResponse uploadMediaResponse, UnmarshallerContext context) {
		
		uploadMediaResponse.setRequestId(context.stringValue("UploadMediaResponse.RequestId"));
		uploadMediaResponse.setSuccess(context.booleanValue("UploadMediaResponse.Success"));
		uploadMediaResponse.setCode(context.stringValue("UploadMediaResponse.Code"));
		uploadMediaResponse.setMessage(context.stringValue("UploadMediaResponse.Message"));
		uploadMediaResponse.setHttpStatusCode(context.integerValue("UploadMediaResponse.HttpStatusCode"));

		UploadParams uploadParams = new UploadParams();
		uploadParams.setInstance(context.stringValue("UploadMediaResponse.UploadParams.Instance"));
		uploadParams.setName(context.stringValue("UploadMediaResponse.UploadParams.Name"));
		uploadParams.setFileName(context.stringValue("UploadMediaResponse.UploadParams.FileName"));
		uploadParams.setNeedsUpload(context.booleanValue("UploadMediaResponse.UploadParams.NeedsUpload"));
		uploadParams.setAccessId(context.stringValue("UploadMediaResponse.UploadParams.AccessId"));
		uploadParams.setPolicy(context.stringValue("UploadMediaResponse.UploadParams.Policy"));
		uploadParams.setSignature(context.stringValue("UploadMediaResponse.UploadParams.Signature"));
		uploadParams.setExpire(context.stringValue("UploadMediaResponse.UploadParams.Expire"));
		uploadParams.setCallback(context.stringValue("UploadMediaResponse.UploadParams.Callback"));
		uploadParams.setFolder(context.stringValue("UploadMediaResponse.UploadParams.Folder"));
		uploadParams.setHost(context.stringValue("UploadMediaResponse.UploadParams.Host"));

		Media media = new Media();
		media.setId(context.longValue("UploadMediaResponse.UploadParams.Media.Id"));
		media.setInstance(context.stringValue("UploadMediaResponse.UploadParams.Media.Instance"));
		media.setName(context.stringValue("UploadMediaResponse.UploadParams.Media.Name"));
		media.setDescription(context.stringValue("UploadMediaResponse.UploadParams.Media.Description"));
		media.setType(context.stringValue("UploadMediaResponse.UploadParams.Media.Type"));
		media.setContent(context.stringValue("UploadMediaResponse.UploadParams.Media.Content"));
		media.setFilePath(context.stringValue("UploadMediaResponse.UploadParams.Media.FilePath"));
		uploadParams.setMedia(media);
		uploadMediaResponse.setUploadParams(uploadParams);
	 
	 	return uploadMediaResponse;
	}
}