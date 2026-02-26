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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListFeatureConsistencyCheckJobsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureConsistencyCheckJobsResponseUnmarshaller {

	public static ListFeatureConsistencyCheckJobsResponse unmarshall(ListFeatureConsistencyCheckJobsResponse listFeatureConsistencyCheckJobsResponse, UnmarshallerContext _ctx) {
		
		listFeatureConsistencyCheckJobsResponse.setRequestId(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.RequestId"));
		listFeatureConsistencyCheckJobsResponse.setTotalCount(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.TotalCount"));

		List<FeatureConsistencyCheckJobsItem> featureConsistencyCheckJobs = new ArrayList<FeatureConsistencyCheckJobsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs.Length"); i++) {
			FeatureConsistencyCheckJobsItem featureConsistencyCheckJobsItem = new FeatureConsistencyCheckJobsItem();
			featureConsistencyCheckJobsItem.setFeatureConsistencyCheckJobId(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].FeatureConsistencyCheckJobId"));
			featureConsistencyCheckJobsItem.setFeatureConsistencyCheckJobConfigId(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].FeatureConsistencyCheckJobConfigId"));
			featureConsistencyCheckJobsItem.setFeatureConsistencyCheckJobConfigName(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].FeatureConsistencyCheckJobConfigName"));
			featureConsistencyCheckJobsItem.setGmtStartTime(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].GmtStartTime"));
			featureConsistencyCheckJobsItem.setGmtEndTime(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].GmtEndTime"));
			featureConsistencyCheckJobsItem.setStatus(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].Status"));
			featureConsistencyCheckJobsItem.setConfig(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].Config"));

			List<String> logs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].Logs.Length"); j++) {
				logs.add(_ctx.stringValue("ListFeatureConsistencyCheckJobsResponse.FeatureConsistencyCheckJobs["+ i +"].Logs["+ j +"]"));
			}
			featureConsistencyCheckJobsItem.setLogs(logs);

			featureConsistencyCheckJobs.add(featureConsistencyCheckJobsItem);
		}
		listFeatureConsistencyCheckJobsResponse.setFeatureConsistencyCheckJobs(featureConsistencyCheckJobs);
	 
	 	return listFeatureConsistencyCheckJobsResponse;
	}
}