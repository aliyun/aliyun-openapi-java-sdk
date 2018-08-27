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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeMonthlyServiceStatusDetailResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeMonthlyServiceStatusDetailResponse.AffectedInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonthlyServiceStatusDetailResponseUnmarshaller {

	public static DescribeMonthlyServiceStatusDetailResponse unmarshall(DescribeMonthlyServiceStatusDetailResponse describeMonthlyServiceStatusDetailResponse, UnmarshallerContext context) {
		
		describeMonthlyServiceStatusDetailResponse.setRequestId(context.stringValue("DescribeMonthlyServiceStatusDetailResponse.RequestId"));
		describeMonthlyServiceStatusDetailResponse.setInstanceId(context.stringValue("DescribeMonthlyServiceStatusDetailResponse.InstanceId"));
		describeMonthlyServiceStatusDetailResponse.setUptimePct(context.floatValue("DescribeMonthlyServiceStatusDetailResponse.UptimePct"));

		List<AffectedInfo> affectedInfos = new ArrayList<AffectedInfo>();
		for (int i = 0; i < context.lengthValue("DescribeMonthlyServiceStatusDetailResponse.AffectedInfos.Length"); i++) {
			AffectedInfo affectedInfo = new AffectedInfo();
			affectedInfo.setStartTime(context.stringValue("DescribeMonthlyServiceStatusDetailResponse.AffectedInfos["+ i +"].StartTime"));
			affectedInfo.setEndTime(context.stringValue("DescribeMonthlyServiceStatusDetailResponse.AffectedInfos["+ i +"].EndTime"));
			affectedInfo.setDescription(context.stringValue("DescribeMonthlyServiceStatusDetailResponse.AffectedInfos["+ i +"].Description"));

			affectedInfos.add(affectedInfo);
		}
		describeMonthlyServiceStatusDetailResponse.setAffectedInfos(affectedInfos);
	 
	 	return describeMonthlyServiceStatusDetailResponse;
	}
}