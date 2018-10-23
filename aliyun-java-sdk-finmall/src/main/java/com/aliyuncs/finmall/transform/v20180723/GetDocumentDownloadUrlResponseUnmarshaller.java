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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.GetDocumentDownloadUrlResponse;
import com.aliyuncs.finmall.model.v20180723.GetDocumentDownloadUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDocumentDownloadUrlResponseUnmarshaller {

	public static GetDocumentDownloadUrlResponse unmarshall(GetDocumentDownloadUrlResponse getDocumentDownloadUrlResponse, UnmarshallerContext context) {
		
		getDocumentDownloadUrlResponse.setRequestId(context.stringValue("GetDocumentDownloadUrlResponse.RequestId"));
		getDocumentDownloadUrlResponse.setCode(context.stringValue("GetDocumentDownloadUrlResponse.Code"));
		getDocumentDownloadUrlResponse.setMessage(context.stringValue("GetDocumentDownloadUrlResponse.Message"));

		Data data = new Data();
		data.setDownloadUrl(context.stringValue("GetDocumentDownloadUrlResponse.Data.DownloadUrl"));
		data.setViewUrl(context.stringValue("GetDocumentDownloadUrlResponse.Data.ViewUrl"));
		getDocumentDownloadUrlResponse.setData(data);
	 
	 	return getDocumentDownloadUrlResponse;
	}
}