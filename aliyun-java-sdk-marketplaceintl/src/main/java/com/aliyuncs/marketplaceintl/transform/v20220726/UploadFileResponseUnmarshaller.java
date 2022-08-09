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

package com.aliyuncs.marketplaceintl.transform.v20220726;

import com.aliyuncs.marketplaceintl.model.v20220726.UploadFileResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.UploadFileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadFileResponseUnmarshaller {

	public static UploadFileResponse unmarshall(UploadFileResponse uploadFileResponse, UnmarshallerContext _ctx) {
		
		uploadFileResponse.setRequestId(_ctx.stringValue("UploadFileResponse.RequestId"));
		uploadFileResponse.setErrorCode(_ctx.stringValue("UploadFileResponse.ErrorCode"));
		uploadFileResponse.setCode(_ctx.integerValue("UploadFileResponse.Code"));
		uploadFileResponse.setMsg(_ctx.stringValue("UploadFileResponse.Msg"));
		uploadFileResponse.setSuccess(_ctx.booleanValue("UploadFileResponse.Success"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("UploadFileResponse.Data.Url"));
		data.setTrackId(_ctx.stringValue("UploadFileResponse.Data.TrackId"));
		uploadFileResponse.setData(data);
	 
	 	return uploadFileResponse;
	}
}