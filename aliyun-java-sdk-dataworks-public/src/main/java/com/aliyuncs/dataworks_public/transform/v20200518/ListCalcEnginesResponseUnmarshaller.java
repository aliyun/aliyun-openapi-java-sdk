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

import com.aliyuncs.dataworks_public.model.v20200518.ListCalcEnginesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListCalcEnginesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListCalcEnginesResponse.Data.CalcEnginesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCalcEnginesResponseUnmarshaller {

	public static ListCalcEnginesResponse unmarshall(ListCalcEnginesResponse listCalcEnginesResponse, UnmarshallerContext _ctx) {
		
		listCalcEnginesResponse.setRequestId(_ctx.stringValue("ListCalcEnginesResponse.RequestId"));
		listCalcEnginesResponse.setHttpStatusCode(_ctx.integerValue("ListCalcEnginesResponse.HttpStatusCode"));
		listCalcEnginesResponse.setSuccess(_ctx.booleanValue("ListCalcEnginesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCalcEnginesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCalcEnginesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListCalcEnginesResponse.Data.TotalCount"));

		List<CalcEnginesItem> calcEngines = new ArrayList<CalcEnginesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCalcEnginesResponse.Data.CalcEngines.Length"); i++) {
			CalcEnginesItem calcEnginesItem = new CalcEnginesItem();
			calcEnginesItem.setBindingProjectName(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].BindingProjectName"));
			calcEnginesItem.setIsDefault(_ctx.booleanValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].IsDefault"));
			calcEnginesItem.setEngineId(_ctx.integerValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].EngineId"));
			calcEnginesItem.setDwRegion(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].DwRegion"));
			calcEnginesItem.setTaskAuthType(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].TaskAuthType"));
			calcEnginesItem.setCalcEngineType(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].CalcEngineType"));
			calcEnginesItem.setEngineInfo(_ctx.mapValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].EngineInfo"));
			calcEnginesItem.setEnvType(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].EnvType"));
			calcEnginesItem.setRegion(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].Region"));
			calcEnginesItem.setGmtCreate(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].GmtCreate"));
			calcEnginesItem.setBindingProjectId(_ctx.integerValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].BindingProjectId"));
			calcEnginesItem.setName(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].Name"));
			calcEnginesItem.setTenantId(_ctx.longValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].TenantId"));

			calcEngines.add(calcEnginesItem);
		}
		data.setCalcEngines(calcEngines);
		listCalcEnginesResponse.setData(data);
	 
	 	return listCalcEnginesResponse;
	}
}