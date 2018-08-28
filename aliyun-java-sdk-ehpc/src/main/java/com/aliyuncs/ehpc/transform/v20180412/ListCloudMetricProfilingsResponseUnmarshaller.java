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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCloudMetricProfilingsResponseUnmarshaller {

	public static ListCloudMetricProfilingsResponse unmarshall(ListCloudMetricProfilingsResponse listCloudMetricProfilingsResponse, UnmarshallerContext context) {
		
		listCloudMetricProfilingsResponse.setRequestId(context.stringValue("ListCloudMetricProfilingsResponse.RequestId"));
		listCloudMetricProfilingsResponse.setTotalCount(context.integerValue("ListCloudMetricProfilingsResponse.TotalCount"));
		listCloudMetricProfilingsResponse.setPageNumber(context.integerValue("ListCloudMetricProfilingsResponse.PageNumber"));
		listCloudMetricProfilingsResponse.setPageSize(context.integerValue("ListCloudMetricProfilingsResponse.PageSize"));

		List<ProfilingInfo> profilings = new ArrayList<ProfilingInfo>();
		for (int i = 0; i < context.lengthValue("ListCloudMetricProfilingsResponse.Profilings.Length"); i++) {
			ProfilingInfo profilingInfo = new ProfilingInfo();
			profilingInfo.setProfilingId(context.stringValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].ProfilingId"));
			profilingInfo.setInstanceId(context.stringValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].InstanceId"));
			profilingInfo.setHostName(context.stringValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].HostName"));
			profilingInfo.setPid(context.integerValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].Pid"));
			profilingInfo.setDuration(context.integerValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].Duration"));
			profilingInfo.setFreq(context.integerValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].Freq"));
			profilingInfo.setTriggerTime(context.stringValue("ListCloudMetricProfilingsResponse.Profilings["+ i +"].TriggerTime"));

			profilings.add(profilingInfo);
		}
		listCloudMetricProfilingsResponse.setProfilings(profilings);
	 
	 	return listCloudMetricProfilingsResponse;
	}
}