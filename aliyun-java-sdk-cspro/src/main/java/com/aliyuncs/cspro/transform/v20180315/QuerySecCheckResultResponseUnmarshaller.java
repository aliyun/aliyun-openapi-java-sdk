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

package com.aliyuncs.cspro.transform.v20180315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cspro.model.v20180315.QuerySecCheckResultResponse;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckResultResponse.Data;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckResultResponse.Data.OmniSecCheckResultDTO;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckResultResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecCheckResultResponseUnmarshaller {

	public static QuerySecCheckResultResponse unmarshall(QuerySecCheckResultResponse querySecCheckResultResponse, UnmarshallerContext _ctx) {
		
		querySecCheckResultResponse.setRequestId(_ctx.stringValue("QuerySecCheckResultResponse.RequestId"));
		querySecCheckResultResponse.setSuccess(_ctx.booleanValue("QuerySecCheckResultResponse.Success"));
		querySecCheckResultResponse.setCode(_ctx.stringValue("QuerySecCheckResultResponse.Code"));
		querySecCheckResultResponse.setMessage(_ctx.stringValue("QuerySecCheckResultResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("QuerySecCheckResultResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("QuerySecCheckResultResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("QuerySecCheckResultResponse.Data.PageInfo.Total"));
		data.setPageInfo(pageInfo);

		List<OmniSecCheckResultDTO> list = new ArrayList<OmniSecCheckResultDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySecCheckResultResponse.Data.List.Length"); i++) {
			OmniSecCheckResultDTO omniSecCheckResultDTO = new OmniSecCheckResultDTO();
			omniSecCheckResultDTO.setId(_ctx.longValue("QuerySecCheckResultResponse.Data.List["+ i +"].Id"));
			omniSecCheckResultDTO.setCheckType(_ctx.stringValue("QuerySecCheckResultResponse.Data.List["+ i +"].CheckType"));
			omniSecCheckResultDTO.setCheckTarget(_ctx.stringValue("QuerySecCheckResultResponse.Data.List["+ i +"].CheckTarget"));
			omniSecCheckResultDTO.setCheckTime(_ctx.stringValue("QuerySecCheckResultResponse.Data.List["+ i +"].CheckTime"));
			omniSecCheckResultDTO.setUrl(_ctx.stringValue("QuerySecCheckResultResponse.Data.List["+ i +"].Url"));
			omniSecCheckResultDTO.setRiskTypes(_ctx.stringValue("QuerySecCheckResultResponse.Data.List["+ i +"].RiskTypes"));
			omniSecCheckResultDTO.setRiskSources(_ctx.stringValue("QuerySecCheckResultResponse.Data.List["+ i +"].RiskSources"));
			omniSecCheckResultDTO.setResult(_ctx.stringValue("QuerySecCheckResultResponse.Data.List["+ i +"].Result"));

			list.add(omniSecCheckResultDTO);
		}
		data.setList(list);
		querySecCheckResultResponse.setData(data);
	 
	 	return querySecCheckResultResponse;
	}
}