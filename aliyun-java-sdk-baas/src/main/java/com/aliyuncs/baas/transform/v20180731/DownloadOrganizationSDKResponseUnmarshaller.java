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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DownloadOrganizationSDKResponse;
import com.aliyuncs.baas.model.v20180731.DownloadOrganizationSDKResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadOrganizationSDKResponseUnmarshaller {

	public static DownloadOrganizationSDKResponse unmarshall(DownloadOrganizationSDKResponse downloadOrganizationSDKResponse, UnmarshallerContext context) {
		
		downloadOrganizationSDKResponse.setRequestId(context.stringValue("DownloadOrganizationSDKResponse.RequestId"));
		downloadOrganizationSDKResponse.setSuccess(context.booleanValue("DownloadOrganizationSDKResponse.Success"));
		downloadOrganizationSDKResponse.setErrorCode(context.integerValue("DownloadOrganizationSDKResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DownloadOrganizationSDKResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setContent(context.stringValue("DownloadOrganizationSDKResponse.Result["+ i +"].Content"));
			resultItem.setPath(context.stringValue("DownloadOrganizationSDKResponse.Result["+ i +"].Path"));

			result.add(resultItem);
		}
		downloadOrganizationSDKResponse.setResult(result);
	 
	 	return downloadOrganizationSDKResponse;
	}
}