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
package com.aliyuncs.tesladam.transform.v20180118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tesladam.model.v20180118.HostGetsResponse;
import com.aliyuncs.tesladam.model.v20180118.HostGetsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class HostGetsResponseUnmarshaller {

	public static HostGetsResponse unmarshall(HostGetsResponse hostGetsResponse, UnmarshallerContext context) {
		
		hostGetsResponse.setStatus(context.booleanValue("HostGetsResponse.Status"));
		hostGetsResponse.setMessage(context.stringValue("HostGetsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("HostGetsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setHostname(context.stringValue("HostGetsResponse.Data["+ i +"].Hostname"));
			dataItem.setIp(context.stringValue("HostGetsResponse.Data["+ i +"].Ip"));
			dataItem.setAppCode(context.stringValue("HostGetsResponse.Data["+ i +"].AppCode"));
			dataItem.setClusterCode(context.stringValue("HostGetsResponse.Data["+ i +"].ClusterCode"));
			dataItem.setSshStatus(context.integerValue("HostGetsResponse.Data["+ i +"].SshStatus"));
			dataItem.setHeartStatus(context.integerValue("HostGetsResponse.Data["+ i +"].heartStatus"));
			dataItem.setHealthScoreLast(context.integerValue("HostGetsResponse.Data["+ i +"].HealthScoreLast"));
			dataItem.setHealthReasonLast(context.stringValue("HostGetsResponse.Data["+ i +"].HealthReasonLast"));

			data.add(dataItem);
		}
		hostGetsResponse.setData(data);
	 
	 	return hostGetsResponse;
	}
}