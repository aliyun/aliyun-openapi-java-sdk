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
import com.aliyuncs.eipanycast.model.v20200309.DescribeAnycastEipAddressResponse.AnycastEipBindInfo.PopLocation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAnycastEipAddressResponseUnmarshaller {

	public static DescribeAnycastEipAddressResponse unmarshall(DescribeAnycastEipAddressResponse describeAnycastEipAddressResponse, UnmarshallerContext _ctx) {
		
		describeAnycastEipAddressResponse.setRequestId(_ctx.stringValue("DescribeAnycastEipAddressResponse.RequestId"));
		describeAnycastEipAddressResponse.setStatus(_ctx.stringValue("DescribeAnycastEipAddressResponse.Status"));
		describeAnycastEipAddressResponse.setDescription(_ctx.stringValue("DescribeAnycastEipAddressResponse.Description"));
		describeAnycastEipAddressResponse.setInstanceChargeType(_ctx.stringValue("DescribeAnycastEipAddressResponse.InstanceChargeType"));
		describeAnycastEipAddressResponse.setCreateTime(_ctx.stringValue("DescribeAnycastEipAddressResponse.CreateTime"));
		describeAnycastEipAddressResponse.setBusinessStatus(_ctx.stringValue("DescribeAnycastEipAddressResponse.BusinessStatus"));
		describeAnycastEipAddressResponse.setInternetChargeType(_ctx.stringValue("DescribeAnycastEipAddressResponse.InternetChargeType"));
		describeAnycastEipAddressResponse.setName(_ctx.stringValue("DescribeAnycastEipAddressResponse.Name"));
		describeAnycastEipAddressResponse.setAnycastId(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastId"));
		describeAnycastEipAddressResponse.setServiceLocation(_ctx.stringValue("DescribeAnycastEipAddressResponse.ServiceLocation"));
		describeAnycastEipAddressResponse.setBandwidth(_ctx.integerValue("DescribeAnycastEipAddressResponse.Bandwidth"));
		describeAnycastEipAddressResponse.setIpAddress(_ctx.stringValue("DescribeAnycastEipAddressResponse.IpAddress"));
		describeAnycastEipAddressResponse.setBid(_ctx.stringValue("DescribeAnycastEipAddressResponse.Bid"));
		describeAnycastEipAddressResponse.setAliUid(_ctx.longValue("DescribeAnycastEipAddressResponse.AliUid"));

		List<AnycastEipBindInfo> anycastEipBindInfoList = new ArrayList<AnycastEipBindInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList.Length"); i++) {
			AnycastEipBindInfo anycastEipBindInfo = new AnycastEipBindInfo();
			anycastEipBindInfo.setBindInstanceType(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].BindInstanceType"));
			anycastEipBindInfo.setBindTime(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].BindTime"));
			anycastEipBindInfo.setStatus(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].Status"));
			anycastEipBindInfo.setBindInstanceRegionId(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].BindInstanceRegionId"));
			anycastEipBindInfo.setBindInstanceId(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].BindInstanceId"));
			anycastEipBindInfo.setAssociationMode(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].AssociationMode"));
			anycastEipBindInfo.setPrivateIpAddress(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].PrivateIpAddress"));

			List<PopLocation> popLocations = new ArrayList<PopLocation>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].PopLocations.Length"); j++) {
				PopLocation popLocation = new PopLocation();
				popLocation.setPopLocation(_ctx.stringValue("DescribeAnycastEipAddressResponse.AnycastEipBindInfoList["+ i +"].PopLocations["+ j +"].PopLocation"));

				popLocations.add(popLocation);
			}
			anycastEipBindInfo.setPopLocations(popLocations);

			anycastEipBindInfoList.add(anycastEipBindInfo);
		}
		describeAnycastEipAddressResponse.setAnycastEipBindInfoList(anycastEipBindInfoList);
	 
	 	return describeAnycastEipAddressResponse;
	}
}