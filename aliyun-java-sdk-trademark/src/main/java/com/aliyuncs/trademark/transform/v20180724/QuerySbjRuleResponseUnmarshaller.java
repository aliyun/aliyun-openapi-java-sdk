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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QuerySbjRuleResponse;
import com.aliyuncs.trademark.model.v20180724.QuerySbjRuleResponse.SbjRuleItem;
import com.aliyuncs.trademark.model.v20180724.QuerySbjRuleResponse.SbjRuleItem.FrontendOption;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySbjRuleResponseUnmarshaller {

	public static QuerySbjRuleResponse unmarshall(QuerySbjRuleResponse querySbjRuleResponse, UnmarshallerContext _ctx) {
		
		querySbjRuleResponse.setRequestId(_ctx.stringValue("QuerySbjRuleResponse.RequestId"));
		querySbjRuleResponse.setRuleId(_ctx.stringValue("QuerySbjRuleResponse.RuleId"));
		querySbjRuleResponse.setBizType(_ctx.stringValue("QuerySbjRuleResponse.BizType"));

		List<SbjRuleItem> sbjRuleList = new ArrayList<SbjRuleItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySbjRuleResponse.SbjRuleList.Length"); i++) {
			SbjRuleItem sbjRuleItem = new SbjRuleItem();
			sbjRuleItem.setFieldName(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].FieldName"));
			sbjRuleItem.setSbjFieldId(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].SbjFieldId"));
			sbjRuleItem.setEspExtFieldName(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].EspExtFieldName"));
			sbjRuleItem.setRequiredExpression(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].RequiredExpression"));
			sbjRuleItem.setValidateRegularExpression(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].ValidateRegularExpression"));
			sbjRuleItem.setFileType(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].FileType"));
			sbjRuleItem.setShowExpression(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].ShowExpression"));
			sbjRuleItem.setDefaultValue(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].DefaultValue"));
			sbjRuleItem.setFrontendType(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].FrontendType"));
			sbjRuleItem.setTrademarkServiceExpression(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].TrademarkServiceExpression"));

			List<FrontendOption> frontendOptions = new ArrayList<FrontendOption>();
			for (int j = 0; j < _ctx.lengthValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].FrontendOptions.Length"); j++) {
				FrontendOption frontendOption = new FrontendOption();
				frontendOption.setTitle(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].FrontendOptions["+ j +"].title"));
				frontendOption.setValue(_ctx.stringValue("QuerySbjRuleResponse.SbjRuleList["+ i +"].FrontendOptions["+ j +"].value"));

				frontendOptions.add(frontendOption);
			}
			sbjRuleItem.setFrontendOptions(frontendOptions);

			sbjRuleList.add(sbjRuleItem);
		}
		querySbjRuleResponse.setSbjRuleList(sbjRuleList);
	 
	 	return querySbjRuleResponse;
	}
}