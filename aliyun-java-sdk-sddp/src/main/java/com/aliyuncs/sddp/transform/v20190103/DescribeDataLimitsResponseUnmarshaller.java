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

	public static DescribeDataLimitsResponse unmarshall(DescribeDataLimitsResponse describeDataLimitsResponse, UnmarshallerContext _ctx) {
		
		describeDataLimitsResponse.setRequestId(_ctx.stringValue("DescribeDataLimitsResponse.RequestId"));
		describeDataLimitsResponse.setPageSize(_ctx.integerValue("DescribeDataLimitsResponse.PageSize"));
		describeDataLimitsResponse.setCurrentPage(_ctx.integerValue("DescribeDataLimitsResponse.CurrentPage"));
		describeDataLimitsResponse.setTotalCount(_ctx.integerValue("DescribeDataLimitsResponse.TotalCount"));

		List<DataLimit> items = new ArrayList<DataLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataLimitsResponse.Items.Length"); i++) {
			DataLimit dataLimit = new DataLimit();
			dataLimit.setRegionId(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].RegionId"));
			dataLimit.setLocalName(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].LocalName"));
			dataLimit.setParentId(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].ParentId"));
			dataLimit.setId(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].Id"));
			dataLimit.setUserName(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].UserName"));
			dataLimit.setGmtCreate(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].GmtCreate"));
			dataLimit.setConnector(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].Connector"));
			dataLimit.setCheckStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].CheckStatus"));
			dataLimit.setCheckStatusName(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].CheckStatusName"));
			dataLimit.setResourceType(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].ResourceType"));
			dataLimit.setResourceTypeCode(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].ResourceTypeCode"));
			dataLimit.setAuditStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].AuditStatus"));
			dataLimit.setLogStoreDay(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].LogStoreDay"));
			dataLimit.setEnable(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].Enable"));
			dataLimit.setAutoScan(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].AutoScan"));
			dataLimit.setEngineType(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].EngineType"));
			dataLimit.setProcessStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].ProcessStatus"));
			dataLimit.setProcessTotalCount(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].ProcessTotalCount"));
			dataLimit.setTotalCount(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].TotalCount"));
			dataLimit.setLastFinishedTime(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].LastFinishedTime"));
			dataLimit.setErrorCode(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].ErrorCode"));
			dataLimit.setErrorMessage(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].ErrorMessage"));
			dataLimit.setPort(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].Port"));

			items.add(dataLimit);
		}
		describeDataLimitsResponse.setItems(items);
	 
	 	return describeDataLimitsResponse;
	}
}