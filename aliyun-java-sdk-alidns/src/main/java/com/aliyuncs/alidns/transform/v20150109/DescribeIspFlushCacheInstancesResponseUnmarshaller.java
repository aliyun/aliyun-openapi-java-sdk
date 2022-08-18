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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheInstancesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstance;
import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstance.QuotaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIspFlushCacheInstancesResponseUnmarshaller {

	public static DescribeIspFlushCacheInstancesResponse unmarshall(DescribeIspFlushCacheInstancesResponse describeIspFlushCacheInstancesResponse, UnmarshallerContext _ctx) {
		
		describeIspFlushCacheInstancesResponse.setRequestId(_ctx.stringValue("DescribeIspFlushCacheInstancesResponse.RequestId"));
		describeIspFlushCacheInstancesResponse.setPageSize(_ctx.integerValue("DescribeIspFlushCacheInstancesResponse.PageSize"));
		describeIspFlushCacheInstancesResponse.setPageNumber(_ctx.integerValue("DescribeIspFlushCacheInstancesResponse.PageNumber"));
		describeIspFlushCacheInstancesResponse.setTotalPages(_ctx.integerValue("DescribeIspFlushCacheInstancesResponse.TotalPages"));
		describeIspFlushCacheInstancesResponse.setTotalItems(_ctx.integerValue("DescribeIspFlushCacheInstancesResponse.TotalItems"));

		List<IspFlushCacheInstance> ispFlushCacheInstances = new ArrayList<IspFlushCacheInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances.Length"); i++) {
			IspFlushCacheInstance ispFlushCacheInstance = new IspFlushCacheInstance();
			ispFlushCacheInstance.setIsp(_ctx.stringValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].Isp"));
			ispFlushCacheInstance.setExpireTime(_ctx.stringValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].ExpireTime"));
			ispFlushCacheInstance.setInstanceId(_ctx.stringValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].InstanceId"));
			ispFlushCacheInstance.setExpireTimestamp(_ctx.longValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].ExpireTimestamp"));
			ispFlushCacheInstance.setInstanceName(_ctx.stringValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].InstanceName"));
			ispFlushCacheInstance.setVersionCode(_ctx.stringValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].VersionCode"));
			ispFlushCacheInstance.setStatus(_ctx.stringValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].Status"));

			QuotaInfo quotaInfo = new QuotaInfo();
			quotaInfo.setInstanceQuota(_ctx.integerValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].QuotaInfo.InstanceQuota"));
			quotaInfo.setInstanceQuotaUsed(_ctx.integerValue("DescribeIspFlushCacheInstancesResponse.IspFlushCacheInstances["+ i +"].QuotaInfo.InstanceQuotaUsed"));
			ispFlushCacheInstance.setQuotaInfo(quotaInfo);

			ispFlushCacheInstances.add(ispFlushCacheInstance);
		}
		describeIspFlushCacheInstancesResponse.setIspFlushCacheInstances(ispFlushCacheInstances);
	 
	 	return describeIspFlushCacheInstancesResponse;
	}
}