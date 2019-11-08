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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.DescribeJobErrorCodeResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeJobErrorCodeResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobErrorCodeResponseUnmarshaller {

	public static DescribeJobErrorCodeResponse unmarshall(DescribeJobErrorCodeResponse describeJobErrorCodeResponse, UnmarshallerContext _ctx) {
		
		describeJobErrorCodeResponse.setRequestId(_ctx.stringValue("DescribeJobErrorCodeResponse.RequestId"));
		describeJobErrorCodeResponse.setSuccess(_ctx.booleanValue("DescribeJobErrorCodeResponse.Success"));
		describeJobErrorCodeResponse.setErrCode(_ctx.stringValue("DescribeJobErrorCodeResponse.ErrCode"));
		describeJobErrorCodeResponse.setErrMessage(_ctx.stringValue("DescribeJobErrorCodeResponse.ErrMessage"));
		describeJobErrorCodeResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobErrorCodeResponse.HttpStatusCode"));

		Item item = new Item();
		item.setJobId(_ctx.stringValue("DescribeJobErrorCodeResponse.Item.JobId"));
		item.setLanguage(_ctx.stringValue("DescribeJobErrorCodeResponse.Item.Language"));
		item.setErrorCode(_ctx.stringValue("DescribeJobErrorCodeResponse.Item.ErrorCode"));
		item.setErrorMessage(_ctx.stringValue("DescribeJobErrorCodeResponse.Item.ErrorMessage"));
		item.setJobType(_ctx.stringValue("DescribeJobErrorCodeResponse.Item.JobType"));
		item.setJobState(_ctx.stringValue("DescribeJobErrorCodeResponse.Item.JobState"));
		describeJobErrorCodeResponse.setItem(item);
	 
	 	return describeJobErrorCodeResponse;
	}
}