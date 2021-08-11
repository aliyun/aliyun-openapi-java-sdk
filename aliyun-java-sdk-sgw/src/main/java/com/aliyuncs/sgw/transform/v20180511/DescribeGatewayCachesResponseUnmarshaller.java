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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayCachesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayCachesResponse.Cache;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayCachesResponseUnmarshaller {

	public static DescribeGatewayCachesResponse unmarshall(DescribeGatewayCachesResponse describeGatewayCachesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayCachesResponse.setRequestId(_ctx.stringValue("DescribeGatewayCachesResponse.RequestId"));
		describeGatewayCachesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayCachesResponse.Success"));
		describeGatewayCachesResponse.setCode(_ctx.stringValue("DescribeGatewayCachesResponse.Code"));
		describeGatewayCachesResponse.setMessage(_ctx.stringValue("DescribeGatewayCachesResponse.Message"));

		List<Cache> caches = new ArrayList<Cache>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayCachesResponse.Caches.Length"); i++) {
			Cache cache = new Cache();
			cache.setSizeInGB(_ctx.longValue("DescribeGatewayCachesResponse.Caches["+ i +"].SizeInGB"));
			cache.setIops(_ctx.longValue("DescribeGatewayCachesResponse.Caches["+ i +"].Iops"));
			cache.setCacheId(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].CacheId"));
			cache.setCacheType(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].CacheType"));
			cache.setIsUsed(_ctx.booleanValue("DescribeGatewayCachesResponse.Caches["+ i +"].IsUsed"));
			cache.setLocalFilePath(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].LocalFilePath"));
			cache.setRenewURL(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].RenewURL"));
			cache.setExpiredTime(_ctx.longValue("DescribeGatewayCachesResponse.Caches["+ i +"].ExpiredTime"));
			cache.setExpireStatus(_ctx.integerValue("DescribeGatewayCachesResponse.Caches["+ i +"].ExpireStatus"));
			cache.setPerformanceLevel(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].PerformanceLevel"));
			cache.setBuyURL(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].BuyURL"));
			cache.setSubscriptionInstanceId(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].SubscriptionInstanceId"));

			caches.add(cache);
		}
		describeGatewayCachesResponse.setCaches(caches);
	 
	 	return describeGatewayCachesResponse;
	}
}