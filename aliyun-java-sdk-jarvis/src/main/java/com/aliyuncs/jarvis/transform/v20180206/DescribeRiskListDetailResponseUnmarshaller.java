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

package com.aliyuncs.jarvis.transform.v20180206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis.model.v20180206.DescribeRiskListDetailResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeRiskListDetailResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeRiskListDetailResponse.Data.EcsSecGroupRiskItem;
import com.aliyuncs.jarvis.model.v20180206.DescribeRiskListDetailResponse.Data.RdsWhitelistRiskItem;
import com.aliyuncs.jarvis.model.v20180206.DescribeRiskListDetailResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskListDetailResponseUnmarshaller {

	public static DescribeRiskListDetailResponse unmarshall(DescribeRiskListDetailResponse describeRiskListDetailResponse, UnmarshallerContext context) {
		
		describeRiskListDetailResponse.setRequestId(context.stringValue("DescribeRiskListDetailResponse.RequestId"));
		describeRiskListDetailResponse.setModule(context.stringValue("DescribeRiskListDetailResponse.Module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeRiskListDetailResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeRiskListDetailResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeRiskListDetailResponse.PageInfo.currentPage"));
		describeRiskListDetailResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeRiskListDetailResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setRiskId(context.integerValue("DescribeRiskListDetailResponse.DataList["+ i +"].RiskId"));
			data.setUpdateTime(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].UpdateTime"));
			data.setRiskDescribe(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].RiskDescribe"));
			data.setRiskType(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].RiskType"));
			data.setRiskInstance(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].RiskInstance"));
			data.setProduct(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].Product"));
			data.setRegionId(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].RegionId"));
			data.setTacticsName(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].TacticsName"));
			data.setStatus(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].Status"));
			data.setIgnoreTime(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].IgnoreTime"));

			List<EcsSecGroupRiskItem> ecsSecGroupRisk = new ArrayList<EcsSecGroupRiskItem>();
			for (int j = 0; j < context.lengthValue("DescribeRiskListDetailResponse.DataList["+ i +"].EcsSecGroupRisk.Length"); j++) {
				EcsSecGroupRiskItem ecsSecGroupRiskItem = new EcsSecGroupRiskItem();
				ecsSecGroupRiskItem.setNetType(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].EcsSecGroupRisk["+ j +"].NetType"));
				ecsSecGroupRiskItem.setDirection(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].EcsSecGroupRisk["+ j +"].Direction"));
				ecsSecGroupRiskItem.setDstPortRange(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].EcsSecGroupRisk["+ j +"].DstPortRange"));
				ecsSecGroupRiskItem.setSrcIpRange(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].EcsSecGroupRisk["+ j +"].SrcIpRange"));

				ecsSecGroupRisk.add(ecsSecGroupRiskItem);
			}
			data.setEcsSecGroupRisk(ecsSecGroupRisk);

			List<RdsWhitelistRiskItem> rdsWhitelistRisk = new ArrayList<RdsWhitelistRiskItem>();
			for (int j = 0; j < context.lengthValue("DescribeRiskListDetailResponse.DataList["+ i +"].RdsWhitelistRisk.Length"); j++) {
				RdsWhitelistRiskItem rdsWhitelistRiskItem = new RdsWhitelistRiskItem();
				rdsWhitelistRiskItem.setRdsWhitelistGroup(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].RdsWhitelistRisk["+ j +"].RdsWhitelistGroup"));
				rdsWhitelistRiskItem.setRiskDetail(context.stringValue("DescribeRiskListDetailResponse.DataList["+ i +"].RdsWhitelistRisk["+ j +"].RiskDetail"));

				rdsWhitelistRisk.add(rdsWhitelistRiskItem);
			}
			data.setRdsWhitelistRisk(rdsWhitelistRisk);

			dataList.add(data);
		}
		describeRiskListDetailResponse.setDataList(dataList);
	 
	 	return describeRiskListDetailResponse;
	}
}