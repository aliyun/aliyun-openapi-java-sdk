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

import com.aliyuncs.qualitycheck.model.v20190115.ListSchemeTaskConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListSchemeTaskConfigResponse.DataItem;
import com.aliyuncs.qualitycheck.model.v20190115.ListSchemeTaskConfigResponse.DataItem.DataConfig;
import com.aliyuncs.qualitycheck.model.v20190115.ListSchemeTaskConfigResponse.DataItem.DataConfig.AssignConfig;
import com.aliyuncs.qualitycheck.model.v20190115.ListSchemeTaskConfigResponse.DataItem.DataConfig.AssignConfig.AssignConfigContest;
import com.aliyuncs.qualitycheck.model.v20190115.ListSchemeTaskConfigResponse.DataItem.SchemeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSchemeTaskConfigResponseUnmarshaller {

	public static ListSchemeTaskConfigResponse unmarshall(ListSchemeTaskConfigResponse listSchemeTaskConfigResponse, UnmarshallerContext _ctx) {
		
		listSchemeTaskConfigResponse.setRequestId(_ctx.stringValue("ListSchemeTaskConfigResponse.RequestId"));
		listSchemeTaskConfigResponse.setCount(_ctx.integerValue("ListSchemeTaskConfigResponse.Count"));
		listSchemeTaskConfigResponse.setCurrentPage(_ctx.integerValue("ListSchemeTaskConfigResponse.CurrentPage"));
		listSchemeTaskConfigResponse.setPageSize(_ctx.integerValue("ListSchemeTaskConfigResponse.PageSize"));
		listSchemeTaskConfigResponse.setPageNumber(_ctx.integerValue("ListSchemeTaskConfigResponse.PageNumber"));
		listSchemeTaskConfigResponse.setResultCountId(_ctx.stringValue("ListSchemeTaskConfigResponse.ResultCountId"));
		listSchemeTaskConfigResponse.setLastDataId(_ctx.stringValue("ListSchemeTaskConfigResponse.LastDataId"));
		listSchemeTaskConfigResponse.setSuccess(_ctx.booleanValue("ListSchemeTaskConfigResponse.Success"));
		listSchemeTaskConfigResponse.setCode(_ctx.stringValue("ListSchemeTaskConfigResponse.Code"));
		listSchemeTaskConfigResponse.setMessage(_ctx.stringValue("ListSchemeTaskConfigResponse.Message"));
		listSchemeTaskConfigResponse.setHttpStatusCode(_ctx.integerValue("ListSchemeTaskConfigResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListSchemeTaskConfigResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("ListSchemeTaskConfigResponse.Messages["+ i +"]"));
		}
		listSchemeTaskConfigResponse.setMessages(messages);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSchemeTaskConfigResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListSchemeTaskConfigResponse.Data["+ i +"].Id"));
			dataItem.setSchemeTaskConfigId(_ctx.longValue("ListSchemeTaskConfigResponse.Data["+ i +"].SchemeTaskConfigId"));
			dataItem.setName(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].Name"));
			dataItem.setSourceDataType(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].SourceDataType"));
			dataItem.setStatus(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].Status"));
			dataItem.setManualReview(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].ManualReview"));
			dataItem.setAssignType(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].AssignType"));
			dataItem.setAsrTaskPriority(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].AsrTaskPriority"));
			dataItem.setModeCustomizationId(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].ModeCustomizationId"));
			dataItem.setModelName(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].ModelName"));
			dataItem.setVocabId(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].VocabId"));
			dataItem.setVocabName(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].VocabName"));
			dataItem.setUserGroup(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].UserGroup"));
			dataItem.setCreateUser(_ctx.longValue("ListSchemeTaskConfigResponse.Data["+ i +"].CreateUser"));
			dataItem.setCreateTime(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].CreateTime"));
			dataItem.setUpdateTime(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].UpdateTime"));
			dataItem.setUpdateUser(_ctx.longValue("ListSchemeTaskConfigResponse.Data["+ i +"].UpdateUser"));
			dataItem.setType(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].Type"));
			dataItem.setNumberSum(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].NumberSum"));
			dataItem.setNumberSuccess(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].NumberSuccess"));
			dataItem.setNumberFail(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].NumberFail"));
			dataItem.setFinishRate(_ctx.doubleValue("ListSchemeTaskConfigResponse.Data["+ i +"].FinishRate"));
			dataItem.setNumberExecuting(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].NumberExecuting"));

			List<Long> schemeIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListSchemeTaskConfigResponse.Data["+ i +"].SchemeIdList.Length"); j++) {
				schemeIdList.add(_ctx.longValue("ListSchemeTaskConfigResponse.Data["+ i +"].SchemeIdList["+ j +"]"));
			}
			dataItem.setSchemeIdList(schemeIdList);

			DataConfig dataConfig = new DataConfig();
			dataConfig.setIndex(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.Index"));
			dataConfig.setResultParam(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.ResultParam"));
			dataConfig.setDataSets(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.DataSets"));

			List<AssignConfig> assignConfigs = new ArrayList<AssignConfig>();
			for (int j = 0; j < _ctx.lengthValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.AssignConfigs.Length"); j++) {
				AssignConfig assignConfig = new AssignConfig();

				List<AssignConfigContest> assignConfigContests = new ArrayList<AssignConfigContest>();
				for (int k = 0; k < _ctx.lengthValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.AssignConfigs["+ j +"].AssignConfigContests.Length"); k++) {
					AssignConfigContest assignConfigContest = new AssignConfigContest();
					assignConfigContest.setName(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.AssignConfigs["+ j +"].AssignConfigContests["+ k +"].Name"));
					assignConfigContest.setDataType(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.AssignConfigs["+ j +"].AssignConfigContests["+ k +"].DataType"));
					assignConfigContest.setSymbol(_ctx.integerValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.AssignConfigs["+ j +"].AssignConfigContests["+ k +"].Symbol"));
					assignConfigContest.setValue(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.AssignConfigs["+ j +"].AssignConfigContests["+ k +"].Value"));

					List<String> listObject = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.AssignConfigs["+ j +"].AssignConfigContests["+ k +"].ListObject.Length"); l++) {
						listObject.add(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].DataConfig.AssignConfigs["+ j +"].AssignConfigContests["+ k +"].ListObject["+ l +"]"));
					}
					assignConfigContest.setListObject(listObject);

					assignConfigContests.add(assignConfigContest);
				}
				assignConfig.setAssignConfigContests(assignConfigContests);

				assignConfigs.add(assignConfig);
			}
			dataConfig.setAssignConfigs(assignConfigs);
			dataItem.setDataConfig(dataConfig);

			List<SchemeListItem> schemeList = new ArrayList<SchemeListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSchemeTaskConfigResponse.Data["+ i +"].SchemeList.Length"); j++) {
				SchemeListItem schemeListItem = new SchemeListItem();
				schemeListItem.setSchemeId(_ctx.longValue("ListSchemeTaskConfigResponse.Data["+ i +"].SchemeList["+ j +"].SchemeId"));
				schemeListItem.setName(_ctx.stringValue("ListSchemeTaskConfigResponse.Data["+ i +"].SchemeList["+ j +"].Name"));

				schemeList.add(schemeListItem);
			}
			dataItem.setSchemeList(schemeList);

			data.add(dataItem);
		}
		listSchemeTaskConfigResponse.setData(data);
	 
	 	return listSchemeTaskConfigResponse;
	}
}