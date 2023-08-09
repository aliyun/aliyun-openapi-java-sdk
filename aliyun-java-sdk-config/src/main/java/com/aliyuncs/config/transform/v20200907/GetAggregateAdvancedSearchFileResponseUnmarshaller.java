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

import com.aliyuncs.config.model.v20200907.GetAggregateAdvancedSearchFileResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateAdvancedSearchFileResponse.ResourceSearch;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateAdvancedSearchFileResponseUnmarshaller {

	public static GetAggregateAdvancedSearchFileResponse unmarshall(GetAggregateAdvancedSearchFileResponse getAggregateAdvancedSearchFileResponse, UnmarshallerContext _ctx) {
		
		getAggregateAdvancedSearchFileResponse.setRequestId(_ctx.stringValue("GetAggregateAdvancedSearchFileResponse.RequestId"));

		ResourceSearch resourceSearch = new ResourceSearch();
		resourceSearch.setDownloadUrl(_ctx.stringValue("GetAggregateAdvancedSearchFileResponse.ResourceSearch.DownloadUrl"));
		resourceSearch.setStatus(_ctx.stringValue("GetAggregateAdvancedSearchFileResponse.ResourceSearch.Status"));
		resourceSearch.setAccountId(_ctx.longValue("GetAggregateAdvancedSearchFileResponse.ResourceSearch.AccountId"));
		resourceSearch.setResourceInventoryGenerateTime(_ctx.longValue("GetAggregateAdvancedSearchFileResponse.ResourceSearch.ResourceInventoryGenerateTime"));
		getAggregateAdvancedSearchFileResponse.setResourceSearch(resourceSearch);
	 
	 	return getAggregateAdvancedSearchFileResponse;
	}
}