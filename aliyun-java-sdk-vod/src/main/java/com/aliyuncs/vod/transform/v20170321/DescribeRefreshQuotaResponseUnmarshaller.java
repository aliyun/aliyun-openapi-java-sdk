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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.DescribeRefreshQuotaResponse;
import com.aliyuncs.vod.model.v20170321.DescribeRefreshQuotaResponse.RefreshCacheQuota;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRefreshQuotaResponseUnmarshaller {

	public static DescribeRefreshQuotaResponse unmarshall(DescribeRefreshQuotaResponse describeRefreshQuotaResponse, UnmarshallerContext context) {
		
		describeRefreshQuotaResponse.setRequestId(context.stringValue("DescribeRefreshQuotaResponse.RequestId"));

		RefreshCacheQuota refreshCacheQuota = new RefreshCacheQuota();
		refreshCacheQuota.setUrlQuota(context.stringValue("DescribeRefreshQuotaResponse.RefreshCacheQuota.UrlQuota"));
		refreshCacheQuota.setDirQuota(context.stringValue("DescribeRefreshQuotaResponse.RefreshCacheQuota.DirQuota"));
		refreshCacheQuota.setUrlRemain(context.stringValue("DescribeRefreshQuotaResponse.RefreshCacheQuota.UrlRemain"));
		refreshCacheQuota.setDirRemain(context.stringValue("DescribeRefreshQuotaResponse.RefreshCacheQuota.DirRemain"));
		describeRefreshQuotaResponse.setRefreshCacheQuota(refreshCacheQuota);
	 
	 	return describeRefreshQuotaResponse;
	}
}