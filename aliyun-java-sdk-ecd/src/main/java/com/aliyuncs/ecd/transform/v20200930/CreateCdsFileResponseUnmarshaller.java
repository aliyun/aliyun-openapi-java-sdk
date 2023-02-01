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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.CreateCdsFileResponse;
import com.aliyuncs.ecd.model.v20200930.CreateCdsFileResponse.FileModel;
import com.aliyuncs.ecd.model.v20200930.CreateCdsFileResponse.FileModel.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCdsFileResponseUnmarshaller {

	public static CreateCdsFileResponse unmarshall(CreateCdsFileResponse createCdsFileResponse, UnmarshallerContext _ctx) {
		
		createCdsFileResponse.setRequestId(_ctx.stringValue("CreateCdsFileResponse.RequestId"));

		List<FileModel> fileModels = new ArrayList<FileModel>();
		for (int i = 0; i < _ctx.lengthValue("CreateCdsFileResponse.FileModels.Length"); i++) {
			FileModel fileModel = new FileModel();
			fileModel.setUploadId(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].UploadId"));
			fileModel.setUploadUrl(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].UploadUrl"));
			fileModel.setAccessKeyId(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].AccessKeyId"));
			fileModel.setFileId(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].FileId"));
			fileModel.setUploadType(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].UploadType"));
			fileModel.setExpirationSeconds(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].ExpirationSeconds"));
			fileModel.setAccessTokenExpirationMillis(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].AccessTokenExpirationMillis"));
			fileModel.setAccessKeySecret(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].AccessKeySecret"));
			fileModel.setResourceUrl(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].ResourceUrl"));
			fileModel.setEndPoint(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].EndPoint"));
			fileModel.setAccessToken(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].AccessToken"));
			fileModel.setBucket(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].Bucket"));

			List<Info> headerInfo = new ArrayList<Info>();
			for (int j = 0; j < _ctx.lengthValue("CreateCdsFileResponse.FileModels["+ i +"].HeaderInfo.Length"); j++) {
				Info info = new Info();
				info.setDate(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].HeaderInfo["+ j +"].Date"));
				info.setAuthorization(_ctx.stringValue("CreateCdsFileResponse.FileModels["+ i +"].HeaderInfo["+ j +"].Authorization"));

				headerInfo.add(info);
			}
			fileModel.setHeaderInfo(headerInfo);

			fileModels.add(fileModel);
		}
		createCdsFileResponse.setFileModels(fileModels);
	 
	 	return createCdsFileResponse;
	}
}