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

import com.aliyuncs.cspro.model.v20180315.QuerySecCheckConfigsResponse;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckConfigsResponse.Data;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckConfigsResponse.Data.OmniSecCheckDTO;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckConfigsResponse.Data.OmniSecCheckDTO.OmniSecCheckDetailDTO;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckConfigsResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecCheckConfigsResponseUnmarshaller {

	public static QuerySecCheckConfigsResponse unmarshall(QuerySecCheckConfigsResponse querySecCheckConfigsResponse, UnmarshallerContext _ctx) {
		
		querySecCheckConfigsResponse.setRequestId(_ctx.stringValue("QuerySecCheckConfigsResponse.RequestId"));
		querySecCheckConfigsResponse.setSuccess(_ctx.booleanValue("QuerySecCheckConfigsResponse.Success"));
		querySecCheckConfigsResponse.setCode(_ctx.stringValue("QuerySecCheckConfigsResponse.Code"));
		querySecCheckConfigsResponse.setMessage(_ctx.stringValue("QuerySecCheckConfigsResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("QuerySecCheckConfigsResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("QuerySecCheckConfigsResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("QuerySecCheckConfigsResponse.Data.PageInfo.Total"));
		data.setPageInfo(pageInfo);

		List<OmniSecCheckDTO> list = new ArrayList<OmniSecCheckDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySecCheckConfigsResponse.Data.List.Length"); i++) {
			OmniSecCheckDTO omniSecCheckDTO = new OmniSecCheckDTO();
			omniSecCheckDTO.setName(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].Name"));
			omniSecCheckDTO.setConfType(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].ConfType"));
			omniSecCheckDTO.setCheckTarget(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].CheckTarget"));
			omniSecCheckDTO.setExtras(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].Extras"));
			omniSecCheckDTO.setValid(_ctx.booleanValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].Valid"));
			omniSecCheckDTO.setAccessible(_ctx.booleanValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].Accessible"));
			omniSecCheckDTO.setId(_ctx.longValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].Id"));
			omniSecCheckDTO.setSpec(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].Spec"));

			List<OmniSecCheckDetailDTO> checkDetailDTOList = new ArrayList<OmniSecCheckDetailDTO>();
			for (int j = 0; j < _ctx.lengthValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].CheckDetailDTOList.Length"); j++) {
				OmniSecCheckDetailDTO omniSecCheckDetailDTO = new OmniSecCheckDetailDTO();
				omniSecCheckDetailDTO.setCheckType(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].CheckDetailDTOList["+ j +"].CheckType"));
				omniSecCheckDetailDTO.setCheckIntervalUnit(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].CheckDetailDTOList["+ j +"].CheckIntervalUnit"));
				omniSecCheckDetailDTO.setCheckIntervalVal(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].CheckDetailDTOList["+ j +"].CheckIntervalVal"));
				omniSecCheckDetailDTO.setCheckExtras(_ctx.stringValue("QuerySecCheckConfigsResponse.Data.List["+ i +"].CheckDetailDTOList["+ j +"].CheckExtras"));

				checkDetailDTOList.add(omniSecCheckDetailDTO);
			}
			omniSecCheckDTO.setCheckDetailDTOList(checkDetailDTOList);

			list.add(omniSecCheckDTO);
		}
		data.setList(list);
		querySecCheckConfigsResponse.setData(data);
	 
	 	return querySecCheckConfigsResponse;
	}
}