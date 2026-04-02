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

import com.aliyuncs.eflo.model.v20220530.GetErResponse;
import com.aliyuncs.eflo.model.v20220530.GetErResponse.Content;
import com.aliyuncs.eflo.model.v20220530.GetErResponse.Content.ErAttachment;
import com.aliyuncs.eflo.model.v20220530.GetErResponse.Content.ErRouteEntry;
import com.aliyuncs.eflo.model.v20220530.GetErResponse.Content.ErRouteMap;
import com.aliyuncs.eflo.model.v20220530.GetErResponse.Content.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetErResponseUnmarshaller {

	public static GetErResponse unmarshall(GetErResponse getErResponse, UnmarshallerContext _ctx) {
		
		getErResponse.setRequestId(_ctx.stringValue("GetErResponse.RequestId"));
		getErResponse.setCode(_ctx.integerValue("GetErResponse.Code"));
		getErResponse.setMessage(_ctx.stringValue("GetErResponse.Message"));
		getErResponse.setAccessDeniedDetail(_ctx.stringValue("GetErResponse.AccessDeniedDetail"));

		Content content = new Content();
		content.setCreateTime(_ctx.stringValue("GetErResponse.Content.CreateTime"));
		content.setGmtModified(_ctx.stringValue("GetErResponse.Content.GmtModified"));
		content.setMessage(_ctx.stringValue("GetErResponse.Content.Message"));
		content.setErId(_ctx.stringValue("GetErResponse.Content.ErId"));
		content.setRegionId(_ctx.stringValue("GetErResponse.Content.RegionId"));
		content.setTenantId(_ctx.stringValue("GetErResponse.Content.TenantId"));
		content.setStatus(_ctx.stringValue("GetErResponse.Content.Status"));
		content.setErName(_ctx.stringValue("GetErResponse.Content.ErName"));
		content.setMasterZoneId(_ctx.stringValue("GetErResponse.Content.MasterZoneId"));
		content.setDescription(_ctx.stringValue("GetErResponse.Content.Description"));
		content.setResourceGroupId(_ctx.stringValue("GetErResponse.Content.ResourceGroupId"));

		List<ErAttachment> erAttachments = new ArrayList<ErAttachment>();
		for (int i = 0; i < _ctx.lengthValue("GetErResponse.Content.ErAttachments.Length"); i++) {
			ErAttachment erAttachment = new ErAttachment();
			erAttachment.setStatus(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].Status"));
			erAttachment.setMessage(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].Message"));
			erAttachment.setResourceGroupId(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].ResourceGroupId"));
			erAttachment.setInstanceId(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].InstanceId"));
			erAttachment.setCreateTime(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].CreateTime"));
			erAttachment.setGmtModified(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].GmtModified"));
			erAttachment.setErId(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].ErId"));
			erAttachment.setAcross(_ctx.booleanValue("GetErResponse.Content.ErAttachments["+ i +"].Across"));
			erAttachment.setInstanceName(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].InstanceName"));
			erAttachment.setTenantId(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].TenantId"));
			erAttachment.setResourceTenantId(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].ResourceTenantId"));
			erAttachment.setAutoReceiveAllRoute(_ctx.booleanValue("GetErResponse.Content.ErAttachments["+ i +"].AutoReceiveAllRoute"));
			erAttachment.setErAttachmentName(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].ErAttachmentName"));
			erAttachment.setErAttachmentId(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].ErAttachmentId"));
			erAttachment.setRegionId(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].RegionId"));
			erAttachment.setInstanceType(_ctx.stringValue("GetErResponse.Content.ErAttachments["+ i +"].InstanceType"));

			erAttachments.add(erAttachment);
		}
		content.setErAttachments(erAttachments);

		List<ErRouteMap> erRouteMaps = new ArrayList<ErRouteMap>();
		for (int i = 0; i < _ctx.lengthValue("GetErResponse.Content.ErRouteMaps.Length"); i++) {
			ErRouteMap erRouteMap = new ErRouteMap();
			erRouteMap.setStatus(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].Status"));
			erRouteMap.setTransmissionInstanceType(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].TransmissionInstanceType"));
			erRouteMap.setAction(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].Action"));
			erRouteMap.setDescription(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].Description"));
			erRouteMap.setReceptionInstanceType(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].ReceptionInstanceType"));
			erRouteMap.setMessage(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].Message"));
			erRouteMap.setErRouteMapName(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].ErRouteMapName"));
			erRouteMap.setReceptionInstanceId(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].ReceptionInstanceId"));
			erRouteMap.setResourceGroupId(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].ResourceGroupId"));
			erRouteMap.setCreateTime(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].CreateTime"));
			erRouteMap.setGmtModified(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].GmtModified"));
			erRouteMap.setErId(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].ErId"));
			erRouteMap.setTransmissionInstanceName(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].TransmissionInstanceName"));
			erRouteMap.setDestinationCidrBlock(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].DestinationCidrBlock"));
			erRouteMap.setReceptionInstanceOwner(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].ReceptionInstanceOwner"));
			erRouteMap.setTenantId(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].TenantId"));
			erRouteMap.setReceptionInstanceName(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].ReceptionInstanceName"));
			erRouteMap.setErRouteMapId(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].ErRouteMapId"));
			erRouteMap.setTransmissionInstanceOwner(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].TransmissionInstanceOwner"));
			erRouteMap.setRegionId(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].RegionId"));
			erRouteMap.setTransmissionInstanceId(_ctx.stringValue("GetErResponse.Content.ErRouteMaps["+ i +"].TransmissionInstanceId"));
			erRouteMap.setRouteMapNum(_ctx.integerValue("GetErResponse.Content.ErRouteMaps["+ i +"].RouteMapNum"));

			erRouteMaps.add(erRouteMap);
		}
		content.setErRouteMaps(erRouteMaps);

		List<ErRouteEntry> erRouteEntrys = new ArrayList<ErRouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("GetErResponse.Content.ErRouteEntrys.Length"); i++) {
			ErRouteEntry erRouteEntry = new ErRouteEntry();
			erRouteEntry.setStatus(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].Status"));
			erRouteEntry.setNextHopType(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].NextHopType"));
			erRouteEntry.setTenantId(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].TenantId"));
			erRouteEntry.setResourceTenantId(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].ResourceTenantId"));
			erRouteEntry.setRouteType(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].RouteType"));
			erRouteEntry.setErRouteEntryId(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].ErRouteEntryId"));
			erRouteEntry.setResourceGroupId(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].ResourceGroupId"));
			erRouteEntry.setNextHopId(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].NextHopId"));
			erRouteEntry.setGmtModified(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].GmtModified"));
			erRouteEntry.setErId(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].ErId"));
			erRouteEntry.setRegionId(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].RegionId"));
			erRouteEntry.setDestinationCidrBlock(_ctx.stringValue("GetErResponse.Content.ErRouteEntrys["+ i +"].DestinationCidrBlock"));

			erRouteEntrys.add(erRouteEntry);
		}
		content.setErRouteEntrys(erRouteEntrys);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetErResponse.Content.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetErResponse.Content.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetErResponse.Content.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		content.setTags(tags);
		getErResponse.setContent(content);
	 
	 	return getErResponse;
	}
}