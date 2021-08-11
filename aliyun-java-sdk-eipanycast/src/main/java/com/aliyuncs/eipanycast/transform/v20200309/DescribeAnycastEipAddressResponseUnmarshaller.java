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

package com.aliyuncs.eipanycast.transform.v20200309;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eipanycast.model.v20200309.DescribeAnycastEipAddressResponse;
import com.aliyuncs.eipanycast.model.v20200309.DescribeAnycastEipAddressResponse.AnycastEipBindInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAnycastEipAddressResponseUnmarshaller {

	public static DescribeAnycastEipAddressResponse unmarshall(DescribeAnycastEipAddressResponse describeAnycastEipAddressResponse, UnmarshallerContext _ctx) {
		
		describeAnycastEipAddressResponse.setRequestId(_ctx.stringValue("DescribeAnycastEipAddressResponse.RequestId"));
		describeAnycastEipAddressResponse.setAnycastId(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastId"));
		describeAnycastEipAddressResponse.setIpAddress(_ctx.stringValue("DescribeAnycastEipAddressResponse.IpAddress"));
		describeAnycastEipAddressResponse.setName(_ctx.stringValue("DescribeAnycastEipAddressResponse.Name"));
		describeAnycastEipAddressResponse.setDescription(_ctx.stringValue("DescribeAnycastEipAddressResponse.Description"));
		describeAnycastEipAddressResponse.setBandwidth(_ctx.integerValue("DescribeAnycastEipAddressResponse.Bandwidth"));
		describeAnycastEipAddressResponse.setInstanceChargeType(_ctx.stringValue("DescribeAnycastEipAddressResponse.InstanceChargeType"));
		describeAnycastEipAddressResponse.setInternetChargeType(_ctx.stringValue("DescribeAnycastEipAddressResponse.InternetChargeType"));
		describeAnycastEipAddressResponse.setCreateTime(_ctx.stringValue("DescribeAnycastEipAddressResponse.CreateTime"));
		describeAnycastEipAddressResponse.setStatus(_ctx.stringValue("DescribeAnycastEipAddressResponse.Status"));
		describeAnycastEipAddressResponse.setServiceLocation(_ctx.stringValue("DescribeAnycastEipAddressResponse.ServiceLocation"));
		describeAnycastEipAddressResponse.setAliUid(_ctx.longValue("DescribeAnycastEipAddressResponse.AliUid"));
		describeAnycastEipAddressResponse.setBid(_ctx.stringValue("DescribeAnycastEipAddressResponse.Bid"));
		describeAnycastEipAddressResponse.setBusinessStatus(_ctx.stringValue("DescribeAnycastEipAddressResponse.BusinessStatus"));

		List<AnycastEipBindInfo> anycastEipBindInfoList = new ArrayList<AnycastEipBindInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList.Length"); i++) {
			AnycastEipBindInfo anycastEipBindInfo = new AnycastEipBindInfo();
			anycastEipBindInfo.setBindInstanceId(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].BindInstanceId"));
			anycastEipBindInfo.setBindInstanceType(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].BindInstanceType"));
			anycastEipBindInfo.setBindTime(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].BindTime"));
			anycastEipBindInfo.setBindInstanceRegionId(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].BindInstanceRegionId"));

			anycastEipBindInfoList.add(anycastEipBindInfo);
		}
		describeAnycastEipAddressResponse.setAnycastEipBindInfoList(anycastEipBindInfoList);
	 
	 	return describeAnycastEipAddressResponse;
	}
}