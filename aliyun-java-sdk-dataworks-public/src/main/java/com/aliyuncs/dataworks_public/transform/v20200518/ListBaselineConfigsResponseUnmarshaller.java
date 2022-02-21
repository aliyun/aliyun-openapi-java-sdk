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

import com.aliyuncs.dataworks_public.model.v20200518.ListBaselineConfigsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListBaselineConfigsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListBaselineConfigsResponse.Data.BaselinesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaselineConfigsResponseUnmarshaller {

	public static ListBaselineConfigsResponse unmarshall(ListBaselineConfigsResponse listBaselineConfigsResponse, UnmarshallerContext _ctx) {
		
		listBaselineConfigsResponse.setRequestId(_ctx.stringValue("ListBaselineConfigsResponse.RequestId"));
		listBaselineConfigsResponse.setHttpStatusCode(_ctx.integerValue("ListBaselineConfigsResponse.HttpStatusCode"));
		listBaselineConfigsResponse.setErrorMessage(_ctx.stringValue("ListBaselineConfigsResponse.ErrorMessage"));
		listBaselineConfigsResponse.setErrorCode(_ctx.stringValue("ListBaselineConfigsResponse.ErrorCode"));
		listBaselineConfigsResponse.setSuccess(_ctx.booleanValue("ListBaselineConfigsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListBaselineConfigsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListBaselineConfigsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListBaselineConfigsResponse.Data.TotalCount"));

		List<BaselinesItem> baselines = new ArrayList<BaselinesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBaselineConfigsResponse.Data.Baselines.Length"); i++) {
			BaselinesItem baselinesItem = new BaselinesItem();
			baselinesItem.setHourSlaDetail(_ctx.stringValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].HourSlaDetail"));
			baselinesItem.setIsDefault(_ctx.booleanValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].IsDefault"));
			baselinesItem.setOwner(_ctx.stringValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].Owner"));
			baselinesItem.setProjectId(_ctx.longValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].ProjectId"));
			baselinesItem.setPriority(_ctx.integerValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].Priority"));
			baselinesItem.setSlaMinu(_ctx.integerValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].SlaMinu"));
			baselinesItem.setSlaHour(_ctx.integerValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].SlaHour"));
			baselinesItem.setBaselineId(_ctx.longValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].BaselineId"));
			baselinesItem.setBaselineName(_ctx.stringValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].BaselineName"));
			baselinesItem.setHourExpDetail(_ctx.stringValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].HourExpDetail"));
			baselinesItem.setUseFlag(_ctx.booleanValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].UseFlag"));
			baselinesItem.setExpHour(_ctx.integerValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].ExpHour"));
			baselinesItem.setBaselineType(_ctx.stringValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].BaselineType"));
			baselinesItem.setExpMinu(_ctx.integerValue("ListBaselineConfigsResponse.Data.Baselines["+ i +"].ExpMinu"));

			baselines.add(baselinesItem);
		}
		data.setBaselines(baselines);
		listBaselineConfigsResponse.setData(data);
	 
	 	return listBaselineConfigsResponse;
	}
}