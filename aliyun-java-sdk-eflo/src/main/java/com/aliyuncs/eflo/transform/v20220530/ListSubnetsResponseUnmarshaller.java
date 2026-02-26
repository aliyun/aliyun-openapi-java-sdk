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

import com.aliyuncs.eflo.model.v20220530.ListSubnetsResponse;
import com.aliyuncs.eflo.model.v20220530.ListSubnetsResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListSubnetsResponse.Content.DataItem;
import com.aliyuncs.eflo.model.v20220530.ListSubnetsResponse.Content.DataItem.Tag;
import com.aliyuncs.eflo.model.v20220530.ListSubnetsResponse.Content.DataItem.VpdBaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubnetsResponseUnmarshaller {

	public static ListSubnetsResponse unmarshall(ListSubnetsResponse listSubnetsResponse, UnmarshallerContext _ctx) {
		
		listSubnetsResponse.setRequestId(_ctx.stringValue("ListSubnetsResponse.RequestId"));
		listSubnetsResponse.setCode(_ctx.integerValue("ListSubnetsResponse.Code"));
		listSubnetsResponse.setMessage(_ctx.stringValue("ListSubnetsResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListSubnetsResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSubnetsResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreateTime(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGmtModified(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setTenantId(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setRegionId(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setZoneId(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].ZoneId"));
			dataItem.setType(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].Type"));
			dataItem.setSubnetId(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].SubnetId"));
			dataItem.setSubnetName(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].SubnetName"));
			dataItem.setCidr(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].Cidr"));
			dataItem.setVpdId(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].VpdId"));
			dataItem.setStatus(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].Status"));
			dataItem.setMessage(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].Message"));
			dataItem.setNcCount(_ctx.integerValue("ListSubnetsResponse.Content.Data["+ i +"].NcCount"));
			dataItem.setNetworkInterfaceCount(_ctx.integerValue("ListSubnetsResponse.Content.Data["+ i +"].NetworkInterfaceCount"));
			dataItem.setResourceGroupId(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].ResourceGroupId"));

			VpdBaseInfo vpdBaseInfo = new VpdBaseInfo();
			vpdBaseInfo.setVpdId(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].VpdBaseInfo.VpdId"));
			vpdBaseInfo.setVpdName(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].VpdBaseInfo.VpdName"));
			vpdBaseInfo.setCidr(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].VpdBaseInfo.Cidr"));
			vpdBaseInfo.setCreateTime(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].VpdBaseInfo.CreateTime"));
			dataItem.setVpdBaseInfo(vpdBaseInfo);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListSubnetsResponse.Content.Data["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListSubnetsResponse.Content.Data["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			dataItem.setTags(tags);

			data.add(dataItem);
		}
		content.setData(data);
		listSubnetsResponse.setContent(content);
	 
	 	return listSubnetsResponse;
	}
}