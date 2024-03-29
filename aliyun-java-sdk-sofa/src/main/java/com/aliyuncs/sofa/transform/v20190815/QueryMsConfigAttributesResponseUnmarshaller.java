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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryMsConfigAttributesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsConfigAttributesResponse.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsConfigAttributesResponseUnmarshaller {

	public static QueryMsConfigAttributesResponse unmarshall(QueryMsConfigAttributesResponse queryMsConfigAttributesResponse, UnmarshallerContext _ctx) {
		
		queryMsConfigAttributesResponse.setRequestId(_ctx.stringValue("QueryMsConfigAttributesResponse.RequestId"));
		queryMsConfigAttributesResponse.setResultMessage(_ctx.stringValue("QueryMsConfigAttributesResponse.ResultMessage"));
		queryMsConfigAttributesResponse.setResultCode(_ctx.stringValue("QueryMsConfigAttributesResponse.ResultCode"));

		Attribute attribute = new Attribute();
		attribute.setInstanceId(_ctx.stringValue("QueryMsConfigAttributesResponse.Attribute.InstanceId"));
		attribute.setAttributeName(_ctx.stringValue("QueryMsConfigAttributesResponse.Attribute.AttributeName"));
		attribute.setId(_ctx.longValue("QueryMsConfigAttributesResponse.Attribute.Id"));
		attribute.setDesc(_ctx.stringValue("QueryMsConfigAttributesResponse.Attribute.Desc"));
		queryMsConfigAttributesResponse.setAttribute(attribute);
	 
	 	return queryMsConfigAttributesResponse;
	}
}