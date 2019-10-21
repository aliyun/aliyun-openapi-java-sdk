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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DownloadFabricOrganizationSDKResponse;
import com.aliyuncs.baas.model.v20181221.DownloadFabricOrganizationSDKResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadFabricOrganizationSDKResponseUnmarshaller {

	public static DownloadFabricOrganizationSDKResponse unmarshall(DownloadFabricOrganizationSDKResponse downloadFabricOrganizationSDKResponse, UnmarshallerContext _ctx) {
		
		downloadFabricOrganizationSDKResponse.setRequestId(_ctx.stringValue("DownloadFabricOrganizationSDKResponse.RequestId"));
		downloadFabricOrganizationSDKResponse.setSuccess(_ctx.booleanValue("DownloadFabricOrganizationSDKResponse.Success"));
		downloadFabricOrganizationSDKResponse.setErrorCode(_ctx.integerValue("DownloadFabricOrganizationSDKResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DownloadFabricOrganizationSDKResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setContent(_ctx.stringValue("DownloadFabricOrganizationSDKResponse.Result["+ i +"].Content"));
			resultItem.setPath(_ctx.stringValue("DownloadFabricOrganizationSDKResponse.Result["+ i +"].Path"));

			result.add(resultItem);
		}
		downloadFabricOrganizationSDKResponse.setResult(result);
	 
	 	return downloadFabricOrganizationSDKResponse;
	}
}