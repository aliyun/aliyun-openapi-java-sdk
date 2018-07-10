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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.DownloadUnreachableContactsResponse;
import com.aliyuncs.ccc.model.v20170705.DownloadUnreachableContactsResponse.DownloadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadUnreachableContactsResponseUnmarshaller {

	public static DownloadUnreachableContactsResponse unmarshall(DownloadUnreachableContactsResponse downloadUnreachableContactsResponse, UnmarshallerContext context) {
		
		downloadUnreachableContactsResponse.setRequestId(context.stringValue("DownloadUnreachableContactsResponse.RequestId"));
		downloadUnreachableContactsResponse.setSuccess(context.booleanValue("DownloadUnreachableContactsResponse.Success"));
		downloadUnreachableContactsResponse.setCode(context.stringValue("DownloadUnreachableContactsResponse.Code"));
		downloadUnreachableContactsResponse.setMessage(context.stringValue("DownloadUnreachableContactsResponse.Message"));
		downloadUnreachableContactsResponse.setHttpStatusCode(context.integerValue("DownloadUnreachableContactsResponse.HttpStatusCode"));

		DownloadParams downloadParams = new DownloadParams();
		downloadParams.setSignatureUrl(context.stringValue("DownloadUnreachableContactsResponse.DownloadParams.SignatureUrl"));
		downloadUnreachableContactsResponse.setDownloadParams(downloadParams);
	 
	 	return downloadUnreachableContactsResponse;
	}
}