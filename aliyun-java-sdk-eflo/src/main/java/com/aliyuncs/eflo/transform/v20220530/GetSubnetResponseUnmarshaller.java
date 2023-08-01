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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.GetSubnetResponse;
import com.aliyuncs.eflo.model.v20220530.GetSubnetResponse.Content;
import com.aliyuncs.eflo.model.v20220530.GetSubnetResponse.Content.Tag;
import com.aliyuncs.eflo.model.v20220530.GetSubnetResponse.Content.VpdBaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubnetResponseUnmarshaller {

	public static GetSubnetResponse unmarshall(GetSubnetResponse getSubnetResponse, UnmarshallerContext _ctx) {
		
		getSubnetResponse.setRequestId(_ctx.stringValue("GetSubnetResponse.RequestId"));
		getSubnetResponse.setCode(_ctx.integerValue("GetSubnetResponse.Code"));
		getSubnetResponse.setMessage(_ctx.stringValue("GetSubnetResponse.Message"));

		Content content = new Content();
		content.setCreateTime(_ctx.stringValue("GetSubnetResponse.Content.CreateTime"));
		content.setGmtModified(_ctx.stringValue("GetSubnetResponse.Content.GmtModified"));
		content.setTenantId(_ctx.stringValue("GetSubnetResponse.Content.TenantId"));
		content.setRegionId(_ctx.stringValue("GetSubnetResponse.Content.RegionId"));
		content.setZoneId(_ctx.stringValue("GetSubnetResponse.Content.ZoneId"));
		content.setSubnetId(_ctx.stringValue("GetSubnetResponse.Content.SubnetId"));
		content.setSubnetName(_ctx.stringValue("GetSubnetResponse.Content.SubnetName"));
		content.setCidr(_ctx.stringValue("GetSubnetResponse.Content.Cidr"));
		content.setVpdId(_ctx.stringValue("GetSubnetResponse.Content.VpdId"));
		content.setType(_ctx.stringValue("GetSubnetResponse.Content.Type"));
		content.setStatus(_ctx.stringValue("GetSubnetResponse.Content.Status"));
		content.setMessage(_ctx.stringValue("GetSubnetResponse.Content.Message"));
		content.setNcCount(_ctx.integerValue("GetSubnetResponse.Content.NcCount"));
		content.setNetworkInterfaceCount(_ctx.integerValue("GetSubnetResponse.Content.NetworkInterfaceCount"));
		content.setLbCount(_ctx.longValue("GetSubnetResponse.Content.LbCount"));
		content.setResourceGroupId(_ctx.stringValue("GetSubnetResponse.Content.ResourceGroupId"));
		content.setPrivateIpCount(_ctx.longValue("GetSubnetResponse.Content.PrivateIpCount"));
		content.setAvailableIps(_ctx.integerValue("GetSubnetResponse.Content.AvailableIps"));

		VpdBaseInfo vpdBaseInfo = new VpdBaseInfo();
		vpdBaseInfo.setVpdId(_ctx.stringValue("GetSubnetResponse.Content.VpdBaseInfo.VpdId"));
		vpdBaseInfo.setVpdName(_ctx.stringValue("GetSubnetResponse.Content.VpdBaseInfo.VpdName"));
		vpdBaseInfo.setCidr(_ctx.stringValue("GetSubnetResponse.Content.VpdBaseInfo.Cidr"));
		vpdBaseInfo.setCreateTime(_ctx.stringValue("GetSubnetResponse.Content.VpdBaseInfo.CreateTime"));
		content.setVpdBaseInfo(vpdBaseInfo);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetSubnetResponse.Content.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetSubnetResponse.Content.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetSubnetResponse.Content.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		content.setTags(tags);
		getSubnetResponse.setContent(content);
	 
	 	return getSubnetResponse;
	}
}