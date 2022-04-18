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
		describeDataLimitsResponse.setCurrentPage(_ctx.integerValue("DescribeDataLimitsResponse.CurrentPage"));
		describeDataLimitsResponse.setPageSize(_ctx.integerValue("DescribeDataLimitsResponse.PageSize"));
		describeDataLimitsResponse.setTotalCount(_ctx.integerValue("DescribeDataLimitsResponse.TotalCount"));

		List<DataLimit> items = new ArrayList<DataLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataLimitsResponse.Items.Length"); i++) {
			DataLimit dataLimit = new DataLimit();
			dataLimit.setSupportEvent(_ctx.booleanValue("DescribeDataLimitsResponse.Items["+ i +"].SupportEvent"));
			dataLimit.setErrorMessage(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].ErrorMessage"));
			dataLimit.setCheckStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].CheckStatus"));
			dataLimit.setLocalName(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].LocalName"));
			dataLimit.setTenantName(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].TenantName"));
			dataLimit.setAgentId(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].AgentId"));
			dataLimit.setNextStartTime(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].NextStartTime"));
			dataLimit.setConnector(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].Connector"));
			dataLimit.setPort(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].Port"));
			dataLimit.setCheckStatusName(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].CheckStatusName"));
			dataLimit.setAgentState(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].AgentState"));
			dataLimit.setSamplingSize(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].SamplingSize"));
			dataLimit.setParentId(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].ParentId"));
			dataLimit.setDatamaskStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].DatamaskStatus"));
			dataLimit.setProcessTotalCount(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].ProcessTotalCount"));
			dataLimit.setResourceType(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].ResourceType"));
			dataLimit.setErrorCode(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].ErrorCode"));
			dataLimit.setOcrStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].OcrStatus"));
			dataLimit.setLogStoreDay(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].LogStoreDay"));
			dataLimit.setEventStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].EventStatus"));
			dataLimit.setSupportScan(_ctx.booleanValue("DescribeDataLimitsResponse.Items["+ i +"].SupportScan"));
			dataLimit.setLastFinishedTime(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].LastFinishedTime"));
			dataLimit.setUserName(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].UserName"));
			dataLimit.setAuditStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].AuditStatus"));
			dataLimit.setSupportOcr(_ctx.booleanValue("DescribeDataLimitsResponse.Items["+ i +"].SupportOcr"));
			dataLimit.setSupportAgentInstall(_ctx.booleanValue("DescribeDataLimitsResponse.Items["+ i +"].SupportAgentInstall"));
			dataLimit.setEngineType(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].EngineType"));
			dataLimit.setInstanceId(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].InstanceId"));
			dataLimit.setTotalCount(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].TotalCount"));
			dataLimit.setInstanceDescription(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].InstanceDescription"));
			dataLimit.setDbVersion(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].DbVersion"));
			dataLimit.setRegionId(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].RegionId"));
			dataLimit.setGmtCreate(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].GmtCreate"));
			dataLimit.setSupportAudit(_ctx.booleanValue("DescribeDataLimitsResponse.Items["+ i +"].SupportAudit"));
			dataLimit.setAutoScan(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].AutoScan"));
			dataLimit.setResourceTypeCode(_ctx.stringValue("DescribeDataLimitsResponse.Items["+ i +"].ResourceTypeCode"));
			dataLimit.setSupportDatamask(_ctx.booleanValue("DescribeDataLimitsResponse.Items["+ i +"].SupportDatamask"));
			dataLimit.setProcessStatus(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].ProcessStatus"));
			dataLimit.setId(_ctx.longValue("DescribeDataLimitsResponse.Items["+ i +"].Id"));
			dataLimit.setEnable(_ctx.integerValue("DescribeDataLimitsResponse.Items["+ i +"].Enable"));

			items.add(dataLimit);
		}
		describeDataLimitsResponse.setItems(items);
	 
	 	return describeDataLimitsResponse;
	}
}