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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFailedDeploymentStatusInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeFailedDeploymentStatusInfoResponseUnmarshaller {

	public static OpsDescribeFailedDeploymentStatusInfoResponse unmarshall(OpsDescribeFailedDeploymentStatusInfoResponse opsDescribeFailedDeploymentStatusInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeFailedDeploymentStatusInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.RequestId"));
		opsDescribeFailedDeploymentStatusInfoResponse.setTotalCount(_ctx.integerValue("OpsDescribeFailedDeploymentStatusInfoResponse.TotalCount"));

		List<FailedDeployStatusInfoItem> failedDeployStatusInfo = new ArrayList<FailedDeployStatusInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo.Length"); i++) {
			FailedDeployStatusInfoItem failedDeployStatusInfoItem = new FailedDeployStatusInfoItem();
			failedDeployStatusInfoItem.setGmtCreated(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].GmtCreated"));
			failedDeployStatusInfoItem.setBatchNo(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].BatchNo"));
			failedDeployStatusInfoItem.setReasonDetail(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].ReasonDetail"));
			failedDeployStatusInfoItem.setRawReason(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].RawReason"));
			failedDeployStatusInfoItem.setNcIp(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].NcIp"));
			failedDeployStatusInfoItem.setGmtModified(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].GmtModified"));
			failedDeployStatusInfoItem.setResourceId(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].ResourceId"));
			failedDeployStatusInfoItem.setPlanId(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].PlanId"));
			failedDeployStatusInfoItem.setReason(_ctx.stringValue("OpsDescribeFailedDeploymentStatusInfoResponse.FailedDeployStatusInfo["+ i +"].Reason"));

			failedDeployStatusInfo.add(failedDeployStatusInfoItem);
		}
		opsDescribeFailedDeploymentStatusInfoResponse.setFailedDeployStatusInfo(failedDeployStatusInfo);
	 
	 	return opsDescribeFailedDeploymentStatusInfoResponse;
	}
}