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
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowsResponse.DataFlow.AutoImportConfiguration;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowsResponse.DataFlow.AutoImportConfiguration.OssInventoryConfig;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowsResponse.DataFlow.AutoRefreshItem;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowsResponse.DataFlow.LazyLoadConfiguration;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowsResponse.DataFlow.LazyLoadConfiguration.EvictRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataFlowsResponseUnmarshaller {

	public static DescribeDataFlowsResponse unmarshall(DescribeDataFlowsResponse describeDataFlowsResponse, UnmarshallerContext _ctx) {
		
		describeDataFlowsResponse.setRequestId(_ctx.stringValue("DescribeDataFlowsResponse.RequestId"));
		describeDataFlowsResponse.setNextToken(_ctx.stringValue("DescribeDataFlowsResponse.NextToken"));

		List<DataFlow> dataFlowInfo = new ArrayList<DataFlow>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataFlowsResponse.DataFlowInfo.Length"); i++) {
			DataFlow dataFlow = new DataFlow();
			dataFlow.setStatus(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].Status"));
			dataFlow.setFsetId(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].FsetId"));
			dataFlow.setFileSystemPath(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].FileSystemPath"));
			dataFlow.setDescription(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].Description"));
			dataFlow.setCreateTime(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].CreateTime"));
			dataFlow.setThroughput(_ctx.longValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].Throughput"));
			dataFlow.setAutoRefreshInterval(_ctx.longValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoRefreshInterval"));
			dataFlow.setFsetDescription(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].FsetDescription"));
			dataFlow.setSourceStorage(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].SourceStorage"));
			dataFlow.setSourceStoragePath(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].SourceStoragePath"));
			dataFlow.setSourceSecurityType(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].SourceSecurityType"));
			dataFlow.setUpdateTime(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].UpdateTime"));
			dataFlow.setFileSystemId(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].FileSystemId"));
			dataFlow.setAutoRefreshPolicy(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoRefreshPolicy"));
			dataFlow.setErrorMessage(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].ErrorMessage"));
			dataFlow.setDataFlowId(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].DataFlowId"));

			LazyLoadConfiguration lazyLoadConfiguration = new LazyLoadConfiguration();
			lazyLoadConfiguration.setEnabled(_ctx.booleanValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].LazyLoadConfiguration.Enabled"));

			List<EvictRule> evictRules = new ArrayList<EvictRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].LazyLoadConfiguration.EvictRules.Length"); j++) {
				EvictRule evictRule = new EvictRule();
				evictRule.setAttribute(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].LazyLoadConfiguration.EvictRules["+ j +"].Attribute"));
				evictRule.setThreshold(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].LazyLoadConfiguration.EvictRules["+ j +"].Threshold"));

				evictRules.add(evictRule);
			}
			lazyLoadConfiguration.setEvictRules(evictRules);
			dataFlow.setLazyLoadConfiguration(lazyLoadConfiguration);

			AutoImportConfiguration autoImportConfiguration = new AutoImportConfiguration();
			autoImportConfiguration.setEnabled(_ctx.booleanValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoImportConfiguration.Enabled"));
			autoImportConfiguration.setDataType(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoImportConfiguration.DataType"));

			OssInventoryConfig ossInventoryConfig = new OssInventoryConfig();
			ossInventoryConfig.setRoleArn(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoImportConfiguration.OssInventoryConfig.RoleArn"));
			ossInventoryConfig.setInventoryId(_ctx.stringValue("DescribeDataFlowsResponse.DataFlowInfo["+ i +"].AutoImportConfiguration.OssInventoryConfig.InventoryId"));
			autoImportConfiguration.setOssInventoryConfig(ossInventoryConfig);
			dataFlow.setAutoImportConfiguration(autoImportConfiguration);

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