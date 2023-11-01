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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.GetLogsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.GetLogsResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.GetLogsResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.GetLogsResponse.Data.ResponseData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLogsResponseUnmarshaller {

	public static GetLogsResponse unmarshall(GetLogsResponse getLogsResponse, UnmarshallerContext _ctx) {
		
		getLogsResponse.setRequestId(_ctx.stringValue("GetLogsResponse.RequestId"));
		getLogsResponse.setSuccess(_ctx.booleanValue("GetLogsResponse.Success"));
		getLogsResponse.setCode(_ctx.integerValue("GetLogsResponse.Code"));
		getLogsResponse.setMessage(_ctx.stringValue("GetLogsResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("GetLogsResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("GetLogsResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("GetLogsResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		ResponseData responseData = new ResponseData();
		responseData.setCompleteOrNot(_ctx.booleanValue("GetLogsResponse.Data.ResponseData.CompleteOrNot"));
		responseData.setCount(_ctx.integerValue("GetLogsResponse.Data.ResponseData.Count"));
		responseData.setCost(_ctx.longValue("GetLogsResponse.Data.ResponseData.Cost"));
		responseData.setHasSql(_ctx.booleanValue("GetLogsResponse.Data.ResponseData.HasSql"));

		List<String> keys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLogsResponse.Data.ResponseData.Keys.Length"); i++) {
			keys.add(_ctx.stringValue("GetLogsResponse.Data.ResponseData.Keys["+ i +"]"));
		}
		responseData.setKeys(keys);

		List<String> lines = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLogsResponse.Data.ResponseData.Lines.Length"); i++) {
			lines.add(_ctx.stringValue("GetLogsResponse.Data.ResponseData.Lines["+ i +"]"));
		}
		responseData.setLines(lines);
		data.setResponseData(responseData);
		getLogsResponse.setData(data);
	 
	 	return getLogsResponse;
	}
}