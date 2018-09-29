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

	public static DescribeDcdnUserQuotaResponse unmarshall(DescribeDcdnUserQuotaResponse describeDcdnUserQuotaResponse, UnmarshallerContext context) {
		
		describeDcdnUserQuotaResponse.setRequestId(context.stringValue("DescribeDcdnUserQuotaResponse.RequestId"));
		describeDcdnUserQuotaResponse.setDomainQuota(context.integerValue("DescribeDcdnUserQuotaResponse.DomainQuota"));
		describeDcdnUserQuotaResponse.setRefreshUrlQuota(context.integerValue("DescribeDcdnUserQuotaResponse.RefreshUrlQuota"));
		describeDcdnUserQuotaResponse.setRefreshDirQuota(context.integerValue("DescribeDcdnUserQuotaResponse.RefreshDirQuota"));
		describeDcdnUserQuotaResponse.setRefreshUrlRemain(context.integerValue("DescribeDcdnUserQuotaResponse.RefreshUrlRemain"));
		describeDcdnUserQuotaResponse.setRefreshDirRemain(context.integerValue("DescribeDcdnUserQuotaResponse.RefreshDirRemain"));
		describeDcdnUserQuotaResponse.setPreloadQuota(context.integerValue("DescribeDcdnUserQuotaResponse.PreloadQuota"));
		describeDcdnUserQuotaResponse.setPreloadRemain(context.integerValue("DescribeDcdnUserQuotaResponse.PreloadRemain"));
		describeDcdnUserQuotaResponse.setBlockQuota(context.integerValue("DescribeDcdnUserQuotaResponse.BlockQuota"));
		describeDcdnUserQuotaResponse.setBlockRemain(context.integerValue("DescribeDcdnUserQuotaResponse.BlockRemain"));
	 
	 	return describeDcdnUserQuotaResponse;
	}
}