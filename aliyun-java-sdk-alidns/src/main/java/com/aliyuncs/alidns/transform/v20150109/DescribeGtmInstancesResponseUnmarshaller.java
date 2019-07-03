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

import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstancesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstancesResponse.GtmInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmInstancesResponseUnmarshaller {

	public static DescribeGtmInstancesResponse unmarshall(DescribeGtmInstancesResponse describeGtmInstancesResponse, UnmarshallerContext _ctx) {
		
		describeGtmInstancesResponse.setRequestId(_ctx.stringValue("DescribeGtmInstancesResponse.RequestId"));
		describeGtmInstancesResponse.setPageNumber(_ctx.integerValue("DescribeGtmInstancesResponse.PageNumber"));
		describeGtmInstancesResponse.setPageSize(_ctx.integerValue("DescribeGtmInstancesResponse.PageSize"));
		describeGtmInstancesResponse.setTotalItems(_ctx.integerValue("DescribeGtmInstancesResponse.TotalItems"));
		describeGtmInstancesResponse.setTotalPages(_ctx.integerValue("DescribeGtmInstancesResponse.TotalPages"));

		List<GtmInstance> gtmInstances = new ArrayList<GtmInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmInstancesResponse.GtmInstances.Length"); i++) {
			GtmInstance gtmInstance = new GtmInstance();
			gtmInstance.setInstanceId(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].InstanceId"));
			gtmInstance.setInstanceName(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].InstanceName"));
			gtmInstance.setCname(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].Cname"));
			gtmInstance.setUserDomainName(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].UserDomainName"));
			gtmInstance.setVersionCode(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].VersionCode"));
			gtmInstance.setTtl(_ctx.integerValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].Ttl"));
			gtmInstance.setLbaStrategy(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].LbaStrategy"));
			gtmInstance.setCreateTime(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].CreateTime"));
			gtmInstance.setCreateTimestamp(_ctx.longValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].CreateTimestamp"));
			gtmInstance.setExpireTime(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].ExpireTime"));
			gtmInstance.setExpireTimestamp(_ctx.longValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].ExpireTimestamp"));
			gtmInstance.setAlertGroup(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].AlertGroup"));
			gtmInstance.setCnameMode(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].CnameMode"));

			gtmInstances.add(gtmInstance);
		}
		describeGtmInstancesResponse.setGtmInstances(gtmInstances);
	 
	 	return describeGtmInstancesResponse;
	}
}