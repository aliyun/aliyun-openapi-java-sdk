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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListAKSClustersResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSClustersResponse.ListItem;
import com.aliyuncs.sofa.model.v20190815.ListAKSClustersResponse.ListItem.CellInfosItem;
import com.aliyuncs.sofa.model.v20190815.ListAKSClustersResponse.ListItem.NetworkInfo;
import com.aliyuncs.sofa.model.v20190815.ListAKSClustersResponse.ListItem.SecuredGroupInfosItem;
import com.aliyuncs.sofa.model.v20190815.ListAKSClustersResponse.ListItem.ZoneInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSClustersResponseUnmarshaller {

	public static ListAKSClustersResponse unmarshall(ListAKSClustersResponse listAKSClustersResponse, UnmarshallerContext _ctx) {
		
		listAKSClustersResponse.setRequestId(_ctx.stringValue("ListAKSClustersResponse.RequestId"));
		listAKSClustersResponse.setResultCode(_ctx.stringValue("ListAKSClustersResponse.ResultCode"));
		listAKSClustersResponse.setResultMessage(_ctx.stringValue("ListAKSClustersResponse.ResultMessage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSClustersResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAlsProjectName(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].AlsProjectName"));
			listItem.setClusterProviderType(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].ClusterProviderType"));
			listItem.setDisplayName(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].DisplayName"));
			listItem.setEnableLogging(_ctx.booleanValue("ListAKSClustersResponse.List["+ i +"].EnableLogging"));
			listItem.setEnableMesh(_ctx.booleanValue("ListAKSClustersResponse.List["+ i +"].EnableMesh"));
			listItem.setEnableMetis(_ctx.booleanValue("ListAKSClustersResponse.List["+ i +"].EnableMetis"));
			listItem.setId(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].Id"));
			listItem.setInstallType(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].InstallType"));
			listItem.setName(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].Name"));
			listItem.setPodCidr(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].PodCidr"));
			listItem.setServiceCidr(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].ServiceCidr"));
			listItem.setStatus(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].Status"));

			NetworkInfo networkInfo = new NetworkInfo();
			networkInfo.setDescription(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].NetworkInfo.Description"));
			networkInfo.setSegment(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].NetworkInfo.Segment"));
			networkInfo.setType(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].NetworkInfo.Type"));
			listItem.setNetworkInfo(networkInfo);

			List<CellInfosItem> cellInfos = new ArrayList<CellInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAKSClustersResponse.List["+ i +"].CellInfos.Length"); j++) {
				CellInfosItem cellInfosItem = new CellInfosItem();
				cellInfosItem.setDisplayName(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].CellInfos["+ j +"].DisplayName"));
				cellInfosItem.setId(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].CellInfos["+ j +"].Id"));
				cellInfosItem.setName(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].CellInfos["+ j +"].Name"));

				cellInfos.add(cellInfosItem);
			}
			listItem.setCellInfos(cellInfos);

			List<SecuredGroupInfosItem> securedGroupInfos = new ArrayList<SecuredGroupInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAKSClustersResponse.List["+ i +"].SecuredGroupInfos.Length"); j++) {
				SecuredGroupInfosItem securedGroupInfosItem = new SecuredGroupInfosItem();
				securedGroupInfosItem.setIaasProviderId(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].SecuredGroupInfos["+ j +"].IaasProviderId"));
				securedGroupInfosItem.setId(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].SecuredGroupInfos["+ j +"].Id"));
				securedGroupInfosItem.setName(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].SecuredGroupInfos["+ j +"].Name"));
				securedGroupInfosItem.setSecuredGroupIdentity(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].SecuredGroupInfos["+ j +"].SecuredGroupIdentity"));
				securedGroupInfosItem.setSecuredZoneId(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].SecuredGroupInfos["+ j +"].SecuredZoneId"));
				securedGroupInfosItem.setUtcCreate(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].SecuredGroupInfos["+ j +"].UtcCreate"));
				securedGroupInfosItem.setUtcModified(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].SecuredGroupInfos["+ j +"].UtcModified"));

				securedGroupInfos.add(securedGroupInfosItem);
			}
			listItem.setSecuredGroupInfos(securedGroupInfos);

			List<ZoneInfosItem> zoneInfos = new ArrayList<ZoneInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAKSClustersResponse.List["+ i +"].ZoneInfos.Length"); j++) {
				ZoneInfosItem zoneInfosItem = new ZoneInfosItem();
				zoneInfosItem.setDisplayName(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].ZoneInfos["+ j +"].DisplayName"));
				zoneInfosItem.setId(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].ZoneInfos["+ j +"].Id"));
				zoneInfosItem.setName(_ctx.stringValue("ListAKSClustersResponse.List["+ i +"].ZoneInfos["+ j +"].Name"));

				zoneInfos.add(zoneInfosItem);
			}
			listItem.setZoneInfos(zoneInfos);

			list.add(listItem);
		}
		listAKSClustersResponse.setList(list);
	 
	 	return listAKSClustersResponse;
	}
}