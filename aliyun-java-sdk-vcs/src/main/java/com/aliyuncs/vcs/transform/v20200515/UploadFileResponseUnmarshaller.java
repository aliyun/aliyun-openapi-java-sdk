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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.UploadFileResponse;
import com.aliyuncs.vcs.model.v20200515.UploadFileResponse.Data;
import com.aliyuncs.vcs.model.v20200515.UploadFileResponse.Data.OssPath;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadFileResponseUnmarshaller {

	public static UploadFileResponse unmarshall(UploadFileResponse uploadFileResponse, UnmarshallerContext _ctx) {
		
		uploadFileResponse.setRequestId(_ctx.stringValue("UploadFileResponse.RequestId"));
		uploadFileResponse.setMessage(_ctx.stringValue("UploadFileResponse.Message"));
		uploadFileResponse.setCode(_ctx.stringValue("UploadFileResponse.Code"));

		Data data = new Data();

		List<OssPath> records = new ArrayList<OssPath>();
		for (int i = 0; i < _ctx.lengthValue("UploadFileResponse.Data.Records.Length"); i++) {
			OssPath ossPath = new OssPath();
			ossPath.setSourceId(_ctx.stringValue("UploadFileResponse.Data.Records["+ i +"].SourceId"));
			ossPath.setOssPath(_ctx.stringValue("UploadFileResponse.Data.Records["+ i +"].OssPath"));

			records.add(ossPath);
		}
		data.setRecords(records);
		uploadFileResponse.setData(data);
	 
	 	return uploadFileResponse;
	}
}