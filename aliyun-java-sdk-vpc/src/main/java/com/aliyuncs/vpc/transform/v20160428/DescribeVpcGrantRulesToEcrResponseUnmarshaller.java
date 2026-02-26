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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeVpcGrantRulesToEcrResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcGrantRulesToEcrResponse.GrantRuleModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcGrantRulesToEcrResponseUnmarshaller {

	public static DescribeVpcGrantRulesToEcrResponse unmarshall(DescribeVpcGrantRulesToEcrResponse describeVpcGrantRulesToEcrResponse, UnmarshallerContext _ctx) {
		
		describeVpcGrantRulesToEcrResponse.setRequestId(_ctx.stringValue("DescribeVpcGrantRulesToEcrResponse.RequestId"));
		describeVpcGrantRulesToEcrResponse.setNextToken(_ctx.stringValue("DescribeVpcGrantRulesToEcrResponse.NextToken"));
		describeVpcGrantRulesToEcrResponse.setTotalCount(_ctx.stringValue("DescribeVpcGrantRulesToEcrResponse.TotalCount"));

		List<GrantRuleModelsItem> grantRuleModels = new ArrayList<GrantRuleModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcGrantRulesToEcrResponse.GrantRuleModels.Length"); i++) {
			GrantRuleModelsItem grantRuleModelsItem = new GrantRuleModelsItem();
			grantRuleModelsItem.setInstanceId(_ctx.stringValue("DescribeVpcGrantRulesToEcrResponse.GrantRuleModels["+ i +"].InstanceId"));
			grantRuleModelsItem.setType(_ctx.stringValue("DescribeVpcGrantRulesToEcrResponse.GrantRuleModels["+ i +"].Type"));
			grantRuleModelsItem.setInstanceUid(_ctx.longValue("DescribeVpcGrantRulesToEcrResponse.GrantRuleModels["+ i +"].InstanceUid"));
			grantRuleModelsItem.setRegionNo(_ctx.stringValue("DescribeVpcGrantRulesToEcrResponse.GrantRuleModels["+ i +"].RegionNo"));
			grantRuleModelsItem.setEcrId(_ctx.stringValue("DescribeVpcGrantRulesToEcrResponse.GrantRuleModels["+ i +"].EcrId"));
			grantRuleModelsItem.setEcrOwnerId(_ctx.longValue("DescribeVpcGrantRulesToEcrResponse.GrantRuleModels["+ i +"].EcrOwnerId"));
			grantRuleModelsItem.setCreationTime(_ctx.stringValue("DescribeVpcGrantRulesToEcrResponse.GrantRuleModels["+ i +"].CreationTime"));

			grantRuleModels.add(grantRuleModelsItem);
		}
		describeVpcGrantRulesToEcrResponse.setGrantRuleModels(grantRuleModels);
	 
	 	return describeVpcGrantRulesToEcrResponse;
	}
}