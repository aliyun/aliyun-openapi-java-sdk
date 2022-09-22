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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListApplicationMonitorDetectResultResponse;
import com.aliyuncs.ga.model.v20191120.ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationMonitorDetectResultResponseUnmarshaller {

	public static ListApplicationMonitorDetectResultResponse unmarshall(ListApplicationMonitorDetectResultResponse listApplicationMonitorDetectResultResponse, UnmarshallerContext _ctx) {
		
		listApplicationMonitorDetectResultResponse.setRequestId(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.RequestId"));
		listApplicationMonitorDetectResultResponse.setTotalCount(_ctx.integerValue("ListApplicationMonitorDetectResultResponse.TotalCount"));
		listApplicationMonitorDetectResultResponse.setPageSize(_ctx.integerValue("ListApplicationMonitorDetectResultResponse.PageSize"));
		listApplicationMonitorDetectResultResponse.setPageNumber(_ctx.integerValue("ListApplicationMonitorDetectResultResponse.PageNumber"));

		List<ApplicationMonitorDetectResult> applicationMonitorDetectResultList = new ArrayList<ApplicationMonitorDetectResult>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList.Length"); i++) {
			ApplicationMonitorDetectResult applicationMonitorDetectResult = new ApplicationMonitorDetectResult();
			applicationMonitorDetectResult.setAcceleratorId(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].AcceleratorId"));
			applicationMonitorDetectResult.setListenerId(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].ListenerId"));
			applicationMonitorDetectResult.setTaskId(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].TaskId"));
			applicationMonitorDetectResult.setPort(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].Port"));
			applicationMonitorDetectResult.setBizProtocol(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].Protocol"));
			applicationMonitorDetectResult.setDiagStatus(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].DiagStatus"));
			applicationMonitorDetectResult.setStatusCode(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].StatusCode"));
			applicationMonitorDetectResult.setContent(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].Content"));
			applicationMonitorDetectResult.setDetail(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].Detail"));
			applicationMonitorDetectResult.setDetectTime(_ctx.stringValue("ListApplicationMonitorDetectResultResponse.ApplicationMonitorDetectResultList["+ i +"].DetectTime"));

			applicationMonitorDetectResultList.add(applicationMonitorDetectResult);
		}
		listApplicationMonitorDetectResultResponse.setApplicationMonitorDetectResultList(applicationMonitorDetectResultList);
	 
	 	return listApplicationMonitorDetectResultResponse;
	}
}