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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.ListDpiConfigErrorResponse;
import com.aliyuncs.smartag.model.v20180313.ListDpiConfigErrorResponse.DpiConfigErrorItem;
import com.aliyuncs.smartag.model.v20180313.ListDpiConfigErrorResponse.DpiConfigErrorItem.RuleConfigErrorListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDpiConfigErrorResponseUnmarshaller {

	public static ListDpiConfigErrorResponse unmarshall(ListDpiConfigErrorResponse listDpiConfigErrorResponse, UnmarshallerContext _ctx) {
		
		listDpiConfigErrorResponse.setRequestId(_ctx.stringValue("ListDpiConfigErrorResponse.RequestId"));
		listDpiConfigErrorResponse.setNextToken(_ctx.stringValue("ListDpiConfigErrorResponse.NextToken"));
		listDpiConfigErrorResponse.setMaxResults(_ctx.integerValue("ListDpiConfigErrorResponse.MaxResults"));
		listDpiConfigErrorResponse.setTotal(_ctx.integerValue("ListDpiConfigErrorResponse.Total"));

		List<DpiConfigErrorItem> dpiConfigError = new ArrayList<DpiConfigErrorItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDpiConfigErrorResponse.DpiConfigError.Length"); i++) {
			DpiConfigErrorItem dpiConfigErrorItem = new DpiConfigErrorItem();
			dpiConfigErrorItem.setErrorType(_ctx.stringValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].ErrorType"));
			dpiConfigErrorItem.setSN(_ctx.stringValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].SN"));
			dpiConfigErrorItem.setSmartAGId(_ctx.stringValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].SmartAGId"));

			List<RuleConfigErrorListItem> ruleConfigErrorList = new ArrayList<RuleConfigErrorListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].RuleConfigErrorList.Length"); j++) {
				RuleConfigErrorListItem ruleConfigErrorListItem = new RuleConfigErrorListItem();
				ruleConfigErrorListItem.setRuleId(_ctx.stringValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].RuleConfigErrorList["+ j +"].RuleId"));

				List<String> dpiSignatureIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].RuleConfigErrorList["+ j +"].DpiSignatureIds.Length"); k++) {
					dpiSignatureIds.add(_ctx.stringValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].RuleConfigErrorList["+ j +"].DpiSignatureIds["+ k +"]"));
				}
				ruleConfigErrorListItem.setDpiSignatureIds(dpiSignatureIds);

				List<String> dpiGroupIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].RuleConfigErrorList["+ j +"].DpiGroupIds.Length"); k++) {
					dpiGroupIds.add(_ctx.stringValue("ListDpiConfigErrorResponse.DpiConfigError["+ i +"].RuleConfigErrorList["+ j +"].DpiGroupIds["+ k +"]"));
				}
				ruleConfigErrorListItem.setDpiGroupIds(dpiGroupIds);

				ruleConfigErrorList.add(ruleConfigErrorListItem);
			}
			dpiConfigErrorItem.setRuleConfigErrorList(ruleConfigErrorList);

			dpiConfigError.add(dpiConfigErrorItem);
		}
		listDpiConfigErrorResponse.setDpiConfigError(dpiConfigError);
	 
	 	return listDpiConfigErrorResponse;
	}
}