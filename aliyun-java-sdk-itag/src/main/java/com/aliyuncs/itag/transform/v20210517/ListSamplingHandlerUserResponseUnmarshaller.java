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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.ListSamplingHandlerUserResponse;
import com.aliyuncs.itag.model.v20210517.ListSamplingHandlerUserResponse.Result;
import com.aliyuncs.itag.model.v20210517.ListSamplingHandlerUserResponse.Result.ITagSamplingStatsDTO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSamplingHandlerUserResponseUnmarshaller {

	public static ListSamplingHandlerUserResponse unmarshall(ListSamplingHandlerUserResponse listSamplingHandlerUserResponse, UnmarshallerContext _ctx) {
		
		listSamplingHandlerUserResponse.setRequestId(_ctx.stringValue("ListSamplingHandlerUserResponse.RequestId"));
		listSamplingHandlerUserResponse.setCode(_ctx.stringValue("ListSamplingHandlerUserResponse.Code"));
		listSamplingHandlerUserResponse.setErrInfo(_ctx.stringValue("ListSamplingHandlerUserResponse.ErrInfo"));
		listSamplingHandlerUserResponse.setMsg(_ctx.stringValue("ListSamplingHandlerUserResponse.Msg"));
		listSamplingHandlerUserResponse.setSucc(_ctx.booleanValue("ListSamplingHandlerUserResponse.Succ"));
		listSamplingHandlerUserResponse.setErrorCode(_ctx.stringValue("ListSamplingHandlerUserResponse.ErrorCode"));

		Result result = new Result();

		ITagSamplingStatsDTO iTagSamplingStatsDTO = new ITagSamplingStatsDTO();
		iTagSamplingStatsDTO.setHasNonCompleteTask(_ctx.integerValue("ListSamplingHandlerUserResponse.Result.ITagSamplingStatsDTO.HasNonCompleteTask"));
		iTagSamplingStatsDTO.setSubUserTaskId(_ctx.stringValue("ListSamplingHandlerUserResponse.Result.ITagSamplingStatsDTO.SubUserTaskId"));
		iTagSamplingStatsDTO.setWorkUserMap(_ctx.mapValue("ListSamplingHandlerUserResponse.Result.ITagSamplingStatsDTO.WorkUserMap"));
		iTagSamplingStatsDTO.setMarkResultKVMap(_ctx.mapValue("ListSamplingHandlerUserResponse.Result.ITagSamplingStatsDTO.MarkResultKVMap"));
		iTagSamplingStatsDTO.setTotalSubTaskCount(_ctx.stringValue("ListSamplingHandlerUserResponse.Result.ITagSamplingStatsDTO.TotalSubTaskCount"));
		iTagSamplingStatsDTO.setTotalMarkItemCount(_ctx.stringValue("ListSamplingHandlerUserResponse.Result.ITagSamplingStatsDTO.TotalMarkItemCount"));
		iTagSamplingStatsDTO.setSubTaskAndMarkItemMap(_ctx.mapValue("ListSamplingHandlerUserResponse.Result.ITagSamplingStatsDTO.SubTaskAndMarkItemMap"));
		result.setITagSamplingStatsDTO(iTagSamplingStatsDTO);
		listSamplingHandlerUserResponse.setResult(result);
	 
	 	return listSamplingHandlerUserResponse;
	}
}