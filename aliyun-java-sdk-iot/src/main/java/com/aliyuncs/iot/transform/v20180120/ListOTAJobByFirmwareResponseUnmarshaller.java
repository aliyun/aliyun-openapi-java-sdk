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

import com.aliyuncs.iot.model.v20180120.ListOTAJobByFirmwareResponse;
import com.aliyuncs.iot.model.v20180120.ListOTAJobByFirmwareResponse.SimpleOTAJobInfo;
import com.aliyuncs.iot.model.v20180120.ListOTAJobByFirmwareResponse.SimpleOTAJobInfo.OtaTagDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOTAJobByFirmwareResponseUnmarshaller {

	public static ListOTAJobByFirmwareResponse unmarshall(ListOTAJobByFirmwareResponse listOTAJobByFirmwareResponse, UnmarshallerContext _ctx) {
		
		listOTAJobByFirmwareResponse.setRequestId(_ctx.stringValue("ListOTAJobByFirmwareResponse.RequestId"));
		listOTAJobByFirmwareResponse.setCurrentPage(_ctx.integerValue("ListOTAJobByFirmwareResponse.CurrentPage"));
		listOTAJobByFirmwareResponse.setErrorMessage(_ctx.stringValue("ListOTAJobByFirmwareResponse.ErrorMessage"));
		listOTAJobByFirmwareResponse.setSuccess(_ctx.booleanValue("ListOTAJobByFirmwareResponse.Success"));
		listOTAJobByFirmwareResponse.setCode(_ctx.stringValue("ListOTAJobByFirmwareResponse.Code"));
		listOTAJobByFirmwareResponse.setPageSize(_ctx.integerValue("ListOTAJobByFirmwareResponse.PageSize"));
		listOTAJobByFirmwareResponse.setPageCount(_ctx.integerValue("ListOTAJobByFirmwareResponse.PageCount"));
		listOTAJobByFirmwareResponse.setTotal(_ctx.integerValue("ListOTAJobByFirmwareResponse.Total"));

		List<SimpleOTAJobInfo> data = new ArrayList<SimpleOTAJobInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListOTAJobByFirmwareResponse.Data.Length"); i++) {
			SimpleOTAJobInfo simpleOTAJobInfo = new SimpleOTAJobInfo();
			simpleOTAJobInfo.setProductKey(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].ProductKey"));
			simpleOTAJobInfo.setJobStatus(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].JobStatus"));
			simpleOTAJobInfo.setUtcStartTime(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].UtcStartTime"));
			simpleOTAJobInfo.setUtcModified(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].UtcModified"));
			simpleOTAJobInfo.setJobId(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].JobId"));
			simpleOTAJobInfo.setUtcCreate(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].UtcCreate"));
			simpleOTAJobInfo.setSelectionType(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].SelectionType"));
			simpleOTAJobInfo.setJobType(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].JobType"));
			simpleOTAJobInfo.setTargetSelection(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].TargetSelection"));
			simpleOTAJobInfo.setUtcEndTime(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].UtcEndTime"));
			simpleOTAJobInfo.setFirmwareId(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].FirmwareId"));

			List<OtaTagDTO> tags = new ArrayList<OtaTagDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListOTAJobByFirmwareResponse.Data["+ i +"].Tags.Length"); j++) {
				OtaTagDTO otaTagDTO = new OtaTagDTO();
				otaTagDTO.setKey(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].Tags["+ j +"].Key"));
				otaTagDTO.setValue(_ctx.stringValue("ListOTAJobByFirmwareResponse.Data["+ i +"].Tags["+ j +"].Value"));

				tags.add(otaTagDTO);
			}
			simpleOTAJobInfo.setTags(tags);

			data.add(simpleOTAJobInfo);
		}
		listOTAJobByFirmwareResponse.setData(data);
	 
	 	return listOTAJobByFirmwareResponse;
	}
}