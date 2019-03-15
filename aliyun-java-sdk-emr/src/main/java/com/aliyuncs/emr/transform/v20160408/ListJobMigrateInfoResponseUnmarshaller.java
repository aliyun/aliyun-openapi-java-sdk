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

import com.aliyuncs.emr.model.v20160408.ListJobMigrateInfoResponse;
import com.aliyuncs.emr.model.v20160408.ListJobMigrateInfoResponse.JobMigrateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobMigrateInfoResponseUnmarshaller {

	public static ListJobMigrateInfoResponse unmarshall(ListJobMigrateInfoResponse listJobMigrateInfoResponse, UnmarshallerContext context) {
		
		listJobMigrateInfoResponse.setTotal(context.longValue("ListJobMigrateInfoResponse.Total"));

		List<JobMigrateInfo> jobMigrateInfoList = new ArrayList<JobMigrateInfo>();
		for (int i = 0; i < context.lengthValue("ListJobMigrateInfoResponse.JobMigrateInfoList.Length"); i++) {
			JobMigrateInfo jobMigrateInfo = new JobMigrateInfo();
			jobMigrateInfo.setId(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].Id"));
			jobMigrateInfo.setName(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].Name"));
			jobMigrateInfo.setType(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].Type"));
			jobMigrateInfo.setMaxRetry(context.integerValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].MaxRetry"));
			jobMigrateInfo.setFailedAction(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].FailedAction"));
			jobMigrateInfo.setParams(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].Params"));
			jobMigrateInfo.setNewId(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].NewId"));
			jobMigrateInfo.setPremigratedDate(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].PremigratedDate"));
			jobMigrateInfo.setMigratedDate(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].MigratedDate"));
			jobMigrateInfo.setCreateTime(context.stringValue("ListJobMigrateInfoResponse.JobMigrateInfoList["+ i +"].CreateTime"));

			jobMigrateInfoList.add(jobMigrateInfo);
		}
		listJobMigrateInfoResponse.setJobMigrateInfoList(jobMigrateInfoList);
	 
	 	return listJobMigrateInfoResponse;
	}
}