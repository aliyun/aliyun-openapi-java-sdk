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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAddrAttributeInfoResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAddrAttributeInfoResponse.AddrItem;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAddrAttributeInfoResponse.AddrItem.AttributeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmAddrAttributeInfoResponseUnmarshaller {

	public static DescribeDnsGtmAddrAttributeInfoResponse unmarshall(DescribeDnsGtmAddrAttributeInfoResponse describeDnsGtmAddrAttributeInfoResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmAddrAttributeInfoResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmAddrAttributeInfoResponse.RequestId"));

		List<AddrItem> addr = new ArrayList<AddrItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAddrAttributeInfoResponse.Addr.Length"); i++) {
			AddrItem addrItem = new AddrItem();
			addrItem.setAddr(_ctx.stringValue("DescribeDnsGtmAddrAttributeInfoResponse.Addr["+ i +"].Addr"));

			AttributeInfo attributeInfo = new AttributeInfo();
			attributeInfo.setLineCode(_ctx.stringValue("DescribeDnsGtmAddrAttributeInfoResponse.Addr["+ i +"].AttributeInfo.LineCode"));
			attributeInfo.setLineName(_ctx.stringValue("DescribeDnsGtmAddrAttributeInfoResponse.Addr["+ i +"].AttributeInfo.LineName"));
			attributeInfo.setGroupCode(_ctx.stringValue("DescribeDnsGtmAddrAttributeInfoResponse.Addr["+ i +"].AttributeInfo.GroupCode"));
			attributeInfo.setGroupName(_ctx.stringValue("DescribeDnsGtmAddrAttributeInfoResponse.Addr["+ i +"].AttributeInfo.GroupName"));
			attributeInfo.setFatherCode(_ctx.stringValue("DescribeDnsGtmAddrAttributeInfoResponse.Addr["+ i +"].AttributeInfo.FatherCode"));
			addrItem.setAttributeInfo(attributeInfo);

			addr.add(addrItem);
		}
		describeDnsGtmAddrAttributeInfoResponse.setAddr(addr);
	 
	 	return describeDnsGtmAddrAttributeInfoResponse;
	}
}