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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListCloudMetricProfilingsResponse;
import com.aliyuncs.ehpc.model.v20180412.ListCloudMetricProfilingsResponse.ProfilingInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCloudMetricProfilingsResponseUnmarshaller {

	public static ListCloudMetricProfilingsResponse unmarshall(ListCloudMetricProfilingsResponse listCloudMetricProfilingsResponse, UnmarshallerContext _ctx) {
		
		listCloudMetricProfilingsResponse.setRequestId(_ctx.stringValue("ListCloudMetricProfilingsResponse.RequestId"));
		listCloudMetricProfilingsResponse.setTotalCount(_ctx.integerValue("ListCloudMetricProfilingsResponse.TotalCount"));
		listCloudMetricProfilingsResponse.setPageNumber(_ctx.integerValue("ListCloudMetricProfilingsResponse.PageNumber"));
		listCloudMetricProfilingsResponse.setPageSize(_ctx.integerValue("ListCloudMetricProfilingsResponse.PageSize"));

		List<ProfilingInfo> profilings = new ArrayList<ProfilingInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListCloudMetricProfilingsResponse.Profilings.Length"); i++) {
			ProfilingInfo profilingInfo = new ProfilingInfo();
			profilingInfo.setProfilingId(_ctx.stringValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].ProfilingId"));
			profilingInfo.setInstanceId(_ctx.stringValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].InstanceId"));
			profilingInfo.setHostName(_ctx.stringValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].HostName"));
			profilingInfo.setPid(_ctx.integerValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].Pid"));
			profilingInfo.setDuration(_ctx.integerValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].Duration"));
			profilingInfo.setFreq(_ctx.integerValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].Freq"));
			profilingInfo.setTriggerTime(_ctx.stringValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].TriggerTime"));

			profilings.add(profilingInfo);
		}
		listCloudMetricProfilingsResponse.setProfilings(profilings);
	 
	 	return listCloudMetricProfilingsResponse;
	}
}