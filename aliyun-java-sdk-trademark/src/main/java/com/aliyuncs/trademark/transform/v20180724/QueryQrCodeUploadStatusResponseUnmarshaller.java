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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.QueryQrCodeUploadStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryQrCodeUploadStatusResponseUnmarshaller {

	public static QueryQrCodeUploadStatusResponse unmarshall(QueryQrCodeUploadStatusResponse queryQrCodeUploadStatusResponse, UnmarshallerContext _ctx) {
		
		queryQrCodeUploadStatusResponse.setRequestId(_ctx.stringValue("QueryQrCodeUploadStatusResponse.RequestId"));
		queryQrCodeUploadStatusResponse.setOssKey(_ctx.stringValue("QueryQrCodeUploadStatusResponse.OssKey"));
		queryQrCodeUploadStatusResponse.setOssUrl(_ctx.stringValue("QueryQrCodeUploadStatusResponse.OssUrl"));
		queryQrCodeUploadStatusResponse.setStatus(_ctx.integerValue("QueryQrCodeUploadStatusResponse.Status"));
		queryQrCodeUploadStatusResponse.setSuccess(_ctx.booleanValue("QueryQrCodeUploadStatusResponse.Success"));
	 
	 	return queryQrCodeUploadStatusResponse;
	}
}