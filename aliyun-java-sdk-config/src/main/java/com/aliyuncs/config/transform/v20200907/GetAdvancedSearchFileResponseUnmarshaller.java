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

package com.aliyuncs.config.transform.v20200907;

import com.aliyuncs.config.model.v20200907.GetAdvancedSearchFileResponse;
import com.aliyuncs.config.model.v20200907.GetAdvancedSearchFileResponse.ResourceSearch;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdvancedSearchFileResponseUnmarshaller {

	public static GetAdvancedSearchFileResponse unmarshall(GetAdvancedSearchFileResponse getAdvancedSearchFileResponse, UnmarshallerContext _ctx) {
		
		getAdvancedSearchFileResponse.setRequestId(_ctx.stringValue("GetAdvancedSearchFileResponse.RequestId"));

		ResourceSearch resourceSearch = new ResourceSearch();
		resourceSearch.setDownloadUrl(_ctx.stringValue("GetAdvancedSearchFileResponse.ResourceSearch.DownloadUrl"));
		resourceSearch.setStatus(_ctx.stringValue("GetAdvancedSearchFileResponse.ResourceSearch.Status"));
		resourceSearch.setAccountId(_ctx.longValue("GetAdvancedSearchFileResponse.ResourceSearch.AccountId"));
		resourceSearch.setResourceInventoryGenerateTime(_ctx.longValue("GetAdvancedSearchFileResponse.ResourceSearch.ResourceInventoryGenerateTime"));
		getAdvancedSearchFileResponse.setResourceSearch(resourceSearch);
	 
	 	return getAdvancedSearchFileResponse;
	}
}