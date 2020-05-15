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

import com.aliyuncs.sddp.model.v20190103.DescribeDataHubConnectorsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataHubConnectorsResponse.Connector;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataHubConnectorsResponseUnmarshaller {

	public static DescribeDataHubConnectorsResponse unmarshall(DescribeDataHubConnectorsResponse describeDataHubConnectorsResponse, UnmarshallerContext _ctx) {
		
		describeDataHubConnectorsResponse.setRequestId(_ctx.stringValue("DescribeDataHubConnectorsResponse.RequestId"));
		describeDataHubConnectorsResponse.setPageSize(_ctx.integerValue("DescribeDataHubConnectorsResponse.PageSize"));
		describeDataHubConnectorsResponse.setCurrentPage(_ctx.integerValue("DescribeDataHubConnectorsResponse.CurrentPage"));
		describeDataHubConnectorsResponse.setTotalCount(_ctx.integerValue("DescribeDataHubConnectorsResponse.TotalCount"));

		List<Connector> items = new ArrayList<Connector>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataHubConnectorsResponse.Items.Length"); i++) {
			Connector connector = new Connector();
			connector.setId(_ctx.longValue("DescribeDataHubConnectorsResponse.Items["+ i +"].Id"));
			connector.setName(_ctx.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].Name"));
			connector.setDescription(_ctx.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].Description"));
			connector.setCreationTime(_ctx.longValue("DescribeDataHubConnectorsResponse.Items["+ i +"].CreationTime"));
			connector.setConnectorProduct(_ctx.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].ConnectorProduct"));
			connector.setConnectorPath(_ctx.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].ConnectorPath"));
			connector.setRiskLevelId(_ctx.longValue("DescribeDataHubConnectorsResponse.Items["+ i +"].RiskLevelId"));
			connector.setRiskLevelName(_ctx.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].RiskLevelName"));
			connector.setUserId(_ctx.longValue("DescribeDataHubConnectorsResponse.Items["+ i +"].UserId"));
			connector.setLoginName(_ctx.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].LoginName"));
			connector.setDisplayName(_ctx.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].DisplayName"));

			items.add(connector);
		}
		describeDataHubConnectorsResponse.setItems(items);
	 
	 	return describeDataHubConnectorsResponse;
	}
}