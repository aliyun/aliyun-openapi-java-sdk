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

import com.aliyuncs.qualitycheck.model.v20190115.GetSchemeTaskConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetSchemeTaskConfigResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetSchemeTaskConfigResponse.Data.DataConfig;
import com.aliyuncs.qualitycheck.model.v20190115.GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigsItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigsItem.AssignConfigContestsItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetSchemeTaskConfigResponse.Data.SchemeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSchemeTaskConfigResponseUnmarshaller {

	public static GetSchemeTaskConfigResponse unmarshall(GetSchemeTaskConfigResponse getSchemeTaskConfigResponse, UnmarshallerContext _ctx) {
		
		getSchemeTaskConfigResponse.setRequestId(_ctx.stringValue("GetSchemeTaskConfigResponse.RequestId"));
		getSchemeTaskConfigResponse.setCode(_ctx.stringValue("GetSchemeTaskConfigResponse.Code"));
		getSchemeTaskConfigResponse.setSuccess(_ctx.stringValue("GetSchemeTaskConfigResponse.Success"));
		getSchemeTaskConfigResponse.setMessage(_ctx.stringValue("GetSchemeTaskConfigResponse.Message"));
		getSchemeTaskConfigResponse.setHttpStatusCode(_ctx.stringValue("GetSchemeTaskConfigResponse.HttpStatusCode"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetSchemeTaskConfigResponse.Data.Id"));
		data.setSchemeTaskConfigId(_ctx.longValue("GetSchemeTaskConfigResponse.Data.SchemeTaskConfigId"));
		data.setName(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.Name"));
		data.setSourceDataType(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.SourceDataType"));
		data.setStatus(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.Status"));
		data.setAssignType(_ctx.integerValue("GetSchemeTaskConfigResponse.Data.AssignType"));
		data.setManualReview(_ctx.integerValue("GetSchemeTaskConfigResponse.Data.ManualReview"));
		data.setAsrTaskPriority(_ctx.integerValue("GetSchemeTaskConfigResponse.Data.AsrTaskPriority"));
		data.setModeCustomizationId(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.ModeCustomizationId"));
		data.setModelName(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.ModelName"));

		List<Long> schemeIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetSchemeTaskConfigResponse.Data.SchemeIdList.Length"); i++) {
			schemeIdList.add(_ctx.longValue("GetSchemeTaskConfigResponse.Data.SchemeIdList["+ i +"]"));
		}
		data.setSchemeIdList(schemeIdList);

		DataConfig dataConfig = new DataConfig();
		dataConfig.setIndex(_ctx.longValue("GetSchemeTaskConfigResponse.Data.DataConfig.Index"));
		dataConfig.setResultParam(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.DataConfig.ResultParam"));
		dataConfig.setDataSets(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.DataConfig.DataSets"));

		List<AssignConfigsItem> assignConfigs = new ArrayList<AssignConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigs.Length"); i++) {
			AssignConfigsItem assignConfigsItem = new AssignConfigsItem();

			List<AssignConfigContestsItem> assignConfigContests = new ArrayList<AssignConfigContestsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigs["+ i +"].AssignConfigContests.Length"); j++) {
				AssignConfigContestsItem assignConfigContestsItem = new AssignConfigContestsItem();
				assignConfigContestsItem.setName(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigs["+ i +"].AssignConfigContests["+ j +"].Name"));
				assignConfigContestsItem.setDataType(_ctx.integerValue("GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigs["+ i +"].AssignConfigContests["+ j +"].DataType"));
				assignConfigContestsItem.setSymbol(_ctx.integerValue("GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigs["+ i +"].AssignConfigContests["+ j +"].Symbol"));
				assignConfigContestsItem.setValue(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigs["+ i +"].AssignConfigContests["+ j +"].Value"));

				List<String> listObject = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigs["+ i +"].AssignConfigContests["+ j +"].ListObject.Length"); k++) {
					listObject.add(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.DataConfig.AssignConfigs["+ i +"].AssignConfigContests["+ j +"].ListObject["+ k +"]"));
				}
				assignConfigContestsItem.setListObject(listObject);

				assignConfigContests.add(assignConfigContestsItem);
			}
			assignConfigsItem.setAssignConfigContests(assignConfigContests);

			assignConfigs.add(assignConfigsItem);
		}
		dataConfig.setAssignConfigs(assignConfigs);
		data.setDataConfig(dataConfig);

		List<SchemeListItem> schemeList = new ArrayList<SchemeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSchemeTaskConfigResponse.Data.SchemeList.Length"); i++) {
			SchemeListItem schemeListItem = new SchemeListItem();
			schemeListItem.setSchemeId(_ctx.longValue("GetSchemeTaskConfigResponse.Data.SchemeList["+ i +"].SchemeId"));
			schemeListItem.setName(_ctx.stringValue("GetSchemeTaskConfigResponse.Data.SchemeList["+ i +"].Name"));

			schemeList.add(schemeListItem);
		}
		data.setSchemeList(schemeList);
		getSchemeTaskConfigResponse.setData(data);
	 
	 	return getSchemeTaskConfigResponse;
	}
}