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

import com.aliyuncs.eflo.model.v20220530.ListVccsResponse;
import com.aliyuncs.eflo.model.v20220530.ListVccsResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListVccsResponse.Content.DataItem;
import com.aliyuncs.eflo.model.v20220530.ListVccsResponse.Content.DataItem.ErInfo;
import com.aliyuncs.eflo.model.v20220530.ListVccsResponse.Content.DataItem.Tag;
import com.aliyuncs.eflo.model.v20220530.ListVccsResponse.Content.DataItem.VpdBaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVccsResponseUnmarshaller {

	public static ListVccsResponse unmarshall(ListVccsResponse listVccsResponse, UnmarshallerContext _ctx) {
		
		listVccsResponse.setRequestId(_ctx.stringValue("ListVccsResponse.RequestId"));
		listVccsResponse.setCode(_ctx.integerValue("ListVccsResponse.Code"));
		listVccsResponse.setMessage(_ctx.stringValue("ListVccsResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListVccsResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVccsResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTenantId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setRegionId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setZoneId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ZoneId"));
			dataItem.setVccId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].VccId"));
			dataItem.setVpdId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].VpdId"));
			dataItem.setVpcId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].VpcId"));
			dataItem.setCenId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].CenId"));
			dataItem.setVccName(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].VccName"));
			dataItem.setAccessPointId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].AccessPointId"));
			dataItem.setLineOperator(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].LineOperator"));
			dataItem.setSpec(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].Spec"));
			dataItem.setPortType(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].PortType"));
			dataItem.setStatus(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].Status"));
			dataItem.setCurrentNode(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].CurrentNode"));
			dataItem.setMessage(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].Message"));
			dataItem.setCreateTime(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGmtModified(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setTaskId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].TaskId"));
			dataItem.setRate(_ctx.doubleValue("ListVccsResponse.Content.Data["+ i +"].Rate"));
			dataItem.setBandwidthStr(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].BandwidthStr"));
			dataItem.setCommodityCode(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].CommodityCode"));
			dataItem.setBgpCidr(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].BgpCidr"));
			dataItem.setExpirationDate(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ExpirationDate"));
			dataItem.setResourceGroupId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ResourceGroupId"));
			dataItem.setConnectionType(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ConnectionType"));

			VpdBaseInfo vpdBaseInfo = new VpdBaseInfo();
			vpdBaseInfo.setVpdId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].VpdBaseInfo.VpdId"));
			vpdBaseInfo.setVpdName(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].VpdBaseInfo.VpdName"));
			vpdBaseInfo.setCidr(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].VpdBaseInfo.Cidr"));
			vpdBaseInfo.setCreateTime(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].VpdBaseInfo.CreateTime"));
			dataItem.setVpdBaseInfo(vpdBaseInfo);

			List<ErInfo> erInfos = new ArrayList<ErInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListVccsResponse.Content.Data["+ i +"].ErInfos.Length"); j++) {
				ErInfo erInfo = new ErInfo();
				erInfo.setCreateTime(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].CreateTime"));
				erInfo.setGmtModified(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].GmtModified"));
				erInfo.setMessage(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].Message"));
				erInfo.setErId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].ErId"));
				erInfo.setRegionId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].RegionId"));
				erInfo.setTenantId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].TenantId"));
				erInfo.setStatus(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].Status"));
				erInfo.setErName(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].ErName"));
				erInfo.setMasterZoneId(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].MasterZoneId"));
				erInfo.setDescription(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].Description"));
				erInfo.setConnections(_ctx.longValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].Connections"));
				erInfo.setRouteMaps(_ctx.longValue("ListVccsResponse.Content.Data["+ i +"].ErInfos["+ j +"].RouteMaps"));

				erInfos.add(erInfo);
			}
			dataItem.setErInfos(erInfos);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListVccsResponse.Content.Data["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListVccsResponse.Content.Data["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			dataItem.setTags(tags);

			data.add(dataItem);
		}
		content.setData(data);
		listVccsResponse.setContent(content);
	 
	 	return listVccsResponse;
	}
}