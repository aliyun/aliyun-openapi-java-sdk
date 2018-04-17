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

package com.aliyuncs.iot.transform.v20170420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20170420.QueryProductTopicResponse;
import com.aliyuncs.iot.model.v20170420.QueryProductTopicResponse.ProductTopicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductTopicResponseUnmarshaller {

	public static QueryProductTopicResponse unmarshall(QueryProductTopicResponse queryProductTopicResponse, UnmarshallerContext context) {
		
		queryProductTopicResponse.setRequestId(context.stringValue("QueryProductTopicResponse.RequestId"));
		queryProductTopicResponse.setSuccess(context.booleanValue("QueryProductTopicResponse.Success"));
		queryProductTopicResponse.setErrorMessage(context.stringValue("QueryProductTopicResponse.ErrorMessage"));

		List<ProductTopicInfo> data = new ArrayList<ProductTopicInfo>();
		for (int i = 0; i < context.lengthValue("QueryProductTopicResponse.Data.Length"); i++) {
			ProductTopicInfo productTopicInfo = new ProductTopicInfo();
			productTopicInfo.setProductKey(context.stringValue("QueryProductTopicResponse.Data["+ i +"].ProductKey"));
			productTopicInfo.setTopicShortName(context.stringValue("QueryProductTopicResponse.Data["+ i +"].TopicShortName"));
			productTopicInfo.setOperation(context.stringValue("QueryProductTopicResponse.Data["+ i +"].Operation"));
			productTopicInfo.setDesc(context.stringValue("QueryProductTopicResponse.Data["+ i +"].Desc"));
			productTopicInfo.setId(context.stringValue("QueryProductTopicResponse.Data["+ i +"].Id"));

			data.add(productTopicInfo);
		}
		queryProductTopicResponse.setData(data);
	 
	 	return queryProductTopicResponse;
	}
}