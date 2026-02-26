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

package com.aliyuncs.schedulerx3.transform.v20240624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx3.model.v20240624.ListRegionZoneResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListRegionZoneResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRegionZoneResponseUnmarshaller {

	public static ListRegionZoneResponse unmarshall(ListRegionZoneResponse listRegionZoneResponse, UnmarshallerContext _ctx) {
		
		listRegionZoneResponse.setRequestId(_ctx.stringValue("ListRegionZoneResponse.RequestId"));
		listRegionZoneResponse.setCode(_ctx.integerValue("ListRegionZoneResponse.Code"));
		listRegionZoneResponse.setErrorCode(_ctx.stringValue("ListRegionZoneResponse.ErrorCode"));
		listRegionZoneResponse.setSuccess(_ctx.booleanValue("ListRegionZoneResponse.Success"));
		listRegionZoneResponse.setMessage(_ctx.stringValue("ListRegionZoneResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRegionZoneResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setZoneId(_ctx.stringValue("ListRegionZoneResponse.Data["+ i +"].ZoneId"));
			dataItem.setLocalName(_ctx.stringValue("ListRegionZoneResponse.Data["+ i +"].LocalName"));

			data.add(dataItem);
		}
		listRegionZoneResponse.setData(data);
	 
	 	return listRegionZoneResponse;
	}
}