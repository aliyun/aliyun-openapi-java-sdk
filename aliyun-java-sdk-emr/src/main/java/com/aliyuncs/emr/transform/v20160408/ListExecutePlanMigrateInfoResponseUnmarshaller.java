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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutePlanMigrateInfoResponseUnmarshaller {

	public static ListExecutePlanMigrateInfoResponse unmarshall(ListExecutePlanMigrateInfoResponse listExecutePlanMigrateInfoResponse, UnmarshallerContext context) {
		
		listExecutePlanMigrateInfoResponse.setTotal(context.longValue("ListExecutePlanMigrateInfoResponse.Total"));

		List<ExecutePlanMigrateInfo> executePlanMigrateInfoList = new ArrayList<ExecutePlanMigrateInfo>();
		for (int i = 0; i < context.lengthValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList.Length"); i++) {
			ExecutePlanMigrateInfo executePlanMigrateInfo = new ExecutePlanMigrateInfo();
			executePlanMigrateInfo.setId(context.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].Id"));
			executePlanMigrateInfo.setBizId(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].BizId"));
			executePlanMigrateInfo.setCreateTime(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].CreateTime"));
			executePlanMigrateInfo.setName(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].Name"));
			executePlanMigrateInfo.setStatus(context.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].Status"));
			executePlanMigrateInfo.setCronExpr(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].CronExpr"));
			executePlanMigrateInfo.setStartScheduleTime(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].StartScheduleTime"));
			executePlanMigrateInfo.setIsCycle(context.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].IsCycle"));
			executePlanMigrateInfo.setBuildClusterCondition(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].BuildClusterCondition"));

			List<JobInfo> jobList = new ArrayList<JobInfo>();
			for (int j = 0; j < context.lengthValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList.Length"); j++) {
				JobInfo jobInfo = new JobInfo();
				jobInfo.setClusterId(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].ClusterId"));
				jobInfo.setJobId(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].JobId"));
				jobInfo.setDescription(context.stringValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].Description"));
				jobInfo.setIndexNO(context.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].IndexNO"));
				jobInfo.setStatus(context.longValue("ListExecutePlanMigrateInfoResponse.ExecutePlanMigrateInfoList["+ i +"].JobList["+ j +"].Status"));

				jobList.add(jobInfo);
			}
			executePlanMigrateInfo.setJobList(jobList);

			executePlanMigrateInfoList.add(executePlanMigrateInfo);
		}
		listExecutePlanMigrateInfoResponse.setExecutePlanMigrateInfoList(executePlanMigrateInfoList);
	 
	 	return listExecutePlanMigrateInfoResponse;
	}
}