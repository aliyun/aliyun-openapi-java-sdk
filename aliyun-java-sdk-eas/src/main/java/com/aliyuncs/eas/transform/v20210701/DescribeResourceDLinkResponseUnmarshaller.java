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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.DescribeResourceDLinkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceDLinkResponseUnmarshaller {

	public static DescribeResourceDLinkResponse unmarshall(DescribeResourceDLinkResponse describeResourceDLinkResponse, UnmarshallerContext _ctx) {
		
		describeResourceDLinkResponse.setRequestId(_ctx.stringValue("DescribeResourceDLinkResponse.RequestId"));
		describeResourceDLinkResponse.setVpcId(_ctx.stringValue("DescribeResourceDLinkResponse.VpcId"));
		describeResourceDLinkResponse.setVSwitchId(_ctx.stringValue("DescribeResourceDLinkResponse.VSwitchId"));
		describeResourceDLinkResponse.setSecurityGroupId(_ctx.stringValue("DescribeResourceDLinkResponse.SecurityGroupId"));
		describeResourceDLinkResponse.setDestinationCIDRs(_ctx.stringValue("DescribeResourceDLinkResponse.DestinationCIDRs"));

		List<String> auxVSwitchList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceDLinkResponse.AuxVSwitchList.Length"); i++) {
			auxVSwitchList.add(_ctx.stringValue("DescribeResourceDLinkResponse.AuxVSwitchList["+ i +"]"));
		}
		describeResourceDLinkResponse.setAuxVSwitchList(auxVSwitchList);
	 
	 	return describeResourceDLinkResponse;
	}
}