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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountResourceConfigurationResponse;
import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountResourceConfigurationResponse.IpAddressAttribute;
import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountResourceConfigurationResponse.Tag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMultiAccountResourceConfigurationResponseUnmarshaller {

	public static GetMultiAccountResourceConfigurationResponse unmarshall(GetMultiAccountResourceConfigurationResponse getMultiAccountResourceConfigurationResponse, UnmarshallerContext _ctx) {
		
		getMultiAccountResourceConfigurationResponse.setRequestId(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.RequestId"));
		getMultiAccountResourceConfigurationResponse.setAccountId(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.AccountId"));
		getMultiAccountResourceConfigurationResponse.setConfiguration(_ctx.mapValue("GetMultiAccountResourceConfigurationResponse.Configuration"));
		getMultiAccountResourceConfigurationResponse.setCreateTime(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.CreateTime"));
		getMultiAccountResourceConfigurationResponse.setExpireTime(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.ExpireTime"));
		getMultiAccountResourceConfigurationResponse.setRegionId(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.RegionId"));
		getMultiAccountResourceConfigurationResponse.setResourceGroupId(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.ResourceGroupId"));
		getMultiAccountResourceConfigurationResponse.setResourceId(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.ResourceId"));
		getMultiAccountResourceConfigurationResponse.setResourceName(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.ResourceName"));
		getMultiAccountResourceConfigurationResponse.setResourceType(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.ResourceType"));
		getMultiAccountResourceConfigurationResponse.setZoneId(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.ZoneId"));

		List<String> ipAddresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetMultiAccountResourceConfigurationResponse.IpAddresses.Length"); i++) {
			ipAddresses.add(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.IpAddresses["+ i +"]"));
		}
		getMultiAccountResourceConfigurationResponse.setIpAddresses(ipAddresses);

		List<IpAddressAttribute> ipAddressAttributes = new ArrayList<IpAddressAttribute>();
		for (int i = 0; i < _ctx.lengthValue("GetMultiAccountResourceConfigurationResponse.IpAddressAttributes.Length"); i++) {
			IpAddressAttribute ipAddressAttribute = new IpAddressAttribute();
			ipAddressAttribute.setIpAddress(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.IpAddressAttributes["+ i +"].IpAddress"));
			ipAddressAttribute.setNetworkType(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.IpAddressAttributes["+ i +"].NetworkType"));
			ipAddressAttribute.setVersion(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.IpAddressAttributes["+ i +"].Version"));

			ipAddressAttributes.add(ipAddressAttribute);
		}
		getMultiAccountResourceConfigurationResponse.setIpAddressAttributes(ipAddressAttributes);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetMultiAccountResourceConfigurationResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetMultiAccountResourceConfigurationResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		getMultiAccountResourceConfigurationResponse.setTags(tags);
	 
	 	return getMultiAccountResourceConfigurationResponse;
	}
}