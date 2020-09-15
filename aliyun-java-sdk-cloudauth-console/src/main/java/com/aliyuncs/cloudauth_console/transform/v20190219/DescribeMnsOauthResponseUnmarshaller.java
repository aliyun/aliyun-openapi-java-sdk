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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeMnsOauthResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.DescribeMnsOauthResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMnsOauthResponseUnmarshaller {

	public static DescribeMnsOauthResponse unmarshall(DescribeMnsOauthResponse describeMnsOauthResponse, UnmarshallerContext _ctx) {
		
		describeMnsOauthResponse.setRequestId(_ctx.stringValue("DescribeMnsOauthResponse.RequestId"));

		Data data = new Data();
		data.setMnsServe(_ctx.booleanValue("DescribeMnsOauthResponse.Data.MnsServe"));
		data.setOpenMnsService(_ctx.booleanValue("DescribeMnsOauthResponse.Data.OpenMnsService"));
		data.setMnsAuthorized(_ctx.booleanValue("DescribeMnsOauthResponse.Data.MnsAuthorized"));
		data.setTopicName(_ctx.stringValue("DescribeMnsOauthResponse.Data.TopicName"));
		data.setEndPoint(_ctx.stringValue("DescribeMnsOauthResponse.Data.EndPoint"));

		List<String> topicList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMnsOauthResponse.Data.TopicList.Length"); i++) {
			topicList.add(_ctx.stringValue("DescribeMnsOauthResponse.Data.TopicList["+ i +"]"));
		}
		data.setTopicList(topicList);
		describeMnsOauthResponse.setData(data);
	 
	 	return describeMnsOauthResponse;
	}
}