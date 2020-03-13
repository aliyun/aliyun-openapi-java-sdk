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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWorkitemsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWorkitemsResponse.Result;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWorkitemsResponse.Result.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutWorkitemsResponseUnmarshaller {

	public static QueryLinkeBahamutWorkitemsResponse unmarshall(QueryLinkeBahamutWorkitemsResponse queryLinkeBahamutWorkitemsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutWorkitemsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.RequestId"));
		queryLinkeBahamutWorkitemsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.ResultCode"));
		queryLinkeBahamutWorkitemsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.ResultMessage"));
		queryLinkeBahamutWorkitemsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.ErrorMessage"));
		queryLinkeBahamutWorkitemsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Message"));
		queryLinkeBahamutWorkitemsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutWorkitemsResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutWorkitemsResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutWorkitemsResponse.Result.Page"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutWorkitemsResponse.Result.PageSize"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setAcHour(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].AcHour"));
			datasItem.setAssignedTo(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].AssignedTo"));
			datasItem.setAssignedToStaffId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].AssignedToStaffId"));
			datasItem.setCanSelect(_ctx.booleanValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].CanSelect"));
			datasItem.setCreator(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Creator"));
			datasItem.setCreatorId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].CreatorId"));
			datasItem.setCreatorStaffId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].CreatorStaffId"));
			datasItem.setEsHour(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].EsHour"));
			datasItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].ExternalId"));
			datasItem.setId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Id"));
			datasItem.setLink(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Link"));
			datasItem.setNoSelectInfo(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].NoSelectInfo"));
			datasItem.setNoSelectTag(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].NoSelectTag"));
			datasItem.setPriority(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Priority"));
			datasItem.setPriorityId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].PriorityId"));
			datasItem.setProgress(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Progress"));
			datasItem.setProjectId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].ProjectId"));
			datasItem.setStamp(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Stamp"));
			datasItem.setStatus(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Status"));
			datasItem.setStatusId(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].StatusId"));
			datasItem.setStatusStage(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].StatusStage"));
			datasItem.setSubject(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Subject"));
			datasItem.setUrl(_ctx.stringValue("QueryLinkeBahamutWorkitemsResponse.Result.Datas["+ i +"].Url"));

			datas.add(datasItem);
		}
		result.setDatas(datas);
		queryLinkeBahamutWorkitemsResponse.setResult(result);
	 
	 	return queryLinkeBahamutWorkitemsResponse;
	}
}