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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.UploadOssFileResponse;
import com.aliyuncs.pts.model.v20190810.UploadOssFileResponse.UploadedResult;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadOssFileResponseUnmarshaller {

	public static UploadOssFileResponse unmarshall(UploadOssFileResponse uploadOssFileResponse, UnmarshallerContext _ctx) {
		
		uploadOssFileResponse.setRequestId(_ctx.stringValue("UploadOssFileResponse.RequestId"));
		uploadOssFileResponse.setMessage(_ctx.stringValue("UploadOssFileResponse.Message"));
		uploadOssFileResponse.setCode(_ctx.stringValue("UploadOssFileResponse.Code"));
		uploadOssFileResponse.setSuccess(_ctx.booleanValue("UploadOssFileResponse.Success"));
		uploadOssFileResponse.setHttpStatusCode(_ctx.integerValue("UploadOssFileResponse.HttpStatusCode"));
		uploadOssFileResponse.setMd5(_ctx.stringValue("UploadOssFileResponse.Md5"));

		UploadedResult uploadedResult = new UploadedResult();
		uploadedResult.setFileType(_ctx.stringValue("UploadOssFileResponse.UploadedResult.FileType"));
		uploadedResult.setUri(_ctx.stringValue("UploadOssFileResponse.UploadedResult.Uri"));
		uploadedResult.setMd5(_ctx.stringValue("UploadOssFileResponse.UploadedResult.Md5"));
		uploadedResult.setFileTags(_ctx.mapValue("UploadOssFileResponse.UploadedResult.FileTags"));
		uploadOssFileResponse.setUploadedResult(uploadedResult);
	 
	 	return uploadOssFileResponse;
	}
}