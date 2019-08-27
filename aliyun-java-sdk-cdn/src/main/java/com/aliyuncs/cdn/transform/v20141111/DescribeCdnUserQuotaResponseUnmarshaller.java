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

package com.aliyuncs.cdn.transform.v20141111;

import com.aliyuncs.cdn.model.v20141111.DescribeCdnUserQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnUserQuotaResponseUnmarshaller {

	public static DescribeCdnUserQuotaResponse unmarshall(DescribeCdnUserQuotaResponse describeCdnUserQuotaResponse, UnmarshallerContext _ctx) {
		
		describeCdnUserQuotaResponse.setRequestId(_ctx.stringValue("DescribeCdnUserQuotaResponse.RequestId"));
		describeCdnUserQuotaResponse.setDomainQuota(_ctx.integerValue("DescribeCdnUserQuotaResponse.DomainQuota"));
		describeCdnUserQuotaResponse.setRefreshUrlQuota(_ctx.integerValue("DescribeCdnUserQuotaResponse.RefreshUrlQuota"));
		describeCdnUserQuotaResponse.setRefreshDirQuota(_ctx.integerValue("DescribeCdnUserQuotaResponse.RefreshDirQuota"));
		describeCdnUserQuotaResponse.setRefreshUrlRemain(_ctx.integerValue("DescribeCdnUserQuotaResponse.RefreshUrlRemain"));
		describeCdnUserQuotaResponse.setRefreshDirRemain(_ctx.integerValue("DescribeCdnUserQuotaResponse.RefreshDirRemain"));
		describeCdnUserQuotaResponse.setPreloadQuota(_ctx.integerValue("DescribeCdnUserQuotaResponse.PreloadQuota"));
		describeCdnUserQuotaResponse.setPreloadRemain(_ctx.integerValue("DescribeCdnUserQuotaResponse.PreloadRemain"));
		describeCdnUserQuotaResponse.setBlockQuota(_ctx.integerValue("DescribeCdnUserQuotaResponse.BlockQuota"));
		describeCdnUserQuotaResponse.setBlockRemain(_ctx.integerValue("DescribeCdnUserQuotaResponse.BlockRemain"));
	 
	 	return describeCdnUserQuotaResponse;
	}
}