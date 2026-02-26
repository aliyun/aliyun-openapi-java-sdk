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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeDataFlowsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowsResponse.DataFlow;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowsResponse.DataFlow.AutoRefreshItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataFlowsResponseUnmarshaller {

	public static DescribeDataFlowsResponse unmarshall(DescribeDataFlowsResponse describeDataFlowsResponse, UnmarshallerContext _ctx) {
		
		describeDataFlowsResponse.setRequestId(_ctx.stringValue("DescribeDataFlowsResponse.RequestId"));
		describeDataFlowsResponse.setNextToken(_ctx.stringValue("DescribeDataFlowsResponse.NextToken"));

		List<DataFlow> dataFlowInfo = new ArrayList<DataFlow>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataFlowsResponse.DataFlowInfo.Length"); i++) {
			DataFlow dataFlow = new DataFlow();
			dataFlow.setFileSystemId(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].FileSystemId"));
			dataFlow.setDataFlowId(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].DataFlowId"));
			dataFlow.setFsetId(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].FsetId"));
			dataFlow.setStatus(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].Status"));
			dataFlow.setErrorMessage(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].ErrorMessage"));
			dataFlow.setSourceStorage(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].SourceStorage"));
			dataFlow.setSourceSecurityType(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].SourceSecurityType"));
			dataFlow.setThroughput(_ctx.longValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].Throughput"));
			dataFlow.setDescription(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].Description"));
			dataFlow.setCreateTime(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].CreateTime"));
			dataFlow.setUpdateTime(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].UpdateTime"));
			dataFlow.setFileSystemPath(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].FileSystemPath"));
			dataFlow.setFsetDescription(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].FsetDescription"));
			dataFlow.setAutoRefreshInterval(_ctx.longValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoRefreshInterval"));
			dataFlow.setAutoRefreshPolicy(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoRefreshPolicy"));
			dataFlow.setSourceStoragePath(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].SourceStoragePath"));

			List<AutoRefreshItem> autoRefresh = new ArrayList<AutoRefreshItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoRefresh.Length"); j++) {
				AutoRefreshItem autoRefreshItem = new AutoRefreshItem();
				autoRefreshItem.setRefreshPath(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoRefresh["+ j +"].RefreshPath"));

				autoRefresh.add(autoRefreshItem);
			}
			dataFlow.setAutoRefresh(autoRefresh);

			dataFlowInfo.add(dataFlow);
		}
		describeDataFlowsResponse.setDataFlowInfo(dataFlowInfo);
	 
	 	return describeDataFlowsResponse;
	}
}