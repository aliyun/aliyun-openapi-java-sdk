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

package com.aliyuncs.dfs.transform.v20180620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dfs.model.v20180620.GetRegionResponse;
import com.aliyuncs.dfs.model.v20180620.GetRegionResponse.AvailableZone;
import com.aliyuncs.dfs.model.v20180620.GetRegionResponse.AvailableZone.Option;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegionResponseUnmarshaller {

	public static GetRegionResponse unmarshall(GetRegionResponse getRegionResponse, UnmarshallerContext _ctx) {
		
		getRegionResponse.setRequestId(_ctx.stringValue("GetRegionResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setZoneId(_ctx.stringValue("GetRegionResponse.AvailableZones["+ i +"].ZoneId"));

			List<Option> options = new ArrayList<Option>();
			for (int j = 0; j < _ctx.lengthValue("GetRegionResponse.AvailableZones["+ i +"].Options.Length"); j++) {
				Option option = new Option();
				option.setStorageType(_ctx.stringValue("GetRegionResponse.AvailableZones["+ i +"].Options["+ j +"].StorageType"));
				option.setProtocolType(_ctx.stringValue("GetRegionResponse.AvailableZones["+ i +"].Options["+ j +"].ProtocolType"));

				options.add(option);
			}
			availableZone.setOptions(options);

			availableZones.add(availableZone);
		}
		getRegionResponse.setAvailableZones(availableZones);
	 
	 	return getRegionResponse;
	}
}