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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAlertStatisticsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAlertStatisticsResponse.AlertInfoStatisticalModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeAlertStatisticsResponseUnmarshaller {

	public static OpsDescribeAlertStatisticsResponse unmarshall(OpsDescribeAlertStatisticsResponse opsDescribeAlertStatisticsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeAlertStatisticsResponse.setRequestId(_ctx.stringValue("OpsDescribeAlertStatisticsResponse.RequestId"));
		opsDescribeAlertStatisticsResponse.setFixedTotal(_ctx.integerValue("OpsDescribeAlertStatisticsResponse.FixedTotal"));
		opsDescribeAlertStatisticsResponse.setWaitTotal(_ctx.integerValue("OpsDescribeAlertStatisticsResponse.WaitTotal"));
		opsDescribeAlertStatisticsResponse.setFinishedTotal(_ctx.integerValue("OpsDescribeAlertStatisticsResponse.FinishedTotal"));
		opsDescribeAlertStatisticsResponse.setProcessingTotal(_ctx.integerValue("OpsDescribeAlertStatisticsResponse.ProcessingTotal"));

		List<AlertInfoStatisticalModel> alertInfoStatisticalModels = new ArrayList<AlertInfoStatisticalModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeAlertStatisticsResponse.AlertInfoStatisticalModels.Length"); i++) {
			AlertInfoStatisticalModel alertInfoStatisticalModel = new AlertInfoStatisticalModel();
			alertInfoStatisticalModel.setAlertLevel(_ctx.stringValue("OpsDescribeAlertStatisticsResponse.AlertInfoStatisticalModels["+ i +"].AlertLevel"));
			alertInfoStatisticalModel.setAlertProcessingTotal(_ctx.integerValue("OpsDescribeAlertStatisticsResponse.AlertInfoStatisticalModels["+ i +"].AlertProcessingTotal"));
			alertInfoStatisticalModel.setAlertFixedTotal(_ctx.integerValue("OpsDescribeAlertStatisticsResponse.AlertInfoStatisticalModels["+ i +"].AlertFixedTotal"));
			alertInfoStatisticalModel.setAlertFinishedTotal(_ctx.integerValue("OpsDescribeAlertStatisticsResponse.AlertInfoStatisticalModels["+ i +"].AlertFinishedTotal"));
			alertInfoStatisticalModel.setAlertWaitTotal(_ctx.integerValue("OpsDescribeAlertStatisticsResponse.AlertInfoStatisticalModels["+ i +"].AlertWaitTotal"));

			alertInfoStatisticalModels.add(alertInfoStatisticalModel);
		}
		opsDescribeAlertStatisticsResponse.setAlertInfoStatisticalModels(alertInfoStatisticalModels);
	 
	 	return opsDescribeAlertStatisticsResponse;
	}
}