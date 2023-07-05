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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeCheckResultOverviewResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeCheckResultOverviewResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.DescribeCheckResultOverviewResponse.Data.CheckResultCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckResultOverviewResponseUnmarshaller {

	public static DescribeCheckResultOverviewResponse unmarshall(DescribeCheckResultOverviewResponse describeCheckResultOverviewResponse, UnmarshallerContext _ctx) {
		
		describeCheckResultOverviewResponse.setRequestId(_ctx.stringValue("DescribeCheckResultOverviewResponse.RequestId"));

		Data data = new Data();
		data.setResourceTotalCount(_ctx.stringValue("DescribeCheckResultOverviewResponse.Data.ResourceTotalCount"));
		data.setActiveCheckItemCount(_ctx.stringValue("DescribeCheckResultOverviewResponse.Data.ActiveCheckItemCount"));

		List<CheckResultCount> checkResultCountList = new ArrayList<CheckResultCount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCheckResultOverviewResponse.Data.CheckResultCountList.Length"); i++) {
			CheckResultCount checkResultCount = new CheckResultCount();
			checkResultCount.setCategory(_ctx.stringValue("DescribeCheckResultOverviewResponse.Data.CheckResultCountList["+ i +"].Category"));
			checkResultCount.setWarningCount(_ctx.stringValue("DescribeCheckResultOverviewResponse.Data.CheckResultCountList["+ i +"].WarningCount"));
			checkResultCount.setCriticalCount(_ctx.stringValue("DescribeCheckResultOverviewResponse.Data.CheckResultCountList["+ i +"].CriticalCount"));
			checkResultCount.setNormalCount(_ctx.stringValue("DescribeCheckResultOverviewResponse.Data.CheckResultCountList["+ i +"].NormalCount"));

			checkResultCountList.add(checkResultCount);
		}
		data.setCheckResultCountList(checkResultCountList);
		describeCheckResultOverviewResponse.setData(data);
	 
	 	return describeCheckResultOverviewResponse;
	}
}