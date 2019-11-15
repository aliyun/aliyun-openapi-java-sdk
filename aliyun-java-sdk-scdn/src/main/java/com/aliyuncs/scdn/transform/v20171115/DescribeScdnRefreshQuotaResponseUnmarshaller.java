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

	public static DescribeScdnRefreshQuotaResponse unmarshall(DescribeScdnRefreshQuotaResponse describeScdnRefreshQuotaResponse, UnmarshallerContext _ctx) {
		
		describeScdnRefreshQuotaResponse.setRequestId(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.RequestId"));
		describeScdnRefreshQuotaResponse.setUrlQuota(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.UrlQuota"));
		describeScdnRefreshQuotaResponse.setDirQuota(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.DirQuota"));
		describeScdnRefreshQuotaResponse.setUrlRemain(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.UrlRemain"));
		describeScdnRefreshQuotaResponse.setDirRemain(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.DirRemain"));
		describeScdnRefreshQuotaResponse.setPreloadQuota(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.PreloadQuota"));
		describeScdnRefreshQuotaResponse.setBlockQuota(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.BlockQuota"));
		describeScdnRefreshQuotaResponse.setPreloadRemain(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.PreloadRemain"));
		describeScdnRefreshQuotaResponse.setBlockRemain(_ctx.stringValue("DescribeScdnRefreshQuotaResponse.blockRemain"));
	 
	 	return describeScdnRefreshQuotaResponse;
	}
}