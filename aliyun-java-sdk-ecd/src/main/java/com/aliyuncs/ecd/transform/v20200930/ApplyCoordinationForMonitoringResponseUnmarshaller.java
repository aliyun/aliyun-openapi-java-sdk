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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.ApplyCoordinationForMonitoringResponse;
import com.aliyuncs.ecd.model.v20200930.ApplyCoordinationForMonitoringResponse.CoordinateFlowModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyCoordinationForMonitoringResponseUnmarshaller {

	public static ApplyCoordinationForMonitoringResponse unmarshall(ApplyCoordinationForMonitoringResponse applyCoordinationForMonitoringResponse, UnmarshallerContext _ctx) {
		
		applyCoordinationForMonitoringResponse.setRequestId(_ctx.stringValue("ApplyCoordinationForMonitoringResponse.RequestId"));

		List<CoordinateFlowModel> coordinateFlowModels = new ArrayList<CoordinateFlowModel>();
		for (int i = 0; i < _ctx.lengthValue("ApplyCoordinationForMonitoringResponse.CoordinateFlowModels.Length"); i++) {
			CoordinateFlowModel coordinateFlowModel = new CoordinateFlowModel();
			coordinateFlowModel.setCoordinateStatus(_ctx.stringValue("ApplyCoordinationForMonitoringResponse.CoordinateFlowModels["+ i +"].CoordinateStatus"));
			coordinateFlowModel.setInitiatorType(_ctx.stringValue("ApplyCoordinationForMonitoringResponse.CoordinateFlowModels["+ i +"].InitiatorType"));
			coordinateFlowModel.setOwnerUserId(_ctx.stringValue("ApplyCoordinationForMonitoringResponse.CoordinateFlowModels["+ i +"].OwnerUserId"));
			coordinateFlowModel.setCoordinateTicket(_ctx.stringValue("ApplyCoordinationForMonitoringResponse.CoordinateFlowModels["+ i +"].CoordinateTicket"));
			coordinateFlowModel.setCoId(_ctx.stringValue("ApplyCoordinationForMonitoringResponse.CoordinateFlowModels["+ i +"].CoId"));
			coordinateFlowModel.setResourceId(_ctx.stringValue("ApplyCoordinationForMonitoringResponse.CoordinateFlowModels["+ i +"].ResourceId"));
			coordinateFlowModel.setResourceName(_ctx.stringValue("ApplyCoordinationForMonitoringResponse.CoordinateFlowModels["+ i +"].ResourceName"));

			coordinateFlowModels.add(coordinateFlowModel);
		}
		applyCoordinationForMonitoringResponse.setCoordinateFlowModels(coordinateFlowModels);
	 
	 	return applyCoordinationForMonitoringResponse;
	}
}