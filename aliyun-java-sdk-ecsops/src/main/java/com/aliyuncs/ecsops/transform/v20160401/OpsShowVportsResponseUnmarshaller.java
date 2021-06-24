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

import com.aliyuncs.ecsops.model.v20160401.OpsShowVportsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsShowVportsResponse.ShowVportModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsShowVportsResponseUnmarshaller {

	public static OpsShowVportsResponse unmarshall(OpsShowVportsResponse opsShowVportsResponse, UnmarshallerContext _ctx) {
		
		opsShowVportsResponse.setRequestId(_ctx.stringValue("OpsShowVportsResponse.RequestId"));

		List<ShowVportModel> showVportModels = new ArrayList<ShowVportModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsShowVportsResponse.ShowVportModels.Length"); i++) {
			ShowVportModel showVportModel = new ShowVportModel();
			showVportModel.setErrorMessage(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].ErrorMessage"));
			showVportModel.setVportStatus(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].VportStatus"));
			showVportModel.setEniNetworkType(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].EniNetworkType"));
			showVportModel.setCode(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].Code"));
			showVportModel.setVportName(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].VportName"));
			showVportModel.setInstanceId(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].InstanceId"));
			showVportModel.setEniStatus(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].EniStatus"));
			showVportModel.setEniId(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].EniId"));
			showVportModel.setEniType(_ctx.stringValue("OpsShowVportsResponse.ShowVportModels["+ i +"].EniType"));

			showVportModels.add(showVportModel);
		}
		opsShowVportsResponse.setShowVportModels(showVportModels);
	 
	 	return opsShowVportsResponse;
	}
}