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

import com.aliyuncs.adb.model.v20190315.DescribeSyncJobListResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSyncJobListResponse.SyncJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSyncJobListResponseUnmarshaller {

	public static DescribeSyncJobListResponse unmarshall(DescribeSyncJobListResponse describeSyncJobListResponse, UnmarshallerContext _ctx) {
		
		describeSyncJobListResponse.setRequestId(_ctx.stringValue("DescribeSyncJobListResponse.RequestId"));
		describeSyncJobListResponse.setTotalCount(_ctx.integerValue("DescribeSyncJobListResponse.TotalCount"));
		describeSyncJobListResponse.setPageSize(_ctx.integerValue("DescribeSyncJobListResponse.PageSize"));
		describeSyncJobListResponse.setPageNumber(_ctx.integerValue("DescribeSyncJobListResponse.PageNumber"));
		describeSyncJobListResponse.setDBClusterId(_ctx.integerValue("DescribeSyncJobListResponse.DBClusterId"));

		List<SyncJob> syncJobs = new ArrayList<SyncJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSyncJobListResponse.SyncJobs.Length"); i++) {
			SyncJob syncJob = new SyncJob();
			syncJob.setSourceStorageSize(_ctx.integerValue("DescribeSyncJobListResponse.SyncJobs["+ i +"].SourceStorageSize"));
			syncJob.setSourceDBClusterId(_ctx.stringValue("DescribeSyncJobListResponse.SyncJobs["+ i +"].SourceDBClusterId"));
			syncJob.setJobId(_ctx.stringValue("DescribeSyncJobListResponse.SyncJobs["+ i +"].JobId"));
			syncJob.setSourceDBType(_ctx.stringValue("DescribeSyncJobListResponse.SyncJobs["+ i +"].SourceDBType"));
			syncJob.setSourceDBClusterDescription(_ctx.stringValue("DescribeSyncJobListResponse.SyncJobs["+ i +"].SourceDBClusterDescription"));
			syncJob.setRegionId(_ctx.stringValue("DescribeSyncJobListResponse.SyncJobs["+ i +"].RegionId"));
			syncJob.setSourceTableNumber(_ctx.integerValue("DescribeSyncJobListResponse.SyncJobs["+ i +"].SourceTableNumber"));
			syncJob.setSyncPlatform(_ctx.stringValue("DescribeSyncJobListResponse.SyncJobs["+ i +"].SyncPlatform"));

			syncJobs.add(syncJob);
		}
		describeSyncJobListResponse.setSyncJobs(syncJobs);
	 
	 	return describeSyncJobListResponse;
	}
}