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

package com.aliyuncs.cloudphoto.transform.v20170711;

import com.aliyuncs.cloudphoto.model.v20170711.GetDownloadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDownloadUrlResponseUnmarshaller {

	public static GetDownloadUrlResponse unmarshall(GetDownloadUrlResponse getDownloadUrlResponse, UnmarshallerContext context) {
		
		getDownloadUrlResponse.setRequestId(context.stringValue("GetDownloadUrlResponse.RequestId"));
		getDownloadUrlResponse.setCode(context.stringValue("GetDownloadUrlResponse.Code"));
		getDownloadUrlResponse.setMessage(context.stringValue("GetDownloadUrlResponse.Message"));
		getDownloadUrlResponse.setDownloadUrl(context.stringValue("GetDownloadUrlResponse.DownloadUrl"));
		getDownloadUrlResponse.setAction(context.stringValue("GetDownloadUrlResponse.Action"));
	 
	 	return getDownloadUrlResponse;
	}
}