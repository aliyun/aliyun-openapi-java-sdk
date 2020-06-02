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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListInstanceRegionResponse;
import com.aliyuncs.cr.model.v20181201.ListInstanceRegionResponse.RegionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceRegionResponseUnmarshaller {

	public static ListInstanceRegionResponse unmarshall(ListInstanceRegionResponse listInstanceRegionResponse, UnmarshallerContext _ctx) {
		
		listInstanceRegionResponse.setRequestId(_ctx.stringValue("ListInstanceRegionResponse.RequestId"));
		listInstanceRegionResponse.setIsSuccess(_ctx.booleanValue("ListInstanceRegionResponse.IsSuccess"));
		listInstanceRegionResponse.setCode(_ctx.stringValue("ListInstanceRegionResponse.Code"));

		List<RegionsItem> regions = new ArrayList<RegionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceRegionResponse.Regions.Length"); i++) {
			RegionsItem regionsItem = new RegionsItem();
			regionsItem.setRegionId(_ctx.stringValue("ListInstanceRegionResponse.Regions["+ i +"].RegionId"));
			regionsItem.setLocalName(_ctx.stringValue("ListInstanceRegionResponse.Regions["+ i +"].LocalName"));

			regions.add(regionsItem);
		}
		listInstanceRegionResponse.setRegions(regions);
	 
	 	return listInstanceRegionResponse;
	}
}