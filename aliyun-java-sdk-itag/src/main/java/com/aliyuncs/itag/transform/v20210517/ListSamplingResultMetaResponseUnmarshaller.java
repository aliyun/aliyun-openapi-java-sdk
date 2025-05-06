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

import com.aliyuncs.itag.model.v20210517.ListSamplingResultMetaResponse;
import com.aliyuncs.itag.model.v20210517.ListSamplingResultMetaResponse.Result;
import com.aliyuncs.itag.model.v20210517.ListSamplingResultMetaResponse.Result.ITagSamplingStatsDTO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSamplingResultMetaResponseUnmarshaller {

	public static ListSamplingResultMetaResponse unmarshall(ListSamplingResultMetaResponse listSamplingResultMetaResponse, UnmarshallerContext _ctx) {
		
		listSamplingResultMetaResponse.setRequestId(_ctx.stringValue("ListSamplingResultMetaResponse.RequestId"));
		listSamplingResultMetaResponse.setCode(_ctx.stringValue("ListSamplingResultMetaResponse.Code"));
		listSamplingResultMetaResponse.setErrInfo(_ctx.stringValue("ListSamplingResultMetaResponse.ErrInfo"));
		listSamplingResultMetaResponse.setMsg(_ctx.stringValue("ListSamplingResultMetaResponse.Msg"));
		listSamplingResultMetaResponse.setSucc(_ctx.booleanValue("ListSamplingResultMetaResponse.Succ"));
		listSamplingResultMetaResponse.setErrorCode(_ctx.stringValue("ListSamplingResultMetaResponse.ErrorCode"));

		Result result = new Result();

		ITagSamplingStatsDTO iTagSamplingStatsDTO = new ITagSamplingStatsDTO();
		iTagSamplingStatsDTO.setHasNonCompleteTask(_ctx.integerValue("ListSamplingResultMetaResponse.Result.ITagSamplingStatsDTO.HasNonCompleteTask"));
		iTagSamplingStatsDTO.setSubUserTaskId(_ctx.stringValue("ListSamplingResultMetaResponse.Result.ITagSamplingStatsDTO.SubUserTaskId"));
		iTagSamplingStatsDTO.setWorkUserMap(_ctx.mapValue("ListSamplingResultMetaResponse.Result.ITagSamplingStatsDTO.WorkUserMap"));
		iTagSamplingStatsDTO.setMarkResultKVMap(_ctx.mapValue("ListSamplingResultMetaResponse.Result.ITagSamplingStatsDTO.MarkResultKVMap"));
		iTagSamplingStatsDTO.setTotalSubTaskCount(_ctx.stringValue("ListSamplingResultMetaResponse.Result.ITagSamplingStatsDTO.TotalSubTaskCount"));
		iTagSamplingStatsDTO.setTotalMarkItemCount(_ctx.stringValue("ListSamplingResultMetaResponse.Result.ITagSamplingStatsDTO.TotalMarkItemCount"));
		iTagSamplingStatsDTO.setSubTaskAndMarkItemMap(_ctx.mapValue("ListSamplingResultMetaResponse.Result.ITagSamplingStatsDTO.SubTaskAndMarkItemMap"));
		result.setITagSamplingStatsDTO(iTagSamplingStatsDTO);
		listSamplingResultMetaResponse.setResult(result);
	 
	 	return listSamplingResultMetaResponse;
	}
}