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

import com.aliyuncs.cspro.model.v20180315.QuerySecCheckSamplesResponse;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckSamplesResponse.Data;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckSamplesResponse.Data.OmniSecCheckSampleDTO;
import com.aliyuncs.cspro.model.v20180315.QuerySecCheckSamplesResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecCheckSamplesResponseUnmarshaller {

	public static QuerySecCheckSamplesResponse unmarshall(QuerySecCheckSamplesResponse querySecCheckSamplesResponse, UnmarshallerContext _ctx) {
		
		querySecCheckSamplesResponse.setRequestId(_ctx.stringValue("QuerySecCheckSamplesResponse.RequestId"));
		querySecCheckSamplesResponse.setSuccess(_ctx.booleanValue("QuerySecCheckSamplesResponse.Success"));
		querySecCheckSamplesResponse.setCode(_ctx.stringValue("QuerySecCheckSamplesResponse.Code"));
		querySecCheckSamplesResponse.setMessage(_ctx.stringValue("QuerySecCheckSamplesResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("QuerySecCheckSamplesResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("QuerySecCheckSamplesResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("QuerySecCheckSamplesResponse.Data.PageInfo.Total"));
		data.setPageInfo(pageInfo);

		List<OmniSecCheckSampleDTO> list = new ArrayList<OmniSecCheckSampleDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySecCheckSamplesResponse.Data.List.Length"); i++) {
			OmniSecCheckSampleDTO omniSecCheckSampleDTO = new OmniSecCheckSampleDTO();
			omniSecCheckSampleDTO.setId(_ctx.longValue("QuerySecCheckSamplesResponse.Data.List["+ i +"].Id"));
			omniSecCheckSampleDTO.setSample(_ctx.stringValue("QuerySecCheckSamplesResponse.Data.List["+ i +"].Sample"));
			omniSecCheckSampleDTO.setCreateTime(_ctx.longValue("QuerySecCheckSamplesResponse.Data.List["+ i +"].CreateTime"));
			omniSecCheckSampleDTO.setExtras(_ctx.stringValue("QuerySecCheckSamplesResponse.Data.List["+ i +"].Extras"));

			list.add(omniSecCheckSampleDTO);
		}
		data.setList(list);
		querySecCheckSamplesResponse.setData(data);
	 
	 	return querySecCheckSamplesResponse;
	}
}