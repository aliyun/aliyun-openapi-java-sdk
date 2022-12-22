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

import com.aliyuncs.vpc.model.v20160428.GetVpnGatewayDiagnoseResultResponse;
import com.aliyuncs.vpc.model.v20160428.GetVpnGatewayDiagnoseResultResponse.DiagnoseResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpnGatewayDiagnoseResultResponseUnmarshaller {

	public static GetVpnGatewayDiagnoseResultResponse unmarshall(GetVpnGatewayDiagnoseResultResponse getVpnGatewayDiagnoseResultResponse, UnmarshallerContext _ctx) {
		
		getVpnGatewayDiagnoseResultResponse.setRequestId(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.RequestId"));
		getVpnGatewayDiagnoseResultResponse.setBeginTime(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.BeginTime"));
		getVpnGatewayDiagnoseResultResponse.setDiagnoseId(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.DiagnoseId"));
		getVpnGatewayDiagnoseResultResponse.setFinishTime(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.FinishTime"));
		getVpnGatewayDiagnoseResultResponse.setFinishedCount(_ctx.integerValue("GetVpnGatewayDiagnoseResultResponse.FinishedCount"));
		getVpnGatewayDiagnoseResultResponse.setResourceInstanceId(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.ResourceInstanceId"));
		getVpnGatewayDiagnoseResultResponse.setResourceType(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.ResourceType"));
		getVpnGatewayDiagnoseResultResponse.setTotalCount(_ctx.integerValue("GetVpnGatewayDiagnoseResultResponse.TotalCount"));
		getVpnGatewayDiagnoseResultResponse.setVpnGatewayId(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.VpnGatewayId"));

		List<DiagnoseResultItem> diagnoseResult = new ArrayList<DiagnoseResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVpnGatewayDiagnoseResultResponse.DiagnoseResult.Length"); i++) {
			DiagnoseResultItem diagnoseResultItem = new DiagnoseResultItem();
			diagnoseResultItem.setDiagnoseName(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.DiagnoseResult["+ i +"].DiagnoseName"));
			diagnoseResultItem.setDiagnoseResultDescription(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.DiagnoseResult["+ i +"].DiagnoseResultDescription"));
			diagnoseResultItem.setDiagnoseResultLevel(_ctx.stringValue("GetVpnGatewayDiagnoseResultResponse.DiagnoseResult["+ i +"].DiagnoseResultLevel"));

			diagnoseResult.add(diagnoseResultItem);
		}
		getVpnGatewayDiagnoseResultResponse.setDiagnoseResult(diagnoseResult);
	 
	 	return getVpnGatewayDiagnoseResultResponse;
	}
}