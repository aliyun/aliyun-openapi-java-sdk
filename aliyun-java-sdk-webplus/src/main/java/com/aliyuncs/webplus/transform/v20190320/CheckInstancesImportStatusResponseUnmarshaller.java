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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.CheckInstancesImportStatusResponse;
import com.aliyuncs.webplus.model.v20190320.CheckInstancesImportStatusResponse.InstanceImportStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckInstancesImportStatusResponseUnmarshaller {

	public static CheckInstancesImportStatusResponse unmarshall(CheckInstancesImportStatusResponse checkInstancesImportStatusResponse, UnmarshallerContext _ctx) {
		
		checkInstancesImportStatusResponse.setRequestId(_ctx.stringValue("CheckInstancesImportStatusResponse.RequestId"));
		checkInstancesImportStatusResponse.setCode(_ctx.stringValue("CheckInstancesImportStatusResponse.Code"));
		checkInstancesImportStatusResponse.setMessage(_ctx.stringValue("CheckInstancesImportStatusResponse.Message"));

		List<InstanceImportStatus> instancesImportStatus = new ArrayList<InstanceImportStatus>();
		for (int i = 0; i < _ctx.lengthValue("CheckInstancesImportStatusResponse.InstancesImportStatus.Length"); i++) {
			InstanceImportStatus instanceImportStatus = new InstanceImportStatus();
			instanceImportStatus.setInstanceId(_ctx.stringValue("CheckInstancesImportStatusResponse.InstancesImportStatus["+ i +"].InstanceId"));
			instanceImportStatus.setImportStatus(_ctx.stringValue("CheckInstancesImportStatusResponse.InstancesImportStatus["+ i +"].ImportStatus"));
			instanceImportStatus.setImportMessage(_ctx.stringValue("CheckInstancesImportStatusResponse.InstancesImportStatus["+ i +"].ImportMessage"));
			instanceImportStatus.setFinishedTime(_ctx.longValue("CheckInstancesImportStatusResponse.InstancesImportStatus["+ i +"].FinishedTime"));

			instancesImportStatus.add(instanceImportStatus);
		}
		checkInstancesImportStatusResponse.setInstancesImportStatus(instancesImportStatus);
	 
	 	return checkInstancesImportStatusResponse;
	}
}