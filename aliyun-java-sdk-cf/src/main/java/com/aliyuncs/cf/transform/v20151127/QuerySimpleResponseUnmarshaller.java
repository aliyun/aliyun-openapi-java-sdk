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

package com.aliyuncs.cf.transform.v20151127;

import com.aliyuncs.cf.model.v20151127.QuerySimpleResponse;
import com.aliyuncs.cf.model.v20151127.QuerySimpleResponse.CollinadataQueryResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySimpleResponseUnmarshaller {

	public static QuerySimpleResponse unmarshall(QuerySimpleResponse querySimpleResponse, UnmarshallerContext context) {
		
		querySimpleResponse.setRequestId(context.stringValue("QuerySimpleResponse.RequestId"));
		querySimpleResponse.setSuccess(context.booleanValue("QuerySimpleResponse.Success"));
		querySimpleResponse.setMsg(context.stringValue("QuerySimpleResponse.Msg"));
		querySimpleResponse.setCode(context.integerValue("QuerySimpleResponse.Code"));

		CollinadataQueryResult collinadataQueryResult = new CollinadataQueryResult();
		collinadataQueryResult.setScore(context.stringValue("QuerySimpleResponse.CollinadataQueryResult.Score"));
		collinadataQueryResult.setDetail(context.stringValue("QuerySimpleResponse.CollinadataQueryResult.Detail"));
		collinadataQueryResult.setRisklevel(context.stringValue("QuerySimpleResponse.CollinadataQueryResult.Risklevel"));
		querySimpleResponse.setCollinadataQueryResult(collinadataQueryResult);
	 
	 	return querySimpleResponse;
	}
}