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

package com.aliyuncs.dysmsapi.transform.v20170525;

import com.aliyuncs.dysmsapi.model.v20170525.QueryShortUrlResponse;
import com.aliyuncs.dysmsapi.model.v20170525.QueryShortUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryShortUrlResponseUnmarshaller {

	public static QueryShortUrlResponse unmarshall(QueryShortUrlResponse queryShortUrlResponse, UnmarshallerContext _ctx) {
		
		queryShortUrlResponse.setRequestId(_ctx.stringValue("QueryShortUrlResponse.RequestId"));
		queryShortUrlResponse.setCode(_ctx.stringValue("QueryShortUrlResponse.Code"));
		queryShortUrlResponse.setMessage(_ctx.stringValue("QueryShortUrlResponse.Message"));

		Data data = new Data();
		data.setSourceUrl(_ctx.stringValue("QueryShortUrlResponse.Data.SourceUrl"));
		data.setShortUrlName(_ctx.stringValue("QueryShortUrlResponse.Data.ShortUrlName"));
		data.setShortUrlStatus(_ctx.stringValue("QueryShortUrlResponse.Data.ShortUrlStatus"));
		data.setShortUrl(_ctx.stringValue("QueryShortUrlResponse.Data.ShortUrl"));
		data.setCreateDate(_ctx.stringValue("QueryShortUrlResponse.Data.CreateDate"));
		data.setExpireDate(_ctx.stringValue("QueryShortUrlResponse.Data.ExpireDate"));
		data.setPageViewCount(_ctx.stringValue("QueryShortUrlResponse.Data.PageViewCount"));
		data.setUniqueVisitorCount(_ctx.stringValue("QueryShortUrlResponse.Data.UniqueVisitorCount"));
		queryShortUrlResponse.setData(data);
	 
	 	return queryShortUrlResponse;
	}
}