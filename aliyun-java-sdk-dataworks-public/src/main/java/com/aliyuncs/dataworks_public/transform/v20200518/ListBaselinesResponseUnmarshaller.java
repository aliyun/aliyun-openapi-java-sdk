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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListBaselinesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListBaselinesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListBaselinesResponse.Data.BaselinesItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListBaselinesResponse.Data.BaselinesItem.OverTimeSettingsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaselinesResponseUnmarshaller {

	public static ListBaselinesResponse unmarshall(ListBaselinesResponse listBaselinesResponse, UnmarshallerContext _ctx) {
		
		listBaselinesResponse.setRequestId(_ctx.stringValue("ListBaselinesResponse.RequestId"));
		listBaselinesResponse.setSuccess(_ctx.booleanValue("ListBaselinesResponse.Success"));
		listBaselinesResponse.setErrorCode(_ctx.stringValue("ListBaselinesResponse.ErrorCode"));
		listBaselinesResponse.setErrorMessage(_ctx.stringValue("ListBaselinesResponse.ErrorMessage"));
		listBaselinesResponse.setHttpStatusCode(_ctx.integerValue("ListBaselinesResponse.HttpStatusCode"));
		listBaselinesResponse.setDynamicErrorCode(_ctx.stringValue("ListBaselinesResponse.DynamicErrorCode"));
		listBaselinesResponse.setDynamicErrorMessage(_ctx.stringValue("ListBaselinesResponse.DynamicErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.stringValue("ListBaselinesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.stringValue("ListBaselinesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.stringValue("ListBaselinesResponse.Data.TotalCount"));

		List<BaselinesItem> baselines = new ArrayList<BaselinesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBaselinesResponse.Data.Baselines.Length"); i++) {
			BaselinesItem baselinesItem = new BaselinesItem();
			baselinesItem.setBaselineId(_ctx.longValue("ListBaselinesResponse.Data.Baselines["+ i +"].BaselineId"));
			baselinesItem.setProjectId(_ctx.longValue("ListBaselinesResponse.Data.Baselines["+ i +"].ProjectId"));
			baselinesItem.setBaselineType(_ctx.stringValue("ListBaselinesResponse.Data.Baselines["+ i +"].BaselineType"));
			baselinesItem.setPriority(_ctx.integerValue("ListBaselinesResponse.Data.Baselines["+ i +"].Priority"));
			baselinesItem.setOwner(_ctx.stringValue("ListBaselinesResponse.Data.Baselines["+ i +"].Owner"));
			baselinesItem.setBaselineName(_ctx.stringValue("ListBaselinesResponse.Data.Baselines["+ i +"].BaselineName"));
			baselinesItem.setEnabled(_ctx.booleanValue("ListBaselinesResponse.Data.Baselines["+ i +"].Enabled"));
			baselinesItem.setAlertEnabled(_ctx.booleanValue("ListBaselinesResponse.Data.Baselines["+ i +"].AlertEnabled"));
			baselinesItem.setAlertMarginThreshold(_ctx.integerValue("ListBaselinesResponse.Data.Baselines["+ i +"].AlertMarginThreshold"));

			List<OverTimeSettingsItem> overTimeSettings = new ArrayList<OverTimeSettingsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListBaselinesResponse.Data.Baselines["+ i +"].OverTimeSettings.Length"); j++) {
				OverTimeSettingsItem overTimeSettingsItem = new OverTimeSettingsItem();
				overTimeSettingsItem.setCycle(_ctx.integerValue("ListBaselinesResponse.Data.Baselines["+ i +"].OverTimeSettings["+ j +"].Cycle"));
				overTimeSettingsItem.setTime(_ctx.stringValue("ListBaselinesResponse.Data.Baselines["+ i +"].OverTimeSettings["+ j +"].Time"));

				overTimeSettings.add(overTimeSettingsItem);
			}
			baselinesItem.setOverTimeSettings(overTimeSettings);

			baselines.add(baselinesItem);
		}
		data.setBaselines(baselines);
		listBaselinesResponse.setData(data);
	 
	 	return listBaselinesResponse;
	}
}