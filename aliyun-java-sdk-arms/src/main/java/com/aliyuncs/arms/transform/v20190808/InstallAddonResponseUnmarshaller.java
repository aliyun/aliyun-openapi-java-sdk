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

import com.aliyuncs.arms.model.v20190808.InstallAddonResponse;
import com.aliyuncs.arms.model.v20190808.InstallAddonResponse.Data;
import com.aliyuncs.arms.model.v20190808.InstallAddonResponse.Data.ConditionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstallAddonResponseUnmarshaller {

	public static InstallAddonResponse unmarshall(InstallAddonResponse installAddonResponse, UnmarshallerContext _ctx) {
		
		installAddonResponse.setRequestId(_ctx.stringValue("InstallAddonResponse.RequestId"));
		installAddonResponse.setCode(_ctx.integerValue("InstallAddonResponse.Code"));
		installAddonResponse.setSuccess(_ctx.booleanValue("InstallAddonResponse.Success"));
		installAddonResponse.setMessage(_ctx.stringValue("InstallAddonResponse.Message"));

		Data data = new Data();
		data.setAddonName(_ctx.stringValue("InstallAddonResponse.Data.AddonName"));
		data.setAlertRuleCount(_ctx.longValue("InstallAddonResponse.Data.AlertRuleCount"));
		data.setCreateTime(_ctx.stringValue("InstallAddonResponse.Data.CreateTime"));
		data.setDashboardCount(_ctx.longValue("InstallAddonResponse.Data.DashboardCount"));
		data.setExporterCount(_ctx.longValue("InstallAddonResponse.Data.ExporterCount"));
		data.setHaveConfig(_ctx.booleanValue("InstallAddonResponse.Data.HaveConfig"));
		data.setInstallUserId(_ctx.stringValue("InstallAddonResponse.Data.InstallUserId"));
		data.setLanguage(_ctx.stringValue("InstallAddonResponse.Data.Language"));
		data.setReleaseId(_ctx.stringValue("InstallAddonResponse.Data.ReleaseId"));
		data.setReleaseName(_ctx.stringValue("InstallAddonResponse.Data.ReleaseName"));
		data.setScene(_ctx.stringValue("InstallAddonResponse.Data.Scene"));
		data.setStatus(_ctx.stringValue("InstallAddonResponse.Data.Status"));
		data.setUpdateTime(_ctx.stringValue("InstallAddonResponse.Data.UpdateTime"));
		data.setUserId(_ctx.stringValue("InstallAddonResponse.Data.UserId"));
		data.setVersion(_ctx.stringValue("InstallAddonResponse.Data.Version"));
		data.setEnvironmentId(_ctx.stringValue("InstallAddonResponse.Data.EnvironmentId"));
		data.setRegionId(_ctx.stringValue("InstallAddonResponse.Data.RegionId"));
		data.setManaged(_ctx.booleanValue("InstallAddonResponse.Data.Managed"));

		List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
		for (int i = 0; i < _ctx.lengthValue("InstallAddonResponse.Data.Conditions.Length"); i++) {
			ConditionsItem conditionsItem = new ConditionsItem();
			conditionsItem.setFirstTransitionTime(_ctx.stringValue("InstallAddonResponse.Data.Conditions["+ i +"].FirstTransitionTime"));
			conditionsItem.setLastTransitionTime(_ctx.stringValue("InstallAddonResponse.Data.Conditions["+ i +"].LastTransitionTime"));
			conditionsItem.setMessage(_ctx.stringValue("InstallAddonResponse.Data.Conditions["+ i +"].Message"));
			conditionsItem.setReason(_ctx.stringValue("InstallAddonResponse.Data.Conditions["+ i +"].Reason"));
			conditionsItem.setStatus(_ctx.stringValue("InstallAddonResponse.Data.Conditions["+ i +"].Status"));
			conditionsItem.setType(_ctx.stringValue("InstallAddonResponse.Data.Conditions["+ i +"].Type"));

			conditions.add(conditionsItem);
		}
		data.setConditions(conditions);
		installAddonResponse.setData(data);
	 
	 	return installAddonResponse;
	}
}