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

	public static DescribeDataHubConnectorsResponse unmarshall(DescribeDataHubConnectorsResponse describeDataHubConnectorsResponse, UnmarshallerContext context) {
		
		describeDataHubConnectorsResponse.setRequestId(context.stringValue("DescribeDataHubConnectorsResponse.RequestId"));
		describeDataHubConnectorsResponse.setPageSize(context.integerValue("DescribeDataHubConnectorsResponse.PageSize"));
		describeDataHubConnectorsResponse.setCurrentPage(context.integerValue("DescribeDataHubConnectorsResponse.CurrentPage"));
		describeDataHubConnectorsResponse.setTotalCount(context.integerValue("DescribeDataHubConnectorsResponse.TotalCount"));

		List<Connector> items = new ArrayList<Connector>();
		for (int i = 0; i < context.lengthValue("DescribeDataHubConnectorsResponse.Items.Length"); i++) {
			Connector connector = new Connector();
			connector.setId(context.longValue("DescribeDataHubConnectorsResponse.Items["+ i +"].Id"));
			connector.setName(context.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].Name"));
			connector.setDescription(context.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].Description"));
			connector.setCreationTime(context.longValue("DescribeDataHubConnectorsResponse.Items["+ i +"].CreationTime"));
			connector.setConnectorProduct(context.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].ConnectorProduct"));
			connector.setConnectorPath(context.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].ConnectorPath"));
			connector.setRiskLevelId(context.longValue("DescribeDataHubConnectorsResponse.Items["+ i +"].RiskLevelId"));
			connector.setRiskLevelName(context.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].RiskLevelName"));
			connector.setUserId(context.longValue("DescribeDataHubConnectorsResponse.Items["+ i +"].UserId"));
			connector.setLoginName(context.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].LoginName"));
			connector.setDisplayName(context.stringValue("DescribeDataHubConnectorsResponse.Items["+ i +"].DisplayName"));

			items.add(connector);
		}
		describeDataHubConnectorsResponse.setItems(items);
	 
	 	return describeDataHubConnectorsResponse;
	}
}