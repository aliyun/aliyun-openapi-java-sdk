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

package com.aliyuncs.hitsdb.transform.v20170601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDeletionJobListResponse;
import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDeletionJobListResponse.JobItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExploreHiTSDBInstanceDeletionJobListResponseUnmarshaller {

	public static ExploreHiTSDBInstanceDeletionJobListResponse unmarshall(ExploreHiTSDBInstanceDeletionJobListResponse exploreHiTSDBInstanceDeletionJobListResponse, UnmarshallerContext _ctx) {
		
		exploreHiTSDBInstanceDeletionJobListResponse.setRequestId(_ctx.stringValue("ExploreHiTSDBInstanceDeletionJobListResponse.RequestId"));
		exploreHiTSDBInstanceDeletionJobListResponse.setPageNumber(_ctx.integerValue("ExploreHiTSDBInstanceDeletionJobListResponse.PageNumber"));
		exploreHiTSDBInstanceDeletionJobListResponse.setPageSize(_ctx.integerValue("ExploreHiTSDBInstanceDeletionJobListResponse.PageSize"));
		exploreHiTSDBInstanceDeletionJobListResponse.setTotal(_ctx.longValue("ExploreHiTSDBInstanceDeletionJobListResponse.Total"));

		List<JobItem> jobList = new ArrayList<JobItem>();
		for (int i = 0; i < _ctx.lengthValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList.Length"); i++) {
			JobItem jobItem = new JobItem();
			jobItem.setId(_ctx.longValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].Id"));
			jobItem.setInstanceId(_ctx.stringValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].InstanceId"));
			jobItem.setIp(_ctx.stringValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].Ip"));
			jobItem.setPort(_ctx.integerValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].Port"));
			jobItem.setMetric(_ctx.stringValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].Metric"));
			jobItem.setTags(_ctx.stringValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].Tags"));
			jobItem.setStartTime(_ctx.longValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].StartTime"));
			jobItem.setEndTime(_ctx.longValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].EndTime"));
			jobItem.setStatus(_ctx.stringValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].Status"));
			jobItem.setJobTyp(_ctx.stringValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].JobTyp"));
			jobItem.setJobCreationTime(_ctx.longValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].JobCreationTime"));
			jobItem.setJobStartTime(_ctx.longValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].JobStartTime"));
			jobItem.setJobEndTime(_ctx.longValue("ExploreHiTSDBInstanceDeletionJobListResponse.JobList["+ i +"].JobEndTime"));

			jobList.add(jobItem);
		}
		exploreHiTSDBInstanceDeletionJobListResponse.setJobList(jobList);
	 
	 	return exploreHiTSDBInstanceDeletionJobListResponse;
	}
}