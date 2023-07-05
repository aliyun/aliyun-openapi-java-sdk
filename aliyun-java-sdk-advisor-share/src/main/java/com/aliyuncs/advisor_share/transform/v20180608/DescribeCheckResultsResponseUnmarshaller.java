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

import com.aliyuncs.advisor_share.model.v20180608.DescribeCheckResultsResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeCheckResultsResponse.CheckResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckResultsResponseUnmarshaller {

	public static DescribeCheckResultsResponse unmarshall(DescribeCheckResultsResponse describeCheckResultsResponse, UnmarshallerContext _ctx) {
		
		describeCheckResultsResponse.setRequestId(_ctx.stringValue("DescribeCheckResultsResponse.RequestId"));

		List<CheckResult> data = new ArrayList<CheckResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCheckResultsResponse.Data.Length"); i++) {
			CheckResult checkResult = new CheckResult();
			checkResult.setSeverity(_ctx.integerValue("DescribeCheckResultsResponse.Data["+ i +"].Severity"));
			checkResult.setAdviceCount(_ctx.integerValue("DescribeCheckResultsResponse.Data["+ i +"].AdviceCount"));
			checkResult.setSummary(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].Summary"));
			checkResult.setProduct(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].Product"));
			checkResult.setOperateColumn(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].OperateColumn"));
			checkResult.setViewColumn(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].ViewColumn"));
			checkResult.setDescription(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].Description"));
			checkResult.setTips(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].Tips"));
			checkResult.setCheckId(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].CheckId"));
			checkResult.setRefreshDateTime(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].RefreshDateTime"));
			checkResult.setCategory(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].Category"));
			checkResult.setCheckName(_ctx.stringValue("DescribeCheckResultsResponse.Data["+ i +"].CheckName"));
			checkResult.setConfigSupport(_ctx.booleanValue("DescribeCheckResultsResponse.Data["+ i +"].ConfigSupport"));

			data.add(checkResult);
		}
		describeCheckResultsResponse.setData(data);
	 
	 	return describeCheckResultsResponse;
	}
}