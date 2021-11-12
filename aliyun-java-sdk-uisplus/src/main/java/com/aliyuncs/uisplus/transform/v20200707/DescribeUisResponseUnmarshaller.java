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

package com.aliyuncs.uisplus.transform.v20200707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uisplus.model.v20200707.DescribeUisResponse;
import com.aliyuncs.uisplus.model.v20200707.DescribeUisResponse.InternetIpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUisResponseUnmarshaller {

	public static DescribeUisResponse unmarshall(DescribeUisResponse describeUisResponse, UnmarshallerContext _ctx) {
		
		describeUisResponse.setRequestId(_ctx.stringValue("DescribeUisResponse.RequestId"));
		describeUisResponse.setUisId(_ctx.stringValue("DescribeUisResponse.UisId"));
		describeUisResponse.setNetworkMode(_ctx.stringValue("DescribeUisResponse.NetworkMode"));
		describeUisResponse.setWildcardDomainState(_ctx.stringValue("DescribeUisResponse.WildcardDomainState"));
		describeUisResponse.setState(_ctx.stringValue("DescribeUisResponse.State"));
		describeUisResponse.setUisName(_ctx.stringValue("DescribeUisResponse.UisName"));
		describeUisResponse.setRegionId(_ctx.stringValue("DescribeUisResponse.RegionId"));
		describeUisResponse.setMbpsQuota(_ctx.doubleValue("DescribeUisResponse.MbpsQuota"));
		describeUisResponse.setKppsQuota(_ctx.doubleValue("DescribeUisResponse.KppsQuota"));
		describeUisResponse.setFlowQuota(_ctx.doubleValue("DescribeUisResponse.FlowQuota"));
		describeUisResponse.setUsedMBpsQuota(_ctx.doubleValue("DescribeUisResponse.UsedMBpsQuota"));
		describeUisResponse.setUsedKPpsQuota(_ctx.doubleValue("DescribeUisResponse.UsedKPpsQuota"));
		describeUisResponse.setUsedFlowQuota(_ctx.doubleValue("DescribeUisResponse.UsedFlowQuota"));

		List<String> uisNodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUisResponse.UisNodes.Length"); i++) {
			uisNodes.add(_ctx.stringValue("DescribeUisResponse.UisNodes["+ i +"]"));
		}
		describeUisResponse.setUisNodes(uisNodes);

		List<InternetIpsItem> internetIps = new ArrayList<InternetIpsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUisResponse.InternetIps.Length"); i++) {
			InternetIpsItem internetIpsItem = new InternetIpsItem();
			internetIpsItem.setType(_ctx.stringValue("DescribeUisResponse.InternetIps["+ i +"].Type"));
			internetIpsItem.setIp(_ctx.stringValue("DescribeUisResponse.InternetIps["+ i +"].Ip"));
			internetIpsItem.setUisNodeId(_ctx.stringValue("DescribeUisResponse.InternetIps["+ i +"].UisNodeId"));
			internetIpsItem.setEipId(_ctx.stringValue("DescribeUisResponse.InternetIps["+ i +"].EipId"));
			internetIpsItem.setRole(_ctx.stringValue("DescribeUisResponse.InternetIps["+ i +"].Role"));

			internetIps.add(internetIpsItem);
		}
		describeUisResponse.setInternetIps(internetIps);
	 
	 	return describeUisResponse;
	}
}