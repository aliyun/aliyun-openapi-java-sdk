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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeGlobalDistributeCacheResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeGlobalDistributeCacheResponse.GlobalDistributeCache;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeGlobalDistributeCacheResponse.GlobalDistributeCache.SubInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGlobalDistributeCacheResponseUnmarshaller {

	public static DescribeGlobalDistributeCacheResponse unmarshall(DescribeGlobalDistributeCacheResponse describeGlobalDistributeCacheResponse, UnmarshallerContext _ctx) {
		
		describeGlobalDistributeCacheResponse.setRequestId(_ctx.stringValue("DescribeGlobalDistributeCacheResponse.RequestId"));
		describeGlobalDistributeCacheResponse.setTotalRecordCount(_ctx.integerValue("DescribeGlobalDistributeCacheResponse.TotalRecordCount"));
		describeGlobalDistributeCacheResponse.setPageNumber(_ctx.integerValue("DescribeGlobalDistributeCacheResponse.PageNumber"));
		describeGlobalDistributeCacheResponse.setPageSize(_ctx.integerValue("DescribeGlobalDistributeCacheResponse.PageSize"));

		List<GlobalDistributeCache> globalDistributeCaches = new ArrayList<GlobalDistributeCache>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches.Length"); i++) {
			GlobalDistributeCache globalDistributeCache = new GlobalDistributeCache();
			globalDistributeCache.setGlobalInstanceId(_ctx.stringValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches["+ i +"].GlobalInstanceId"));
			globalDistributeCache.setGlobalInstanceName(_ctx.stringValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches["+ i +"].GlobalInstanceName"));
			globalDistributeCache.setStatus(_ctx.stringValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches["+ i +"].Status"));

			List<SubInstance> subInstances = new ArrayList<SubInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches["+ i +"].SubInstances.Length"); j++) {
				SubInstance subInstance = new SubInstance();
				subInstance.setGlobalInstanceId(_ctx.stringValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches["+ i +"].SubInstances["+ j +"].GlobalInstanceId"));
				subInstance.setInstanceID(_ctx.stringValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches["+ i +"].SubInstances["+ j +"].InstanceID"));
				subInstance.setRegionId(_ctx.stringValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches["+ i +"].SubInstances["+ j +"].RegionId"));
				subInstance.setInstanceStatus(_ctx.stringValue("DescribeGlobalDistributeCacheResponse.GlobalDistributeCaches["+ i +"].SubInstances["+ j +"].InstanceStatus"));

				subInstances.add(subInstance);
			}
			globalDistributeCache.setSubInstances(subInstances);

			globalDistributeCaches.add(globalDistributeCache);
		}
		describeGlobalDistributeCacheResponse.setGlobalDistributeCaches(globalDistributeCaches);
	 
	 	return describeGlobalDistributeCacheResponse;
	}
}