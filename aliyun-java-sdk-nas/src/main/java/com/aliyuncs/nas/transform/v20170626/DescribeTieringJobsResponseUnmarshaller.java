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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeTieringJobsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeTieringJobsResponse.TieringJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTieringJobsResponseUnmarshaller {

	public static DescribeTieringJobsResponse unmarshall(DescribeTieringJobsResponse describeTieringJobsResponse, UnmarshallerContext _ctx) {
		
		describeTieringJobsResponse.setRequestId(_ctx.stringValue("DescribeTieringJobsResponse.RequestId"));
		describeTieringJobsResponse.setTotalCount(_ctx.integerValue("DescribeTieringJobsResponse.TotalCount"));
		describeTieringJobsResponse.setPageSize(_ctx.integerValue("DescribeTieringJobsResponse.PageSize"));
		describeTieringJobsResponse.setPageNumber(_ctx.integerValue("DescribeTieringJobsResponse.PageNumber"));

		List<TieringJob> tieringJobs = new ArrayList<TieringJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTieringJobsResponse.TieringJobs.Length"); i++) {
			TieringJob tieringJob = new TieringJob();
			tieringJob.setName(_ctx.stringValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Name"));
			tieringJob.setVolume(_ctx.stringValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Volume"));
			tieringJob.setPath(_ctx.stringValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Path"));
			tieringJob.setRecursive(_ctx.booleanValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Recursive"));
			tieringJob.setType(_ctx.stringValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Type"));
			tieringJob.setPolicy(_ctx.stringValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Policy"));
			tieringJob.setWeekday(_ctx.integerValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Weekday"));
			tieringJob.setHour(_ctx.integerValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Hour"));
			tieringJob.setEnabled(_ctx.booleanValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Enabled"));
			tieringJob.setStatus(_ctx.stringValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].Status"));
			tieringJob.setLastUpdateTime(_ctx.longValue("DescribeTieringJobsResponse.TieringJobs["+ i +"].LastUpdateTime"));

			tieringJobs.add(tieringJob);
		}
		describeTieringJobsResponse.setTieringJobs(tieringJobs);
	 
	 	return describeTieringJobsResponse;
	}
}