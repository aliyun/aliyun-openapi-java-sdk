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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnUserQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnUserQuotaResponseUnmarshaller {

	public static DescribeScdnUserQuotaResponse unmarshall(DescribeScdnUserQuotaResponse describeScdnUserQuotaResponse, UnmarshallerContext _ctx) {
		
		describeScdnUserQuotaResponse.setRequestId(_ctx.stringValue("DescribeScdnUserQuotaResponse.RequestId"));
		describeScdnUserQuotaResponse.setDomainQuota(_ctx.integerValue("DescribeScdnUserQuotaResponse.DomainQuota"));
		describeScdnUserQuotaResponse.setRefreshUrlQuota(_ctx.integerValue("DescribeScdnUserQuotaResponse.RefreshUrlQuota"));
		describeScdnUserQuotaResponse.setRefreshDirQuota(_ctx.integerValue("DescribeScdnUserQuotaResponse.RefreshDirQuota"));
		describeScdnUserQuotaResponse.setRefreshUrlRemain(_ctx.integerValue("DescribeScdnUserQuotaResponse.RefreshUrlRemain"));
		describeScdnUserQuotaResponse.setRefreshDirRemain(_ctx.integerValue("DescribeScdnUserQuotaResponse.RefreshDirRemain"));
		describeScdnUserQuotaResponse.setPreloadQuota(_ctx.integerValue("DescribeScdnUserQuotaResponse.PreloadQuota"));
		describeScdnUserQuotaResponse.setPreloadRemain(_ctx.integerValue("DescribeScdnUserQuotaResponse.PreloadRemain"));
		describeScdnUserQuotaResponse.setBlockQuota(_ctx.integerValue("DescribeScdnUserQuotaResponse.BlockQuota"));
		describeScdnUserQuotaResponse.setBlockRemain(_ctx.integerValue("DescribeScdnUserQuotaResponse.BlockRemain"));
	 
	 	return describeScdnUserQuotaResponse;
	}
}