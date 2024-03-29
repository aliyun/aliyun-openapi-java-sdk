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

	public static DescribeDataLimitDetailResponse unmarshall(DescribeDataLimitDetailResponse describeDataLimitDetailResponse, UnmarshallerContext _ctx) {
		
		describeDataLimitDetailResponse.setRequestId(_ctx.stringValue("DescribeDataLimitDetailResponse.RequestId"));

		DataLimit dataLimit = new DataLimit();
		dataLimit.setLocalName(_ctx.stringValue("DescribeDataLimitDetailResponse.DataLimit.LocalName"));
		dataLimit.setCheckStatus(_ctx.integerValue("DescribeDataLimitDetailResponse.DataLimit.CheckStatus"));
		dataLimit.setConnector(_ctx.stringValue("DescribeDataLimitDetailResponse.DataLimit.Connector"));
		dataLimit.setPort(_ctx.integerValue("DescribeDataLimitDetailResponse.DataLimit.Port"));
		dataLimit.setCheckStatusName(_ctx.stringValue("DescribeDataLimitDetailResponse.DataLimit.CheckStatusName"));
		dataLimit.setRegionId(_ctx.stringValue("DescribeDataLimitDetailResponse.DataLimit.RegionId"));
		dataLimit.setParentId(_ctx.stringValue("DescribeDataLimitDetailResponse.DataLimit.ParentId"));
		dataLimit.setResourceType(_ctx.longValue("DescribeDataLimitDetailResponse.DataLimit.ResourceType"));
		dataLimit.setLogStoreDay(_ctx.integerValue("DescribeDataLimitDetailResponse.DataLimit.LogStoreDay"));
		dataLimit.setGmtCreate(_ctx.longValue("DescribeDataLimitDetailResponse.DataLimit.GmtCreate"));
		dataLimit.setResourceTypeCode(_ctx.stringValue("DescribeDataLimitDetailResponse.DataLimit.ResourceTypeCode"));
		dataLimit.setUserName(_ctx.stringValue("DescribeDataLimitDetailResponse.DataLimit.UserName"));
		dataLimit.setId(_ctx.longValue("DescribeDataLimitDetailResponse.DataLimit.Id"));
		dataLimit.setAuditStatus(_ctx.integerValue("DescribeDataLimitDetailResponse.DataLimit.AuditStatus"));
		describeDataLimitDetailResponse.setDataLimit(dataLimit);
	 
	 	return describeDataLimitDetailResponse;
	}
}