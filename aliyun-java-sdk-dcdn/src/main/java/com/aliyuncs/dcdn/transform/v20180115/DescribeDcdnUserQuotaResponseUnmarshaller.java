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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserQuotaResponseUnmarshaller {

	public static DescribeDcdnUserQuotaResponse unmarshall(DescribeDcdnUserQuotaResponse describeDcdnUserQuotaResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserQuotaResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserQuotaResponse.RequestId"));
		describeDcdnUserQuotaResponse.setDomainQuota(_ctx.integerValue("DescribeDcdnUserQuotaResponse.DomainQuota"));
		describeDcdnUserQuotaResponse.setRefreshUrlQuota(_ctx.integerValue("DescribeDcdnUserQuotaResponse.RefreshUrlQuota"));
		describeDcdnUserQuotaResponse.setRefreshDirQuota(_ctx.integerValue("DescribeDcdnUserQuotaResponse.RefreshDirQuota"));
		describeDcdnUserQuotaResponse.setRefreshUrlRemain(_ctx.integerValue("DescribeDcdnUserQuotaResponse.RefreshUrlRemain"));
		describeDcdnUserQuotaResponse.setRefreshDirRemain(_ctx.integerValue("DescribeDcdnUserQuotaResponse.RefreshDirRemain"));
		describeDcdnUserQuotaResponse.setPreloadQuota(_ctx.integerValue("DescribeDcdnUserQuotaResponse.PreloadQuota"));
		describeDcdnUserQuotaResponse.setPreloadRemain(_ctx.integerValue("DescribeDcdnUserQuotaResponse.PreloadRemain"));
		describeDcdnUserQuotaResponse.setBlockQuota(_ctx.integerValue("DescribeDcdnUserQuotaResponse.BlockQuota"));
		describeDcdnUserQuotaResponse.setBlockRemain(_ctx.integerValue("DescribeDcdnUserQuotaResponse.BlockRemain"));
	 
	 	return describeDcdnUserQuotaResponse;
	}
}