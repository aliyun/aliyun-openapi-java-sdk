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

package com.aliyuncs.anytrans.transform.v20250707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.anytrans.model.v20250707.TermEditResponse;
import com.aliyuncs.anytrans.model.v20250707.TermEditResponse.Data;
import com.aliyuncs.anytrans.model.v20250707.TermEditResponse.Data.TermsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TermEditResponseUnmarshaller {

	public static TermEditResponse unmarshall(TermEditResponse termEditResponse, UnmarshallerContext _ctx) {
		
		termEditResponse.setCode(_ctx.stringValue("TermEditResponse.code"));
		termEditResponse.setMessage(_ctx.stringValue("TermEditResponse.message"));
		termEditResponse.setRequestId(_ctx.stringValue("TermEditResponse.requestId"));
		termEditResponse.setSuccess(_ctx.booleanValue("TermEditResponse.success"));
		termEditResponse.setHttpStatusCode(_ctx.stringValue("TermEditResponse.httpStatusCode"));

		Data data = new Data();
		data.setFailCount(_ctx.longValue("TermEditResponse.data.failCount"));

		List<TermsItem> terms = new ArrayList<TermsItem>();
		for (int i = 0; i < _ctx.lengthValue("TermEditResponse.data.terms.Length"); i++) {
			TermsItem termsItem = new TermsItem();
			termsItem.setTermId(_ctx.stringValue("TermEditResponse.data.terms["+ i +"].termId"));
			termsItem.setSrc(_ctx.stringValue("TermEditResponse.data.terms["+ i +"].src"));
			termsItem.setTgt(_ctx.stringValue("TermEditResponse.data.terms["+ i +"].tgt"));

			terms.add(termsItem);
		}
		data.setTerms(terms);
		termEditResponse.setData(data);
	 
	 	return termEditResponse;
	}
}