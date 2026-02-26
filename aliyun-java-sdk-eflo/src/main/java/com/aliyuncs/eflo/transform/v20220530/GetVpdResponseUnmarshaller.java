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

import com.aliyuncs.eflo.model.v20220530.GetVpdResponse;
import com.aliyuncs.eflo.model.v20220530.GetVpdResponse.Content;
import com.aliyuncs.eflo.model.v20220530.GetVpdResponse.Content.ErInfo;
import com.aliyuncs.eflo.model.v20220530.GetVpdResponse.Content.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpdResponseUnmarshaller {

	public static GetVpdResponse unmarshall(GetVpdResponse getVpdResponse, UnmarshallerContext _ctx) {
		
		getVpdResponse.setRequestId(_ctx.stringValue("GetVpdResponse.RequestId"));
		getVpdResponse.setCode(_ctx.integerValue("GetVpdResponse.Code"));
		getVpdResponse.setMessage(_ctx.stringValue("GetVpdResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetVpdResponse.Content.RegionId"));
		content.setVpdId(_ctx.stringValue("GetVpdResponse.Content.VpdId"));
		content.setVpdName(_ctx.stringValue("GetVpdResponse.Content.VpdName"));
		content.setCidr(_ctx.stringValue("GetVpdResponse.Content.Cidr"));
		content.setServiceCidr(_ctx.stringValue("GetVpdResponse.Content.ServiceCidr"));
		content.setStatus(_ctx.stringValue("GetVpdResponse.Content.Status"));
		content.setMessage(_ctx.stringValue("GetVpdResponse.Content.Message"));
		content.setNcCount(_ctx.integerValue("GetVpdResponse.Content.NcCount"));
		content.setNetworkInterfaceCount(_ctx.integerValue("GetVpdResponse.Content.NetworkInterfaceCount"));
		content.setSubnetCount(_ctx.longValue("GetVpdResponse.Content.SubnetCount"));
		content.setCreateTime(_ctx.stringValue("GetVpdResponse.Content.CreateTime"));
		content.setGmtModified(_ctx.stringValue("GetVpdResponse.Content.GmtModified"));
		content.setTenantId(_ctx.stringValue("GetVpdResponse.Content.TenantId"));
		content.setAttachErStatus(_ctx.booleanValue("GetVpdResponse.Content.AttachErStatus"));
		content.setResourceGroupId(_ctx.stringValue("GetVpdResponse.Content.ResourceGroupId"));
		content.setQuota(_ctx.integerValue("GetVpdResponse.Content.Quota"));
		content.setPrivateIpCount(_ctx.longValue("GetVpdResponse.Content.PrivateIpCount"));

		List<String> secondaryCidrBlocks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVpdResponse.Content.SecondaryCidrBlocks.Length"); i++) {
			secondaryCidrBlocks.add(_ctx.stringValue("GetVpdResponse.Content.SecondaryCidrBlocks["+ i +"]"));
		}
		content.setSecondaryCidrBlocks(secondaryCidrBlocks);

		List<ErInfo> erInfos = new ArrayList<ErInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetVpdResponse.Content.ErInfos.Length"); i++) {
			ErInfo erInfo = new ErInfo();
			erInfo.setCreateTime(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].CreateTime"));
			erInfo.setGmtModified(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].GmtModified"));
			erInfo.setMessage(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].Message"));
			erInfo.setErId(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].ErId"));
			erInfo.setRegionId(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].RegionId"));
			erInfo.setTenantId(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].TenantId"));
			erInfo.setStatus(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].Status"));
			erInfo.setErName(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].ErName"));
			erInfo.setMasterZoneId(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].MasterZoneId"));
			erInfo.setDescription(_ctx.stringValue("GetVpdResponse.Content.ErInfos["+ i +"].Description"));
			erInfo.setConnections(_ctx.longValue("GetVpdResponse.Content.ErInfos["+ i +"].Connections"));
			erInfo.setRouteMaps(_ctx.longValue("GetVpdResponse.Content.ErInfos["+ i +"].RouteMaps"));

			erInfos.add(erInfo);
		}
		content.setErInfos(erInfos);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetVpdResponse.Content.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetVpdResponse.Content.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetVpdResponse.Content.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		content.setTags(tags);
		getVpdResponse.setContent(content);
	 
	 	return getVpdResponse;
	}
}