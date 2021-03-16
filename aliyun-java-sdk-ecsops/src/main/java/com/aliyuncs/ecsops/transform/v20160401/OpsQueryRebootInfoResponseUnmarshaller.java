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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryRebootInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryRebootInfoResponse.CheckPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryRebootInfoResponseUnmarshaller {

	public static OpsQueryRebootInfoResponse unmarshall(OpsQueryRebootInfoResponse opsQueryRebootInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryRebootInfoResponse.setRequestId(_ctx.stringValue("OpsQueryRebootInfoResponse.RequestId"));

		List<CheckPoint> checkPoints = new ArrayList<CheckPoint>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryRebootInfoResponse.CheckPoints.Length"); i++) {
			CheckPoint checkPoint = new CheckPoint();
			checkPoint.setId(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].Id"));
			checkPoint.setAliUid(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].AliUid"));
			checkPoint.setProductCode(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].ProductCode"));
			checkPoint.setInstanceId(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].InstanceId"));
			checkPoint.setOrderId(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].OrderId"));
			checkPoint.setRestartDate(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].RestartDate"));
			checkPoint.setUserPerform(_ctx.booleanValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].UserPerform"));
			checkPoint.setSystemPerform(_ctx.booleanValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].SystemPerform"));
			checkPoint.setGmtCreated(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].GmtCreated"));
			checkPoint.setGmtModified(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].GmtModified"));
			checkPoint.setIsDeleted(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].IsDeleted"));
			checkPoint.setExpectedTime(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].ExpectedTime"));
			checkPoint.setRequestId(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].RequestId"));
			checkPoint.setUpgradeDate(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].UpgradeDate"));
			checkPoint.setScriptionId(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].ScriptionId"));
			checkPoint.setMark(_ctx.stringValue("OpsQueryRebootInfoResponse.CheckPoints["+ i +"].Mark"));

			checkPoints.add(checkPoint);
		}
		opsQueryRebootInfoResponse.setCheckPoints(checkPoints);
	 
	 	return opsQueryRebootInfoResponse;
	}
}