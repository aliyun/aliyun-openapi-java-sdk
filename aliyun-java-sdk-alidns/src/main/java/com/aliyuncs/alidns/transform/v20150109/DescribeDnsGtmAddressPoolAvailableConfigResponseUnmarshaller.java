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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAddressPoolAvailableConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAddressPoolAvailableConfigResponse.AttributeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmAddressPoolAvailableConfigResponseUnmarshaller {

	public static DescribeDnsGtmAddressPoolAvailableConfigResponse unmarshall(DescribeDnsGtmAddressPoolAvailableConfigResponse describeDnsGtmAddressPoolAvailableConfigResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmAddressPoolAvailableConfigResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmAddressPoolAvailableConfigResponse.RequestId"));

		List<AttributeInfo> attributeInfos = new ArrayList<AttributeInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAddressPoolAvailableConfigResponse.AttributeInfos.Length"); i++) {
			AttributeInfo attributeInfo = new AttributeInfo();
			attributeInfo.setLineCode(_ctx.stringValue("DescribeDnsGtmAddressPoolAvailableConfigResponse.AttributeInfos["+ i +"].LineCode"));
			attributeInfo.setLineName(_ctx.stringValue("DescribeDnsGtmAddressPoolAvailableConfigResponse.AttributeInfos["+ i +"].LineName"));
			attributeInfo.setGroupCode(_ctx.stringValue("DescribeDnsGtmAddressPoolAvailableConfigResponse.AttributeInfos["+ i +"].GroupCode"));
			attributeInfo.setGroupName(_ctx.stringValue("DescribeDnsGtmAddressPoolAvailableConfigResponse.AttributeInfos["+ i +"].GroupName"));
			attributeInfo.setFatherCode(_ctx.stringValue("DescribeDnsGtmAddressPoolAvailableConfigResponse.AttributeInfos["+ i +"].FatherCode"));

			attributeInfos.add(attributeInfo);
		}
		describeDnsGtmAddressPoolAvailableConfigResponse.setAttributeInfos(attributeInfos);
	 
	 	return describeDnsGtmAddressPoolAvailableConfigResponse;
	}
}