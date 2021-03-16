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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxSitesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxSitesResponse.CloudBoxSiteSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListCloudBoxSitesResponseUnmarshaller {

	public static OpsListCloudBoxSitesResponse unmarshall(OpsListCloudBoxSitesResponse opsListCloudBoxSitesResponse, UnmarshallerContext _ctx) {
		
		opsListCloudBoxSitesResponse.setRequestId(_ctx.stringValue("OpsListCloudBoxSitesResponse.RequestId"));
		opsListCloudBoxSitesResponse.setTotalCount(_ctx.integerValue("OpsListCloudBoxSitesResponse.TotalCount"));
		opsListCloudBoxSitesResponse.setNextToken(_ctx.stringValue("OpsListCloudBoxSitesResponse.NextToken"));

		List<CloudBoxSiteSet> cloudBoxSiteSets = new ArrayList<CloudBoxSiteSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets.Length"); i++) {
			CloudBoxSiteSet cloudBoxSiteSet = new CloudBoxSiteSet();
			cloudBoxSiteSet.setCloudBoxSiteId(_ctx.stringValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets["+ i +"].CloudBoxSiteId"));
			cloudBoxSiteSet.setDescription(_ctx.stringValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets["+ i +"].Description"));
			cloudBoxSiteSet.setCloudBoxSiteName(_ctx.stringValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets["+ i +"].CloudBoxSiteName"));
			cloudBoxSiteSet.setCountry(_ctx.stringValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets["+ i +"].Country"));
			cloudBoxSiteSet.setProvince(_ctx.stringValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets["+ i +"].Province"));
			cloudBoxSiteSet.setCity(_ctx.stringValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets["+ i +"].City"));
			cloudBoxSiteSet.setStreetAddress(_ctx.stringValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets["+ i +"].StreetAddress"));
			cloudBoxSiteSet.setSiteQuestionares(_ctx.stringValue("OpsListCloudBoxSitesResponse.CloudBoxSiteSets["+ i +"].SiteQuestionares"));

			cloudBoxSiteSets.add(cloudBoxSiteSet);
		}
		opsListCloudBoxSitesResponse.setCloudBoxSiteSets(cloudBoxSiteSets);
	 
	 	return opsListCloudBoxSitesResponse;
	}
}