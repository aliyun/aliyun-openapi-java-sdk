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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.DescribeIpSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpSetResponseUnmarshaller {

	public static DescribeIpSetResponse unmarshall(DescribeIpSetResponse describeIpSetResponse, UnmarshallerContext _ctx) {
		
		describeIpSetResponse.setRequestId(_ctx.stringValue("DescribeIpSetResponse.RequestId"));
		describeIpSetResponse.setIpSetId(_ctx.stringValue("DescribeIpSetResponse.IpSetId"));
		describeIpSetResponse.setAccelerateRegionId(_ctx.stringValue("DescribeIpSetResponse.AccelerateRegionId"));
		describeIpSetResponse.setBandwidth(_ctx.integerValue("DescribeIpSetResponse.Bandwidth"));
		describeIpSetResponse.setState(_ctx.stringValue("DescribeIpSetResponse.State"));

		List<String> ipAddressList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpSetResponse.IpAddressList.Length"); i++) {
			ipAddressList.add(_ctx.stringValue("DescribeIpSetResponse.IpAddressList["+ i +"]"));
		}
		describeIpSetResponse.setIpAddressList(ipAddressList);
	 
	 	return describeIpSetResponse;
	}
}