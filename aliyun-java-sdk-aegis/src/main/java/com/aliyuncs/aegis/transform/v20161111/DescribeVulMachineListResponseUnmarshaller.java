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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeVulMachineListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeVulMachineListResponse.MachineStatistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulMachineListResponseUnmarshaller {

	public static DescribeVulMachineListResponse unmarshall(DescribeVulMachineListResponse describeVulMachineListResponse, UnmarshallerContext context) {
		
		describeVulMachineListResponse.setRequestId(context.stringValue("DescribeVulMachineListResponse.RequestId"));
		describeVulMachineListResponse.setTotalCount(context.integerValue("DescribeVulMachineListResponse.TotalCount"));

		List<MachineStatistic> machineStatistics = new ArrayList<MachineStatistic>();
		for (int i = 0; i < context.lengthValue("DescribeVulMachineListResponse.MachineStatistics.Length"); i++) {
			MachineStatistic machineStatistic = new MachineStatistic();
			machineStatistic.setUuid(context.stringValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].Uuid"));
			machineStatistic.setCveNum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].CveNum"));
			machineStatistic.setEmgNum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].EmgNum"));
			machineStatistic.setSysNum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].SysNum"));
			machineStatistic.setCmsNum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].CmsNum"));
			machineStatistic.setCmsDealedTotalNum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].CmsDealedTotalNum"));
			machineStatistic.setVulDealedTotalNum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].VulDealedTotalNum"));
			machineStatistic.setVulAsapSum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].VulAsapSum"));
			machineStatistic.setVulLaterSum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].VulLaterSum"));
			machineStatistic.setVulNntfSum(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].VulNntfSum"));
			machineStatistic.setVulSeriousTotal(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].VulSeriousTotal"));
			machineStatistic.setVulHighTotal(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].VulHighTotal"));
			machineStatistic.setVulMediumTotal(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].VulMediumTotal"));
			machineStatistic.setVulLowTotal(context.integerValue("DescribeVulMachineListResponse.MachineStatistics["+ i +"].VulLowTotal"));

			machineStatistics.add(machineStatistic);
		}
		describeVulMachineListResponse.setMachineStatistics(machineStatistics);
	 
	 	return describeVulMachineListResponse;
	}
}