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

import com.aliyuncs.eflo.model.v20220530.ListVpdsResponse;
import com.aliyuncs.eflo.model.v20220530.ListVpdsResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListVpdsResponse.Content.DataItem;
import com.aliyuncs.eflo.model.v20220530.ListVpdsResponse.Content.DataItem.ErInfo;
import com.aliyuncs.eflo.model.v20220530.ListVpdsResponse.Content.DataItem.Tag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpdsResponseUnmarshaller {

	public static ListVpdsResponse unmarshall(ListVpdsResponse listVpdsResponse, UnmarshallerContext _ctx) {
		
		listVpdsResponse.setRequestId(_ctx.stringValue("ListVpdsResponse.RequestId"));
		listVpdsResponse.setCode(_ctx.integerValue("ListVpdsResponse.Code"));
		listVpdsResponse.setMessage(_ctx.stringValue("ListVpdsResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListVpdsResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVpdsResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTenantId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setRegionId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setVpdId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].VpdId"));
			dataItem.setVpdName(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].VpdName"));
			dataItem.setCidr(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Cidr"));
			dataItem.setServiceCidr(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ServiceCidr"));
			dataItem.setStatus(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Status"));
			dataItem.setMessage(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Message"));
			dataItem.setNcCount(_ctx.integerValue("ListVpdsResponse.Content.Data["+ i +"].NcCount"));
			dataItem.setNetworkInterfaceCount(_ctx.integerValue("ListVpdsResponse.Content.Data["+ i +"].NetworkInterfaceCount"));
			dataItem.setSubnetCount(_ctx.integerValue("ListVpdsResponse.Content.Data["+ i +"].SubnetCount"));
			dataItem.setCreateTime(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGmtModified(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setDependence(_ctx.mapValue("ListVpdsResponse.Content.Data["+ i +"].Dependence"));
			dataItem.setResourceGroupId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ResourceGroupId"));

			List<String> secondaryCidrBlocks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListVpdsResponse.Content.Data["+ i +"].SecondaryCidrBlocks.Length"); j++) {
				secondaryCidrBlocks.add(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].SecondaryCidrBlocks["+ j +"]"));
			}
			dataItem.setSecondaryCidrBlocks(secondaryCidrBlocks);

			List<ErInfo> erInfos = new ArrayList<ErInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos.Length"); j++) {
				ErInfo erInfo = new ErInfo();
				erInfo.setCreateTime(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].CreateTime"));
				erInfo.setGmtModified(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].GmtModified"));
				erInfo.setMessage(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].Message"));
				erInfo.setErId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].ErId"));
				erInfo.setRegionId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].RegionId"));
				erInfo.setTenantId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].TenantId"));
				erInfo.setStatus(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].Status"));
				erInfo.setErName(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].ErName"));
				erInfo.setMasterZoneId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].MasterZoneId"));
				erInfo.setDescription(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].Description"));
				erInfo.setConnections(_ctx.longValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].Connections"));
				erInfo.setRouteMaps(_ctx.longValue("ListVpdsResponse.Content.Data["+ i +"].ErInfos["+ j +"].RouteMaps"));

				erInfos.add(erInfo);
			}
			dataItem.setErInfos(erInfos);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListVpdsResponse.Content.Data["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			dataItem.setTags(tags);

			data.add(dataItem);
		}
		content.setData(data);
		listVpdsResponse.setContent(content);
	 
	 	return listVpdsResponse;
	}
}