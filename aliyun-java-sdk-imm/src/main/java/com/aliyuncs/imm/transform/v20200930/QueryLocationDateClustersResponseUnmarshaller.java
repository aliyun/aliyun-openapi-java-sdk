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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.QueryLocationDateClustersResponse;
import com.aliyuncs.imm.model.v20200930.QueryLocationDateClustersResponse.LocationDateClustersItem;
import com.aliyuncs.imm.model.v20200930.QueryLocationDateClustersResponse.LocationDateClustersItem.AddressesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLocationDateClustersResponseUnmarshaller {

	public static QueryLocationDateClustersResponse unmarshall(QueryLocationDateClustersResponse queryLocationDateClustersResponse, UnmarshallerContext _ctx) {
		
		queryLocationDateClustersResponse.setRequestId(_ctx.stringValue("QueryLocationDateClustersResponse.RequestId"));
		queryLocationDateClustersResponse.setNextToken(_ctx.stringValue("QueryLocationDateClustersResponse.NextToken"));

		List<LocationDateClustersItem> locationDateClusters = new ArrayList<LocationDateClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLocationDateClustersResponse.LocationDateClusters.Length"); i++) {
			LocationDateClustersItem locationDateClustersItem = new LocationDateClustersItem();
			locationDateClustersItem.setTitle(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Title"));
			locationDateClustersItem.setLocationDateClusterLevel(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].LocationDateClusterLevel"));
			locationDateClustersItem.setLocationDateClusterStartTime(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].LocationDateClusterStartTime"));
			locationDateClustersItem.setLocationDateClusterEndTime(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].LocationDateClusterEndTime"));
			locationDateClustersItem.setObjectId(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].ObjectId"));
			locationDateClustersItem.setUpdateTime(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].UpdateTime"));
			locationDateClustersItem.setCreateTime(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].CreateTime"));
			locationDateClustersItem.setCustomId(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].CustomId"));
			locationDateClustersItem.setCustomLabels(_ctx.mapValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].CustomLabels"));

			List<AddressesItem> addresses = new ArrayList<AddressesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Addresses.Length"); j++) {
				AddressesItem addressesItem = new AddressesItem();
				addressesItem.setLanguage(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Addresses["+ j +"].Language"));
				addressesItem.setAddressLine(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Addresses["+ j +"].AddressLine"));
				addressesItem.setCountry(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Addresses["+ j +"].Country"));
				addressesItem.setProvince(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Addresses["+ j +"].Province"));
				addressesItem.setCity(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Addresses["+ j +"].City"));
				addressesItem.setDistrict(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Addresses["+ j +"].District"));
				addressesItem.setTownship(_ctx.stringValue("QueryLocationDateClustersResponse.LocationDateClusters["+ i +"].Addresses["+ j +"].Township"));

				addresses.add(addressesItem);
			}
			locationDateClustersItem.setAddresses(addresses);

			locationDateClusters.add(locationDateClustersItem);
		}
		queryLocationDateClustersResponse.setLocationDateClusters(locationDateClusters);
	 
	 	return queryLocationDateClustersResponse;
	}
}