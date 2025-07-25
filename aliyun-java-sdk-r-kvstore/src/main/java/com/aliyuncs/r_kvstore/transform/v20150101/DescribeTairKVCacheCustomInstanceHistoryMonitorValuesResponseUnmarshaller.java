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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseUnmarshaller {

	public static DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse unmarshall(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse describeTairKVCacheCustomInstanceHistoryMonitorValuesResponse, UnmarshallerContext _ctx) {
		
		describeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.setRequestId(_ctx.stringValue("DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.RequestId"));
		describeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.setDatapoints(_ctx.stringValue("DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.Datapoints"));
		describeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.setNextToken(_ctx.stringValue("DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.NextToken"));
		describeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.setPeriod(_ctx.stringValue("DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse.Period"));
	 
	 	return describeTairKVCacheCustomInstanceHistoryMonitorValuesResponse;
	}
}