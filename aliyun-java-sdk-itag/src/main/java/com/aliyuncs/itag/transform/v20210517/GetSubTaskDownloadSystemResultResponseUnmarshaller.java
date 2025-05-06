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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.GetSubTaskDownloadSystemResultResponse;
import com.aliyuncs.itag.model.v20210517.GetSubTaskDownloadSystemResultResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetSubTaskDownloadSystemResultResponse.Result.ITagSimpleMarkItemDTO;
import com.aliyuncs.itag.model.v20210517.GetSubTaskDownloadSystemResultResponse.Result.ITagSimpleMarkItemDTO.ITagSimpleUserMarkResultDTO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubTaskDownloadSystemResultResponseUnmarshaller {

	public static GetSubTaskDownloadSystemResultResponse unmarshall(GetSubTaskDownloadSystemResultResponse getSubTaskDownloadSystemResultResponse, UnmarshallerContext _ctx) {
		
		getSubTaskDownloadSystemResultResponse.setRequestId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.RequestId"));
		getSubTaskDownloadSystemResultResponse.setCode(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Code"));
		getSubTaskDownloadSystemResultResponse.setErrInfo(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.ErrInfo"));
		getSubTaskDownloadSystemResultResponse.setMsg(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Msg"));
		getSubTaskDownloadSystemResultResponse.setSucc(_ctx.booleanValue("GetSubTaskDownloadSystemResultResponse.Succ"));
		getSubTaskDownloadSystemResultResponse.setErrorCode(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.ErrorCode"));

		Result result = new Result();
		result.setTaskId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.TaskId"));
		result.setSubTaskId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.SubTaskId"));
		result.setWorkNode(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.WorkNode"));
		result.setUserMarkItemListMap(_ctx.mapValue("GetSubTaskDownloadSystemResultResponse.Result.UserMarkItemListMap"));
		result.setUserSubTaskMap(_ctx.mapValue("GetSubTaskDownloadSystemResultResponse.Result.UserSubTaskMap"));

		List<ITagSimpleMarkItemDTO> markItemList = new ArrayList<ITagSimpleMarkItemDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList.Length"); i++) {
			ITagSimpleMarkItemDTO iTagSimpleMarkItemDTO = new ITagSimpleMarkItemDTO();
			iTagSimpleMarkItemDTO.setMarkItemId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkItemId"));
			iTagSimpleMarkItemDTO.setDataId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].DataId"));
			iTagSimpleMarkItemDTO.setDatasetId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].DatasetId"));
			iTagSimpleMarkItemDTO.setState(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].State"));
			iTagSimpleMarkItemDTO.setMine(_ctx.integerValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].Mine"));
			iTagSimpleMarkItemDTO.setRejectFlag(_ctx.integerValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].RejectFlag"));
			iTagSimpleMarkItemDTO.setFixedFlag(_ctx.integerValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].FixedFlag"));
			iTagSimpleMarkItemDTO.setAbandonFlag(_ctx.integerValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].AbandonFlag"));
			iTagSimpleMarkItemDTO.setWeight(_ctx.integerValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].Weight"));
			iTagSimpleMarkItemDTO.setDataMeta(_ctx.mapValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].DataMeta"));

			List<ITagSimpleUserMarkResultDTO> markResultList = new ArrayList<ITagSimpleUserMarkResultDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkResultList.Length"); j++) {
				ITagSimpleUserMarkResultDTO iTagSimpleUserMarkResultDTO = new ITagSimpleUserMarkResultDTO();
				iTagSimpleUserMarkResultDTO.setMarkResultId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkResultList["+ j +"].MarkResultId"));
				iTagSimpleUserMarkResultDTO.setMarkTitle(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkResultList["+ j +"].MarkTitle"));
				iTagSimpleUserMarkResultDTO.setMarkResult(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkResultList["+ j +"].MarkResult"));
				iTagSimpleUserMarkResultDTO.setQuestionId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkResultList["+ j +"].QuestionId"));
				iTagSimpleUserMarkResultDTO.setResultType(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkResultList["+ j +"].ResultType"));
				iTagSimpleUserMarkResultDTO.setVersion(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkResultList["+ j +"].Version"));
				iTagSimpleUserMarkResultDTO.setUserMarkResultId(_ctx.stringValue("GetSubTaskDownloadSystemResultResponse.Result.MarkItemList["+ i +"].MarkResultList["+ j +"].UserMarkResultId"));

				markResultList.add(iTagSimpleUserMarkResultDTO);
			}
			iTagSimpleMarkItemDTO.setMarkResultList(markResultList);

			markItemList.add(iTagSimpleMarkItemDTO);
		}
		result.setMarkItemList(markItemList);
		getSubTaskDownloadSystemResultResponse.setResult(result);
	 
	 	return getSubTaskDownloadSystemResultResponse;
	}
}