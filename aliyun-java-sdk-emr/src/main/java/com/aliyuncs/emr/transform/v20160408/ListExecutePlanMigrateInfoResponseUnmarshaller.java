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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListExecutePlanMigrateInfoResponse;
import com.aliyuncs.emr.model.v20160408.ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfo;
import com.aliyuncs.emr.model.v20160408.ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfo.JobInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutePlanMigrateInfoResponseUnmarshaller {

	public static ListExecutePlanMigrateInfoResponse unmarshall(ListExecutePlanMigrateInfoResponse listExecutePlanMigrateInfoResponse, UnmarshallerContext _ctx) {
		
		listExecutePlanMigrateInfoResponse.setTotal(_ctx.longValue("ListExecutePlanMigrateInfoResponse.Total"));

		List<ExecutePlanMigrateInfo> executePlanMigrateInfoList = new ArrayList<ExecutePlanMigrateInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList.Length"); i++) {
			ExecutePlanMigrateInfo executePlanMigrateInfo = new ExecutePlanMigrateInfo();
			executePlanMigrateInfo.setId(_ctx.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].Id"));
			executePlanMigrateInfo.setBizId(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].BizId"));
			executePlanMigrateInfo.setCreateTime(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].CreateTime"));
			executePlanMigrateInfo.setName(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].Name"));
			executePlanMigrateInfo.setStatus(_ctx.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].Status"));
			executePlanMigrateInfo.setCronExpr(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].CronExpr"));
			executePlanMigrateInfo.setStartScheduleTime(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].StartScheduleTime"));
			executePlanMigrateInfo.setIsCycle(_ctx.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].IsCycle"));
			executePlanMigrateInfo.setBuildClusterCondition(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].BuildClusterCondition"));

			List<JobInfo> jobList = new ArrayList<JobInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList.Length"); j++) {
				JobInfo jobInfo = new JobInfo();
				jobInfo.setClusterId(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].ClusterId"));
				jobInfo.setJobId(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].JobId"));
				jobInfo.setDescription(_ctx.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].Description"));
				jobInfo.setIndexNO(_ctx.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].IndexNO"));
				jobInfo.setStatus(_ctx.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].Status"));

				jobList.add(jobInfo);
			}
			executePlanMigrateInfo.setJobList(jobList);

			executePlanMigrateInfoList.add(executePlanMigrateInfo);
		}
		listExecutePlanMigrateInfoResponse.setExecutePlanMigrateInfoList(executePlanMigrateInfoList);
	 
	 	return listExecutePlanMigrateInfoResponse;
	}
}