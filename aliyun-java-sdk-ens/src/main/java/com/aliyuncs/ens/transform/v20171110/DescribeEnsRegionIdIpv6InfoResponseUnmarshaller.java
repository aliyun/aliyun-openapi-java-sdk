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

package com.aliyuncs.ens.transform.v20171110;

import com.aliyuncs.ens.model.v20171110.DescribeEnsRegionIdIpv6InfoResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsRegionIdIpv6InfoResponse.SupportIpv6Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsRegionIdIpv6InfoResponseUnmarshaller {

	public static DescribeEnsRegionIdIpv6InfoResponse unmarshall(DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6InfoResponse, UnmarshallerContext _ctx) {
		
		describeEnsRegionIdIpv6InfoResponse.setRequestId(_ctx.stringValue("DescribeEnsRegionIdIpv6InfoResponse.RequestId"));

		SupportIpv6Info supportIpv6Info = new SupportIpv6Info();
		supportIpv6Info.setSupportIpv6(_ctx.booleanValue("DescribeEnsRegionIdIpv6InfoResponse.SupportIpv6Info.SupportIpv6"));
		supportIpv6Info.setEnsRegionId(_ctx.stringValue("DescribeEnsRegionIdIpv6InfoResponse.SupportIpv6Info.EnsRegionId"));
		describeEnsRegionIdIpv6InfoResponse.setSupportIpv6Info(supportIpv6Info);
	 
	 	return describeEnsRegionIdIpv6InfoResponse;
	}
}