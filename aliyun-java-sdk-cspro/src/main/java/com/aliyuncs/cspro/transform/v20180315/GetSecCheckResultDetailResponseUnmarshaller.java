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

import com.aliyuncs.cspro.model.v20180315.GetSecCheckResultDetailResponse;
import com.aliyuncs.cspro.model.v20180315.GetSecCheckResultDetailResponse.Data;
import com.aliyuncs.cspro.model.v20180315.GetSecCheckResultDetailResponse.Data.OmniSecCheckResultDetailDTO;
import com.aliyuncs.cspro.model.v20180315.GetSecCheckResultDetailResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecCheckResultDetailResponseUnmarshaller {

	public static GetSecCheckResultDetailResponse unmarshall(GetSecCheckResultDetailResponse getSecCheckResultDetailResponse, UnmarshallerContext _ctx) {
		
		getSecCheckResultDetailResponse.setRequestId(_ctx.stringValue("GetSecCheckResultDetailResponse.RequestId"));
		getSecCheckResultDetailResponse.setSuccess(_ctx.booleanValue("GetSecCheckResultDetailResponse.Success"));
		getSecCheckResultDetailResponse.setCode(_ctx.stringValue("GetSecCheckResultDetailResponse.Code"));
		getSecCheckResultDetailResponse.setMessage(_ctx.stringValue("GetSecCheckResultDetailResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("GetSecCheckResultDetailResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("GetSecCheckResultDetailResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetSecCheckResultDetailResponse.Data.PageInfo.Total"));
		data.setPageInfo(pageInfo);

		List<OmniSecCheckResultDetailDTO> list = new ArrayList<OmniSecCheckResultDetailDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetSecCheckResultDetailResponse.Data.List.Length"); i++) {
			OmniSecCheckResultDetailDTO omniSecCheckResultDetailDTO = new OmniSecCheckResultDetailDTO();
			omniSecCheckResultDetailDTO.setId(_ctx.longValue("GetSecCheckResultDetailResponse.Data.List["+ i +"].Id"));
			omniSecCheckResultDetailDTO.setResultId(_ctx.longValue("GetSecCheckResultDetailResponse.Data.List["+ i +"].ResultId"));
			omniSecCheckResultDetailDTO.setKeywords(_ctx.stringValue("GetSecCheckResultDetailResponse.Data.List["+ i +"].Keywords"));
			omniSecCheckResultDetailDTO.setContent(_ctx.stringValue("GetSecCheckResultDetailResponse.Data.List["+ i +"].Content"));
			omniSecCheckResultDetailDTO.setPicUrl(_ctx.stringValue("GetSecCheckResultDetailResponse.Data.List["+ i +"].PicUrl"));
			omniSecCheckResultDetailDTO.setSnapshotKey(_ctx.stringValue("GetSecCheckResultDetailResponse.Data.List["+ i +"].SnapshotKey"));
			omniSecCheckResultDetailDTO.setExtra(_ctx.stringValue("GetSecCheckResultDetailResponse.Data.List["+ i +"].Extra"));
			omniSecCheckResultDetailDTO.setRiskType(_ctx.stringValue("GetSecCheckResultDetailResponse.Data.List["+ i +"].RiskType"));

			list.add(omniSecCheckResultDetailDTO);
		}
		data.setList(list);
		getSecCheckResultDetailResponse.setData(data);
	 
	 	return getSecCheckResultDetailResponse;
	}
}