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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.QueryIndustryLabelBagResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIndustryLabelBagResponseUnmarshaller {

	public static QueryIndustryLabelBagResponse unmarshall(QueryIndustryLabelBagResponse queryIndustryLabelBagResponse, UnmarshallerContext _ctx) {
		
		queryIndustryLabelBagResponse.setRequestId(_ctx.stringValue("QueryIndustryLabelBagResponse.RequestId"));
		queryIndustryLabelBagResponse.setCode(_ctx.integerValue("QueryIndustryLabelBagResponse.Code"));
		queryIndustryLabelBagResponse.setErrorMsg(_ctx.stringValue("QueryIndustryLabelBagResponse.ErrorMsg"));
		queryIndustryLabelBagResponse.setSuccess(_ctx.booleanValue("QueryIndustryLabelBagResponse.Success"));

		List<Map<Object, Object>> data = _ctx.listMapValue("QueryIndustryLabelBagResponse.Data");
		queryIndustryLabelBagResponse.setData(data);
	 
	 	return queryIndustryLabelBagResponse;
	}
}