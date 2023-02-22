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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListClusterCnnfStatusDetailResponse;
import com.aliyuncs.sas.model.v20181203.ListClusterCnnfStatusDetailResponse.StatusDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterCnnfStatusDetailResponseUnmarshaller {

	public static ListClusterCnnfStatusDetailResponse unmarshall(ListClusterCnnfStatusDetailResponse listClusterCnnfStatusDetailResponse, UnmarshallerContext _ctx) {
		
		listClusterCnnfStatusDetailResponse.setRequestId(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.RequestId"));

		List<StatusDetail> data = new ArrayList<StatusDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterCnnfStatusDetailResponse.Data.Length"); i++) {
			StatusDetail statusDetail = new StatusDetail();
			statusDetail.setUuid(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].Uuid"));
			statusDetail.setClusterId(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].ClusterId"));
			statusDetail.setInstanceId(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].InstanceId"));
			statusDetail.setMachineName(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].MachineName"));
			statusDetail.setPluginName(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].PluginName"));
			statusDetail.setInstalled(_ctx.booleanValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].Installed"));
			statusDetail.setStatus(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].Status"));
			statusDetail.setInternetIp(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].InternetIp"));
			statusDetail.setIntranetIp(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].IntranetIp"));
			statusDetail.setMachineType(_ctx.integerValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].MachineType"));
			statusDetail.setPluginVersion(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].PluginVersion"));
			statusDetail.setInstanceRole(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].InstanceRole"));
			statusDetail.setInvalidType(_ctx.stringValue("ListClusterCnnfStatusDetailResponse.Data["+ i +"].InvalidType"));

			data.add(statusDetail);
		}
		listClusterCnnfStatusDetailResponse.setData(data);
	 
	 	return listClusterCnnfStatusDetailResponse;
	}
}