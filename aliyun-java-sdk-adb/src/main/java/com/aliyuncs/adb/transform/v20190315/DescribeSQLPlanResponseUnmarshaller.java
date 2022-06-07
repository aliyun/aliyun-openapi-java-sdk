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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeSQLPlanResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSQLPlanResponse.Detail;
import com.aliyuncs.adb.model.v20190315.DescribeSQLPlanResponse.SqlPlanStage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLPlanResponseUnmarshaller {

	public static DescribeSQLPlanResponse unmarshall(DescribeSQLPlanResponse describeSQLPlanResponse, UnmarshallerContext _ctx) {
		
		describeSQLPlanResponse.setRequestId(_ctx.stringValue("DescribeSQLPlanResponse.RequestId"));
		describeSQLPlanResponse.setOriginInfo(_ctx.stringValue("DescribeSQLPlanResponse.OriginInfo"));

		Detail detail = new Detail();
		detail.setSQL(_ctx.stringValue("DescribeSQLPlanResponse.Detail.SQL"));
		detail.setOutputSize(_ctx.longValue("DescribeSQLPlanResponse.Detail.OutputSize"));
		detail.setState(_ctx.stringValue("DescribeSQLPlanResponse.Detail.State"));
		detail.setOutputRows(_ctx.longValue("DescribeSQLPlanResponse.Detail.OutputRows"));
		detail.setUser(_ctx.stringValue("DescribeSQLPlanResponse.Detail.User"));
		detail.setStartTime(_ctx.stringValue("DescribeSQLPlanResponse.Detail.StartTime"));
		detail.setTotalStage(_ctx.longValue("DescribeSQLPlanResponse.Detail.TotalStage"));
		detail.setQueuedTime(_ctx.longValue("DescribeSQLPlanResponse.Detail.QueuedTime"));
		detail.setTotalTime(_ctx.longValue("DescribeSQLPlanResponse.Detail.TotalTime"));
		detail.setTotalTask(_ctx.longValue("DescribeSQLPlanResponse.Detail.TotalTask"));
		detail.setDatabase(_ctx.stringValue("DescribeSQLPlanResponse.Detail.Database"));
		detail.setPeakMemory(_ctx.longValue("DescribeSQLPlanResponse.Detail.PeakMemory"));
		detail.setClientIP(_ctx.stringValue("DescribeSQLPlanResponse.Detail.ClientIP"));
		detail.setPlanningTime(_ctx.longValue("DescribeSQLPlanResponse.Detail.PlanningTime"));
		detail.setCPUTime(_ctx.longValue("DescribeSQLPlanResponse.Detail.CPUTime"));
		describeSQLPlanResponse.setDetail(detail);

		List<SqlPlanStage> stageList = new ArrayList<SqlPlanStage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLPlanResponse.StageList.Length"); i++) {
			SqlPlanStage sqlPlanStage = new SqlPlanStage();
			sqlPlanStage.setState(_ctx.stringValue("DescribeSQLPlanResponse.StageList["+ i +"].State"));
			sqlPlanStage.setCPUTimeAvg(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].CPUTimeAvg"));
			sqlPlanStage.setCPUTimeMax(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].CPUTimeMax"));
			sqlPlanStage.setOperatorCost(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].OperatorCost"));
			sqlPlanStage.setScanTimeMax(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].ScanTimeMax"));
			sqlPlanStage.setInputSizeMax(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].InputSizeMax"));
			sqlPlanStage.setStageId(_ctx.integerValue("DescribeSQLPlanResponse.StageList["+ i +"].StageId"));
			sqlPlanStage.setScanSizeMax(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].ScanSizeMax"));
			sqlPlanStage.setCPUTimeMin(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].CPUTimeMin"));
			sqlPlanStage.setScanTimeMin(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].ScanTimeMin"));
			sqlPlanStage.setScanSizeMin(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].ScanSizeMin"));
			sqlPlanStage.setInputSizeMin(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].InputSizeMin"));
			sqlPlanStage.setPeakMemory(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].PeakMemory"));
			sqlPlanStage.setScanTimeAvg(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].ScanTimeAvg"));
			sqlPlanStage.setScanSizeAvg(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].ScanSizeAvg"));
			sqlPlanStage.setInputSizeAvg(_ctx.longValue("DescribeSQLPlanResponse.StageList["+ i +"].InputSizeAvg"));

			stageList.add(sqlPlanStage);
		}
		describeSQLPlanResponse.setStageList(stageList);
	 
	 	return describeSQLPlanResponse;
	}
}