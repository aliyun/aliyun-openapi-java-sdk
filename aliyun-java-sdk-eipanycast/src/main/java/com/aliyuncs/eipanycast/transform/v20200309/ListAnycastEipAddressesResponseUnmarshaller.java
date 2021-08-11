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

import com.aliyuncs.eipanycast.model.v20200309.ListAnycastEipAddressesResponse;
import com.aliyuncs.eipanycast.model.v20200309.ListAnycastEipAddressesResponse.Anycast;
import com.aliyuncs.eipanycast.model.v20200309.ListAnycastEipAddressesResponse.Anycast.AnycastEipBindInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAnycastEipAddressesResponseUnmarshaller {

	public static ListAnycastEipAddressesResponse unmarshall(ListAnycastEipAddressesResponse listAnycastEipAddressesResponse, UnmarshallerContext _ctx) {
		
		listAnycastEipAddressesResponse.setRequestId(_ctx.stringValue("ListAnycastEipAddressesResponse.RequestId"));
		listAnycastEipAddressesResponse.setTotalCount(_ctx.integerValue("ListAnycastEipAddressesResponse.TotalCount"));
		listAnycastEipAddressesResponse.setNextToken(_ctx.stringValue("ListAnycastEipAddressesResponse.NextToken"));

		List<Anycast> anycastList = new ArrayList<Anycast>();
		for (int i = 0; i < _ctx.lengthValue("ListAnycastEipAddressesResponse.AnycastList.Length"); i++) {
			Anycast anycast = new Anycast();
			anycast.setAnycastId(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].AnycastId"));
			anycast.setIpAddress(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].IpAddress"));
			anycast.setName(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].Name"));
			anycast.setDescription(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].Description"));
			anycast.setBandwidth(_ctx.integerValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].Bandwidth"));
			anycast.setInstanceChargeType(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].InstanceChargeType"));
			anycast.setInternetChargeType(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].InternetChargeType"));
			anycast.setCreateTime(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].CreateTime"));
			anycast.setStatus(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].Status"));
			anycast.setServiceLocation(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].ServiceLocation"));
			anycast.setAliUid(_ctx.longValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].AliUid"));
			anycast.setBid(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].Bid"));
			anycast.setBusinessStatus(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].BusinessStatus"));

			List<AnycastEipBindInfo> anycastEipBindInfoList = new ArrayList<AnycastEipBindInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].AnycastEipBindInfoList.Length"); j++) {
				AnycastEipBindInfo anycastEipBindInfo = new AnycastEipBindInfo();
				anycastEipBindInfo.setBindInstanceId(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].AnycastEipBindInfoList["+ j +"].BindInstanceId"));
				anycastEipBindInfo.setBindInstanceType(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].AnycastEipBindInfoList["+ j +"].BindInstanceType"));
				anycastEipBindInfo.setBindTime(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].AnycastEipBindInfoList["+ j +"].BindTime"));
				anycastEipBindInfo.setBindInstanceRegionId(_ctx.stringValue("ListAnycastEipAddressesResponse.AnycastList["+ i +"].AnycastEipBindInfoList["+ j +"].BindInstanceRegionId"));

				anycastEipBindInfoList.add(anycastEipBindInfo);
			}
			anycast.setAnycastEipBindInfoList(anycastEipBindInfoList);

			anycastList.add(anycast);
		}
		listAnycastEipAddressesResponse.setAnycastList(anycastList);
	 
	 	return listAnycastEipAddressesResponse;
	}
}