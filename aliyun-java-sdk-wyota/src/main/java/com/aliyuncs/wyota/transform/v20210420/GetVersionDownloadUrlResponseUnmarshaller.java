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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.GetVersionDownloadUrlResponse;
import com.aliyuncs.wyota.model.v20210420.GetVersionDownloadUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVersionDownloadUrlResponseUnmarshaller {

	public static GetVersionDownloadUrlResponse unmarshall(GetVersionDownloadUrlResponse getVersionDownloadUrlResponse, UnmarshallerContext _ctx) {
		
		getVersionDownloadUrlResponse.setRequestId(_ctx.stringValue("GetVersionDownloadUrlResponse.RequestId"));
		getVersionDownloadUrlResponse.setCode(_ctx.stringValue("GetVersionDownloadUrlResponse.Code"));
		getVersionDownloadUrlResponse.setMessage(_ctx.stringValue("GetVersionDownloadUrlResponse.Message"));

		Data data = new Data();
		data.setFullDownloadUrl(_ctx.stringValue("GetVersionDownloadUrlResponse.Data.FullDownloadUrl"));
		getVersionDownloadUrlResponse.setData(data);
	 
	 	return getVersionDownloadUrlResponse;
	}
}