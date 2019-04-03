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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeInstanceSwitchNetworkResponse;
import com.aliyuncs.drds.model.v20190123.DescribeInstanceSwitchNetworkResponse.VpcInfo;
import com.aliyuncs.drds.model.v20190123.DescribeInstanceSwitchNetworkResponse.VpcInfo.VswitchInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSwitchNetworkResponseUnmarshaller {

	public static DescribeInstanceSwitchNetworkResponse unmarshall(DescribeInstanceSwitchNetworkResponse describeInstanceSwitchNetworkResponse, UnmarshallerContext context) {
		
		describeInstanceSwitchNetworkResponse.setRequestId(context.stringValue("DescribeInstanceSwitchNetworkResponse.RequestId"));
		describeInstanceSwitchNetworkResponse.setSuccess(context.booleanValue("DescribeInstanceSwitchNetworkResponse.Success"));

		List<VpcInfo> vpcInfos = new ArrayList<VpcInfo>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceSwitchNetworkResponse.VpcInfos.Length"); i++) {
			VpcInfo vpcInfo = new VpcInfo();
			vpcInfo.setVpcId(context.stringValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].VpcId"));
			vpcInfo.setRegionId(context.stringValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].RegionId"));
			vpcInfo.setVpcName(context.stringValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].VpcName"));

			List<VswitchInfo> vswitchInfos = new ArrayList<VswitchInfo>();
			for (int j = 0; j < context.lengthValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].VswitchInfos.Length"); j++) {
				VswitchInfo vswitchInfo = new VswitchInfo();
				vswitchInfo.setVswitchId(context.stringValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].VswitchInfos["+ j +"].VswitchId"));
				vswitchInfo.setVpcId(context.stringValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].VswitchInfos["+ j +"].VpcId"));
				vswitchInfo.setVswitchName(context.stringValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].VswitchInfos["+ j +"].VswitchName"));
				vswitchInfo.setAzoneId(context.stringValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].VswitchInfos["+ j +"].AzoneId"));
				vswitchInfo.setDrdsSupported(context.booleanValue("DescribeInstanceSwitchNetworkResponse.VpcInfos["+ i +"].VswitchInfos["+ j +"].DrdsSupported"));

				vswitchInfos.add(vswitchInfo);
			}
			vpcInfo.setVswitchInfos(vswitchInfos);

			vpcInfos.add(vpcInfo);
		}
		describeInstanceSwitchNetworkResponse.setVpcInfos(vpcInfos);
	 
	 	return describeInstanceSwitchNetworkResponse;
	}
}