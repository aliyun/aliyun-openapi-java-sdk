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

import com.aliyuncs.sofa.model.v20190815.CountDTXAppStatsResponse;
import com.aliyuncs.sofa.model.v20190815.CountDTXAppStatsResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CountDTXAppStatsResponse.Data.AppInfo;
import com.aliyuncs.sofa.model.v20190815.CountDTXAppStatsResponse.Data.Stats;
import com.aliyuncs.sofa.model.v20190815.CountDTXAppStatsResponse.Data.Stats.Exception;
import com.aliyuncs.sofa.model.v20190815.CountDTXAppStatsResponse.Data.Stats.Ongoing;
import com.aliyuncs.sofa.model.v20190815.CountDTXAppStatsResponse.Data.Stats.Today;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountDTXAppStatsResponseUnmarshaller {

	public static CountDTXAppStatsResponse unmarshall(CountDTXAppStatsResponse countDTXAppStatsResponse, UnmarshallerContext _ctx) {
		
		countDTXAppStatsResponse.setRequestId(_ctx.stringValue("CountDTXAppStatsResponse.RequestId"));
		countDTXAppStatsResponse.setResultCode(_ctx.stringValue("CountDTXAppStatsResponse.ResultCode"));
		countDTXAppStatsResponse.setResultMessage(_ctx.stringValue("CountDTXAppStatsResponse.ResultMessage"));
		countDTXAppStatsResponse.setSuccess(_ctx.booleanValue("CountDTXAppStatsResponse.Success"));

		Data data = new Data();

		AppInfo appInfo = new AppInfo();
		appInfo.setAppName(_ctx.stringValue("CountDTXAppStatsResponse.Data.AppInfo.AppName"));
		appInfo.setCreator(_ctx.stringValue("CountDTXAppStatsResponse.Data.AppInfo.Creator"));
		appInfo.setGmtCreate(_ctx.stringValue("CountDTXAppStatsResponse.Data.AppInfo.GmtCreate"));
		appInfo.setGmtModified(_ctx.stringValue("CountDTXAppStatsResponse.Data.AppInfo.GmtModified"));
		appInfo.setInstanceId(_ctx.stringValue("CountDTXAppStatsResponse.Data.AppInfo.InstanceId"));
		appInfo.setOwner(_ctx.stringValue("CountDTXAppStatsResponse.Data.AppInfo.Owner"));
		data.setAppInfo(appInfo);

		Stats stats = new Stats();

		Exception exception = new Exception();
		exception.setTotal(_ctx.longValue("CountDTXAppStatsResponse.Data.Stats.Exception.Total"));
		stats.setException(exception);

		Ongoing ongoing = new Ongoing();
		ongoing.setActionNum(_ctx.longValue("CountDTXAppStatsResponse.Data.Stats.Ongoing.ActionNum"));
		ongoing.setActivityNum(_ctx.longValue("CountDTXAppStatsResponse.Data.Stats.Ongoing.ActivityNum"));
		stats.setOngoing(ongoing);

		Today today = new Today();
		today.setActionNum(_ctx.longValue("CountDTXAppStatsResponse.Data.Stats.Today.ActionNum"));
		today.setActivityNum(_ctx.longValue("CountDTXAppStatsResponse.Data.Stats.Today.ActivityNum"));
		stats.setToday(today);
		data.setStats(stats);
		countDTXAppStatsResponse.setData(data);
	 
	 	return countDTXAppStatsResponse;
	}
}