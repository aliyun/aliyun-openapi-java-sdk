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

package com.aliyuncs.cdn.transform.v20180510;

import com.aliyuncs.cdn.model.v20180510.DescribeIpInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpInfoResponseUnmarshaller {

	public static DescribeIpInfoResponse unmarshall(DescribeIpInfoResponse describeIpInfoResponse, UnmarshallerContext _ctx) {
		
		describeIpInfoResponse.setRequestId(_ctx.stringValue("DescribeIpInfoResponse.RequestId"));
		describeIpInfoResponse.setCdnIp(_ctx.stringValue("DescribeIpInfoResponse.CdnIp"));
		describeIpInfoResponse.setISP(_ctx.stringValue("DescribeIpInfoResponse.ISP"));
		describeIpInfoResponse.setIspEname(_ctx.stringValue("DescribeIpInfoResponse.IspEname"));
		describeIpInfoResponse.setRegion(_ctx.stringValue("DescribeIpInfoResponse.Region"));
		describeIpInfoResponse.setRegionEname(_ctx.stringValue("DescribeIpInfoResponse.RegionEname"));
	 
	 	return describeIpInfoResponse;
	}
}