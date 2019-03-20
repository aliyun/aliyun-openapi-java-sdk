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

package com.aliyuncs.jaq.transform.v20160412;

import com.aliyuncs.jaq.model.v20160412.GetRiskSummaryResponse;
import com.aliyuncs.jaq.model.v20160412.GetRiskSummaryResponse.Data;
import com.aliyuncs.jaq.model.v20160412.GetRiskSummaryResponse.Data.FakeInfo;
import com.aliyuncs.jaq.model.v20160412.GetRiskSummaryResponse.Data.MalwareInfo;
import com.aliyuncs.jaq.model.v20160412.GetRiskSummaryResponse.Data.MalwareInfo.MalwareCount;
import com.aliyuncs.jaq.model.v20160412.GetRiskSummaryResponse.Data.PluginInfo;
import com.aliyuncs.jaq.model.v20160412.GetRiskSummaryResponse.Data.VulnInfo;
import com.aliyuncs.jaq.model.v20160412.GetRiskSummaryResponse.Data.VulnInfo.VulnCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRiskSummaryResponseUnmarshaller {

	public static GetRiskSummaryResponse unmarshall(GetRiskSummaryResponse getRiskSummaryResponse, UnmarshallerContext context) {
		
		getRiskSummaryResponse.setErrorCode(context.integerValue("GetRiskSummaryResponse.ErrorCode"));
		getRiskSummaryResponse.setErrorMsg(context.stringValue("GetRiskSummaryResponse.ErrorMsg"));

		Data data = new Data();
		data.setTaskStatus(context.integerValue("GetRiskSummaryResponse.Data.TaskStatus"));

		VulnInfo vulnInfo = new VulnInfo();
		vulnInfo.setStatus(context.integerValue("GetRiskSummaryResponse.Data.VulnInfo.Status"));

		VulnCount vulnCount = new VulnCount();
		vulnCount.setTotal(context.longValue("GetRiskSummaryResponse.Data.VulnInfo.VulnCount.Total"));
		vulnCount.setRedLine(context.longValue("GetRiskSummaryResponse.Data.VulnInfo.VulnCount.RedLine"));
		vulnCount.setHighLevel(context.longValue("GetRiskSummaryResponse.Data.VulnInfo.VulnCount.HighLevel"));
		vulnCount.setMidLevel(context.longValue("GetRiskSummaryResponse.Data.VulnInfo.VulnCount.MidLevel"));
		vulnCount.setLowLevel(context.longValue("GetRiskSummaryResponse.Data.VulnInfo.VulnCount.LowLevel"));
		vulnInfo.setVulnCount(vulnCount);
		data.setVulnInfo(vulnInfo);

		MalwareInfo malwareInfo = new MalwareInfo();
		malwareInfo.setStatus(context.integerValue("GetRiskSummaryResponse.Data.MalwareInfo.Status"));
		malwareInfo.setDetectResult(context.integerValue("GetRiskSummaryResponse.Data.MalwareInfo.DetectResult"));

		MalwareCount malwareCount = new MalwareCount();
		malwareCount.setTotal(context.longValue("GetRiskSummaryResponse.Data.MalwareInfo.MalwareCount.Total"));
		malwareCount.setHighLevel(context.longValue("GetRiskSummaryResponse.Data.MalwareInfo.MalwareCount.HighLevel"));
		malwareCount.setLowLevel(context.longValue("GetRiskSummaryResponse.Data.MalwareInfo.MalwareCount.LowLevel"));
		malwareCount.setWeakLevel(context.longValue("GetRiskSummaryResponse.Data.MalwareInfo.MalwareCount.WeakLevel"));
		malwareInfo.setMalwareCount(malwareCount);
		data.setMalwareInfo(malwareInfo);

		FakeInfo fakeInfo = new FakeInfo();
		fakeInfo.setStatus(context.integerValue("GetRiskSummaryResponse.Data.FakeInfo.Status"));
		fakeInfo.setFakeAppCount(context.longValue("GetRiskSummaryResponse.Data.FakeInfo.FakeAppCount"));
		fakeInfo.setTotalInfectedUsers(context.longValue("GetRiskSummaryResponse.Data.FakeInfo.TotalInfectedUsers"));
		data.setFakeInfo(fakeInfo);

		PluginInfo pluginInfo = new PluginInfo();
		pluginInfo.setStatus(context.longValue("GetRiskSummaryResponse.Data.PluginInfo.Status"));
		pluginInfo.setPluginCount(context.longValue("GetRiskSummaryResponse.Data.PluginInfo.PluginCount"));
		data.setPluginInfo(pluginInfo);
		getRiskSummaryResponse.setData(data);
	 
	 	return getRiskSummaryResponse;
	}
}