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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListCriteriaStrategyResponse;
import com.aliyuncs.sas.model.v20181203.ListCriteriaStrategyResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCriteriaStrategyResponseUnmarshaller {

	public static ListCriteriaStrategyResponse unmarshall(ListCriteriaStrategyResponse listCriteriaStrategyResponse, UnmarshallerContext _ctx) {
		
		listCriteriaStrategyResponse.setRequestId(_ctx.stringValue("ListCriteriaStrategyResponse.RequestId"));
		listCriteriaStrategyResponse.setSuccess(_ctx.booleanValue("ListCriteriaStrategyResponse.Success"));
		listCriteriaStrategyResponse.setCode(_ctx.stringValue("ListCriteriaStrategyResponse.Code"));
		listCriteriaStrategyResponse.setMessage(_ctx.stringValue("ListCriteriaStrategyResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCriteriaStrategyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListCriteriaStrategyResponse.Data["+ i +"].Id"));
			dataItem.setValue(_ctx.stringValue("ListCriteriaStrategyResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		listCriteriaStrategyResponse.setData(data);
	 
	 	return listCriteriaStrategyResponse;
	}
}