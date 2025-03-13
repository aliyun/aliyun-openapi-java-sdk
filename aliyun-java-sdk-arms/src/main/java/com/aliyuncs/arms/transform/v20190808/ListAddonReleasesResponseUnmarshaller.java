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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListAddonReleasesResponse;
import com.aliyuncs.arms.model.v20190808.ListAddonReleasesResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListAddonReleasesResponse.Data.ReleasesItem;
import com.aliyuncs.arms.model.v20190808.ListAddonReleasesResponse.Data.ReleasesItem.ConditionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAddonReleasesResponseUnmarshaller {

	public static ListAddonReleasesResponse unmarshall(ListAddonReleasesResponse listAddonReleasesResponse, UnmarshallerContext _ctx) {
		
		listAddonReleasesResponse.setRequestId(_ctx.stringValue("ListAddonReleasesResponse.RequestId"));
		listAddonReleasesResponse.setCode(_ctx.integerValue("ListAddonReleasesResponse.Code"));
		listAddonReleasesResponse.setSuccess(_ctx.booleanValue("ListAddonReleasesResponse.Success"));
		listAddonReleasesResponse.setMessage(_ctx.stringValue("ListAddonReleasesResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListAddonReleasesResponse.Data.Total"));

		List<ReleasesItem> releases = new ArrayList<ReleasesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAddonReleasesResponse.Data.Releases.Length"); i++) {
			ReleasesItem releasesItem = new ReleasesItem();
			releasesItem.setAddonName(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].AddonName"));
			releasesItem.setAlertRuleCount(_ctx.longValue("ListAddonReleasesResponse.Data.Releases["+ i +"].AlertRuleCount"));
			releasesItem.setCreateTime(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].CreateTime"));
			releasesItem.setDashboardCount(_ctx.longValue("ListAddonReleasesResponse.Data.Releases["+ i +"].DashboardCount"));
			releasesItem.setExporterCount(_ctx.longValue("ListAddonReleasesResponse.Data.Releases["+ i +"].ExporterCount"));
			releasesItem.setHaveConfig(_ctx.booleanValue("ListAddonReleasesResponse.Data.Releases["+ i +"].HaveConfig"));
			releasesItem.setInstallUserId(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].InstallUserId"));
			releasesItem.setLanguage(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Language"));
			releasesItem.setReleaseId(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].ReleaseId"));
			releasesItem.setReleaseName(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].ReleaseName"));
			releasesItem.setScene(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Scene"));
			releasesItem.setStatus(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Status"));
			releasesItem.setUpdateTime(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].UpdateTime"));
			releasesItem.setUserId(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].UserId"));
			releasesItem.setVersion(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Version"));
			releasesItem.setEnvironmentId(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].EnvironmentId"));
			releasesItem.setRegionId(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].RegionId"));
			releasesItem.setManaged(_ctx.booleanValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Managed"));
			releasesItem.setNextVersion(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].NextVersion"));
			releasesItem.setConfig(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Config"));

			List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Conditions.Length"); j++) {
				ConditionsItem conditionsItem = new ConditionsItem();
				conditionsItem.setFirstTransitionTime(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Conditions["+ j +"].FirstTransitionTime"));
				conditionsItem.setLastTransitionTime(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Conditions["+ j +"].LastTransitionTime"));
				conditionsItem.setMessage(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Conditions["+ j +"].Message"));
				conditionsItem.setReason(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Conditions["+ j +"].Reason"));
				conditionsItem.setStatus(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Conditions["+ j +"].Status"));
				conditionsItem.setType(_ctx.stringValue("ListAddonReleasesResponse.Data.Releases["+ i +"].Conditions["+ j +"].Type"));

				conditions.add(conditionsItem);
			}
			releasesItem.setConditions(conditions);

			releases.add(releasesItem);
		}
		data.setReleases(releases);
		listAddonReleasesResponse.setData(data);
	 
	 	return listAddonReleasesResponse;
	}
}