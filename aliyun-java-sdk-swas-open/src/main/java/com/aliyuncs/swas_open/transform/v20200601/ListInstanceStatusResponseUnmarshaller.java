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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListInstanceStatusResponse;
import com.aliyuncs.swas_open.model.v20200601.ListInstanceStatusResponse.InstanceStatuse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceStatusResponseUnmarshaller {

	public static ListInstanceStatusResponse unmarshall(ListInstanceStatusResponse listInstanceStatusResponse, UnmarshallerContext _ctx) {
		
		listInstanceStatusResponse.setRequestId(_ctx.stringValue("ListInstanceStatusResponse.RequestId"));
		listInstanceStatusResponse.setPageSize(_ctx.integerValue("ListInstanceStatusResponse.PageSize"));
		listInstanceStatusResponse.setPageNumber(_ctx.integerValue("ListInstanceStatusResponse.PageNumber"));
		listInstanceStatusResponse.setTotalCount(_ctx.integerValue("ListInstanceStatusResponse.TotalCount"));

		List<InstanceStatuse> instanceStatuses = new ArrayList<InstanceStatuse>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceStatusResponse.InstanceStatuses.Length"); i++) {
			InstanceStatuse instanceStatuse = new InstanceStatuse();
			instanceStatuse.setStatus(_ctx.stringValue("ListInstanceStatusResponse.InstanceStatuses["+ i +"].Status"));
			instanceStatuse.setInstanceId(_ctx.stringValue("ListInstanceStatusResponse.InstanceStatuses["+ i +"].InstanceId"));

			instanceStatuses.add(instanceStatuse);
		}
		listInstanceStatusResponse.setInstanceStatuses(instanceStatuses);
	 
	 	return listInstanceStatusResponse;
	}
}