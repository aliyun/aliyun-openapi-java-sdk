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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListOTAJobByDeviceResponse;
import com.aliyuncs.iot.model.v20180120.ListOTAJobByDeviceResponse.SimpleOTAJobInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOTAJobByDeviceResponseUnmarshaller {

	public static ListOTAJobByDeviceResponse unmarshall(ListOTAJobByDeviceResponse listOTAJobByDeviceResponse, UnmarshallerContext _ctx) {
		
		listOTAJobByDeviceResponse.setRequestId(_ctx.stringValue("ListOTAJobByDeviceResponse.RequestId"));
		listOTAJobByDeviceResponse.setSuccess(_ctx.booleanValue("ListOTAJobByDeviceResponse.Success"));
		listOTAJobByDeviceResponse.setCode(_ctx.stringValue("ListOTAJobByDeviceResponse.Code"));
		listOTAJobByDeviceResponse.setErrorMessage(_ctx.stringValue("ListOTAJobByDeviceResponse.ErrorMessage"));
		listOTAJobByDeviceResponse.setTotal(_ctx.integerValue("ListOTAJobByDeviceResponse.Total"));
		listOTAJobByDeviceResponse.setPageSize(_ctx.integerValue("ListOTAJobByDeviceResponse.PageSize"));
		listOTAJobByDeviceResponse.setPageCount(_ctx.integerValue("ListOTAJobByDeviceResponse.PageCount"));
		listOTAJobByDeviceResponse.setCurrentPage(_ctx.integerValue("ListOTAJobByDeviceResponse.CurrentPage"));

		List<SimpleOTAJobInfo> data = new ArrayList<SimpleOTAJobInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListOTAJobByDeviceResponse.Data.Length"); i++) {
			SimpleOTAJobInfo simpleOTAJobInfo = new SimpleOTAJobInfo();
			simpleOTAJobInfo.setJobId(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].JobId"));
			simpleOTAJobInfo.setUtcCreate(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].UtcCreate"));
			simpleOTAJobInfo.setUtcModified(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].UtcModified"));
			simpleOTAJobInfo.setProductKey(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].ProductKey"));
			simpleOTAJobInfo.setFirmwareId(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].FirmwareId"));
			simpleOTAJobInfo.setUtcStartTime(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].UtcStartTime"));
			simpleOTAJobInfo.setUtcEndTime(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].UtcEndTime"));
			simpleOTAJobInfo.setJobStatus(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].JobStatus"));
			simpleOTAJobInfo.setJobType(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].JobType"));
			simpleOTAJobInfo.setTargetSelection(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].TargetSelection"));
			simpleOTAJobInfo.setSelectionType(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].SelectionType"));

			data.add(simpleOTAJobInfo);
		}
		listOTAJobByDeviceResponse.setData(data);
	 
	 	return listOTAJobByDeviceResponse;
	}
}