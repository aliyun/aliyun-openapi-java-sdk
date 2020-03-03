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

package com.aliyuncs.geoip.transform.v20200101;

import com.aliyuncs.geoip.model.v20200101.DescribeGeoipInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGeoipInstanceResponseUnmarshaller {

	public static DescribeGeoipInstanceResponse unmarshall(DescribeGeoipInstanceResponse describeGeoipInstanceResponse, UnmarshallerContext _ctx) {
		
		describeGeoipInstanceResponse.setRequestId(_ctx.stringValue("DescribeGeoipInstanceResponse.RequestId"));
		describeGeoipInstanceResponse.setProductCode(_ctx.stringValue("DescribeGeoipInstanceResponse.ProductCode"));
		describeGeoipInstanceResponse.setInstanceId(_ctx.stringValue("DescribeGeoipInstanceResponse.InstanceId"));
		describeGeoipInstanceResponse.setVersionCode(_ctx.stringValue("DescribeGeoipInstanceResponse.VersionCode"));
		describeGeoipInstanceResponse.setMaxQps(_ctx.longValue("DescribeGeoipInstanceResponse.MaxQps"));
		describeGeoipInstanceResponse.setMaxQpd(_ctx.longValue("DescribeGeoipInstanceResponse.MaxQpd"));
		describeGeoipInstanceResponse.setQueryCount(_ctx.longValue("DescribeGeoipInstanceResponse.QueryCount"));
		describeGeoipInstanceResponse.setCreateTime(_ctx.stringValue("DescribeGeoipInstanceResponse.CreateTime"));
		describeGeoipInstanceResponse.setCreateTimestamp(_ctx.longValue("DescribeGeoipInstanceResponse.CreateTimestamp"));
		describeGeoipInstanceResponse.setExpireTime(_ctx.stringValue("DescribeGeoipInstanceResponse.ExpireTime"));
		describeGeoipInstanceResponse.setExpireTimestamp(_ctx.longValue("DescribeGeoipInstanceResponse.ExpireTimestamp"));
	 
	 	return describeGeoipInstanceResponse;
	}
}