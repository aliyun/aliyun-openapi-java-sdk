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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitsResponse.DataLimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataLimitsResponseUnmarshaller {

	public static DescribeDataLimitsResponse unmarshall(DescribeDataLimitsResponse describeDataLimitsResponse, UnmarshallerContext context) {
		
		describeDataLimitsResponse.setRequestId(context.stringValue("DescribeDataLimitsResponse.RequestId"));

		List<DataLimit> dataLimitList = new ArrayList<DataLimit>();
		for (int i = 0; i < context.lengthValue("DescribeDataLimitsResponse.DataLimitList.Length"); i++) {
			DataLimit dataLimit = new DataLimit();
			dataLimit.setRegionId(context.stringValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].RegionId"));
			dataLimit.setLocalName(context.stringValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].LocalName"));
			dataLimit.setParentId(context.stringValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].ParentId"));
			dataLimit.setId(context.longValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].Id"));
			dataLimit.setUserName(context.stringValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].UserName"));
			dataLimit.setGmtCreate(context.longValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].GmtCreate"));
			dataLimit.setConnector(context.stringValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].Connector"));
			dataLimit.setCheckStatus(context.integerValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].CheckStatus"));
			dataLimit.setCheckStatusName(context.stringValue("DescribeDataLimitsResponse.DataLimitList["+ i +"].CheckStatusName"));

			dataLimitList.add(dataLimit);
		}
		describeDataLimitsResponse.setDataLimitList(dataLimitList);
	 
	 	return describeDataLimitsResponse;
	}
}