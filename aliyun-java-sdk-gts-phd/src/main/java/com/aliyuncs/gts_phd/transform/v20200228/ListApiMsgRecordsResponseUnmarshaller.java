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

package com.aliyuncs.gts_phd.transform.v20200228;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gts_phd.model.v20200228.ListApiMsgRecordsResponse;
import com.aliyuncs.gts_phd.model.v20200228.ListApiMsgRecordsResponse.ApiMsgSearchVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApiMsgRecordsResponseUnmarshaller {

	public static ListApiMsgRecordsResponse unmarshall(ListApiMsgRecordsResponse listApiMsgRecordsResponse, UnmarshallerContext _ctx) {
		
		listApiMsgRecordsResponse.setRequestId(_ctx.stringValue("ListApiMsgRecordsResponse.RequestId"));
		listApiMsgRecordsResponse.setPageIndex(_ctx.integerValue("ListApiMsgRecordsResponse.PageIndex"));
		listApiMsgRecordsResponse.setSuccess(_ctx.booleanValue("ListApiMsgRecordsResponse.Success"));
		listApiMsgRecordsResponse.setCnt(_ctx.longValue("ListApiMsgRecordsResponse.Cnt"));
		listApiMsgRecordsResponse.setErrorMessage(_ctx.stringValue("ListApiMsgRecordsResponse.ErrorMessage"));
		listApiMsgRecordsResponse.setPageSize(_ctx.integerValue("ListApiMsgRecordsResponse.PageSize"));
		listApiMsgRecordsResponse.setErrorCode(_ctx.stringValue("ListApiMsgRecordsResponse.ErrorCode"));

		List<ApiMsgSearchVO> data = new ArrayList<ApiMsgSearchVO>();
		for (int i = 0; i < _ctx.lengthValue("ListApiMsgRecordsResponse.Data.Length"); i++) {
			ApiMsgSearchVO apiMsgSearchVO = new ApiMsgSearchVO();
			apiMsgSearchVO.setMsg(_ctx.stringValue("ListApiMsgRecordsResponse.Data["+ i +"].Msg"));
			apiMsgSearchVO.setUid(_ctx.stringValue("ListApiMsgRecordsResponse.Data["+ i +"].Uid"));
			apiMsgSearchVO.setWriteTime(_ctx.longValue("ListApiMsgRecordsResponse.Data["+ i +"].WriteTime"));
			apiMsgSearchVO.setMsgId(_ctx.stringValue("ListApiMsgRecordsResponse.Data["+ i +"].MsgId"));
			apiMsgSearchVO.setState(_ctx.stringValue("ListApiMsgRecordsResponse.Data["+ i +"].State"));
			apiMsgSearchVO.setType(_ctx.integerValue("ListApiMsgRecordsResponse.Data["+ i +"].Type"));

			data.add(apiMsgSearchVO);
		}
		listApiMsgRecordsResponse.setData(data);
	 
	 	return listApiMsgRecordsResponse;
	}
}