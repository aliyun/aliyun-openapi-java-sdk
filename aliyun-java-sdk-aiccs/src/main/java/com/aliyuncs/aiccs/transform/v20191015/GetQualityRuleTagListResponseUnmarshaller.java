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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetQualityRuleTagListResponse;
import com.aliyuncs.aiccs.model.v20191015.GetQualityRuleTagListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityRuleTagListResponseUnmarshaller {

	public static GetQualityRuleTagListResponse unmarshall(GetQualityRuleTagListResponse getQualityRuleTagListResponse, UnmarshallerContext _ctx) {
		
		getQualityRuleTagListResponse.setRequestId(_ctx.stringValue("GetQualityRuleTagListResponse.RequestId"));
		getQualityRuleTagListResponse.setMessage(_ctx.stringValue("GetQualityRuleTagListResponse.Message"));
		getQualityRuleTagListResponse.setCode(_ctx.stringValue("GetQualityRuleTagListResponse.Code"));
		getQualityRuleTagListResponse.setSuccess(_ctx.booleanValue("GetQualityRuleTagListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityRuleTagListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRuleTagName(_ctx.stringValue("GetQualityRuleTagListResponse.Data["+ i +"].RuleTagName"));
			dataItem.setRuleTagId(_ctx.longValue("GetQualityRuleTagListResponse.Data["+ i +"].RuleTagId"));

			data.add(dataItem);
		}
		getQualityRuleTagListResponse.setData(data);
	 
	 	return getQualityRuleTagListResponse;
	}
}