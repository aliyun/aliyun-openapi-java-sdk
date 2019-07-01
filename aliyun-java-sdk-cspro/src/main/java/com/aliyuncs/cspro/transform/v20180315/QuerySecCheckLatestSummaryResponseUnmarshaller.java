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

import com.aliyuncs.cspro.model.v20180315.QuerySecCheckLatestSummaryResponse;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckLatestSummaryResponse.Data;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckLatestSummaryResponse.Data.OmniSecCheckLatestSummaryDTO;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckLatestSummaryResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecCheckLatestSummaryResponseUnmarshaller {

	public static QuerySecCheckLatestSummaryResponse unmarshall(QuerySecCheckLatestSummaryResponse querySecCheckLatestSummaryResponse, UnmarshallerContext _ctx) {
		
		querySecCheckLatestSummaryResponse.setRequestId(_ctx.stringValue("QuerySecCheckLatestSummaryResponse.RequestId"));
		querySecCheckLatestSummaryResponse.setSuccess(_ctx.booleanValue("QuerySecCheckLatestSummaryResponse.Success"));
		querySecCheckLatestSummaryResponse.setCode(_ctx.stringValue("QuerySecCheckLatestSummaryResponse.Code"));
		querySecCheckLatestSummaryResponse.setMessage(_ctx.stringValue("QuerySecCheckLatestSummaryResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("QuerySecCheckLatestSummaryResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("QuerySecCheckLatestSummaryResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("QuerySecCheckLatestSummaryResponse.Data.PageInfo.Total"));
		data.setPageInfo(pageInfo);

		List<OmniSecCheckLatestSummaryDTO> list = new ArrayList<OmniSecCheckLatestSummaryDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySecCheckLatestSummaryResponse.Data.List.Length"); i++) {
			OmniSecCheckLatestSummaryDTO omniSecCheckLatestSummaryDTO = new OmniSecCheckLatestSummaryDTO();
			omniSecCheckLatestSummaryDTO.setId(_ctx.longValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].Id"));
			omniSecCheckLatestSummaryDTO.setConfType(_ctx.stringValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].ConfType"));
			omniSecCheckLatestSummaryDTO.setCheckType(_ctx.stringValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].CheckType"));
			omniSecCheckLatestSummaryDTO.setCheckTarget(_ctx.stringValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].CheckTarget"));
			omniSecCheckLatestSummaryDTO.setUrlCnt(_ctx.longValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].UrlCnt"));
			omniSecCheckLatestSummaryDTO.setRiskCnt(_ctx.longValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].RiskCnt"));
			omniSecCheckLatestSummaryDTO.setCheckTime(_ctx.stringValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].CheckTime"));
			omniSecCheckLatestSummaryDTO.setGmtCheckStart(_ctx.longValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].GmtCheckStart"));
			omniSecCheckLatestSummaryDTO.setGmtCheckEnd(_ctx.longValue("QuerySecCheckLatestSummaryResponse.Data.List["+ i +"].GmtCheckEnd"));

			list.add(omniSecCheckLatestSummaryDTO);
		}
		data.setList(list);
		querySecCheckLatestSummaryResponse.setData(data);
	 
	 	return querySecCheckLatestSummaryResponse;
	}
}