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

import com.aliyuncs.iot.model.v20180120.QueryOTAJobResponse;
import com.aliyuncs.iot.model.v20180120.QueryOTAJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryOTAJobResponse.Data.OtaTagDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOTAJobResponseUnmarshaller {

	public static QueryOTAJobResponse unmarshall(QueryOTAJobResponse queryOTAJobResponse, UnmarshallerContext _ctx) {
		
		queryOTAJobResponse.setRequestId(_ctx.stringValue("QueryOTAJobResponse.RequestId"));
		queryOTAJobResponse.setCode(_ctx.stringValue("QueryOTAJobResponse.Code"));
		queryOTAJobResponse.setErrorMessage(_ctx.stringValue("QueryOTAJobResponse.ErrorMessage"));
		queryOTAJobResponse.setSuccess(_ctx.booleanValue("QueryOTAJobResponse.Success"));

		Data data = new Data();
		data.setUtcCreate(_ctx.stringValue("QueryOTAJobResponse.Data.UtcCreate"));
		data.setRetryInterval(_ctx.integerValue("QueryOTAJobResponse.Data.RetryInterval"));
		data.setJobType(_ctx.stringValue("QueryOTAJobResponse.Data.JobType"));
		data.setSelectionType(_ctx.stringValue("QueryOTAJobResponse.Data.SelectionType"));
		data.setOverwriteMode(_ctx.integerValue("QueryOTAJobResponse.Data.OverwriteMode"));
		data.setTargetSelection(_ctx.stringValue("QueryOTAJobResponse.Data.TargetSelection"));
		data.setTimeoutInMinutes(_ctx.integerValue("QueryOTAJobResponse.Data.TimeoutInMinutes"));
		data.setGrayPercent(_ctx.stringValue("QueryOTAJobResponse.Data.GrayPercent"));
		data.setNeedPush(_ctx.booleanValue("QueryOTAJobResponse.Data.NeedPush"));
		data.setJobStatus(_ctx.stringValue("QueryOTAJobResponse.Data.JobStatus"));
		data.setJobDesc(_ctx.stringValue("QueryOTAJobResponse.Data.JobDesc"));
		data.setUtcModified(_ctx.stringValue("QueryOTAJobResponse.Data.UtcModified"));
		data.setUtcStartTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcStartTime"));
		data.setMultiModuleMode(_ctx.booleanValue("QueryOTAJobResponse.Data.MultiModuleMode"));
		data.setUtcEndTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcEndTime"));
		data.setName(_ctx.stringValue("QueryOTAJobResponse.Data.Name"));
		data.setDestVersion(_ctx.stringValue("QueryOTAJobResponse.Data.DestVersion"));
		data.setUtcScheduleFinishTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcScheduleFinishTime"));
		data.setMaximumPerMinute(_ctx.integerValue("QueryOTAJobResponse.Data.MaximumPerMinute"));
		data.setDynamicMode(_ctx.integerValue("QueryOTAJobResponse.Data.DynamicMode"));
		data.setRetryCount(_ctx.integerValue("QueryOTAJobResponse.Data.RetryCount"));
		data.setProductKey(_ctx.stringValue("QueryOTAJobResponse.Data.ProductKey"));
		data.setGroupName(_ctx.stringValue("QueryOTAJobResponse.Data.GroupName"));
		data.setGroupId(_ctx.stringValue("QueryOTAJobResponse.Data.GroupId"));
		data.setUtcScheduleTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcScheduleTime"));
		data.setJobId(_ctx.stringValue("QueryOTAJobResponse.Data.JobId"));
		data.setDownloadProtocol(_ctx.stringValue("QueryOTAJobResponse.Data.DownloadProtocol"));
		data.setNeedConfirm(_ctx.booleanValue("QueryOTAJobResponse.Data.NeedConfirm"));
		data.setFirmwareId(_ctx.stringValue("QueryOTAJobResponse.Data.FirmwareId"));

		List<String> srcVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryOTAJobResponse.Data.SrcVersions.Length"); i++) {
			srcVersions.add(_ctx.stringValue("QueryOTAJobResponse.Data.SrcVersions["+ i +"]"));
		}
		data.setSrcVersions(srcVersions);

		List<OtaTagDTO> tags = new ArrayList<OtaTagDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryOTAJobResponse.Data.Tags.Length"); i++) {
			OtaTagDTO otaTagDTO = new OtaTagDTO();
			otaTagDTO.setKey(_ctx.stringValue("QueryOTAJobResponse.Data.Tags["+ i +"].Key"));
			otaTagDTO.setValue(_ctx.stringValue("QueryOTAJobResponse.Data.Tags["+ i +"].Value"));

			tags.add(otaTagDTO);
		}
		data.setTags(tags);
		queryOTAJobResponse.setData(data);
	 
	 	return queryOTAJobResponse;
	}
}