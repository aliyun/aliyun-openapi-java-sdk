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

package com.aliyuncs.alimt.transform.v20181012;

import com.aliyuncs.alimt.model.v20181012.TranslateECommerceResponse;
import com.aliyuncs.alimt.model.v20181012.TranslateECommerceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TranslateECommerceResponseUnmarshaller {

	public static TranslateECommerceResponse unmarshall(TranslateECommerceResponse translateECommerceResponse, UnmarshallerContext _ctx) {
		
		translateECommerceResponse.setRequestId(_ctx.stringValue("TranslateECommerceResponse.RequestId"));
		translateECommerceResponse.setCode(_ctx.integerValue("TranslateECommerceResponse.Code"));
		translateECommerceResponse.setMessage(_ctx.stringValue("TranslateECommerceResponse.Message"));

		Data data = new Data();
		data.setTranslated(_ctx.stringValue("TranslateECommerceResponse.Data.Translated"));
		translateECommerceResponse.setData(data);
	 
	 	return translateECommerceResponse;
	}
}