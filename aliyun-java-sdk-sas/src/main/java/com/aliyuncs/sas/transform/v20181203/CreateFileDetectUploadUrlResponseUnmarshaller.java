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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.CreateFileDetectUploadUrlResponse;
import com.aliyuncs.sas.model.v20181203.CreateFileDetectUploadUrlResponse.UploadUrList;
import com.aliyuncs.sas.model.v20181203.CreateFileDetectUploadUrlResponse.UploadUrList.Context;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFileDetectUploadUrlResponseUnmarshaller {

	public static CreateFileDetectUploadUrlResponse unmarshall(CreateFileDetectUploadUrlResponse createFileDetectUploadUrlResponse, UnmarshallerContext _ctx) {
		
		createFileDetectUploadUrlResponse.setRequestId(_ctx.stringValue("CreateFileDetectUploadUrlResponse.RequestId"));

		List<UploadUrList> uploadUrlList = new ArrayList<UploadUrList>();
		for (int i = 0; i < _ctx.lengthValue("CreateFileDetectUploadUrlResponse.UploadUrlList.Length"); i++) {
			UploadUrList uploadUrList = new UploadUrList();
			uploadUrList.setPublicUrl(_ctx.stringValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].PublicUrl"));
			uploadUrList.setInternalUrl(_ctx.stringValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].InternalUrl"));
			uploadUrList.setExpire(_ctx.stringValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].Expire"));
			uploadUrList.setFileExist(_ctx.booleanValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].FileExist"));
			uploadUrList.setHashKey(_ctx.stringValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].HashKey"));

			Context context = new Context();
			context.setAccessId(_ctx.stringValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].Context.AccessId"));
			context.setPolicy(_ctx.stringValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].Context.Policy"));
			context.setSignature(_ctx.stringValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].Context.Signature"));
			context.setOssKey(_ctx.stringValue("CreateFileDetectUploadUrlResponse.UploadUrlList["+ i +"].Context.OssKey"));
			uploadUrList.setContext(context);

			uploadUrlList.add(uploadUrList);
		}
		createFileDetectUploadUrlResponse.setUploadUrlList(uploadUrlList);
	 
	 	return createFileDetectUploadUrlResponse;
	}
}