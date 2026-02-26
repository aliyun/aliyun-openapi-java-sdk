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

import com.aliyuncs.arms.model.v20190808.DescribeAddonReleaseResponse;
import com.aliyuncs.arms.model.v20190808.DescribeAddonReleaseResponse.Data;
import com.aliyuncs.arms.model.v20190808.DescribeAddonReleaseResponse.Data.Release;
import com.aliyuncs.arms.model.v20190808.DescribeAddonReleaseResponse.Data.Release.ConditionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAddonReleaseResponseUnmarshaller {

	public static DescribeAddonReleaseResponse unmarshall(DescribeAddonReleaseResponse describeAddonReleaseResponse, UnmarshallerContext _ctx) {
		
		describeAddonReleaseResponse.setRequestId(_ctx.stringValue("DescribeAddonReleaseResponse.RequestId"));
		describeAddonReleaseResponse.setCode(_ctx.stringValue("DescribeAddonReleaseResponse.Code"));
		describeAddonReleaseResponse.setSuccess(_ctx.stringValue("DescribeAddonReleaseResponse.Success"));
		describeAddonReleaseResponse.setMessage(_ctx.stringValue("DescribeAddonReleaseResponse.Message"));

		Data data = new Data();
		data.setConfig(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Config"));

		Release release = new Release();
		release.setAddonName(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.AddonName"));
		release.setAlertRuleCount(_ctx.longValue("DescribeAddonReleaseResponse.Data.Release.AlertRuleCount"));
		release.setCreateTime(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.CreateTime"));
		release.setDashboardCount(_ctx.longValue("DescribeAddonReleaseResponse.Data.Release.DashboardCount"));
		release.setExporterCount(_ctx.longValue("DescribeAddonReleaseResponse.Data.Release.ExporterCount"));
		release.setHaveConfig(_ctx.booleanValue("DescribeAddonReleaseResponse.Data.Release.HaveConfig"));
		release.setInstallUserId(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.InstallUserId"));
		release.setLanguage(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Language"));
		release.setReleaseId(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.ReleaseId"));
		release.setReleaseName(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.ReleaseName"));
		release.setScene(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Scene"));
		release.setStatus(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Status"));
		release.setUpdateTime(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.UpdateTime"));
		release.setUserID(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.UserID"));
		release.setVersion(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Version"));
		release.setEnvironmentId(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.EnvironmentId"));
		release.setRegionId(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.RegionId"));
		release.setManaged(_ctx.booleanValue("DescribeAddonReleaseResponse.Data.Release.Managed"));

		List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAddonReleaseResponse.Data.Release.Conditions.Length"); i++) {
			ConditionsItem conditionsItem = new ConditionsItem();
			conditionsItem.setFirstTransitionTime(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Conditions["+ i +"].FirstTransitionTime"));
			conditionsItem.setLastTransitionTime(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Conditions["+ i +"].LastTransitionTime"));
			conditionsItem.setMessage(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Conditions["+ i +"].Message"));
			conditionsItem.setReason(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Conditions["+ i +"].Reason"));
			conditionsItem.setStatus(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Conditions["+ i +"].Status"));
			conditionsItem.setType(_ctx.stringValue("DescribeAddonReleaseResponse.Data.Release.Conditions["+ i +"].Type"));

			conditions.add(conditionsItem);
		}
		release.setConditions(conditions);
		data.setRelease(release);
		describeAddonReleaseResponse.setData(data);
	 
	 	return describeAddonReleaseResponse;
	}
}