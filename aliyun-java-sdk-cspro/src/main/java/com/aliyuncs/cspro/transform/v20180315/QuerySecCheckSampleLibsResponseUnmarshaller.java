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

import com.aliyuncs.cspro.model.v20180315.QuerySecCheckSampleLibsResponse;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckSampleLibsResponse.Data;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckSampleLibsResponse.Data.OmniSecCheckSampleLibDTO;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckSampleLibsResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecCheckSampleLibsResponseUnmarshaller {

	public static QuerySecCheckSampleLibsResponse unmarshall(QuerySecCheckSampleLibsResponse querySecCheckSampleLibsResponse, UnmarshallerContext _ctx) {
		
		querySecCheckSampleLibsResponse.setRequestId(_ctx.stringValue("QuerySecCheckSampleLibsResponse.RequestId"));
		querySecCheckSampleLibsResponse.setSuccess(_ctx.booleanValue("QuerySecCheckSampleLibsResponse.Success"));
		querySecCheckSampleLibsResponse.setCode(_ctx.stringValue("QuerySecCheckSampleLibsResponse.Code"));
		querySecCheckSampleLibsResponse.setMessage(_ctx.stringValue("QuerySecCheckSampleLibsResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("QuerySecCheckSampleLibsResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("QuerySecCheckSampleLibsResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("QuerySecCheckSampleLibsResponse.Data.PageInfo.Total"));
		data.setPageInfo(pageInfo);

		List<OmniSecCheckSampleLibDTO> list = new ArrayList<OmniSecCheckSampleLibDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySecCheckSampleLibsResponse.Data.List.Length"); i++) {
			OmniSecCheckSampleLibDTO omniSecCheckSampleLibDTO = new OmniSecCheckSampleLibDTO();
			omniSecCheckSampleLibDTO.setId(_ctx.longValue("QuerySecCheckSampleLibsResponse.Data.List["+ i +"].Id"));
			omniSecCheckSampleLibDTO.setType(_ctx.stringValue("QuerySecCheckSampleLibsResponse.Data.List["+ i +"].Type"));
			omniSecCheckSampleLibDTO.setName(_ctx.stringValue("QuerySecCheckSampleLibsResponse.Data.List["+ i +"].Name"));
			omniSecCheckSampleLibDTO.setExtras(_ctx.stringValue("QuerySecCheckSampleLibsResponse.Data.List["+ i +"].Extras"));

			list.add(omniSecCheckSampleLibDTO);
		}
		data.setList(list);
		querySecCheckSampleLibsResponse.setData(data);
	 
	 	return querySecCheckSampleLibsResponse;
	}
}