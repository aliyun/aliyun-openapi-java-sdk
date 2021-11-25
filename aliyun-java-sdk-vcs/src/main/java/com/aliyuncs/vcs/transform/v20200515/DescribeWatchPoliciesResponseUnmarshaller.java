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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeWatchPoliciesResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeWatchPoliciesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeWatchPoliciesResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWatchPoliciesResponseUnmarshaller {

	public static DescribeWatchPoliciesResponse unmarshall(DescribeWatchPoliciesResponse describeWatchPoliciesResponse, UnmarshallerContext _ctx) {
		
		describeWatchPoliciesResponse.setRequestId(_ctx.stringValue("DescribeWatchPoliciesResponse.RequestId"));
		describeWatchPoliciesResponse.setSuccess(_ctx.booleanValue("DescribeWatchPoliciesResponse.Success"));
		describeWatchPoliciesResponse.setCode(_ctx.stringValue("DescribeWatchPoliciesResponse.Code"));
		describeWatchPoliciesResponse.setMessage(_ctx.stringValue("DescribeWatchPoliciesResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeWatchPoliciesResponse.Data.TotalCount"));
		data.setPageSize(_ctx.longValue("DescribeWatchPoliciesResponse.Data.PageSize"));
		data.setPageNumber(_ctx.longValue("DescribeWatchPoliciesResponse.Data.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWatchPoliciesResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setWatchPolicyId(_ctx.stringValue("DescribeWatchPoliciesResponse.Data.Records["+ i +"].WatchPolicyId"));
			record.setWatchPolicyName(_ctx.stringValue("DescribeWatchPoliciesResponse.Data.Records["+ i +"].WatchPolicyName"));
			record.setWatchMode(_ctx.stringValue("DescribeWatchPoliciesResponse.Data.Records["+ i +"].WatchMode"));
			record.setTargetType(_ctx.stringValue("DescribeWatchPoliciesResponse.Data.Records["+ i +"].TargetType"));
			record.setSimilarityThreshold(_ctx.doubleValue("DescribeWatchPoliciesResponse.Data.Records["+ i +"].SimilarityThreshold"));
			record.setItemMatchType(_ctx.stringValue("DescribeWatchPoliciesResponse.Data.Records["+ i +"].ItemMatchType"));

			records.add(record);
		}
		data.setRecords(records);
		describeWatchPoliciesResponse.setData(data);
	 
	 	return describeWatchPoliciesResponse;
	}
}