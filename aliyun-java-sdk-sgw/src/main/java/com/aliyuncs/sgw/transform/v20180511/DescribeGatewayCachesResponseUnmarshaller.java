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
		describeGatewayCachesResponse.setMessage(_ctx.stringValue("DescribeGatewayCachesResponse.Message"));
		describeGatewayCachesResponse.setCode(_ctx.stringValue("DescribeGatewayCachesResponse.Code"));
		describeGatewayCachesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayCachesResponse.Success"));

		List<Cache> caches = new ArrayList<Cache>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayCachesResponse.Caches.Length"); i++) {
			Cache cache = new Cache();
			cache.setPerformanceLevel(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].PerformanceLevel"));
			cache.setSizeInGB(_ctx.longValue("DescribeGatewayCachesResponse.Caches["+ i +"].SizeInGB"));
			cache.setBuyURL(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].BuyURL"));
			cache.setIops(_ctx.longValue("DescribeGatewayCachesResponse.Caches["+ i +"].Iops"));
			cache.setCacheId(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].CacheId"));
			cache.setCacheType(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].CacheType"));
			cache.setIsUsed(_ctx.booleanValue("DescribeGatewayCachesResponse.Caches["+ i +"].IsUsed"));
			cache.setExpiredTime(_ctx.longValue("DescribeGatewayCachesResponse.Caches["+ i +"].ExpiredTime"));
			cache.setLocalFilePath(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].LocalFilePath"));
			cache.setSubscriptionInstanceId(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].SubscriptionInstanceId"));
			cache.setExpireStatus(_ctx.integerValue("DescribeGatewayCachesResponse.Caches["+ i +"].ExpireStatus"));
			cache.setRenewURL(_ctx.stringValue("DescribeGatewayCachesResponse.Caches["+ i +"].RenewURL"));

			caches.add(cache);
		}
		describeGatewayCachesResponse.setCaches(caches);
	 
	 	return describeGatewayCachesResponse;
	}
}