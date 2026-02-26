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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.QueryDeleteTaskCheckDataResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryDeleteTaskCheckDataResponse.TaskCheckDataDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeleteTaskCheckDataResponseUnmarshaller {

	public static QueryDeleteTaskCheckDataResponse unmarshall(QueryDeleteTaskCheckDataResponse queryDeleteTaskCheckDataResponse, UnmarshallerContext _ctx) {
		
		queryDeleteTaskCheckDataResponse.setRequestId(_ctx.stringValue("QueryDeleteTaskCheckDataResponse.RequestId"));
		queryDeleteTaskCheckDataResponse.setCode(_ctx.stringValue("QueryDeleteTaskCheckDataResponse.Code"));
		queryDeleteTaskCheckDataResponse.setMessage(_ctx.stringValue("QueryDeleteTaskCheckDataResponse.Message"));
		queryDeleteTaskCheckDataResponse.setSuccess(_ctx.booleanValue("QueryDeleteTaskCheckDataResponse.Success"));

		List<TaskCheckDataDto> taskCheckDataDtoList = new ArrayList<TaskCheckDataDto>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeleteTaskCheckDataResponse.TaskCheckDataDtoList.Length"); i++) {
			TaskCheckDataDto taskCheckDataDto = new TaskCheckDataDto();
			taskCheckDataDto.setCheckerName(_ctx.stringValue("QueryDeleteTaskCheckDataResponse.TaskCheckDataDtoList["+ i +"].CheckerName"));
			taskCheckDataDto.setCheckerDesc(_ctx.stringValue("QueryDeleteTaskCheckDataResponse.TaskCheckDataDtoList["+ i +"].CheckerDesc"));
			taskCheckDataDto.setCheckerUniKey(_ctx.stringValue("QueryDeleteTaskCheckDataResponse.TaskCheckDataDtoList["+ i +"].CheckerUniKey"));
			taskCheckDataDto.setDependencyLevel(_ctx.stringValue("QueryDeleteTaskCheckDataResponse.TaskCheckDataDtoList["+ i +"].DependencyLevel"));

			taskCheckDataDtoList.add(taskCheckDataDto);
		}
		queryDeleteTaskCheckDataResponse.setTaskCheckDataDtoList(taskCheckDataDtoList);
	 
	 	return queryDeleteTaskCheckDataResponse;
	}
}