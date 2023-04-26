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

import com.aliyuncs.eflo.model.v20220530.ListErRouteMapsResponse;
import com.aliyuncs.eflo.model.v20220530.ListErRouteMapsResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListErRouteMapsResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListErRouteMapsResponseUnmarshaller {

	public static ListErRouteMapsResponse unmarshall(ListErRouteMapsResponse listErRouteMapsResponse, UnmarshallerContext _ctx) {
		
		listErRouteMapsResponse.setRequestId(_ctx.stringValue("ListErRouteMapsResponse.RequestId"));
		listErRouteMapsResponse.setCode(_ctx.integerValue("ListErRouteMapsResponse.Code"));
		listErRouteMapsResponse.setMessage(_ctx.stringValue("ListErRouteMapsResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListErRouteMapsResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListErRouteMapsResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setTenantId(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setCreateTime(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGmtModified(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setMessage(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].Message"));
			dataItem.setStatus(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].Status"));
			dataItem.setErRouteMapId(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].ErRouteMapId"));
			dataItem.setErId(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].ErId"));
			dataItem.setRouteMapNum(_ctx.integerValue("ListErRouteMapsResponse.Content.Data["+ i +"].RouteMapNum"));
			dataItem.setDescription(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].Description"));
			dataItem.setDestinationCidrBlock(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].DestinationCidrBlock"));
			dataItem.setTransmissionInstanceName(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].TransmissionInstanceName"));
			dataItem.setTransmissionInstanceId(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].TransmissionInstanceId"));
			dataItem.setTransmissionInstanceType(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].TransmissionInstanceType"));
			dataItem.setReceptionInstanceName(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].ReceptionInstanceName"));
			dataItem.setReceptionInstanceId(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].ReceptionInstanceId"));
			dataItem.setReceptionInstanceType(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].ReceptionInstanceType"));
			dataItem.setAction(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].Action"));
			dataItem.setTransmissionInstanceOwner(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].TransmissionInstanceOwner"));
			dataItem.setReceptionInstanceOwner(_ctx.stringValue("ListErRouteMapsResponse.Content.Data["+ i +"].ReceptionInstanceOwner"));

			data.add(dataItem);
		}
		content.setData(data);
		listErRouteMapsResponse.setContent(content);
	 
	 	return listErRouteMapsResponse;
	}
}