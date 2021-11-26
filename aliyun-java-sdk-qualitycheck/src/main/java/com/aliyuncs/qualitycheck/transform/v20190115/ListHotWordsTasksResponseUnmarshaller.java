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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListHotWordsTasksResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListHotWordsTasksResponse.HotWordsTaskPo;
import com.aliyuncs.qualitycheck.model.v20190115.ListHotWordsTasksResponse.HotWordsTaskPo.DialogueParam;
import com.aliyuncs.qualitycheck.model.v20190115.ListHotWordsTasksResponse.HotWordsTaskPo.WordsParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHotWordsTasksResponseUnmarshaller {

	public static ListHotWordsTasksResponse unmarshall(ListHotWordsTasksResponse listHotWordsTasksResponse, UnmarshallerContext _ctx) {
		
		listHotWordsTasksResponse.setRequestId(_ctx.stringValue("ListHotWordsTasksResponse.RequestId"));
		listHotWordsTasksResponse.setSuccess(_ctx.booleanValue("ListHotWordsTasksResponse.Success"));
		listHotWordsTasksResponse.setCode(_ctx.stringValue("ListHotWordsTasksResponse.Code"));
		listHotWordsTasksResponse.setMessage(_ctx.stringValue("ListHotWordsTasksResponse.Message"));
		listHotWordsTasksResponse.setPageNumber(_ctx.integerValue("ListHotWordsTasksResponse.PageNumber"));
		listHotWordsTasksResponse.setPageSize(_ctx.integerValue("ListHotWordsTasksResponse.PageSize"));
		listHotWordsTasksResponse.setCount(_ctx.integerValue("ListHotWordsTasksResponse.Count"));

		List<HotWordsTaskPo> data = new ArrayList<HotWordsTaskPo>();
		for (int i = 0; i < _ctx.lengthValue("ListHotWordsTasksResponse.Data.Length"); i++) {
			HotWordsTaskPo hotWordsTaskPo = new HotWordsTaskPo();
			hotWordsTaskPo.setEndTime(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].EndTime"));
			hotWordsTaskPo.setType(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].Type"));
			hotWordsTaskPo.setStatus(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].Status"));
			hotWordsTaskPo.setTimeInterval(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].TimeInterval"));
			hotWordsTaskPo.setStartTime(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].StartTime"));
			hotWordsTaskPo.setTaskConfigId(_ctx.longValue("ListHotWordsTasksResponse.Data["+ i +"].TaskConfigId"));
			hotWordsTaskPo.setMessage(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].Message"));
			hotWordsTaskPo.setInstanceStatus(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].InstanceStatus"));
			hotWordsTaskPo.setLastExecutionTime(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].LastExecutionTime"));
			hotWordsTaskPo.setName(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].Name"));
			hotWordsTaskPo.setTimeUnit(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].TimeUnit"));

			DialogueParam dialogueParam = new DialogueParam();
			dialogueParam.setEndTime(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].DialogueParam.EndTime"));
			dialogueParam.setDialogueId(_ctx.longValue("ListHotWordsTasksResponse.Data["+ i +"].DialogueParam.DialogueId"));
			dialogueParam.setEndIndex(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].DialogueParam.EndIndex"));
			dialogueParam.setStartTime(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].DialogueParam.StartTime"));
			dialogueParam.setSourceType(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].DialogueParam.SourceType"));
			dialogueParam.setStartIndex(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].DialogueParam.StartIndex"));
			dialogueParam.setRole(_ctx.integerValue("ListHotWordsTasksResponse.Data["+ i +"].DialogueParam.Role"));
			dialogueParam.setDataSetIds(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].DialogueParam.DataSetIds"));
			hotWordsTaskPo.setDialogueParam(dialogueParam);

			WordsParam wordsParam = new WordsParam();
			wordsParam.setExcludes(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].WordsParam.Excludes"));
			wordsParam.setIncludes(_ctx.stringValue("ListHotWordsTasksResponse.Data["+ i +"].WordsParam.Includes"));
			wordsParam.setExtraConfigId(_ctx.longValue("ListHotWordsTasksResponse.Data["+ i +"].WordsParam.ExtraConfigId"));
			hotWordsTaskPo.setWordsParam(wordsParam);

			data.add(hotWordsTaskPo);
		}
		listHotWordsTasksResponse.setData(data);
	 
	 	return listHotWordsTasksResponse;
	}
}