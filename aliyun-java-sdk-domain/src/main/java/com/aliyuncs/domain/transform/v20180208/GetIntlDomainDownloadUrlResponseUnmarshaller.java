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

package com.aliyuncs.domain.transform.v20180208;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180208.GetIntlDomainDownloadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIntlDomainDownloadUrlResponseUnmarshaller {

	public static GetIntlDomainDownloadUrlResponse unmarshall(GetIntlDomainDownloadUrlResponse getIntlDomainDownloadUrlResponse, UnmarshallerContext _ctx) {
		
		getIntlDomainDownloadUrlResponse.setRequestId(_ctx.stringValue("GetIntlDomainDownloadUrlResponse.RequestId"));
		getIntlDomainDownloadUrlResponse.setHttpStatusCode(_ctx.integerValue("GetIntlDomainDownloadUrlResponse.HttpStatusCode"));
		getIntlDomainDownloadUrlResponse.setDynamicCode(_ctx.stringValue("GetIntlDomainDownloadUrlResponse.DynamicCode"));
		getIntlDomainDownloadUrlResponse.setDynamicMessage(_ctx.stringValue("GetIntlDomainDownloadUrlResponse.DynamicMessage"));
		getIntlDomainDownloadUrlResponse.setErrorMsg(_ctx.stringValue("GetIntlDomainDownloadUrlResponse.ErrorMsg"));
		getIntlDomainDownloadUrlResponse.setErrorCode(_ctx.stringValue("GetIntlDomainDownloadUrlResponse.ErrorCode"));
		getIntlDomainDownloadUrlResponse.setSuccess(_ctx.booleanValue("GetIntlDomainDownloadUrlResponse.Success"));
		getIntlDomainDownloadUrlResponse.setAllowRetry(_ctx.booleanValue("GetIntlDomainDownloadUrlResponse.AllowRetry"));
		getIntlDomainDownloadUrlResponse.setAppName(_ctx.stringValue("GetIntlDomainDownloadUrlResponse.AppName"));
		getIntlDomainDownloadUrlResponse.setUrl(_ctx.stringValue("GetIntlDomainDownloadUrlResponse.Url"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIntlDomainDownloadUrlResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetIntlDomainDownloadUrlResponse.ErrorArgs["+ i +"]"));
		}
		getIntlDomainDownloadUrlResponse.setErrorArgs(errorArgs);
	 
	 	return getIntlDomainDownloadUrlResponse;
	}
}