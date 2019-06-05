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

import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitDetailResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataLimitDetailResponse.DataLimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataLimitDetailResponseUnmarshaller {

	public static DescribeDataLimitDetailResponse unmarshall(DescribeDataLimitDetailResponse describeDataLimitDetailResponse, UnmarshallerContext context) {
		
		describeDataLimitDetailResponse.setRequestId(context.stringValue("DescribeDataLimitDetailResponse.RequestId"));

		DataLimit dataLimit = new DataLimit();
		dataLimit.setRegionId(context.stringValue("DescribeDataLimitDetailResponse.DataLimit.RegionId"));
		dataLimit.setLocalName(context.stringValue("DescribeDataLimitDetailResponse.DataLimit.LocalName"));
		dataLimit.setParentId(context.stringValue("DescribeDataLimitDetailResponse.DataLimit.ParentId"));
		dataLimit.setId(context.longValue("DescribeDataLimitDetailResponse.DataLimit.Id"));
		dataLimit.setUserName(context.stringValue("DescribeDataLimitDetailResponse.DataLimit.UserName"));
		dataLimit.setPassword(context.stringValue("DescribeDataLimitDetailResponse.DataLimit.Password"));
		dataLimit.setGmtCreate(context.longValue("DescribeDataLimitDetailResponse.DataLimit.GmtCreate"));
		dataLimit.setConnector(context.stringValue("DescribeDataLimitDetailResponse.DataLimit.Connector"));
		dataLimit.setCheckStatus(context.integerValue("DescribeDataLimitDetailResponse.DataLimit.CheckStatus"));
		dataLimit.setCheckStatusName(context.stringValue("DescribeDataLimitDetailResponse.DataLimit.CheckStatusName"));
		describeDataLimitDetailResponse.setDataLimit(dataLimit);
	 
	 	return describeDataLimitDetailResponse;
	}
}