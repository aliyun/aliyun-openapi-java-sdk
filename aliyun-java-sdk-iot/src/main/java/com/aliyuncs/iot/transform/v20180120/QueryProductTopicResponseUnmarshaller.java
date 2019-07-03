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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryProductTopicResponse;
import com.aliyuncs.iot.model.v20180120.QueryProductTopicResponse.ProductTopicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductTopicResponseUnmarshaller {

	public static QueryProductTopicResponse unmarshall(QueryProductTopicResponse queryProductTopicResponse, UnmarshallerContext _ctx) {
		
		queryProductTopicResponse.setRequestId(_ctx.stringValue("QueryProductTopicResponse.RequestId"));
		queryProductTopicResponse.setSuccess(_ctx.booleanValue("QueryProductTopicResponse.Success"));
		queryProductTopicResponse.setCode(_ctx.stringValue("QueryProductTopicResponse.Code"));
		queryProductTopicResponse.setErrorMessage(_ctx.stringValue("QueryProductTopicResponse.ErrorMessage"));

		List<ProductTopicInfo> data = new ArrayList<ProductTopicInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryProductTopicResponse.Data.Length"); i++) {
			ProductTopicInfo productTopicInfo = new ProductTopicInfo();
			productTopicInfo.setProductKey(_ctx.stringValue("QueryProductTopicResponse.Data["+ i +"].ProductKey"));
			productTopicInfo.setTopicShortName(_ctx.stringValue("QueryProductTopicResponse.Data["+ i +"].TopicShortName"));
			productTopicInfo.setOperation(_ctx.stringValue("QueryProductTopicResponse.Data["+ i +"].Operation"));
			productTopicInfo.setDesc(_ctx.stringValue("QueryProductTopicResponse.Data["+ i +"].Desc"));
			productTopicInfo.setId(_ctx.stringValue("QueryProductTopicResponse.Data["+ i +"].Id"));

			data.add(productTopicInfo);
		}
		queryProductTopicResponse.setData(data);
	 
	 	return queryProductTopicResponse;
	}
}