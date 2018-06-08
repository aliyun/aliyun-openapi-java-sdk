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

package com.aliyuncs.scdn.transform.v20171115;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnRefreshQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnRefreshQuotaResponseUnmarshaller {

	public static DescribeScdnRefreshQuotaResponse unmarshall(DescribeScdnRefreshQuotaResponse describeScdnRefreshQuotaResponse, UnmarshallerContext context) {
		
		describeScdnRefreshQuotaResponse.setRequestId(context.stringValue("DescribeScdnRefreshQuotaResponse.RequestId"));
		describeScdnRefreshQuotaResponse.setUrlQuota(context.stringValue("DescribeScdnRefreshQuotaResponse.UrlQuota"));
		describeScdnRefreshQuotaResponse.setDirQuota(context.stringValue("DescribeScdnRefreshQuotaResponse.DirQuota"));
		describeScdnRefreshQuotaResponse.setUrlRemain(context.stringValue("DescribeScdnRefreshQuotaResponse.UrlRemain"));
		describeScdnRefreshQuotaResponse.setDirRemain(context.stringValue("DescribeScdnRefreshQuotaResponse.DirRemain"));
		describeScdnRefreshQuotaResponse.setPreloadQuota(context.stringValue("DescribeScdnRefreshQuotaResponse.PreloadQuota"));
		describeScdnRefreshQuotaResponse.setBlockQuota(context.stringValue("DescribeScdnRefreshQuotaResponse.BlockQuota"));
		describeScdnRefreshQuotaResponse.setPreloadRemain(context.stringValue("DescribeScdnRefreshQuotaResponse.PreloadRemain"));
		describeScdnRefreshQuotaResponse.setBlockRemain(context.stringValue("DescribeScdnRefreshQuotaResponse.blockRemain"));
	 
	 	return describeScdnRefreshQuotaResponse;
	}
}