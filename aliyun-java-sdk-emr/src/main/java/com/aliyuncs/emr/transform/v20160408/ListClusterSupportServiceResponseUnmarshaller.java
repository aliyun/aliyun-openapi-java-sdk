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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterSupportServiceResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterSupportServiceResponse.SupportService;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterSupportServiceResponseUnmarshaller {

	public static ListClusterSupportServiceResponse unmarshall(ListClusterSupportServiceResponse listClusterSupportServiceResponse, UnmarshallerContext _ctx) {
		
		listClusterSupportServiceResponse.setRequestId(_ctx.stringValue("ListClusterSupportServiceResponse.RequestId"));
		listClusterSupportServiceResponse.setTotalCount(_ctx.stringValue("ListClusterSupportServiceResponse.TotalCount"));
		listClusterSupportServiceResponse.setPageNumber(_ctx.stringValue("ListClusterSupportServiceResponse.PageNumber"));

		List<SupportService> supportServiceList = new ArrayList<SupportService>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterSupportServiceResponse.SupportServiceList.Length"); i++) {
			SupportService supportService = new SupportService();
			supportService.setServiceName(_ctx.stringValue("ListClusterSupportServiceResponse.SupportServiceList["+ i +"].ServiceName"));
			supportService.setServiceDisplayName(_ctx.stringValue("ListClusterSupportServiceResponse.SupportServiceList["+ i +"].ServiceDisplayName"));
			supportService.setServiceVersion(_ctx.stringValue("ListClusterSupportServiceResponse.SupportServiceList["+ i +"].ServiceVersion"));
			supportService.setServiceEcmVersion(_ctx.stringValue("ListClusterSupportServiceResponse.SupportServiceList["+ i +"].ServiceEcmVersion"));

			supportServiceList.add(supportService);
		}
		listClusterSupportServiceResponse.setSupportServiceList(supportServiceList);
	 
	 	return listClusterSupportServiceResponse;
	}
}