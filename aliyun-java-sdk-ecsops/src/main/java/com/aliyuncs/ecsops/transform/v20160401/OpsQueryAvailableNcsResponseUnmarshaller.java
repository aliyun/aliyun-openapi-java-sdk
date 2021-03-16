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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryAvailableNcsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAvailableNcsResponse.NcModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryAvailableNcsResponseUnmarshaller {

	public static OpsQueryAvailableNcsResponse unmarshall(OpsQueryAvailableNcsResponse opsQueryAvailableNcsResponse, UnmarshallerContext _ctx) {
		
		opsQueryAvailableNcsResponse.setRequestId(_ctx.stringValue("OpsQueryAvailableNcsResponse.RequestId"));
		opsQueryAvailableNcsResponse.setTotalCount(_ctx.integerValue("OpsQueryAvailableNcsResponse.TotalCount"));
		opsQueryAvailableNcsResponse.setPageNumber(_ctx.integerValue("OpsQueryAvailableNcsResponse.PageNumber"));
		opsQueryAvailableNcsResponse.setPageSize(_ctx.integerValue("OpsQueryAvailableNcsResponse.PageSize"));

		List<NcModel> ncModels = new ArrayList<NcModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryAvailableNcsResponse.NcModels.Length"); i++) {
			NcModel ncModel = new NcModel();
			ncModel.setNcId(_ctx.stringValue("OpsQueryAvailableNcsResponse.NcModels["+ i +"].NcId"));
			ncModel.setNcIp(_ctx.stringValue("OpsQueryAvailableNcsResponse.NcModels["+ i +"].NcIp"));
			ncModel.setClusterId(_ctx.stringValue("OpsQueryAvailableNcsResponse.NcModels["+ i +"].ClusterId"));
			ncModel.setRackId(_ctx.stringValue("OpsQueryAvailableNcsResponse.NcModels["+ i +"].RackId"));
			ncModel.setTotalCpu(_ctx.integerValue("OpsQueryAvailableNcsResponse.NcModels["+ i +"].TotalCpu"));
			ncModel.setTotalMem(_ctx.integerValue("OpsQueryAvailableNcsResponse.NcModels["+ i +"].TotalMem"));
			ncModel.setAvailableCpu(_ctx.integerValue("OpsQueryAvailableNcsResponse.NcModels["+ i +"].AvailableCpu"));
			ncModel.setAvailableMem(_ctx.integerValue("OpsQueryAvailableNcsResponse.NcModels["+ i +"].AvailableMem"));

			ncModels.add(ncModel);
		}
		opsQueryAvailableNcsResponse.setNcModels(ncModels);
	 
	 	return opsQueryAvailableNcsResponse;
	}
}