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

import com.aliyuncs.mpaas.model.v20190821.QueryMpaasMrtcArtvcRecordfileResponse;
import com.aliyuncs.mpaas.model.v20190821.QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp;
import com.aliyuncs.mpaas.model.v20190821.QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMpaasMrtcArtvcRecordfileResponseUnmarshaller {

	public static QueryMpaasMrtcArtvcRecordfileResponse unmarshall(QueryMpaasMrtcArtvcRecordfileResponse queryMpaasMrtcArtvcRecordfileResponse, UnmarshallerContext _ctx) {
		
		queryMpaasMrtcArtvcRecordfileResponse.setRequestId(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.RequestId"));
		queryMpaasMrtcArtvcRecordfileResponse.setResultCode(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.ResultCode"));
		queryMpaasMrtcArtvcRecordfileResponse.setResultMessage(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.ResultMessage"));

		MrtcApiRecordFileQueryWrapResp mrtcApiRecordFileQueryWrapResp = new MrtcApiRecordFileQueryWrapResp();
		mrtcApiRecordFileQueryWrapResp.setCode(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Code"));
		mrtcApiRecordFileQueryWrapResp.setMsg(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Msg"));

		Data data = new Data();
		data.setBizRequestId(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.BizRequestId"));
		data.setFilePath(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.FilePath"));
		data.setFileType(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.FileType"));
		data.setRecordStartTime(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.RecordStartTime"));
		data.setStatus(_ctx.stringValue("QueryMpaasMrtcArtvcRecordfileResponse.MrtcApiRecordFileQueryWrapResp.Data.Status"));
		mrtcApiRecordFileQueryWrapResp.setData(data);
		queryMpaasMrtcArtvcRecordfileResponse.setMrtcApiRecordFileQueryWrapResp(mrtcApiRecordFileQueryWrapResp);
	 
	 	return queryMpaasMrtcArtvcRecordfileResponse;
	}
}