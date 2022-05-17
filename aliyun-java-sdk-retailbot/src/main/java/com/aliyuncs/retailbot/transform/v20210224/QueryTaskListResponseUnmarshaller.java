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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.QueryTaskListResponse;
import com.aliyuncs.retailbot.model.v20210224.QueryTaskListResponse.PageData;
import com.aliyuncs.retailbot.model.v20210224.QueryTaskListResponse.PageData.DigTaskConfigDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskListResponseUnmarshaller {

	public static QueryTaskListResponse unmarshall(QueryTaskListResponse queryTaskListResponse, UnmarshallerContext _ctx) {
		
		queryTaskListResponse.setRequestId(_ctx.stringValue("QueryTaskListResponse.RequestId"));
		queryTaskListResponse.setSuccess(_ctx.booleanValue("QueryTaskListResponse.Success"));
		queryTaskListResponse.setCode(_ctx.stringValue("QueryTaskListResponse.Code"));
		queryTaskListResponse.setMessage(_ctx.stringValue("QueryTaskListResponse.Message"));

		PageData pageData = new PageData();
		pageData.setMaxResults(_ctx.longValue("QueryTaskListResponse.PageData.MaxResults"));
		pageData.setNextToken(_ctx.stringValue("QueryTaskListResponse.PageData.NextToken"));

		List<DigTaskConfigDTO> data = new ArrayList<DigTaskConfigDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskListResponse.PageData.Data.Length"); i++) {
			DigTaskConfigDTO digTaskConfigDTO = new DigTaskConfigDTO();
			digTaskConfigDTO.setRobotCode(_ctx.stringValue("QueryTaskListResponse.PageData.Data["+ i +"].RobotCode"));
			digTaskConfigDTO.setTaskId(_ctx.longValue("QueryTaskListResponse.PageData.Data["+ i +"].TaskId"));
			digTaskConfigDTO.setOperateDate(_ctx.stringValue("QueryTaskListResponse.PageData.Data["+ i +"].OperateDate"));
			digTaskConfigDTO.setType(_ctx.stringValue("QueryTaskListResponse.PageData.Data["+ i +"].Type"));
			digTaskConfigDTO.setStatus(_ctx.longValue("QueryTaskListResponse.PageData.Data["+ i +"].Status"));
			digTaskConfigDTO.setParamConfig(_ctx.stringValue("QueryTaskListResponse.PageData.Data["+ i +"].ParamConfig"));

			data.add(digTaskConfigDTO);
		}
		pageData.setData(data);
		queryTaskListResponse.setPageData(pageData);
	 
	 	return queryTaskListResponse;
	}
}