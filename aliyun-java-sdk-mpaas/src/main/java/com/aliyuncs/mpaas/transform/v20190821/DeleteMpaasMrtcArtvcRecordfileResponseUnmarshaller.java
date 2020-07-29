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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.DeleteMpaasMrtcArtvcRecordfileResponse;
import com.aliyuncs.mpaas.model.v20190821.DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp;
import com.aliyuncs.mpaas.model.v20190821.DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMpaasMrtcArtvcRecordfileResponseUnmarshaller {

	public static DeleteMpaasMrtcArtvcRecordfileResponse unmarshall(DeleteMpaasMrtcArtvcRecordfileResponse deleteMpaasMrtcArtvcRecordfileResponse, UnmarshallerContext _ctx) {
		
		deleteMpaasMrtcArtvcRecordfileResponse.setRequestId(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.RequestId"));
		deleteMpaasMrtcArtvcRecordfileResponse.setResultCode(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.ResultCode"));
		deleteMpaasMrtcArtvcRecordfileResponse.setResultMessage(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.ResultMessage"));

		MrtcApiRecordFileQueryWrapResp mrtcApiRecordFileQueryWrapResp = new MrtcApiRecordFileQueryWrapResp();
		mrtcApiRecordFileQueryWrapResp.setCode(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Code"));
		mrtcApiRecordFileQueryWrapResp.setMsg(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Msg"));

		Data data = new Data();
		data.setBizRequestId(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.BizRequestId"));
		data.setFilePath(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.FilePath"));
		data.setFileType(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.FileType"));
		data.setRecordStartTime(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.RecordStartTime"));
		data.setStatus(_ctx.stringValue("DeleteMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.Status"));
		mrtcApiRecordFileQueryWrapResp.setData(data);
		deleteMpaasMrtcArtvcRecordfileResponse.setMrtcApiRecordFileQueryWrapResp(mrtcApiRecordFileQueryWrapResp);
	 
	 	return deleteMpaasMrtcArtvcRecordfileResponse;
	}
}