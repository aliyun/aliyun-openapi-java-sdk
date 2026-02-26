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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListWirelessCloudConnectorGroupsResponse;
import com.aliyuncs.cc5g.model.v20220314.ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroup;
import com.aliyuncs.cc5g.model.v20220314.ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroup.WirelessCloudConnector;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWirelessCloudConnectorGroupsResponseUnmarshaller {

	public static ListWirelessCloudConnectorGroupsResponse unmarshall(ListWirelessCloudConnectorGroupsResponse listWirelessCloudConnectorGroupsResponse, UnmarshallerContext _ctx) {
		
		listWirelessCloudConnectorGroupsResponse.setRequestId(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.RequestId"));
		listWirelessCloudConnectorGroupsResponse.setNextToken(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.NextToken"));
		listWirelessCloudConnectorGroupsResponse.setMaxResults(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.MaxResults"));
		listWirelessCloudConnectorGroupsResponse.setTotalCount(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.TotalCount"));

		List<WirelessCloudConnectorGroup> wirelessCloudConnectorGroups = new ArrayList<WirelessCloudConnectorGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups.Length"); i++) {
			WirelessCloudConnectorGroup wirelessCloudConnectorGroup = new WirelessCloudConnectorGroup();
			wirelessCloudConnectorGroup.setWirelessCloudConnectorGroupId(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectorGroupId"));
			wirelessCloudConnectorGroup.setStatus(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].Status"));
			wirelessCloudConnectorGroup.setName(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].Name"));
			wirelessCloudConnectorGroup.setDescription(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].Description"));
			wirelessCloudConnectorGroup.setRegionId(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].RegionId"));
			wirelessCloudConnectorGroup.setCreateTime(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].CreateTime"));

			List<WirelessCloudConnector> wirelessCloudConnectors = new ArrayList<WirelessCloudConnector>();
			for (int j = 0; j < _ctx.lengthValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors.Length"); j++) {
				WirelessCloudConnector wirelessCloudConnector = new WirelessCloudConnector();
				wirelessCloudConnector.setWirelessCloudConnectorId(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].WirelessCloudConnectorId"));
				wirelessCloudConnector.setStatus(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].Status"));
				wirelessCloudConnector.setName(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].Name"));
				wirelessCloudConnector.setDescription(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].Description"));
				wirelessCloudConnector.setRegionId(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].RegionId"));
				wirelessCloudConnector.setUseCase(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].UseCase"));
				wirelessCloudConnector.setDataPackageId(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].DataPackageId"));
				wirelessCloudConnector.setDataPackageType(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].DataPackageType"));
				wirelessCloudConnector.setCardCount(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].CardCount"));
				wirelessCloudConnector.setCreateTime(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].CreateTime"));
				wirelessCloudConnector.setBusinessType(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].BusinessType"));
				wirelessCloudConnector.setServiceType(_ctx.stringValue("ListWirelessCloudConnectorGroupsResponse.WirelessCloudConnectorGroups["+ i +"].WirelessCloudConnectors["+ j +"].ServiceType"));

				wirelessCloudConnectors.add(wirelessCloudConnector);
			}
			wirelessCloudConnectorGroup.setWirelessCloudConnectors(wirelessCloudConnectors);

			wirelessCloudConnectorGroups.add(wirelessCloudConnectorGroup);
		}
		listWirelessCloudConnectorGroupsResponse.setWirelessCloudConnectorGroups(wirelessCloudConnectorGroups);
	 
	 	return listWirelessCloudConnectorGroupsResponse;
	}
}