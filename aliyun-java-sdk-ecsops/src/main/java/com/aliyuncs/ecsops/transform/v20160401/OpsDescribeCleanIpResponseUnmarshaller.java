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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCleanIpResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCleanIpResponse.LockedIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCleanIpResponseUnmarshaller {

	public static OpsDescribeCleanIpResponse unmarshall(OpsDescribeCleanIpResponse opsDescribeCleanIpResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCleanIpResponse.setRequestId(_ctx.stringValue("OpsDescribeCleanIpResponse.RequestId"));
		opsDescribeCleanIpResponse.setPageSize(_ctx.stringValue("OpsDescribeCleanIpResponse.PageSize"));
		opsDescribeCleanIpResponse.setTotal(_ctx.stringValue("OpsDescribeCleanIpResponse.Total"));
		opsDescribeCleanIpResponse.setPageNo(_ctx.stringValue("OpsDescribeCleanIpResponse.PageNo"));

		List<LockedIp> lockedIps = new ArrayList<LockedIp>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCleanIpResponse.LockedIps.Length"); i++) {
			LockedIp lockedIp = new LockedIp();
			lockedIp.setIpType(_ctx.stringValue("OpsDescribeCleanIpResponse.LockedIps["+ i +"].IpType"));
			lockedIp.setIP(_ctx.stringValue("OpsDescribeCleanIpResponse.LockedIps["+ i +"].IP"));

			lockedIps.add(lockedIp);
		}
		opsDescribeCleanIpResponse.setLockedIps(lockedIps);
	 
	 	return opsDescribeCleanIpResponse;
	}
}