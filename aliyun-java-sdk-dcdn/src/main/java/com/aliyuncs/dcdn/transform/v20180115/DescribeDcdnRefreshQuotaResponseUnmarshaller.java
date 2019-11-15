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

package com.aliyuncs.dcdn.transform.v20180115;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnRefreshQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnRefreshQuotaResponseUnmarshaller {

	public static DescribeDcdnRefreshQuotaResponse unmarshall(DescribeDcdnRefreshQuotaResponse describeDcdnRefreshQuotaResponse, UnmarshallerContext _ctx) {
		
		describeDcdnRefreshQuotaResponse.setRequestId(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.RequestId"));
		describeDcdnRefreshQuotaResponse.setUrlQuota(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.UrlQuota"));
		describeDcdnRefreshQuotaResponse.setDirQuota(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.DirQuota"));
		describeDcdnRefreshQuotaResponse.setUrlRemain(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.UrlRemain"));
		describeDcdnRefreshQuotaResponse.setDirRemain(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.DirRemain"));
		describeDcdnRefreshQuotaResponse.setPreloadQuota(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.PreloadQuota"));
		describeDcdnRefreshQuotaResponse.setBlockQuota(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.BlockQuota"));
		describeDcdnRefreshQuotaResponse.setPreloadRemain(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.PreloadRemain"));
		describeDcdnRefreshQuotaResponse.setBlockRemain(_ctx.stringValue("DescribeDcdnRefreshQuotaResponse.blockRemain"));
	 
	 	return describeDcdnRefreshQuotaResponse;
	}
}