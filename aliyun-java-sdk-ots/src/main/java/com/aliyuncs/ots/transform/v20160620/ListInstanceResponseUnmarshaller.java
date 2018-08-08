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

package com.aliyuncs.ots.transform.v20160620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ots.model.v20160620.ListInstanceResponse;
import com.aliyuncs.ots.model.v20160620.ListInstanceResponse.InstanceInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResponseUnmarshaller {

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext context) {
		
		listInstanceResponse.setRequestId(context.stringValue("ListInstanceResponse.RequestId"));
		listInstanceResponse.setTotalCount(context.longValue("ListInstanceResponse.TotalCount"));
		listInstanceResponse.setPageNum(context.longValue("ListInstanceResponse.PageNum"));
		listInstanceResponse.setPageSize(context.longValue("ListInstanceResponse.PageSize"));

		List<InstanceInfo> instanceInfos = new ArrayList<InstanceInfo>();
		for (int i = 0; i < context.lengthValue("ListInstanceResponse.InstanceInfos.Length"); i++) {
			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setInstanceName(context.stringValue("ListInstanceResponse.InstanceInfos["+ i +"].InstanceName"));
			instanceInfo.setTimestamp(context.stringValue("ListInstanceResponse.InstanceInfos["+ i +"].Timestamp"));

			instanceInfos.add(instanceInfo);
		}
		listInstanceResponse.setInstanceInfos(instanceInfos);
	 
	 	return listInstanceResponse;
	}
}