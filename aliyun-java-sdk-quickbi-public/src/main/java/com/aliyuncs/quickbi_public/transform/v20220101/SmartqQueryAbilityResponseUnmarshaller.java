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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.SmartqQueryAbilityResponse;
import com.aliyuncs.quickbi_public.model.v20220101.SmartqQueryAbilityResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.SmartqQueryAbilityResponse.Result.MetaTypeItem;
import com.aliyuncs.quickbi_public.model.v20220101.SmartqQueryAbilityResponse.Result.ValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SmartqQueryAbilityResponseUnmarshaller {

	public static SmartqQueryAbilityResponse unmarshall(SmartqQueryAbilityResponse smartqQueryAbilityResponse, UnmarshallerContext _ctx) {
		
		smartqQueryAbilityResponse.setRequestId(_ctx.stringValue("SmartqQueryAbilityResponse.RequestId"));
		smartqQueryAbilityResponse.setSuccess(_ctx.booleanValue("SmartqQueryAbilityResponse.Success"));

		Result result = new Result();
		result.setChartType(_ctx.stringValue("SmartqQueryAbilityResponse.Result.ChartType"));
		result.setLogicSql(_ctx.stringValue("SmartqQueryAbilityResponse.Result.LogicSql"));
		result.setConclusionText(_ctx.stringValue("SmartqQueryAbilityResponse.Result.ConclusionText"));

		List<MetaTypeItem> metaType = new ArrayList<MetaTypeItem>();
		for (int i = 0; i < _ctx.lengthValue("SmartqQueryAbilityResponse.Result.MetaType.Length"); i++) {
			MetaTypeItem metaTypeItem = new MetaTypeItem();
			metaTypeItem.setKey(_ctx.stringValue("SmartqQueryAbilityResponse.Result.MetaType["+ i +"].Key"));
			metaTypeItem.setValue(_ctx.stringValue("SmartqQueryAbilityResponse.Result.MetaType["+ i +"].Value"));
			metaTypeItem.setType(_ctx.stringValue("SmartqQueryAbilityResponse.Result.MetaType["+ i +"].Type"));

			metaType.add(metaTypeItem);
		}
		result.setMetaType(metaType);

		List<ValuesItem> values = new ArrayList<ValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("SmartqQueryAbilityResponse.Result.Values.Length"); i++) {
			ValuesItem valuesItem = new ValuesItem();

			List<String> row = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SmartqQueryAbilityResponse.Result.Values["+ i +"].Row.Length"); j++) {
				row.add(_ctx.stringValue("SmartqQueryAbilityResponse.Result.Values["+ i +"].Row["+ j +"]"));
			}
			valuesItem.setRow(row);

			values.add(valuesItem);
		}
		result.setValues(values);
		smartqQueryAbilityResponse.setResult(result);
	 
	 	return smartqQueryAbilityResponse;
	}
}